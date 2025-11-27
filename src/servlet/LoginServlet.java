package servlet;
import dao.UserDAO;
import model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String email = req.getParameter("email"); String pass = req.getParameter("password");
        if (email == null || pass == null || email.isEmpty() || pass.isEmpty()) { resp.sendRedirect("index.jsp?error=empty"); return; }
        User user = new UserDAO().login(email.trim().toLowerCase(), pass);
        if (user != null) {
            HttpSession s = req.getSession(true);
            s.setMaxInactiveInterval(30*60);
            s.setAttribute("user", user);
            resp.sendRedirect("home.jsp"); 
        } else { resp.sendRedirect("index.jsp?error=invalid"); }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { resp.sendRedirect("index.jsp"); }
}
