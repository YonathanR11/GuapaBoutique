package Principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/* @author Yonathan */
public class conectar {

    Connection conectar = null;

    public Connection conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost/bdguapa?user=root&password=&autoReconnect=true&useSSL=false");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("ERROR AL CONECTAR CON LA BASE DE DATOS");
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR ACEDER A LA BASE DE DATOS, SE INTENTARA SOLOCIONAR...","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
        return conectar;
    }
}
