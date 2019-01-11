
package Proveedores;

/**
 *
 * @author Jose
 */


import Principal.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;


public class BuscarProveedor {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Administrador.tablaProveedores.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM proveedores ORDER BY pronombre";
        } else {
            sql = "SELECT * FROM proveedores WHERE (idproveedor LIKE'" + busca + "%' OR "
                    //+ "idproveedor LIKE'" + busca + "%' OR "//"%' OR prodprecio LIKE'" + busca + "%' OR "
                    + "pronombre LIKE'" + busca + "%' OR " //"%' OR prodstock LIKE'" + busca + "%' OR "
                    + "protelefono LIKE'" + busca + "%' OR "
                    + "prodireccion LIKE'" + busca + "%' OR "
                    + "propaginaweb LIKE'" + busca + "%' OR "
                    + "procorreoelectronico LIKE'" + busca + "%') "                   
                    + "ORDER BY idproveedor";
                    
            
        }
        String datos[] = new String[6]; //String datos[] = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idproveedor");
                datos[1] = rs.getString("pronombre");
                datos[2] = rs.getString("protelefono");
                datos[3] = rs.getString("prodireccion");
                datos[4] = rs.getString("propaginaweb");
                datos[5] = rs.getString("procorreoelectronico");
               // datos[6] = rs.getString("catnombre");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
