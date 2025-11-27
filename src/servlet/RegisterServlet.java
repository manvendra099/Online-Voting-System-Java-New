package servlet;
import dao.UserDAO;
import model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String pass = req.getParameter("password");
        if (name == null || email == null || pass == null || name.isEmpty() || email.isEmpty() || pass.isEmpty()) {
            resp.sendRedirect("register.jsp?error=empty"); return;
        }
        UserDAO dao = new UserDAO();
        if (dao.registerUser(new User(name.trim(), email.trim().toLowerCase(), pass))) {
            resp.sendRedirect("index.jsp?msg=registered");
        } else {
            resp.sendRedirect("register.jsp?error=already");
        }
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { resp.sendRedirect("register.jsp"); }
}
