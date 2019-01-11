/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Principal.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class buscarcliente {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) Principal.Administrador.tablaClientes1.getModel();

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        String sql = "";
        if (busca.equals("")) {
            sql = "SELECT * FROM clientes ORDER BY clinombre";
        } else {
            sql = "SELECT * FROM clientes WHERE (idcliente LIKE'" + busca + "%' OR "
                    + "clinombre LIKE'" + busca + "%' OR clirfc LIKE'" + busca + "%' OR "
                    + "clitelefono LIKE'" + busca + "%' OR clicorreoelectronico LIKE'" + busca + "%' OR "
                    + "clidireccion LIKE'" + busca +"%') "
                    + "ORDER BY idcliente";
        }
        String datos[] = new String[6];
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                datos[0] = rs.getString("idcliente");
                datos[1] = rs.getString("clinombre");
                datos[2] = rs.getString("clirfc");
                datos[3] = rs.getString("clitelefono");
                datos[4] = rs.getString("clicorreoelectronico");
                datos[5] = rs.getString("clidireccion");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(buscarcliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

