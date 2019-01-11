/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import Principal.Administrador;
import static Principal.Administrador.tablaProductos;
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
public class BuscarProductoEnLista {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();

    public static void listar(String busca) {
        DefaultTableModel modelo = (DefaultTableModel) BuscarProducto.TablaBuscarProductos.getModel();

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
                datos[5] = rs.getString("catnombre");
                modelo.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarProductoEnLista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void mostrardato(){
        DefaultTableModel modelo2 = (DefaultTableModel) BuscarProducto.TablaBuscarProductos.getModel();
        while (modelo2.getRowCount() > 0) {
            modelo2.removeRow(0);
        }
        Object [] datos = new Object [7];     
        try{
           Statement comando=cn.createStatement();
           ResultSet rs = comando.executeQuery("SELECT  idproducto, prodnombre, prodprecio, prodescuento, prodexistencia, catnombre FROM productos");
           while (rs.next()) {
            datos [0] = rs.getObject(1);
            datos [1] = rs.getObject(2);
            datos [2] = rs.getObject(3);
            datos [3] = rs.getObject(4);
            datos [4] = rs.getObject(5);
            datos [5] = rs.getObject(6);
//            datos [6] = rs.getObject(7);
            modelo2.addRow(datos);
        }//            Logger.getLogger(AgregarProductosATabla
        rs.close();
        BuscarProducto.TablaBuscarProductos.setModel(modelo2); 
        } catch (SQLException ex){
            System.out.println(ex);
        }
            
}
    
}
