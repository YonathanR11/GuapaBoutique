/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import productos.*;
import Principal.Administrador;
import static Principal.Administrador.tablaUsuarios;
import Principal.conectar;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peto7
 */
public final class ModificarUsuario extends javax.swing.JDialog {
    //String idproducto2;
    //}catch(Exception e){

    //}
    /**
     * Creates new form ModificarProducto
     */
    public ModificarUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        idusuario.setTransferHandler(null);        
        usuarionombre.setTransferHandler(null);
        usuariocontra.setTransferHandler(null);
        usuariodireccion.setTransferHandler(null);
        usuariotelefono.setTransferHandler(null);
                
        this.setLocationRelativeTo(Administrador.Paneles);
        int filaseleccionada = tablaUsuarios.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) Administrador.tablaUsuarios.getModel();
        idusuario.setText(tablaUsuarios.getValueAt(filaseleccionada, 0).toString());
        usuario.setText(tablaUsuarios.getValueAt(filaseleccionada, 1).toString());
        usuarionombre.setText(tablaUsuarios.getValueAt(filaseleccionada, 2).toString());
//        usuariocontra.setText(tablaUsuarios.getValueAt(filaseleccionada, 3).toString());
        usuariocontra.setText(mostrardato(idusuario.getText()));
        usuariotelefono.setText(tablaUsuarios.getValueAt(filaseleccionada, 3).toString());
        usuariodireccion.setText(tablaUsuarios.getValueAt(filaseleccionada, 5).toString());
//        catnombre.setText(tablaProductos.getValueAt(filaseleccionada, 6).toString());
String estado = tablaUsuarios.getValueAt(filaseleccionada, 6).toString();
        if (estado.equals("ACTIVADA")) {
            estadobox.setSelectedIndex(0);
        }else{
            estadobox.setSelectedIndex(1);
        }
        String tipo = tablaUsuarios.getValueAt(filaseleccionada, 4).toString();
        if (tipo.equals("ADMINISTRADOR")) {
            tipobox.setSelectedIndex(0);
        }else{
            tipobox.setSelectedIndex(1);
        }
//        idusuario2.setText(idusuario.getText());   
    }

    int x, y;
    int cont = 0;
    public String mostrardato( String id){
//        Object idusu=id;
 double idu=Double.parseDouble(id);
    String [] datos = new String [1];     
        try{
           Statement comando=cn.createStatement();
           ResultSet rs = comando.executeQuery("SELECT usucontra FROM usuarios WHERE idusuario="+idu);
           while (rs.next()) {
            datos [0] = rs.getString(1);
           }
           rs.close();
        }
           catch (SQLException ex){
            System.out.println(ex);
                   
                   }        
    return datos[0];
    }
    

