
package com.voting.db;
import jakarta.servlet.*;

public class AppListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        DBConnect.init(sce.getServletContext());
    }
    public void contextDestroyed(ServletContextEvent sce) {}
}
