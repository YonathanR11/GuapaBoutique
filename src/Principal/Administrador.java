package Principal;

import Alertas.AlertaSalir;
import Clientes.Eliminarcliente;
import Clientes.Modificarcliente;
import Clientes.NuevoCliente;
import java.awt.Image;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import Componentes.EstiloTablaHeader;
import Componentes.EstiloTablaRenderer;
import Componentes.MyScrollbarUI;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import Clientes.buscarcliente;
import Proveedores.EliminarProveedor;
import Proveedores.ModificarProveedor;
import Proveedores.NuevoProveedor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import productos.BuscarProductos;
import productos.EliminarProducto;
import productos.ModificarProducto;
import productos.NuevoProducto;
import usuarios.BuscarUsuarios;
import usuarios.EliminarUsuario;
import usuarios.ModificarUsuario;
import usuarios.NuevoUsuario;
import ventas.BuscarProducto;
import ventas.BuscarProductoEnLista;
import ventas.JTexFieldChanged;
import ventas.PocoStock;
import ventas.RealizarVenta;
/**
 *
 * @author Yonathan
 */
public class Administrador extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form Principal
     */
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(this);
        setIconImage(new ImageIcon(getClass().getResource("/img/imgsplash.jpg")).getImage());
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
        conectar cc = new conectar();
        Connection cn = cc.conexion();
         
        btnReportes.setVisible(false);
        
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Paneles.add(PaneInicio);
        Paneles.repaint();
        Paneles.revalidate();
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("/img/guapa.png"));
        Icon icono2 = new ImageIcon(imagen2.getImage().getScaledInstance(iconoleft.getWidth(), iconoleft.getHeight(), Image.SCALE_DEFAULT));
        iconoleft.setIcon(icono2);
        this.repaint();
        codeproducto.requestFocus();
        tablaVentas.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaVentas.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        jScrollPane1.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        tablaVentas.getColumnModel().getColumn(0).setPreferredWidth(130);
        tablaVentas.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaVentas.getColumnModel().getColumn(2).setPreferredWidth(70);
        tablaVentas.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaVentas.getColumnModel().getColumn(4).setPreferredWidth(65);
        tablaVentas.getColumnModel().getColumn(5).setPreferredWidth(102);
        tablaVentas.getColumnModel().getColumn(6).setPreferredWidth(100);
        tablaVentas.getTableHeader().setReorderingAllowed(false) ;
        tablaVentas.getTableHeader().setResizingAllowed(false);
        tablaVentas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        
        tablaProductos.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaProductos.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        tablaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane2.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        tablaProductos.getColumnModel().getColumn(0).setPreferredWidth(200);
        tablaProductos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tablaProductos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
        tablaProductos.getColumnModel().getColumn(4).setPreferredWidth(80);
        tablaProductos.getColumnModel().getColumn(5).setPreferredWidth(100);
        productos.tablaproducto ver = new productos.tablaproducto();
        ver.mostrardato();
        
        tablaClientes1.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaClientes1.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        tablaClientes1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane5.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        tablaClientes1.getColumnModel().getColumn(0).setPreferredWidth(15);//50
        tablaClientes1.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaClientes1.getColumnModel().getColumn(2).setPreferredWidth(60);//rfc
        tablaClientes1.getColumnModel().getColumn(3).setPreferredWidth(40);
        tablaClientes1.getColumnModel().getColumn(4).setPreferredWidth(190);
        tablaClientes1.getColumnModel().getColumn(5).setPreferredWidth(271);
        
        tablaProveedores.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaProveedores.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        tablaProveedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane3.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        tablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaProveedores.getColumnModel().getColumn(1).setPreferredWidth(180);
        tablaProveedores.getColumnModel().getColumn(2).setPreferredWidth(30);
        tablaProveedores.getColumnModel().getColumn(3).setPreferredWidth(200);
        tablaProveedores.getColumnModel().getColumn(4).setPreferredWidth(80);
        tablaProveedores.getColumnModel().getColumn(5).setPreferredWidth(200);
        
        tablaUsuarios.getTableHeader().setDefaultRenderer(new EstiloTablaHeader());
        tablaUsuarios.setDefaultRenderer(Object.class, new EstiloTablaRenderer());
        tablaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane6.getVerticalScrollBar().setUI(new MyScrollbarUI());
        jScrollPane6.getHorizontalScrollBar().setUI(new MyScrollbarUI());
        
        JTexFieldChanged b = new JTexFieldChanged();
        b.JTexFieldChanged(codeproducto);
        hilo = new Thread(this);
        hilo.start();
        fechaActual();
        
    }
    Thread hilo;
    String hora, minutos, segundos, ampm;
    Calendar calendario;
