/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

//import productos.*;
import static Principal.Administrador.tablaUsuarios;
import Principal.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yonathan
 */
public class BuscarUsuarios {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();

    public static void listar1(String busca) {
        DefaultTableModel modelo = (DefaultTableModel)tablaUsuarios.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM usuarios ORDER BY idusuario";
        } else {
             sql = "SELECT * FROM usuarios WHERE (idusuario LIKE'" + busca + "%' OR "
                    + "usuuser LIKE'" + busca + "%' OR usunombre LIKE'" + busca + "%' OR "
                    + "usucontra LIKE'" + busca + "%' OR usutelefono LIKE'" + busca + "%' OR "
                    + "usupermisos LIKE'" + busca + "%' OR "
                    + "usuestadocuenta LIKE'" + busca + "%' OR "
                    + "usudireccion LIKE'" + busca + "%') "
                    + "ORDER BY idusuario";
//            sql = "SELECT * FROM usuarios WHERE (idusuario LIKE'" + busca + "'  "
//                    + "usuuser LIKE'" + busca + "%' OR usunombre LIKE'" + busca + "%' OR "
//                    + "usucontra LIKE'" + busca + "%' OR usutelefono LIKE'" + busca + "%' OR "
//                    + "usupermisos LIKE'" + busca + "%' OR "
//                    + "usudireccion LIKE'" + busca + "%' OR "
//                    + "usuestadocuenta LIKE'" + busca + "%' OR "
//                    + "intentos LIKE'" + busca + "%') "
//                    + "ORDER BY idusuario";
        }
        String datos[] = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idusuario");
                datos[1] = rs.getString("usuuser");
                datos[2] = rs.getString("usunombre");                
//                datos[3] = rs.getString("usucontra");
                datos[3] = rs.getString("usutelefono");
                datos[4] = rs.getString("usupermisos");
                datos[5] = rs.getString("usudireccion");
                datos[6] = rs.getString("usuestadocuenta");
//                datos[8] = rs.getString("intentos");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
