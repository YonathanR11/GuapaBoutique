package ventas;

import Principal.Administrador;
import static Principal.Administrador.codeproducto;
import static Principal.Administrador.tablaVentas;
import Principal.conectar;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Yonathan
 */
public class AgregarProductosATabla {

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    double precio;
    int cont = 0;
    String codigo, cantidad, valor4;
    final String id = "1";
    DefaultTableModel modelo235 = (DefaultTableModel) Administrador.tablaVentas.getModel();
    String[] ExistenciaInicial = new String[50];
    String[] ProductosVendidos = new String[50];

//    void mostrardato(String valor) {
//        DefaultTableModel modelo = (DefaultTableModel) Principal.tablaVentas.getModel();
//        tablaVentas.setModel(modelo);
//        String sql = "SELECT  idproducto, prodnombre, prodexistencia, prodprecio FROM productos WHERE idproducto = '" + valor + "'";
//        Object[] datos = new Object[6];
//        try {
//            Statement st = cn.createStatement();
//            ResultSet rs = st.executeQuery(sql);
//            while (rs.next()) {
//                datos[0] = rs.getObject(1);
//                datos[1] = rs.getObject(2);
//                datos[2] = rs.getObject(3);
////                datos[3] = rs.getObject(4);
//                datos[3] = "1";
//                datos[4] = rs.getObject(4);
//                valor4 = String.valueOf(datos[4]);
//                precio = Double.valueOf(valor4);
//                Principal.subtotalventas = Principal.subtotalventas + precio;
//                datos[5] = Principal.subtotalventas;
//                String total = String.valueOf(Principal.subtotalventas);
//                double t = Double.valueOf(total);
//                NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
//                Principal.totalpesos.setText(nf.format(t));
////                Principal.totalpesos.setText(total);
//                modelo.addRow(datos);
//            }
//            rs.close();
//        } catch (SQLException ex) {
//            System.out.println("ERROR en tabla ventas: " + ex);
//        }
//    }
    
    int cantT;
    int i;
    double subtotalvar;
    boolean desc;
    double vardes;
    double aux3;
    String codsub;
    public double t;
    
    public void enviar(String codigo, String cantidad) {
        boolean VerificarStock = ProductosEnCero(codigo);
        if (VerificarStock) {
        DefaultTableModel tabladet = (DefaultTableModel) tablaVentas.getModel();
        String[] dato = new String[7];

        String sql = "SELECT  idproducto, prodnombre, prodexistencia , prodprecio, prodescuento FROM productos WHERE idproducto = '" + codigo + "'";
        String cod = codigo;
        codsub = codigo;
        String nombre = null;
        String existencia = null;
        String precio = null;
        String descuento = null;
        String cant = String.valueOf(cantidad);
        
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
//                System.out.println("1");
                nombre = rs.getString("prodnombre");
                existencia = rs.getString("prodexistencia");
                precio = rs.getString("prodprecio");
                descuento = rs.getString("prodescuento");
                if (descuento.equals("0")) {
                    desc = false;
                }else{
                    desc = true;
                }
                int c = 0;
                for (i = 0; i < tablaVentas.getRowCount(); i++) {
//                    System.out.println("2");
                    Object com = tablaVentas.getValueAt(i, 0);
                    Object cant1 = tablaVentas.getValueAt(i, 3);
                    Object preciot = tablaVentas.getValueAt(i, 4);
                    if (cant1.equals("1")) {
                        double aux = Double.parseDouble((String)preciot) * 2;
//                        System.out.println("AUX: "+aux);
                        subtotalvar = Integer.parseInt((String) cant1) * aux;
                    } else {
                        int aux2 = Integer.parseInt((String) cant1) + 1;
//                        System.out.println("AUX: "+aux2);
                        subtotalvar = aux2 * Double.parseDouble((String) preciot);
                    }
//                    System.out.println("CANT1: "+cant1);
                    if (cod.equals(com)) {
//                        System.out.println("3 Igual");
                        cantT = Integer.parseInt(cant) + Integer.parseInt((String) cant1);
                        tabladet.removeRow(i);
                        dato[0] = cod;
                        dato[1] = nombre;
                        dato[2] = ActualizarStock(codigo, existencia);
                        dato[3] = Integer.toString(cantT);
                        if (desc) {
                            aux3 = DescuentoMetodo(precio, descuento);
                            dato[4] = String.valueOf(aux3);
                        }else{
                        dato[4] = precio;
                    }
                        dato[5] = descuento+"%";
                        dato[6] = Double.toString(subtotalvar);
                        tabladet.addRow(dato);
                        c = c + 1;
//                        System.out.println("=== TOTAL: "+subtotalvar);
//                        System.out.println("CALCULAR #1");
                        calcular();
                        i = tablaVentas.getRowCount();
                        Administrador.contadordeceldas = Administrador.contadordeceldas - 1;
                    }
                }
                if (c == 0) {
//                    System.out.println("4");
                    dato[0] = cod;
                    dato[1] = nombre;
                    dato[2] = ActualizarStock(codigo, existencia);
                    dato[3] = cant;
                    if (desc || cant.equals("1")) {
                            aux3 = DescuentoMetodo(precio, descuento);
                            dato[4] = String.valueOf(aux3);
                            subtotalvar = Integer.parseInt((String) cant) * Double.parseDouble(String.valueOf(aux3));
                        }else{
                        dato[4] = precio;
                    }
                    dato[5] = descuento+"%";
//                    if (cant.equals("1")) {
////                        System.out.println("5");
//                        subtotalvar = Integer.parseInt((String) cant) * Double.parseDouble((String) precio);
//                    }
                    dato[6] = Double.toString(subtotalvar);
                    tabladet.addRow(dato);
                    tablaVentas.setModel(tabladet);
//                    System.out.println("CALCULAR #2");
                    calcular();
                }
//                System.out.println("FIN");
//        System.out.println("============================================");
            }
            rs.close();
            tablaVentas.setModel(tabladet);
            cantT = 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(AgregarProductosATabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            JOptionPane.showMessageDialog(null, "Producto sin stock, no se puede vender.");
            Administrador.contadordeceldas = Administrador.contadordeceldas - 1;
//            codeproducto.setText("");
        }
    }

