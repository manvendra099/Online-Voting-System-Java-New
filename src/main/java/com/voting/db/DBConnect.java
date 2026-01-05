
package com.voting.db;

import java.sql.Connection;
import java.sql.SQLException;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import jakarta.servlet.ServletContext;

public class DBConnect {
    private static HikariDataSource dataSource;

    public static void init(ServletContext context) {
        if (dataSource == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                String url = "jdbc:mysql://localhost:3306/votingdb?useSSL=false&allowPublicKeyRetrieval=true";
                String user = context.getInitParameter("dbUser");
                String pass = context.getInitParameter("dbPassword");

                HikariConfig config = new HikariConfig();
                config.setJdbcUrl(url);
                config.setUsername(user);
                config.setPassword(pass);
                config.setMaximumPoolSize(10);
                config.setConnectionTimeout(20000);

                dataSource = new HikariDataSource(config);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
}
