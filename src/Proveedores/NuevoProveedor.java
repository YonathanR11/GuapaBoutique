/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proveedores;

import static Principal.Administrador.tablaProveedores;
import Principal.conectar;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jose
 */
public class NuevoProveedor extends java.awt.Dialog {

    /**
     * Creates new form NuevoProveedor
     */
    
    
   // public NuevoProveedor(java.awt.Frame parent, boolean modal) {
     //   super(parent, modal);
       // initComponents();
    //}
    
    public NuevoProveedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(Principal.Administrador.Paneles);
    }
 int   x,y;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        idproveedor = new javax.swing.JTextField();
        pronombre = new javax.swing.JTextField();
        protelefono = new javax.swing.JTextField();
        prodireccion = new javax.swing.JTextField();
        propaginaweb = new javax.swing.JTextField();
        procorreoelectronico = new javax.swing.JTextField();

        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 29, 116), 3, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID del proveedor:");

        guardar.setBackground(new java.awt.Color(197, 29, 116));
        guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setText("Guardar");
        guardar.setContentAreaFilled(false);
        guardar.setFocusPainted(false);
        guardar.setOpaque(true);
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Nombre :");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefono :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Direccion :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Pagina :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Correo electronico :");

        jButton1.setBackground(new java.awt.Color(197, 29, 116));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancelar");
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        CheckBox.setBackground(new java.awt.Color(255, 255, 255));
        CheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CheckBox.setText("No cerrar ventana al guardar");
        CheckBox.setContentAreaFilled(false);
        CheckBox.setFocusPainted(false);
        CheckBox.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(197, 29, 116));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nuevo Proveedor");
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel11MouseDragged(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        idproveedor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idproveedor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idproveedorFocusLost(evt);
            }
        });
        idproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idproveedorActionPerformed(evt);
            }
        });
        idproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idproveedorKeyTyped(evt);
            }
        });

        pronombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pronombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pronombreKeyTyped(evt);
            }
        });

        protelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        protelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                protelefonoKeyTyped(evt);
            }
        });

        prodireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prodireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                prodireccionKeyTyped(evt);
            }
        });

        propaginaweb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        propaginaweb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                propaginawebKeyTyped(evt);
            }
        });

        procorreoelectronico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        procorreoelectronico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                procorreoelectronicoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(idproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(83, 83, 83)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(prodireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                        .addComponent(propaginaweb)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(procorreoelectronico)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(protelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                                    .addComponent(pronombre))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idproveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pronombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(protelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propaginaweb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(procorreoelectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardar))
                .addGap(16, 16, 16))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //-------------------------------------------------------------------------
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (CheckBox.isSelected()) {
            Guardar();
        }else{
            Guardar();
            this.dispose();
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jLabel11MouseDragged

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel11MousePressed

    private void idproveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idproveedorKeyTyped
      int caracteres=5;
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(idproveedor.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_idproveedorKeyTyped

    private void pronombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pronombreKeyTyped
      if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_pronombreKeyTyped

    private void protelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_protelefonoKeyTyped
        int caracteres=10;
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(protelefono.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_protelefonoKeyTyped

    private void prodireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodireccionKeyTyped
        int caracteres=60;
        if(prodireccion.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_prodireccionKeyTyped

    private void propaginawebKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_propaginawebKeyTyped
        int caracteres=60;
        if(propaginaweb.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_propaginawebKeyTyped

    private void procorreoelectronicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procorreoelectronicoKeyTyped
        int caracteres=60;
        if(procorreoelectronico.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_procorreoelectronicoKeyTyped

    private void idproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idproveedorActionPerformed
      
        String sql="SELECT * FROM proveedores WHERE idproveedor='"+idproveedor.getText()+"'";
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            boolean encontrado=false;
            while(rs.next()){
                encontrado=true;
                JOptionPane.showMessageDialog(null,"ID Existente use uno nuevo");  
                //idproveedor.setEditable(false);
//           pronombre.setEditable(false);
//           prodireccion.setEditable(false);
//           propaginaweb.setEditable(false);
//           procorreoelectronico.setEditable(false);
//           protelefono.setEditable(false);
//                break;
            }
//            if (encontrado==false){
//                JOptionPane.showMessageDialog(null,"ID Disponible");
//                      pronombre.setEditable(true);
//           prodireccion.setEditable(true);
//           propaginaweb.setEditable(true);
//           procorreoelectronico.setEditable(true);
//           protelefono.setEditable(true);
//            }
        } catch (SQLException ex) {
            Logger.getLogger(NuevoProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_idproveedorActionPerformed

    private void idproveedorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idproveedorFocusLost
        String sql="SELECT * FROM proveedores WHERE idproveedor='"+idproveedor.getText()+"'";
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                JOptionPane.showMessageDialog(null,"ID Existente use uno nuevo");  
                idproveedor.requestFocus();
          }
        } catch (SQLException ex) {
            Logger.getLogger(NuevoProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_idproveedorFocusLost
//-----------------------------------------------------------------------------------
   public boolean Guardar(){
       boolean a = false;
        int contador=0;
        if(idproveedor.getText().isEmpty()||pronombre.getText().isEmpty()||protelefono.getText().isEmpty()
            ||prodireccion.getText().isEmpty()||propaginaweb.getText().isEmpty()||procorreoelectronico.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Faltan campos por completar", "Error", JOptionPane.WARNING_MESSAGE);
    }
 else{contador=6;}
          
        pronombre.setText(pronombre.getText().toUpperCase());
        
       if(contador==6){
        try{
            PreparedStatement comando = cn.prepareStatement("INSERT INTO proveedores (idproveedor,pronombre,protelefono,prodireccion,propaginaweb,procorreoelectronico)VALUES(?,?,?,?,?,?)");
            comando.setString(1, idproveedor.getText());      
            comando.setString(2, pronombre.getText());
            comando.setString(3, protelefono.getText());
            comando.setString(4, prodireccion.getText());
            comando.setString(5, propaginaweb.getText());
            comando.setString(6, procorreoelectronico.getText());      
           comando.executeUpdate();
           JOptionPane.showMessageDialog(null,"Guardado Correctamente!");
           idproveedor.setText("");
           pronombre.setText("");
           prodireccion.setText("");
           prodireccion.setText("");
           propaginaweb.setText("");
           procorreoelectronico.setText("");
           protelefono.setText("");
           a=true;
        }catch (java.sql.SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR PRODUCTO!"); 
            System.out.println("ERROR AL GUARDAR PRODUCTO: "+e);
        }
        }else{            
            JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR PRODUCTO!");
            a=false;         
        }         
           try {
            DefaultTableModel modelo = (DefaultTableModel) tablaProveedores.getModel();
            int filas = tablaProveedores.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("ERROR: "+e);
        }
        Proveedores.pruebaproveedores ver = new Proveedores.pruebaproveedores();
        ver.mostrardato();
        return a;
   }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NuevoProveedor dialog = new NuevoProveedor(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
     conectar cc= new conectar();
        Connection cn=cc.conexion();


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField procorreoelectronico;
    private javax.swing.JTextField prodireccion;
    private javax.swing.JTextField pronombre;
    private javax.swing.JTextField propaginaweb;
    private javax.swing.JTextField protelefono;
    // End of variables declaration//GEN-END:variables

    
}
