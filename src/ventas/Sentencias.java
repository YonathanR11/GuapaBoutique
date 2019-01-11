/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

/**
 *
 * @author Yonathan
 */
public class Sentencias {
    public static String LISTAR = "SELECT * FROM producto ORDER BY tipoproducto";
    public static String LISTAR1 = "SELECT * FROM ventas, producto WHERE id_producto = idproducto";

    public static String REGISTRAR = "INSERT INTO ventas(idventa, comnombrearticulo, precioarticulo, comnombrevendedor, comnombrecliente, comdescuento, comfecha, commontototal, nomcantidadarticulosvendidos, importe, cambio,total) "
            + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";

    public static String ACTUALIZAR = "UPDATE producto SET "
            + "nombre=?, "
            + "descripcion=?, "
            + "tipoproducto=?, "
            + "precio=? "
            + "WHERE idproducto=?";

    public static String ELIMINAR = "DELETE FROM ventas WHERE idventa = ?";

    public static String ELIMINAR_TODO = "TRUNCATE TABLE ventas";

    private int id_venta;
    private String NomProducto;
    private String precio;
    private String NomVendedor;
    private String NomCliente;
    private int cantidad;
    private String descuento;
    private double total;
    private String fecha;
    private int importe;
    private String cambio;
    private String totalventa;

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public String getNom_producto() {
        return NomProducto;
    }

    public void setNom_producto(String NomProducto){
        this.NomProducto = NomProducto;
    }
    
    public String getPrecioArt() {
        return precio;
    }

    public void setPrecioArt(String precio) {
        this.precio = precio;
    }
    
    public String getNomVendedor() {
        return NomVendedor;
    }
    
    public void setNomVendedor(String NomVendedor) {
        this.NomVendedor = NomVendedor;
    }
    
    public String getNomCliente() {
        return NomCliente;
    }
    
    public void setNomCliente(String NomCliente) {
        this.NomCliente = NomCliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getDescuento() {
        return descuento;
    }
    
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getImporte() {
        return importe;
    }

    public void setImporte(int importe) {
        this.importe = importe;
    }
    
    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    
    public String getTotalVenta() {
        return totalventa;
    }

    public void setTotalVenta(String totalventa) {
        this.totalventa = totalventa;
    }
}
