package kz.aitu.oop.practice.assignment4.data;

import java.sql.*;

public class Connect {
    private static Connection con;
    private Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/assignment_a?useUnicode=true&serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getCon() throws SQLException {
        if(Connect.con == null || Connect.con.isClosed()) {
            new Connect();
        }
        return Connect.con;
    }
    public static Statement getStatement() throws SQLException {
        return Connect.getCon().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }
}
