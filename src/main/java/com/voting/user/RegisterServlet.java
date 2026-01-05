
package com.voting.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.voting.db.DBConnect;

public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email=req.getParameter("email");
        String pass=req.getParameter("password");

        if(email.isEmpty()||pass.isEmpty()){
            res.sendRedirect("register.jsp?error=true");
            return;
        }

        try(Connection con=DBConnect.getConnection()){
            PreparedStatement ps=con.prepareStatement(
                "INSERT INTO users(email,password) VALUES(?,?)");
            ps.setString(1,email);
            ps.setString(2,pass);
            ps.executeUpdate();
            res.sendRedirect("login.jsp?registered=true");
        }catch(Exception e){
            e.printStackTrace();
            res.sendRedirect("register.jsp?exists=true");
        }
    }
}
