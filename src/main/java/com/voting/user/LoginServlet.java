
package com.voting.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.voting.db.DBConnect;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email=req.getParameter("email");
        String pass=req.getParameter("password");

        if(email==null||pass==null){
            res.sendRedirect("login.jsp?error=true");
            return;
        }

        try(Connection con=DBConnect.getConnection()){
            PreparedStatement ps=con.prepareStatement(
                "SELECT * FROM users WHERE email=? AND password=?");
            ps.setString(1,email);
            ps.setString(2,pass);
            ResultSet rs=ps.executeQuery();

            if(rs.next()){
                req.getSession().setAttribute("user",email);
                res.sendRedirect("home.jsp");
            } else {
                res.sendRedirect("login.jsp?invalid=true");
            }
        }catch(Exception e){
            e.printStackTrace();
            res.sendRedirect("login.jsp?error=true");
        }
    }
}
