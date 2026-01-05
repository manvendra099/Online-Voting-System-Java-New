
package com.voting.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.voting.db.DBConnect;

public class VoteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String user=(String)req.getSession().getAttribute("user");
        String candidate=req.getParameter("candidate");

        if(user==null){
            res.sendRedirect("login.jsp");
            return;
        }

        try(Connection con=DBConnect.getConnection()){
            PreparedStatement check=con.prepareStatement(
                "SELECT * FROM votes WHERE user_email=?");
            check.setString(1,user);
            ResultSet rs=check.executeQuery();

            if(rs.next()){
                res.sendRedirect("home.jsp?voted=true");
                return;
            }

            PreparedStatement ps=con.prepareStatement(
                "INSERT INTO votes(user_email,candidate) VALUES(?,?)");
            ps.setString(1,user);
            ps.setString(2,candidate);
            ps.executeUpdate();

            res.sendRedirect("result.jsp");
        }catch(Exception e){
            e.printStackTrace();
            res.sendRedirect("vote.jsp?error=true");
        }
    }
}