//    public static String codeproductobusca;
//    public static int subtotalventas;
    public static double subtotalventas;
    public static int contadordeceldas;
    public String NombreVendedorVentas = "Administrador";
    public static double totalrealizarventa2x;
    
    
    public void fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        this.fecha.setText(formatofecha.format(fecha));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Cabecera = new javax.swing.JPanel();
        SalirSistema = new javax.swing.JButton();
        iconoleft = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        horatxt = new javax.swing.JLabel();
        Paneles = new javax.swing.JPanel();
        PanelVentas = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        totalpesos = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        codeproducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbNombreVendedor = new javax.swing.JLabel();
        btnCancelarVenta = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        numVenta = new javax.swing.JLabel();
        yo = new javax.swing.JLabel();
        NombreCliente = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        CheckAdvertenciaPocoStock = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        PanelProductos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnNuevoProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        BuscarPro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PanelReportes = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Copy = new javax.swing.JPanel();
        PaneInicio = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        PanelClientes = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnNuevoCliente1 = new javax.swing.JButton();
        btnModificarCliente1 = new javax.swing.JButton();
        btnEliminarCliente1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaClientes1 = new javax.swing.JTable();
        BuscarCliente = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        PanelProveedores = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btnNuevoProveedor = new javax.swing.JButton();
        btnModificarProveedor = new javax.swing.JButton();
        btnEliminarProveedor = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        PanelUsuarios = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnNuevoUsuario = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();
        btnEliminarUsuario = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        BuscarUsuario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        PanelLateral = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReportes1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));

        Cabecera.setBackground(new java.awt.Color(197, 29, 116));

        SalirSistema.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        SalirSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Exit_32px_1.png"))); // NOI18N
        SalirSistema.setContentAreaFilled(false);
        SalirSistema.setFocusPainted(false);
        SalirSistema.setFocusable(false);
        SalirSistema.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirSistemaActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        horatxt.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        horatxt.setForeground(new java.awt.Color(255, 255, 255));
        horatxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout CabeceraLayout = new javax.swing.GroupLayout(Cabecera);
        Cabecera.setLayout(CabeceraLayout);
        CabeceraLayout.setHorizontalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                .addComponent(iconoleft, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horatxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SalirSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        CabeceraLayout.setVerticalGroup(
            CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CabeceraLayout.createSequentialGroup()
                .addGroup(CabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CabeceraLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(horatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalirSistema, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Paneles.setBackground(new java.awt.Color(204, 204, 204));
        Paneles.setLayout(new java.awt.CardLayout());

        PanelVentas.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(197, 29, 116));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shopping_Cart_32px.png"))); // NOI18N
        jLabel8.setText(" Ventas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 29, 116)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Total:");

        totalpesos.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        totalpesos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalpesos.setText("0.00");

        jButton5.setBackground(new java.awt.Color(197, 29, 116));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Realizar Venta");
        jButton5.setContentAreaFilled(false);
        jButton5.setFocusPainted(false);
        jButton5.setFocusable(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(totalpesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totalpesos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cliente:");

        codeproducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codeproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codeproductoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Producto:");

        jButton6.setBackground(new java.awt.Color(197, 29, 116));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Buscar producto");
        jButton6.setContentAreaFilled(false);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Vendedor:");

        lbNombreVendedor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbNombreVendedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(197, 29, 116)));

        btnCancelarVenta.setBackground(new java.awt.Color(197, 29, 116));
        btnCancelarVenta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar venta");
        btnCancelarVenta.setContentAreaFilled(false);
        btnCancelarVenta.setFocusPainted(false);
        btnCancelarVenta.setFocusable(false);
        btnCancelarVenta.setOpaque(true);
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("No. Venta:");

        numVenta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        numVenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numVenta.setToolTipText("");
        numVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        yo.setText("Codigo");

        NombreCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NombreCliente.setText("Cliente General");
        NombreCliente.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(197, 29, 116)));

        jButton1.setBackground(new java.awt.Color(197, 29, 116));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_25px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "STOCK", "CANTIDAD", "PRECIO", "DESCUENTO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaVentas.setDoubleBuffered(true);
        tablaVentas.setFocusable(false);
        tablaVentas.setRowHeight(20);
        tablaVentas.getTableHeader().setResizingAllowed(false);
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVentas);

        CheckAdvertenciaPocoStock.setBackground(new java.awt.Color(255, 255, 255));
        CheckAdvertenciaPocoStock.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CheckAdvertenciaPocoStock.setText("Mostrar advertencia de productos de poco stock");
        CheckAdvertenciaPocoStock.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Mostrar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelVentasLayout = new javax.swing.GroupLayout(PanelVentas);
        PanelVentas.setLayout(PanelVentasLayout);
        PanelVentasLayout.setHorizontalGroup(
            PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelVentasLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(codeproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addGap(35, 35, 35)
                        .addComponent(yo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentasLayout.createSequentialGroup()
                        .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelVentasLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 262, Short.MAX_VALUE))
                            .addComponent(NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNombreVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelVentasLayout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelarVenta))
                    .addGroup(PanelVentasLayout.createSequentialGroup()
                        .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(PanelVentasLayout.createSequentialGroup()
                                .addComponent(CheckAdvertenciaPocoStock)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelVentasLayout.setVerticalGroup(
            PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentasLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codeproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentasLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNombreVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NombreCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckAdvertenciaPocoStock)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                .addContainerGap())
        );

        Paneles.add(PanelVentas, "card2");

        PanelProductos.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(197, 29, 116));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shopping_Basket_32px.png"))); // NOI18N
        jLabel5.setText(" Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnNuevoProducto.setBackground(new java.awt.Color(197, 29, 116));
        btnNuevoProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProducto.setText("Nuevo producto");
        btnNuevoProducto.setContentAreaFilled(false);
        btnNuevoProducto.setFocusPainted(false);
        btnNuevoProducto.setOpaque(true);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        btnModificarProducto.setBackground(new java.awt.Color(197, 29, 116));
        btnModificarProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar");
        btnModificarProducto.setContentAreaFilled(false);
        btnModificarProducto.setFocusPainted(false);
        btnModificarProducto.setOpaque(true);
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(197, 29, 116));
        btnEliminarProducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setContentAreaFilled(false);
        btnEliminarProducto.setFocusPainted(false);
        btnEliminarProducto.setOpaque(true);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        tablaProductos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "NOMBRE", "PRECIO", "DESCUENTO", "EXISTENCIA", "CATEGORIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProductos.setDoubleBuffered(true);
        tablaProductos.setFocusable(false);
        tablaProductos.setRowHeight(20);
        tablaProductos.getTableHeader().setResizingAllowed(false);
        tablaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaProductos);

        BuscarPro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuscarPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarProKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarProKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Buscar:");

        javax.swing.GroupLayout PanelProductosLayout = new javax.swing.GroupLayout(PanelProductos);
        PanelProductos.setLayout(PanelProductosLayout);
        PanelProductosLayout.setHorizontalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(PanelProductosLayout.createSequentialGroup()
                        .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelProductosLayout.setVerticalGroup(
            PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarPro)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paneles.add(PanelProductos, "card2");

        PanelReportes.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setBackground(new java.awt.Color(197, 29, 116));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reporte de productos");
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(197, 29, 116));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Report_Card_32px.png"))); // NOI18N
        jLabel19.setText(" Reportes");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelReportesLayout = new javax.swing.GroupLayout(PanelReportes);
        PanelReportes.setLayout(PanelReportesLayout);
        PanelReportesLayout.setHorizontalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(945, Short.MAX_VALUE))
        );
        PanelReportesLayout.setVerticalGroup(
            PanelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReportesLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(637, Short.MAX_VALUE))
        );

        Paneles.add(PanelReportes, "card2");

        Copy.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout CopyLayout = new javax.swing.GroupLayout(Copy);
        Copy.setLayout(CopyLayout);
        CopyLayout.setHorizontalGroup(
            CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1182, Short.MAX_VALUE)
        );
        CopyLayout.setVerticalGroup(
            CopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 744, Short.MAX_VALUE)
        );

        Paneles.add(Copy, "card2");

        PaneInicio.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/imgsplash.jpg"))); // NOI18N

        javax.swing.GroupLayout PaneInicioLayout = new javax.swing.GroupLayout(PaneInicio);
        PaneInicio.setLayout(PaneInicioLayout);
        PaneInicioLayout.setHorizontalGroup(
            PaneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneInicioLayout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel18)
                .addContainerGap(274, Short.MAX_VALUE))
        );
        PaneInicioLayout.setVerticalGroup(
            PaneInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        Paneles.add(PaneInicio, "card2");

        PanelClientes.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(197, 29, 116));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Contacts_32px.png"))); // NOI18N
        jLabel12.setText(" Clientes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnNuevoCliente1.setBackground(new java.awt.Color(197, 29, 116));
        btnNuevoCliente1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNuevoCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente1.setText("Nuevo cliente");
        btnNuevoCliente1.setContentAreaFilled(false);
        btnNuevoCliente1.setFocusPainted(false);
        btnNuevoCliente1.setOpaque(true);
        btnNuevoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCliente1ActionPerformed(evt);
            }
        });

        btnModificarCliente1.setBackground(new java.awt.Color(197, 29, 116));
        btnModificarCliente1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarCliente1.setText("Modificar");
        btnModificarCliente1.setContentAreaFilled(false);
        btnModificarCliente1.setFocusPainted(false);
        btnModificarCliente1.setOpaque(true);
        btnModificarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCliente1ActionPerformed(evt);
            }
        });

        btnEliminarCliente1.setBackground(new java.awt.Color(197, 29, 116));
        btnEliminarCliente1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarCliente1.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCliente1.setText("Eliminar");
        btnEliminarCliente1.setContentAreaFilled(false);
        btnEliminarCliente1.setFocusPainted(false);
        btnEliminarCliente1.setOpaque(true);
        btnEliminarCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCliente1ActionPerformed(evt);
            }
        });

        tablaClientes1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaClientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "RFC", "TELEFONO", "CORREO", "DIRECCION"
            }
        ));
        tablaClientes1.setDoubleBuffered(true);
        tablaClientes1.setFocusable(false);
        tablaClientes1.setRowHeight(20);
        tablaClientes1.getTableHeader().setResizingAllowed(false);
        tablaClientes1.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tablaClientes1);

        BuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuscarCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarClienteKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarClienteKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Buscar:");

        javax.swing.GroupLayout PanelClientesLayout = new javax.swing.GroupLayout(PanelClientes);
        PanelClientes.setLayout(PanelClientesLayout);
        PanelClientesLayout.setHorizontalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(PanelClientesLayout.createSequentialGroup()
                        .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelClientesLayout.setVerticalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnModificarCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarCliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarCliente)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paneles.add(PanelClientes, "card9");

        PanelProveedores.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setText("Proveedores");

        btnNuevoProveedor.setBackground(new java.awt.Color(197, 29, 116));
        btnNuevoProveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNuevoProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoProveedor.setText("Nuevo Proveedor");
        btnNuevoProveedor.setContentAreaFilled(false);
        btnNuevoProveedor.setFocusPainted(false);
        btnNuevoProveedor.setOpaque(true);
        btnNuevoProveedor.setPreferredSize(new java.awt.Dimension(153, 30));
        btnNuevoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProveedorActionPerformed(evt);
            }
        });

        btnModificarProveedor.setBackground(new java.awt.Color(197, 29, 116));
        btnModificarProveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProveedor.setText("Modificar");
        btnModificarProveedor.setContentAreaFilled(false);
        btnModificarProveedor.setFocusPainted(false);
        btnModificarProveedor.setOpaque(true);
        btnModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProveedorActionPerformed(evt);
            }
        });

        btnEliminarProveedor.setBackground(new java.awt.Color(197, 29, 116));
        btnEliminarProveedor.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarProveedor.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedor.setText("Eliminar");
        btnEliminarProveedor.setContentAreaFilled(false);
        btnEliminarProveedor.setFocusPainted(false);
        btnEliminarProveedor.setOpaque(true);
        btnEliminarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedorActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(197, 29, 116));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_People_32px.png"))); // NOI18N
        jLabel15.setText("Proveedores");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        tablaProveedores.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TELEFONO", "DIRECCION", "PAGINA WEB", "CORREO"
            }
        ));
        tablaProveedores.setDoubleBuffered(true);
        tablaProveedores.setFocusable(false);
        tablaProveedores.setRowHeight(20);
        tablaProveedores.getTableHeader().setResizingAllowed(false);
        tablaProveedores.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaProveedores);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Buscar:");

        javax.swing.GroupLayout PanelProveedoresLayout = new javax.swing.GroupLayout(PanelProveedores);
        PanelProveedores.setLayout(PanelProveedoresLayout);
        PanelProveedoresLayout.setHorizontalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                                .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 372, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        PanelProveedoresLayout.setVerticalGroup(
            PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProveedoresLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEliminarProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paneles.add(PanelProveedores, "card2");

        PanelUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(197, 29, 116));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Contacts_32px.png"))); // NOI18N
        jLabel16.setText(" Usuarios");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        btnNuevoUsuario.setBackground(new java.awt.Color(197, 29, 116));
        btnNuevoUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoUsuario.setText("Nuevo usuario");
        btnNuevoUsuario.setContentAreaFilled(false);
        btnNuevoUsuario.setFocusPainted(false);
        btnNuevoUsuario.setOpaque(true);
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        btnModificarUsuario.setBackground(new java.awt.Color(197, 29, 116));
        btnModificarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnModificarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarUsuario.setText("Modificar");
        btnModificarUsuario.setContentAreaFilled(false);
        btnModificarUsuario.setFocusPainted(false);
        btnModificarUsuario.setOpaque(true);
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        btnEliminarUsuario.setBackground(new java.awt.Color(197, 29, 116));
        btnEliminarUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarUsuario.setText("Eliminar");
        btnEliminarUsuario.setContentAreaFilled(false);
        btnEliminarUsuario.setFocusPainted(false);
        btnEliminarUsuario.setOpaque(true);
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        tablaUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "USUARIO", "NOMBRE", "TELEFONO", "TIPO", "DIRECCION", "ESTADO CUENTA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaUsuarios.setDoubleBuffered(true);
        tablaUsuarios.setFocusable(false);
        tablaUsuarios.setRowHeight(20);
        tablaUsuarios.getTableHeader().setResizingAllowed(false);
        tablaUsuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(tablaUsuarios);

        BuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BuscarUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarUsuarioKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("Buscar:");

        javax.swing.GroupLayout PanelUsuariosLayout = new javax.swing.GroupLayout(PanelUsuarios);
        PanelUsuarios.setLayout(PanelUsuariosLayout);
        PanelUsuariosLayout.setHorizontalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(PanelUsuariosLayout.createSequentialGroup()
                        .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelUsuariosLayout.setVerticalGroup(
            PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuariosLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnModificarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );

        Paneles.add(PanelUsuarios, "card10");

        PanelLateral.setBackground(new java.awt.Color(255, 255, 255));

        btnInicio.setBackground(new java.awt.Color(197, 29, 116));
        btnInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(255, 255, 255));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Home_32px.png"))); // NOI18N
        btnInicio.setText(" Inicio");
        btnInicio.setContentAreaFilled(false);
        btnInicio.setFocusPainted(false);
        btnInicio.setFocusable(false);
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.setOpaque(true);
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(197, 29, 116));
        btnVentas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shopping_Cart_32px.png"))); // NOI18N
        btnVentas.setText(" Ventas");
        btnVentas.setContentAreaFilled(false);
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVentas.setOpaque(true);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnUsuarios.setBackground(new java.awt.Color(197, 29, 116));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Contacts_32px.png"))); // NOI18N
        btnUsuarios.setText("Usuarios");
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setFocusPainted(false);
        btnUsuarios.setFocusable(false);
        btnUsuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuarios.setOpaque(true);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(197, 29, 116));
        btnProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Shopping_Basket_32px.png"))); // NOI18N
        btnProductos.setText("Productos");
        btnProductos.setContentAreaFilled(false);
        btnProductos.setFocusPainted(false);
        btnProductos.setFocusable(false);
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProductos.setOpaque(true);
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(197, 29, 116));
        btnProveedores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_People_32px.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setFocusPainted(false);
        btnProveedores.setFocusable(false);
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProveedores.setOpaque(true);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnReportes.setBackground(new java.awt.Color(197, 29, 116));
        btnReportes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Report_Card_32px.png"))); // NOI18N
        btnReportes.setText("Reportes");
        btnReportes.setContentAreaFilled(false);
        btnReportes.setFocusPainted(false);
        btnReportes.setFocusable(false);
        btnReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes.setOpaque(true);
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(197, 29, 116));
        btnClientes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Contacts_32px.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setContentAreaFilled(false);
        btnClientes.setFocusPainted(false);
        btnClientes.setFocusable(false);
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.setOpaque(true);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnReportes1.setBackground(new java.awt.Color(197, 29, 116));
        btnReportes1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnReportes1.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Report_Card_32px.png"))); // NOI18N
        btnReportes1.setText("Cerrar Sesion");
        btnReportes1.setContentAreaFilled(false);
        btnReportes1.setFocusPainted(false);
        btnReportes1.setFocusable(false);
        btnReportes1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReportes1.setOpaque(true);
        btnReportes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVentas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReportes1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReportes1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Paneles, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Cabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Cabecera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Paneles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirSistemaActionPerformed
        AlertaSalir abrir = new AlertaSalir(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_SalirSistemaActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        usuarios.pruebausuarios ver = new usuarios.pruebausuarios();
        ver.mostrardato();
        Paneles.add(PanelUsuarios);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Paneles.add(PanelVentas);
        Paneles.repaint();
        Paneles.revalidate();
        lbNombreVendedor.setText(NombreVendedorVentas);
        ventas.OpcionesVentas.numerosVenta();
        codeproducto.requestFocus();
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Paneles.add(PaneInicio);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Paneles.add(PanelProductos);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnProductosActionPerformed
                    

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Proveedores.pruebaproveedores ver = new Proveedores.pruebaproveedores();
        ver.mostrardato();
        Paneles.add(PanelProveedores);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Paneles.add(PanelReportes);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        NuevoProducto abrir = new NuevoProducto(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        if (tablaProductos.getSelectedRow() == -1) {
            productos.Error abrir = new productos.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
        ModificarProducto abrir = new ModificarProducto(new JFrame(), true);
        abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        if (tablaProductos.getSelectedRow() == -1) {
            productos.Error abrir = new productos.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
        EliminarProducto abrir = new EliminarProducto(new JFrame(), true);
        abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        BuscarProducto abrir = new BuscarProducto(new JFrame(), true);
        BuscarProductoEnLista.listar("");
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        ventas.CancelarVenta abrir = new ventas.CancelarVenta(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        Paneles.removeAll();
        Paneles.repaint();
        Paneles.revalidate();
        Clientes.pruebaclientes ver2 = new Clientes.pruebaclientes();
        ver2.mostrardato();
        Paneles.add(PanelClientes);
        Paneles.repaint();
        Paneles.revalidate();
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReportes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportes1ActionPerformed
        Alertas.AlertaCerrarSesion abrir = new Alertas.AlertaCerrarSesion(new JFrame(), true);
        abrir.setVisible(true);
        hilo.stop();
        this.setVisible(false);
    }//GEN-LAST:event_btnReportes1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventas.SeleccionarCliente abrir = new ventas.SeleccionarCliente(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        RealizarVenta abrir = new RealizarVenta(new JFrame(), true);
        abrir.totalrealizar.setText(totalpesos.getText());
        abrir.importe.setEditable(true);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void codeproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeproductoKeyTyped
        int caracteres=13;
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();  //Limita solo la escritura de numeros en el jtextfield
        if(codeproducto.getText().length()>=caracteres){ //Limita a 13 digitos numericos
           evt.consume();
        }
    }//GEN-LAST:event_codeproductoKeyTyped

    private void btnNuevoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCliente1ActionPerformed
        NuevoCliente abrir = new NuevoCliente(new JFrame(), true);
        abrir.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoCliente1ActionPerformed

    private void btnModificarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCliente1ActionPerformed
        if (tablaClientes1.getSelectedRow() == -1) {
            Clientes.Error abrir = new Clientes.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
            Modificarcliente abrir = new Modificarcliente(new JFrame(), true);
            abrir.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarCliente1ActionPerformed

    private void btnEliminarCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCliente1ActionPerformed
        if (tablaClientes1.getSelectedRow() == -1) {
            Clientes.Error abrir = new Clientes.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
            Eliminarcliente abrir = new Eliminarcliente(new JFrame(), true);
            abrir.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarCliente1ActionPerformed

    private void btnNuevoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProveedorActionPerformed
        NuevoProveedor abrir = new NuevoProveedor(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_btnNuevoProveedorActionPerformed

    private void btnModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProveedorActionPerformed
        if (tablaProveedores.getSelectedRow() == -1) {
            Proveedores.Error abrir = new Proveedores.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
            ModificarProveedor abrir = new ModificarProveedor(new JFrame(), true);
            abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarProveedorActionPerformed

    private void btnEliminarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedorActionPerformed
        EliminarProveedor abrir = new EliminarProveedor(new JFrame(), true);
        abrir.setVisible(true);
    }//GEN-LAST:event_btnEliminarProveedorActionPerformed

    private void BuscarProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarProKeyReleased
        BuscarProductos.listar(BuscarPro.getText());
    }//GEN-LAST:event_BuscarProKeyReleased

    private void BuscarProKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarProKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_BuscarProKeyTyped

    private void BuscarClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarClienteKeyReleased
        buscarcliente.listar(BuscarCliente.getText());
    }//GEN-LAST:event_BuscarClienteKeyReleased

    private void BuscarClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarClienteKeyTyped
                char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_BuscarClienteKeyTyped

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        NuevoUsuario abrir = new NuevoUsuario(new JFrame(), true);
        abrir.setVisible(true); 
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        if (tablaUsuarios.getSelectedRow() == -1) {
            usuarios.Error abrir = new usuarios.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
            ModificarUsuario abrir = new ModificarUsuario(new JFrame(), true);
            abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
        if (tablaUsuarios.getSelectedRow() == -1) {
            usuarios.Error abrir = new usuarios.Error(new JFrame(), true);
            abrir.setVisible(true);
        }else{
            EliminarUsuario abrir = new EliminarUsuario(new JFrame(), true);
            abrir.setVisible(true);
        }
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void BuscarUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarUsuarioKeyReleased
        BuscarUsuarios.listar1(BuscarUsuario.getText());
    }//GEN-LAST:event_BuscarUsuarioKeyReleased

    private void BuscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarUsuarioKeyTyped
        char letras = evt.getKeyChar();
        if (Character.isLowerCase(letras)) {
            String cad = ("" + letras).toUpperCase();
            letras = cad.charAt(0);
            evt.setKeyChar(letras);
        }
    }//GEN-LAST:event_BuscarUsuarioKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        reportes.MetodosReportes.ReporteProductos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        PocoStock abrir = new PocoStock(new JFrame(), true);
                abrir.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked
    
    
    //Hilo
    public void run() {
        for (;;) {
            try {
                calculaHora();
                horatxt.setText(hora + ":" + minutos + " " + ampm);
                int filas = tablaVentas.getRowCount();
                if (filas > contadordeceldas) {
                    codeproducto.setText("");
                    contadordeceldas = contadordeceldas + 1;
                }
                Thread.sleep(100);
            } catch (InterruptedException localInterruptedException1) {
                System.out.println("Error: " + localInterruptedException1);
            }
        }
    }
    
    public void calculaHora() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
                }
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BuscarCliente;
    private javax.swing.JTextField BuscarPro;
    private javax.swing.JTextField BuscarUsuario;
    private javax.swing.JPanel Cabecera;
    public static javax.swing.JCheckBox CheckAdvertenciaPocoStock;
    private javax.swing.JPanel Copy;
    private javax.swing.JPanel Fondo;
    public static javax.swing.JLabel NombreCliente;
    public javax.swing.JPanel PaneInicio;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelProveedores;
    private javax.swing.JPanel PanelReportes;
    private javax.swing.JPanel PanelUsuarios;
    public static javax.swing.JPanel PanelVentas;
    public static javax.swing.JPanel Paneles;
    private javax.swing.JButton SalirSistema;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEliminarCliente1;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedor;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnModificarCliente1;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JButton btnModificarProveedor;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JButton btnNuevoCliente1;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnNuevoProveedor;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReportes1;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    public static javax.swing.JTextField codeproducto;
    public static javax.swing.JLabel fecha;
    public static javax.swing.JLabel horatxt;
    private javax.swing.JLabel iconoleft;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JLabel lbNombreVendedor;
    public static javax.swing.JLabel numVenta;
    public static javax.swing.JTable tablaClientes1;
    public static javax.swing.JTable tablaProductos;
    public static javax.swing.JTable tablaProveedores;
    public static javax.swing.JTable tablaUsuarios;
    public static javax.swing.JTable tablaVentas;
    public static javax.swing.JLabel totalpesos;
    public static javax.swing.JLabel yo;
    // End of variables declaration//GEN-END:variables
}