//    public void defineUsuario(String palabra) {
//        try {
//            String palabraRecibida = palabra;
////            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/terrenos", "root", "");
//            String query = "select * from usuarios where usucontra = ?";
//            PreparedStatement consulta = cn.prepareStatement(query);
//            consulta.setString(1, palabraRecibida);
//            ResultSet resultado = consulta.executeQuery();
//        } catch (Exception e) {
//            System.err.println("Error en abrir la conexión");
//            System.err.println("ERROR:" + e.getMessage());
////            System.exit(0);
//        }
////        return resultado;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        usuariodireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        usuariotelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        usuariocontra = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        usuarionombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idusuario = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CambiaContra = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        estadobox = new javax.swing.JComboBox<>();
        tipobox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 29, 116), 3, true));

        jButton1.setBackground(new java.awt.Color(197, 29, 116));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usuariodireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariodireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuariodireccionKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dirección:");

        usuariotelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariotelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuariotelefonoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefono:");

        usuariocontra.setEditable(false);
        usuariocontra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuariocontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuariocontraKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contraseña:");

        usuarionombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuarionombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarionombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuarioKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Usuario:");

        idusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jButton2.setBackground(new java.awt.Color(197, 29, 116));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancelar");
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(197, 29, 116));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Modificar Usuario");
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        CambiaContra.setBackground(new java.awt.Color(197, 29, 116));
        CambiaContra.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CambiaContra.setForeground(new java.awt.Color(255, 255, 255));
        CambiaContra.setText("Cambiar");
        CambiaContra.setContentAreaFilled(false);
        CambiaContra.setFocusPainted(false);
        CambiaContra.setOpaque(true);
        CambiaContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiaContraActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cuenta :");

        estadobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        estadobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVADA", "BLOQUEADA" }));
        estadobox.setSelectedIndex(-1);
        estadobox.setFocusable(false);

        tipobox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tipobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "NORMAL" }));
        tipobox.setSelectedIndex(-1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TIPO :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(53, 53, 53))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(9, 9, 9)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usuarionombre)
                            .addComponent(usuariodireccion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usuariotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(usuariocontra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CambiaContra))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tipobox, javax.swing.GroupLayout.Alignment.LEADING, 0, 197, Short.MAX_VALUE)
                                        .addComponent(estadobox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 72, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarionombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariocontra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CambiaContra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariotelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuariodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estadobox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipobox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String sql = "UPDATE usuarios SET usuuser=?, usunombre=?, usutelefono=?, usudireccion=?, usuestadocuenta=?, intentos=?, usupermisos=? WHERE idusuario='" + idusuario.getText() + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
//            pst.setString(1,idusuario2.getText());
            pst.setString(1, usuario.getText());
            pst.setString(2, usuarionombre.getText());
            pst.setString(3, usuariotelefono.getText());
            pst.setString(4, usuariodireccion.getText());
            if (estadobox.getSelectedIndex() == 0) {
                pst.setString(5, "ACTIVADA");
                pst.setString(6, "3");
            }else{
                pst.setString(5, "BLOQUEADA");
                pst.setString(6, "0");
            }
            if (tipobox.getSelectedIndex() == 0) {
                pst.setString(7, "ADMINISTRADOR");
            }else{
                pst.setString(7, "NORMAL");
            }
//            pst.setString(7,catnombre.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Actualizados Correctamente!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
//            JOptionPane.showMessageDialog(null,"Ocurrio un problema!");
        }
//        }else{
//            JOptionPane.showMessageDialog(null,"llene correcatamente todos los campos","Error",2);
//        }
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
        int filas = tablaUsuarios.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        usuarios.pruebausuarios ver = new usuarios.pruebausuarios();
        ver.mostrardato();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarioKeyTyped
        int caracteres = 20;
        if (usuario.getText().length() >= caracteres) {
            evt.consume();
        }
//        int caracteres = 5;
//        char c = evt.getKeyChar();
//        if (c < '0' || c > '9') {
//            evt.consume();
//            cont = cont + 1;
//        }
//        if (idusuario.getText().length() >= caracteres) {
//            evt.consume();
//            cont = cont + 1;
//        }
    }//GEN-LAST:event_usuarioKeyTyped

    private void usuarionombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuarionombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
            cont = cont + 1;
        }
    }//GEN-LAST:event_usuarionombreKeyTyped

    private void usuariocontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariocontraKeyTyped
        int caracteres = 15;
        if (usuariocontra.getText().length() >= caracteres) {
            evt.consume();
            cont = cont + 1;
        }
    }//GEN-LAST:event_usuariocontraKeyTyped

    private void usuariotelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariotelefonoKeyTyped
        int caracteres = 10;
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
            cont = cont + 1;
        }
        if (usuariotelefono.getText().length() >= caracteres) {
            evt.consume();
            cont = cont + 1;
        }
    }//GEN-LAST:event_usuariotelefonoKeyTyped

    private void usuariodireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuariodireccionKeyTyped
        int caracteres = 60;
        if (usuariodireccion.getText().length() >= caracteres) {
            evt.consume();
            cont = cont + 1;
        }
    }//GEN-LAST:event_usuariodireccionKeyTyped

    private void CambiaContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiaContraActionPerformed
        usuarios.CambiarContra abrir = new usuarios.CambiarContra(new JFrame(), true);
            abrir.setVisible(true);
    }//GEN-LAST:event_CambiaContraActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarUsuario dialog = new ModificarUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    conectar cc = new conectar();
    Connection cn = cc.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CambiaContra;
    private javax.swing.JComboBox<String> estadobox;
    public static javax.swing.JLabel idusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> tipobox;
    private javax.swing.JTextField usuario;
    public static javax.swing.JTextField usuariocontra;
    private javax.swing.JTextField usuariodireccion;
    private javax.swing.JTextField usuarionombre;
    private javax.swing.JTextField usuariotelefono;
    // End of variables declaration//GEN-END:variables
}