    public void calcular() {
//        System.out.println("7");
        String pre;
        String can;
        double total = 0;
        double precio;
        int cantidad;
        double imp = 0.0;

        for (int i = 0; i < tablaVentas.getRowCount(); i++) {
            pre = tablaVentas.getValueAt(i, 4).toString();
            can = tablaVentas.getValueAt(i, 3).toString();
            precio = Double.parseDouble(pre);
            cantidad = Integer.parseInt(can);
            imp = precio * cantidad;
            total = total + imp;
            tablaVentas.setValueAt(Math.rint(imp * 100) / 100, i, 6);
        }
        t = total;
        RealizarVenta.totale = t;
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.getDefault());
        Administrador.totalpesos.setText(nf.format(t));
    }
    
    public double DescuentoMetodo(String precio2, String descuento2) {
        double precioq = Double.parseDouble(precio2);
        double descuentoq = Double.parseDouble(descuento2);
        double des = (precioq * descuentoq) / 100;
        
        double totaldes = precioq-des;
        return totaldes;
//        return des;
    }
    
    public boolean ProductosEnCero(String codigo){
        boolean var = true;
        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT prodexistencia FROM productos WHERE idproducto = '"+codigo+"'");
            if (registro.next() == true) {
                String exi = registro.getString("prodexistencia");
                int numero = Integer.parseInt(exi);
//                System.out.println("EXI: "+exi);
//                System.out.println("Numero: "+numero);
                if (numero<=0) {
                    var = false;
                }else{
                    var = true;
                }
                
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
//        System.out.println("VAR: "+var);
        return var;
    }
    
//    public void ChecarStock() {
//        for (int i = 0; i < tablaVentas.getRowCount(); i++) {
//            Object idproducto = tablaVentas.getValueAt(i, 0);
//            String id = String.valueOf(idproducto);
//            System.out.println("Codigo: " + id);
//
//            ProductosVendidos[i] = String.valueOf(tablaVentas.getValueAt(i, 3));
//            System.out.println("Vendidos: "+ProductosVendidos[i]);
//            try {
//                Statement comando = cn.createStatement();
//                ResultSet registro = comando.executeQuery("SELECT prodexistencia FROM productos WHERE idproducto = " + id);
//                if (registro.next() == true) {
//                    ExistenciaInicial[i] = registro.getString("prodexistencia");
//                    System.out.println("Existencia: " + ExistenciaInicial[i]);
//                }
//            } catch (Exception e) {
//                System.out.println("ERROR: " + e);
//            }
//        }
//    }
    
    public String ActualizarStock(String code, String existenciaM) {
        int totalExistenciaNow = 0;
        int exis = Integer.parseInt(existenciaM);
//        System.out.println("Existencia: "+existenciaM);
//        System.out.println("Codigo: "+code);
            try {
                String sql = "UPDATE productos SET prodexistencia=? WHERE idproducto = '" + code + "'";
                PreparedStatement pst = cn.prepareStatement(sql);
//                int existencia = Integer.parseInt(ExistenciaInicial[i]);
//                int vendidos = Integer.parseInt(ProductosVendidos[i]);
                totalExistenciaNow = exis - 1;
//               System.out.println("NOW: "+totalExistenciaNow);
                pst.setString(1, String.valueOf(totalExistenciaNow));
                
                pst.executeUpdate();
            } catch (Exception e) {
                System.out.println("ERROR: " + e);
            }
        return String.valueOf(totalExistenciaNow);
    }
    
}
