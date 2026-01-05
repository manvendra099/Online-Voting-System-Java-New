
package com.voting.admin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.*;
import com.voting.db.DBConnect;

public class AddCandidateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String name=req.getParameter("name");

        if(name==null||name.isEmpty()){
            res.sendRedirect("addCandidate.jsp?error=true");
            return;
        }

        try(Connection con=DBConnect.getConnection()){
            PreparedStatement ps=con.prepareStatement(
                "INSERT INTO candidates(name) VALUES(?)");
            ps.setString(1,name);
            ps.executeUpdate();
            res.sendRedirect("admin.jsp?success=true");
        }catch(Exception e){
            e.printStackTrace();
            res.sendRedirect("addCandidate.jsp?error=true");
        }
    }
}
