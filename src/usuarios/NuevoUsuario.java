package usuarios;

//import productos.*;
import static Principal.Administrador.tablaUsuarios;
import Principal.conectar;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NuevoUsuario extends javax.swing.JDialog {

    /**
     * Creates new form Altaproductos
     */
    public NuevoUsuario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        idusuario.setTransferHandler(null);
        usuuser.setTransferHandler(null);
        usunombre.setTransferHandler(null);
        usucontra.setTransferHandler(null);
        usudireccion.setTransferHandler(null);
        usutelefono.setTransferHandler(null);
        this.setLocationRelativeTo(Principal.Administrador.Paneles);
    }

    int x, y;
    boolean band;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        usunombre = new javax.swing.JTextField();
        usucontra = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        usutelefono = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idusuario = new javax.swing.JTextField();
        usuuser = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usudireccion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        CheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(197, 29, 116), 3, true));

        usunombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usunombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usunombreKeyTyped(evt);
            }
        });

        usucontra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usucontra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usucontraKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        usutelefono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usutelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usutelefonoKeyTyped(evt);
            }
        });

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
        jLabel3.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Teléfono:");

        idusuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idusuarioFocusLost(evt);
            }
        });
        idusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idusuarioActionPerformed(evt);
            }
        });
        idusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idusuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idusuarioKeyTyped(evt);
            }
        });

        usuuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usuuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usuuserKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");

        usudireccion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        usudireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usudireccionKeyTyped(evt);
            }
        });

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
        jLabel11.setText("Nuevo Usuario");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuuser, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(usucontra, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(usunombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(usutelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 197, Short.MAX_VALUE))
                                    .addComponent(usudireccion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuuser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usunombre, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usucontra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usutelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usudireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CheckBox)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(guardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (CheckBox.isSelected()) {
            Guardar();
        } else {
            if (Guardar()) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel11MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jLabel11MouseDragged

    private void idusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idusuarioActionPerformed
        String buscar=idusuario.getText();
        String sql="SELECT * FROM usuarios WHERE idusuario='"+buscar+"'";
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
//            boolean encontrado=false;
            while (rs.next()) {          
//                encontrado=true;
                JOptionPane.showMessageDialog(null, "ya existe este registro"); 
                break;
            }
        }catch(SQLException ex){
        java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }//GEN-LAST:event_idusuarioActionPerformed

    private void idusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idusuarioKeyTyped
        int caracteres = 5;
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (idusuario.getText().length() >= caracteres) {
            evt.consume();
        }

    }//GEN-LAST:event_idusuarioKeyTyped

    private void usuuserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usuuserKeyTyped
        int caracteres = 20;
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
        if (usuuser.getText().length() >= caracteres) {
            evt.consume();
        }

    }//GEN-LAST:event_usuuserKeyTyped

    private void usunombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usunombreKeyTyped
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }

    }//GEN-LAST:event_usunombreKeyTyped

    private void usucontraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usucontraKeyTyped
        int caracteres = 15;
        if (usucontra.getText().length() >= caracteres) {
            evt.consume();
        }

    }//GEN-LAST:event_usucontraKeyTyped

    private void usutelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usutelefonoKeyTyped
        int caracteres = 10;
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        if (usutelefono.getText().length() >= caracteres) {
            evt.consume();
        }

    }//GEN-LAST:event_usutelefonoKeyTyped

    private void usudireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usudireccionKeyTyped
        int caracteres = 60;
        if (usudireccion.getText().length() >= caracteres) {
            evt.consume();
        }

    }//GEN-LAST:event_usudireccionKeyTyped

    private void idusuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idusuarioKeyReleased
//    String buscar =idusuario.getText();
    
    }//GEN-LAST:event_idusuarioKeyReleased

    private void idusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idusuarioFocusLost
        String buscar=idusuario.getText();
        String sql="SELECT * FROM usuarios WHERE idusuario='"+buscar+"'";
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
//            boolean encontrado=false;
            while (rs.next()) {          
//                encontrado=true;
                JOptionPane.showMessageDialog(null, "ya existe este registro"); 
                break;
            }
        }catch(SQLException ex){
        java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(Level.SEVERE, null, ex);       
        }
    }//GEN-LAST:event_idusuarioFocusLost

    public boolean Guardar() {
        boolean a = false;
       if (idusuario.getText().isEmpty()||usuuser.getText().isEmpty()||usunombre.getText().isEmpty()||usucontra.getText().isEmpty()||usutelefono.getText().isEmpty()||usudireccion.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "llene correcatamente todos los campos", "Error", 2);
            a = false;
    }
       else{  
            try {
                PreparedStatement comando = cn.prepareStatement("INSERT INTO usuarios (idusuario,usuuser,usunombre,usucontra,usutelefono,usupermisos,usudireccion,usuestadocuenta,intentos)VALUES(?,?,?,?,?,?,?,?,?)");
                comando.setString(1, idusuario.getText());
                comando.setString(2, usuuser.getText());
                comando.setString(3, usunombre.getText());
                comando.setString(4, usucontra.getText());
                comando.setString(5, usutelefono.getText());
                comando.setString(6, "0");
                comando.setString(7, usudireccion.getText());
                comando.setString(8, "activado");
                comando.setString(9, "3");
                //comando.setString(10, catdescripcion.getText());
                comando.executeUpdate();
                JOptionPane.showMessageDialog(null, "Guardado Correctamente!");
                a = true;
            }
//            catch(MySQLIntegrityConstraintViolationException e){
//                JOptionPane.showMessageDialog(null, "ya existe este registro");                
//            }
            catch (java.sql.SQLException e) {
                System.out.println("ERROR AL GUARDAR USUARIO: " + e);
            }
//        }
            idusuario.setText("");
            usuuser.setText("");
            usunombre.setText("");
            usucontra.setText("");
            usutelefono.setText("");
//        usupermisos.setText("");
            usudireccion.setText("");
//        usuestadocuenta.setText("");
//        intentos.setText("");
//        catdescripcion.setText("");
//        cont=0;
//        this.dispose();
//        } else {
//            JOptionPane.showMessageDialog(null, "llene correcatamente todos los campos", "Error", 2);
//            a = false;
//        }
        try {
            DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
            int filas = tablaUsuarios.getRowCount();
            for (int i = 0; filas > i; i++) {
                modelo.removeRow(0);
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
        usuarios.pruebausuarios ver = new usuarios.pruebausuarios();
        ver.mostrardato();
       }
        return a;
        
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
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                NuevoUsuario dialog = new NuevoUsuario(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox CheckBox;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idusuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField usucontra;
    private javax.swing.JTextField usudireccion;
    private javax.swing.JTextField usunombre;
    private javax.swing.JTextField usutelefono;
    private javax.swing.JTextField usuuser;
    // End of variables declaration//GEN-END:variables
}
