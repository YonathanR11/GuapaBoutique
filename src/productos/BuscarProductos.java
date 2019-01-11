/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

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
public class BuscarProductos {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Administrador.tablaProductos.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM productos ORDER BY prodnombre";
        } else {
            sql = "SELECT * FROM productos WHERE (idproducto LIKE'" + busca + "%' OR "
                    + "prodnombre LIKE'" + busca + "%' OR prodprecio LIKE'" + busca + "%' OR "
                    + "prodescuento LIKE'" + busca + "%' OR "
                    + "prodexistencia LIKE'" + busca + "%' OR "
                    + "idcategoria LIKE'" + busca + "%' OR "
                    + "catnombre LIKE'" + busca + "%') "
                    + "ORDER BY idproducto";
        }
        String datos[] = new String[7];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idproducto");
                datos[1] = rs.getString("prodnombre");
                datos[2] = rs.getString("prodprecio");
                datos[3] = rs.getString("prodescuento");
                datos[4] = rs.getString("prodexistencia");
                datos[5] = rs.getString("idcategoria");
                datos[6] = rs.getString("catnombre");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
