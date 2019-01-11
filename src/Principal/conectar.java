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
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/bdguapa?user=root&password=");
        
    }catch (ClassNotFoundException | SQLException e){
//        System.out.println(e.getMessage());
//System.out.println("ERROR AL INTENTAR ACEDER A LA BASE DE DATOS, SE INTENTARA SOLOCIONAR...");
        JOptionPane.showMessageDialog(null, "ERROR AL INTENTAR ACEDER A LA BASE DE DATOS, SE INTENTARA SOLOCIONAR...","ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
    }
    return conectar;
}
}