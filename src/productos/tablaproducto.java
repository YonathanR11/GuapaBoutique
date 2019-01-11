/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import Principal.Administrador;
import static Principal.Administrador.tablaProductos;
import Principal.conectar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author peto7
 */
public class tablaproducto {
    

        public void mostrardato(){
        DefaultTableModel modelo = (DefaultTableModel) Administrador.tablaProductos.getModel(); 
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        Object [] datos = new Object [7];     
        try{
           Statement comando=cn.createStatement();
           ResultSet rs = comando.executeQuery("SELECT  idproducto, prodnombre, prodprecio, prodescuento, prodexistencia, idcategoria, catnombre FROM productos");
           while (rs.next()) {
            datos [0] = rs.getObject(1);
            datos [1] = rs.getObject(2);
            datos [2] = rs.getObject(3);
            datos [3] = rs.getObject(4);
            datos [4] = rs.getObject(5);
            datos [5] = rs.getObject(6);
            datos [6] = rs.getObject(7);
            modelo.addRow(datos);
        }//            Logger.getLogger(AgregarProductosATabla
        rs.close();
        tablaProductos.setModel(modelo); 
        } catch (SQLException ex){
            System.out.println(ex);
        }
            
}
        conectar cc = new conectar();
        Connection cn = cc.conexion();
}
