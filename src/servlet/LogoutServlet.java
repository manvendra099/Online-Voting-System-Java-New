package servlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession s = req.getSession(false); if (s != null) s.invalidate(); resp.sendRedirect("index.jsp"); 
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException { doPost(req, resp); }
}
