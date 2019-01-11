/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import Principal.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yonathan
 */
public class OpcionesVentas {

    static conectar cc = new conectar();
    static Connection cn = cc.conexion();
    static PreparedStatement ps;

    public static void numerosVenta() {
        int c = 0;
        String SQL = "SELECT MAX(idventa) FROM ventas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            if (rs.next()) {
                c = rs.getInt(1);
            }

            if (c == 0) {
                Principal.Administrador.numVenta.setText("1");
            } else {
                Principal.Administrador.numVenta.setText(String.valueOf(c + 1));
            }

        } catch (SQLException ex) {
            Logger.getLogger(OpcionesVentas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int registrar(Sentencias uc) {
        int rsu = 0;
        String sql = Sentencias.REGISTRAR;
        try {
            ps = cn.prepareStatement(sql);
            ps.setInt(1, uc.getId_venta());
            ps.setString(2, uc.getNom_producto());
            ps.setString(3, uc.getPrecioArt());
            ps.setString(4, uc.getNomVendedor());
            ps.setString(5, uc.getNomCliente());
            ps.setString(6, uc.getDescuento());
            ps.setString(7, uc.getFecha());
            ps.setDouble(8, uc.getTotal());
            ps.setDouble(9, uc.getCantidad());
            ps.setDouble(10, uc.getImporte());
            ps.setString(11, uc.getCambio());
            ps.setString(12, uc.getTotalVenta());
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
//        System.out.println(sql);
        return rsu;
    }

}
