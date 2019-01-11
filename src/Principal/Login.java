/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
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
import javafx.scene.input.KeyCode;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Yonathan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    int contar, x, y;
    boolean estado, ContraValida;

    public Login() {
        initComponents();
        ImageIcon imagen = new ImageIcon(getClass().getResource("/img/imgsplash.jpg"));
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(imagenLogo.getWidth(), imagenLogo.getHeight(), Image.SCALE_DEFAULT));
        imagenLogo.setIcon(icono);
        this.repaint();
        this.setLocationRelativeTo(null);
        AWTUtilities.setWindowOpaque(this, false);
        setIconImage(new ImageIcon(getClass().getResource("/img/imgsplash.jpg")).getImage());
    }

    conectar cc = new conectar();
    Connection cn = cc.conexion();
    
    public String name;
    public String tipo;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imagenLogo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        usertxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        intentostxt = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Desarrollador = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(197, 29, 116));

        imagenLogo.setFocusable(false);

        jPanel3.setBackground(new java.awt.Color(197, 29, 116));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imagenLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 440, 490));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Exit_32px.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        usertxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usertxt.setToolTipText("Nombre de usuario");
        usertxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(197, 29, 116)));
        usertxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usertxtMouseClicked(evt);
            }
        });
        usertxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usertxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usertxtKeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(197, 29, 116));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Entrar");
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Customer_32px.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Password_32px.png"))); // NOI18N

        passtxt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        passtxt.setToolTipText("Contraseña");
        passtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(197, 29, 116)));
        passtxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passtxtMouseClicked(evt);
            }
        });
        passtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passtxtKeyPressed(evt);
            }
        });

        intentostxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        intentostxt.setForeground(new java.awt.Color(255, 0, 0));
        intentostxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciar Sesion");

        Desarrollador.setBackground(new java.awt.Color(255, 0, 0));
        Desarrollador.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Desarrollador.setForeground(new java.awt.Color(255, 255, 255));
        Desarrollador.setText("Desarrollador");
        Desarrollador.setContentAreaFilled(false);
        Desarrollador.setFocusPainted(false);
        Desarrollador.setFocusable(false);
        Desarrollador.setOpaque(true);
        Desarrollador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesarrolladorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(517, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(111, 111, 111))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(intentostxt, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(usertxt)
                                .addComponent(passtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Desarrollador)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usertxt))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passtxt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(intentostxt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(Desarrollador)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 54, 850, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String a = usertxt.getText();
        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT usuuser FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                usertxt.setForeground(Color.black);
                EstadoCuenta();
                if (estado) {
                    VerificarContraseña();
                    if (ContraValida) {
                        ActualizarIntentos2();
                        Administrador abrir = new Administrador();
                        abrir.NombreVendedorVentas = NombreDeUsuario();
                        abrir.setVisible(true);
                        this.setVisible(false);
                    } else {
                        VerificarIntentos();
                        passtxt.setForeground(Color.red);
                        contar = contar - 1;
                        ActualizarIntentos();
                        intentostxt.setText("Tiene " + (contar) + " intentos.");
                        if (contar == 0) {
                            JOptionPane.showMessageDialog(null, "La cuenta de " + a + " a sido bloqueada debido a \nque excedio el numero maximo de intentos para \npoder acceder al sistema.\n \nHable con un administrador para poder \ndesbloquear su cuenta.", "Cuenta Bloqueada", JOptionPane.ERROR_MESSAGE);
                            BloquearCuenta();
                            intentostxt.setText("");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "La cuenta de " + a + " a sido bloqueada debido a \nque excedio el numero maximo de intentos para \npoder acceder al sistema.\n \nHable con un administrador para poder \ndesbloquear su cuenta.", "Cuenta Bloqueada", JOptionPane.ERROR_MESSAGE);
                    intentostxt.setText("");
                }
            } else {
                usertxt.setForeground(Color.red);
                intentostxt.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void usertxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usertxtMouseClicked
        usertxt.setForeground(Color.BLACK);
        passtxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_usertxtMouseClicked

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PrecionaEnter();
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void passtxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passtxtMouseClicked
        usertxt.setForeground(Color.BLACK);
        passtxt.setForeground(Color.BLACK);
    }//GEN-LAST:event_passtxtMouseClicked

    private void passtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passtxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PrecionaEnter();
        }
    }//GEN-LAST:event_passtxtKeyPressed

    private void usertxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            PrecionaEnter();
        }
    }//GEN-LAST:event_usertxtKeyPressed

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        Point mueve = MouseInfo.getPointerInfo().getLocation();
        this.setLocation(mueve.x - x, mueve.y - y);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void DesarrolladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesarrolladorActionPerformed
        Administrador abrir = new Administrador();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DesarrolladorActionPerformed

    private void usertxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usertxtKeyTyped
        if (!Character.isLetter(evt.getKeyChar())
                && !(evt.getKeyChar() == KeyEvent.VK_SPACE)
                && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)
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
    }//GEN-LAST:event_usertxtKeyTyped

    public void PrecionaEnter(){
            String a = usertxt.getText();
            try {
                Statement comando = cn.createStatement();
                ResultSet registro = comando.executeQuery("SELECT usuuser FROM usuarios WHERE usuuser='" + a + "'");
                if (registro.next() == true) {
                    usertxt.setForeground(Color.black);
                    EstadoCuenta();
                    if (estado) {
                        VerificarContraseña();
                        if (ContraValida) {
                            ActualizarIntentos2();
                            String QueTipo = TipoCuenta();
//                            if (QueTipo.equals("ADMINISTRADOR")) {
                                System.out.println("Tipo Admin");
                                Administrador abrir = new Administrador();
                                abrir.NombreVendedorVentas = NombreDeUsuario();
                                abrir.setVisible(true);
                                this.setVisible(false);
                                
//                            } else {
//                                System.out.println("Tipo Normal");
//                                Normal abrir = new Normal();
//                                abrir.NombreVendedorVentas = NombreDeUsuario();
//                                abrir.setVisible(true);
//                                this.setVisible(false);
//                                
//                            }

                        } else {
                            VerificarIntentos();
                            passtxt.setForeground(Color.red);
                            contar = contar - 1;
                            ActualizarIntentos();
                            intentostxt.setText("Tiene " + (contar) + " intentos.");
                            if (contar == 0) {
                                JOptionPane.showMessageDialog(null, "La cuenta de " + a + " a sido bloqueada debido a \nque excedio el numero maximo de intentos para \npoder acceder al sistema.\n \nHable con un administrador para poder \ndesbloquear su cuenta.", "Cuenta Bloqueada", JOptionPane.ERROR_MESSAGE);
                                BloquearCuenta();
                                intentostxt.setText("");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La cuenta de " + a + " a sido bloqueada debido a \nque excedio el numero maximo de intentos para \npoder acceder al sistema.\n \nHable con un administrador para poder \ndesbloquear su cuenta.", "Cuenta Bloqueada", JOptionPane.ERROR_MESSAGE);
                        intentostxt.setText("");
                    }
                } else {
                    usertxt.setForeground(Color.red);
                    intentostxt.setText("");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }
    
    public void EstadoCuenta() {
        String a = usertxt.getText();
        String b = passtxt.getText();

        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT usuestadocuenta FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                String c = registro.getString("usuestadocuenta");
                if (c.equals("ACTIVADA")) {
                    estado = true;
                } else {
                    estado = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error con la base de datos.", "Mensaje de ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void VerificarContraseña() {
        String a = usertxt.getText();
        String b = passtxt.getText();

        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT usucontra FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                String c = registro.getString("usucontra");
                if (c.equals(b)) {
                    ContraValida = true;
                } else {
                    ContraValida = false;
                }
            } else {
                passtxt.setForeground(Color.red);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void VerificarIntentos() {
        String a = usertxt.getText();
        String b = passtxt.getText();

        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT intentos FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                String c = registro.getString("intentos");
                contar = Integer.parseInt(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarIntentos() {
        String a = usertxt.getText();
        try {
            String sql = "UPDATE usuarios SET intentos=? WHERE usuuser='" + a + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
            String e = String.valueOf(contar);
            pst.setString(1, e);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ActualizarIntentos2() {
        String a = usertxt.getText();
        try {
            String sql = "UPDATE usuarios SET intentos=? WHERE usuuser='" + a + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
            String e = String.valueOf(3);
            pst.setString(1, e);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void BloquearCuenta() {
        String a = usertxt.getText();
        try {
            String sql = "UPDATE usuarios SET usuestadocuenta=? WHERE usuuser='" + a + "'";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, "BLOQUEADA");
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public String NombreDeUsuario(){
        String a = usertxt.getText();

        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT usunombre FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                name = registro.getString("usunombre");
//                Principal abrir = new Principal();
//                abrir.NombreVendedorVentas = name;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return name;
    }
    
    public String TipoCuenta(){
        String a = usertxt.getText();

        try {
            Statement comando = cn.createStatement();
            ResultSet registro = comando.executeQuery("SELECT usupermisos FROM usuarios WHERE usuuser='" + a + "'");
            if (registro.next() == true) {
                tipo = registro.getString("usupermisos");
//                Principal abrir = new Principal();
//                abrir.NombreVendedorVentas = name;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Desarrollador;
    private javax.swing.JLabel imagenLogo;
    private javax.swing.JLabel intentostxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField passtxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}