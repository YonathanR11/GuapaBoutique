/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

import Principal.Administrador;
import static Principal.Administrador.tablaClientes1;
import Principal.conectar;
import java.awt.Color;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author carlos
 */
public class Modificarcliente extends javax.swing.JDialog {

    /**
     * Creates new form Modificarcliente
     */
    public Modificarcliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(Administrador.Paneles);
        int filaseleccionada = tablaClientes1.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) Administrador.tablaClientes1.getModel();
        idcliente.setText(tablaClientes1.getValueAt(filaseleccionada, 0).toString());
        clinombre2.setText(tablaClientes1.getValueAt(filaseleccionada, 1).toString());
        clirfc2.setText(tablaClientes1.getValueAt(filaseleccionada, 2).toString());
        clitelefono2.setText(tablaClientes1.getValueAt(filaseleccionada, 3).toString());
        clicorreo2.setText(tablaClientes1.getValueAt(filaseleccionada, 4).toString());
        clidireccion2.setText(tablaClientes1.getValueAt(filaseleccionada, 5).toString());
        //idcliente2.setText(idcliente.getText()); 
        
        idcliente.setTransferHandler(null);
         clinombre2.setTransferHandler(null);
          clirfc2.setTransferHandler(null);
           clitelefono2.setTransferHandler(null);
            clidireccion2.setTransferHandler(null);
             clicorreo2.setTransferHandler(null);
    }
   int x,y;
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
        clidireccion2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        clicorreo2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        clitelefono2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        clirfc2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        clinombre2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idcliente = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

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

        clidireccion2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clidireccion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clidireccion2MouseClicked(evt);
            }
        });
        clidireccion2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clidireccion2KeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Direccion");

        clicorreo2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clicorreo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicorreo2MouseClicked(evt);
            }
        });
        clicorreo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clicorreo2KeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Correo electronico:");

        clitelefono2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clitelefono2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clitelefono2MouseClicked(evt);
            }
        });
        clitelefono2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clitelefono2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Telefono:");

        clirfc2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clirfc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clirfc2MouseClicked(evt);
            }
        });
        clirfc2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clirfc2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("RFC:");

        clinombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clinombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clinombre2MouseClicked(evt);
            }
        });
        clinombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clinombre2KeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        idcliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cliente:");

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
        jLabel9.setText("Modificar Cliente");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 140, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clirfc2)
                            .addComponent(clinombre2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(clitelefono2)
                            .addComponent(clidireccion2)
                            .addComponent(clicorreo2))
                        .addGap(66, 66, 66))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 285, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(idcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clinombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clirfc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clitelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clicorreo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clidireccion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       int contador=0;
       if(clinombre2.getText().isEmpty()||clirfc2.getText().isEmpty()||idcliente.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Faltan campos por completar", "Error", JOptionPane.WARNING_MESSAGE);
    }
 else{contador=5;}
        /*
        String cadena2=clinombre2.getText();
        Pattern pat2 = Pattern.compile("(([A-Z][A-Z-ÑÁÉÍÓÚ.]{2,15})+[ ]+([A-Z][A-Z-ÑÁÉÍÓÚ]{2,15}))|([A-Z][A-Z-ÑÁÉÍÓÚ]{2,10})");
        Matcher mat2 = pat2.matcher(cadena2);
        if (mat2.matches()) {
           contador=contador+1;
           clinombre2.setBackground(Color.white);
           avisonombre.setText(" ");
        } else {
            avisonombre.setText("El nombre solo lleva letras");
            clinombre2.setBackground(Color.pink);
     }
        String cadena3=clirfc2.getText();
        Pattern pat3 = Pattern.compile("^([A-ZÑ\\x26]{3,4}([0-9]{2})(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1]))((-)?([A-Z\\d]{3}))?$");
        Matcher mat3 = pat3.matcher(cadena3);
        if (mat3.matches()) {
           clirfc2.setBackground(Color.white);
           avisorfc.setText(" ");
            contador+=1;
        } else {
            clirfc2.setBackground(Color.pink);
             avisorfc.setText("El RFC es incorrecto, introduzca de nuevo");
     }
        String cadena4=clitelefono2.getText();
        Pattern pat4 = Pattern.compile("[0-9]{10,10}|[0-9]{7,7}");
        Matcher mat4 = pat4.matcher(cadena4);
        if (mat4.matches()) {
            clitelefono2.setBackground(Color.white);
           avisotelefono.setText(" ");
            contador+=1;
        } else {
            clitelefono2.setBackground(Color.white);
           avisotelefono.setText("10 digitos para celular o 7 para telefono casa");
     }
         String cadena5=clicorreo2.getText();
        Pattern pat5 = Pattern.compile("([a-zA-Z0-9._]{5,30})+([@gmail]|[@yahoo]|[@itiguala]|[@hotmail])+([.com]|[.es]|[.org]|[.edu]|[.net]|[.gov])+{10,40}");
        Matcher mat5 = pat5.matcher(cadena5);
        if (mat5.matches()) {
          clicorreo2.setBackground(Color.pink);
          avisocorreo.setText(" ");
            contador+=1;
        } else {
           clicorreo2.setForeground(Color.red);
           avisocorreo.setText("Introduzca un correo valido");
     }
        String cadena6=clidireccion2.getText();
        Pattern pat6 = Pattern.compile("[A-Za-z0-9\\s]{5,25}");
        Matcher mat6 = pat6.matcher(cadena6);
        if (mat6.matches()) {
            clidireccion2.setBackground(Color.white);
           avisodireccion.setText(" ");
            contador+=1;
        } else {
           clidireccion2.setBackground(Color.pink);
           avisodireccion.setText("Direccion incorrecta");
     }*/
        clinombre2.setText (clinombre2.getText().toUpperCase()); 
         clirfc2.setText (clirfc2.getText().toUpperCase()); 
        
        if(contador==5){
        try{
            String sql = "UPDATE clientes SET clinombre=?, clirfc=?, clitelefono=?, clicorreoelectronico=?, clidireccion=? WHERE idcliente='"+idcliente.getText()+"'" ;
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1,clinombre2.getText());
            pst.setString(2,clirfc2.getText());
            pst.setString(3,clitelefono2.getText());
            pst.setString(4,clicorreo2.getText());
            pst.setString(5,clidireccion2.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Actualizados Correctamente!");
        }catch(Exception e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un problema!");
        }
        }else{            
            JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR CLIENTE!");
        }
        DefaultTableModel modelo = (DefaultTableModel) tablaClientes1.getModel();
        int filas = tablaClientes1.getRowCount();
        for (int i = 0; filas > i; i++) {
            modelo.removeRow(0);
        }
        Clientes.pruebaclientes ver = new Clientes.pruebaclientes();
        ver.mostrardato();
        //this.dispose();
        if(contador==5){
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jLabel9MouseDragged

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel9MousePressed

    private void clinombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clinombre2MouseClicked
       
    }//GEN-LAST:event_clinombre2MouseClicked

    private void clirfc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clirfc2MouseClicked
      
    }//GEN-LAST:event_clirfc2MouseClicked

    private void clitelefono2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clitelefono2MouseClicked
      
    }//GEN-LAST:event_clitelefono2MouseClicked

    private void clicorreo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicorreo2MouseClicked
    
    }//GEN-LAST:event_clicorreo2MouseClicked

    private void clidireccion2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clidireccion2MouseClicked
      
    }//GEN-LAST:event_clidireccion2MouseClicked

    private void clinombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clinombre2KeyTyped
       if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_clinombre2KeyTyped

    private void clirfc2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clirfc2KeyTyped
       int caracteres=13;
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_0)
                && !(evt.getKeyChar() == KeyEvent.VK_1)
                && !(evt.getKeyChar() == KeyEvent.VK_2)
                && !(evt.getKeyChar() == KeyEvent.VK_3)
                && !(evt.getKeyChar() == KeyEvent.VK_4)
                && !(evt.getKeyChar() == KeyEvent.VK_5)
                && !(evt.getKeyChar() == KeyEvent.VK_6)
                && !(evt.getKeyChar() == KeyEvent.VK_7)
                && !(evt.getKeyChar() == KeyEvent.VK_8)
                && !(evt.getKeyChar() == KeyEvent.VK_9)) {
            evt.consume();
        }
        if(clirfc2.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_clirfc2KeyTyped

    private void clitelefono2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clitelefono2KeyTyped
       int caracteres=10;//numeros limite 10
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
        if(clitelefono2.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_clitelefono2KeyTyped

    private void clicorreo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clicorreo2KeyTyped
       int caracteres=40;
      char c=evt.getKeyChar();;
        if(clicorreo2.getText().length()>=caracteres||c==' '){
           evt.consume();
        }
    }//GEN-LAST:event_clicorreo2KeyTyped

    private void clidireccion2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clidireccion2KeyTyped
         int caracteres=30;
      if(clidireccion2.getText().length()>=caracteres){
           evt.consume();
        }
    }//GEN-LAST:event_clidireccion2KeyTyped

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
            java.util.logging.Logger.getLogger(Modificarcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificarcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificarcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificarcliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Modificarcliente dialog = new Modificarcliente(new javax.swing.JFrame(), true);
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
conectar cc= new conectar();
        Connection cn=cc.conexion();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clicorreo2;
    private javax.swing.JTextField clidireccion2;
    private javax.swing.JTextField clinombre2;
    private javax.swing.JTextField clirfc2;
    private javax.swing.JTextField clitelefono2;
    private javax.swing.JLabel idcliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
