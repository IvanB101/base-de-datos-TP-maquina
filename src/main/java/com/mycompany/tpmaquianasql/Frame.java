/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tpmaquianasql;

import com.mycompany.tpmaquianasql.Controler.Conexion;
import com.mycompany.tpmaquianasql.Controler.ConsumosData;
import com.mycompany.tpmaquianasql.Controler.MesasData;
import com.mycompany.tpmaquianasql.Controler.MozosData;
import com.mycompany.tpmaquianasql.Controler.PlatosData;
import com.mycompany.tpmaquianasql.Controler.Se_ConsumeData;
import com.mycompany.tpmaquianasql.View.Eliminar.DeletePane;
import com.mycompany.tpmaquianasql.View.Consultas.QueryPane;
import com.mycompany.tpmaquianasql.View.Tablas.TablePane;
import com.mycompany.tpmaquianasql.View.ingresar.InputPane;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class Frame extends javax.swing.JFrame {
    private static final String DB_NAME = "TPMaquinaSQL";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/" + DB_NAME;
    private static final String DB_USER = "postgres";
    private static final String DB_PWD = "admin";

    private MozosData mozosData;
    private ConsumosData consumosData;
    private MesasData mesasData;
    private PlatosData platosData;
    private Se_ConsumeData se_ConsumeData;
    private Conexion conexion;

    private Color mainButtonFontColor = new Color(187, 187, 186);
    private Color mainButtonFontColorOnHover = new Color(255, 255, 255);
    private int xMouse, yMouse;

    /**
     * Creates new form Frame
     */
    public Frame() {
        initComponents();

        // Parametros de la conexion
        this.conexion = new Conexion(DB_NAME, DB_URL, DB_USER, DB_PWD);

        try {
            // Conexion con la base de datos
            conexion.getConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Inicializacion de las clases administradoras de la base de datos
        this.mozosData = new MozosData(conexion);
        this.consumosData = new ConsumosData(conexion);
        this.mesasData = new MesasData(conexion);
        this.platosData = new PlatosData(conexion);
        this.se_ConsumeData = new Se_ConsumeData(conexion);

        //firstEjecutionActions(); //TODO
    }

    private void firstEjecutionActions() {
        File file = new File("src/main/java/com/mycompany/tpmaquianasql/Insert/Inserta_Datos.txt");
        String instruccion;

        // Control para realizar las insersiones
        if (!(file.exists()))
            return;

        try {
            Connection con = conexion.getConexion();
            Statement query = con.createStatement();

            InputStream fis = new FileInputStream("src/main/java/com/mycompany/tpmaquianasql/Insert/Inserta_Datos.txt");
            InputStreamReader isr = new InputStreamReader(fis, Charset.forName("UTF-8"));
            BufferedReader br = new BufferedReader(isr);

            // Ejecucion de las sentencias del archivo Inserta_Datos, en el archivo tambien
            // se encuentran las demás sentencias solicitadas para la primera ejecucion del
            // programa
            while ((instruccion = br.readLine()) != null) {
                query.execute(instruccion);
            }

            br.close();

            // Eliminacion el archivo con las instrucciones para que no se vuelva a ejecutar
            // file.delete(); //TODO sacar comentario
        } catch (FileNotFoundException e) {
            // Este control es realizado antes del try
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con la lectura del archivo");
        } catch (SQLException e) {
            switch (e.getErrorCode()) {
                default:
                    JOptionPane.showMessageDialog(null,
                            "Error SQL, codigo: " + e.getErrorCode() + "Excepcion: " + e.getMessage());
            }
        } finally {
            JOptionPane.showMessageDialog(null, "Se han realizado las instrucciones de la primera ejecucion con éxito");
        }
    }

    private void changePane(JPanel jPanel) {
        Contenedor.setLayout(new java.awt.CardLayout());
        Contenedor.removeAll();
        Contenedor.add(jPanel);
        Contenedor.revalidate();
        Contenedor.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JPanel();
        MenuBar = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        insertButtonP = new javax.swing.JPanel();
        insertButtonL = new javax.swing.JLabel();
        deleteButtonP = new javax.swing.JPanel();
        deleteButtonL = new javax.swing.JLabel();
        tablesButtonP = new javax.swing.JPanel();
        tablesButtonL = new javax.swing.JLabel();
        queryButtonP = new javax.swing.JPanel();
        queryButtonL = new javax.swing.JLabel();
        closeButtonP = new javax.swing.JPanel();
        closeButtonL = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        insertButtonL1 = new javax.swing.JLabel();
        insertButtonL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        MenuBar.setBackground(new java.awt.Color(18, 33, 69));
        MenuBar.setToolTipText("");
        MenuBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuBarMouseDragged(evt);
            }
        });
        MenuBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuBarMousePressed(evt);
            }
        });
        MenuBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(187, 187, 186));
        titulo.setText("Base de Datos El Restó del Freaky");
        MenuBar.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 18, -1, -1));

        insertButtonP.setBackground(new java.awt.Color(18, 33, 69));
        insertButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        insertButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertButtonPMouseExited(evt);
            }
        });

        insertButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL.setForeground(new java.awt.Color(187, 187, 186));
        insertButtonL.setText("Cargar");

        javax.swing.GroupLayout insertButtonPLayout = new javax.swing.GroupLayout(insertButtonP);
        insertButtonP.setLayout(insertButtonPLayout);
        insertButtonPLayout.setHorizontalGroup(
                insertButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(insertButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(insertButtonL)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        insertButtonPLayout.setVerticalGroup(
                insertButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(insertButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(insertButtonL)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        MenuBar.add(insertButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        deleteButtonP.setBackground(new java.awt.Color(18, 33, 69));
        deleteButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseExited(evt);
            }
        });

        deleteButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteButtonL.setForeground(new java.awt.Color(187, 187, 186));
        deleteButtonL.setText("Eliminar");

        javax.swing.GroupLayout deleteButtonPLayout = new javax.swing.GroupLayout(deleteButtonP);
        deleteButtonP.setLayout(deleteButtonPLayout);
        deleteButtonPLayout.setHorizontalGroup(
                deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                deleteButtonPLayout.createSequentialGroup()
                                        .addContainerGap(7, Short.MAX_VALUE)
                                        .addComponent(deleteButtonL)
                                        .addContainerGap()));
        deleteButtonPLayout.setVerticalGroup(
                deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(deleteButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(deleteButtonL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        MenuBar.add(deleteButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        tablesButtonP.setBackground(new java.awt.Color(18, 33, 69));
        tablesButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablesButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablesButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseExited(evt);
            }
        });

        tablesButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablesButtonL.setForeground(new java.awt.Color(187, 187, 186));
        tablesButtonL.setText("Tablas");

        javax.swing.GroupLayout tablesButtonPLayout = new javax.swing.GroupLayout(tablesButtonP);
        tablesButtonP.setLayout(tablesButtonPLayout);
        tablesButtonPLayout.setHorizontalGroup(
                tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tablesButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tablesButtonL)
                                .addContainerGap(9, Short.MAX_VALUE)));
        tablesButtonPLayout.setVerticalGroup(
                tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(tablesButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tablesButtonL)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        MenuBar.add(tablesButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 70, -1));

        queryButtonP.setBackground(new java.awt.Color(18, 33, 69));
        queryButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        queryButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        queryButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queryButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                queryButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                queryButtonPMouseExited(evt);
            }
        });

        queryButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        queryButtonL.setForeground(new java.awt.Color(187, 187, 186));
        queryButtonL.setText("Consultas");

        javax.swing.GroupLayout queryButtonPLayout = new javax.swing.GroupLayout(queryButtonP);
        queryButtonP.setLayout(queryButtonPLayout);
        queryButtonPLayout.setHorizontalGroup(
                queryButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(queryButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(queryButtonL)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        queryButtonPLayout.setVerticalGroup(
                queryButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(queryButtonPLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(queryButtonL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));

        MenuBar.add(queryButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        closeButtonP.setBackground(new java.awt.Color(18, 33, 69));
        closeButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonPMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonPMouseExited(evt);
            }
        });

        closeButtonL.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        closeButtonL.setForeground(new java.awt.Color(187, 187, 186));
        closeButtonL.setText("x");

        javax.swing.GroupLayout closeButtonPLayout = new javax.swing.GroupLayout(closeButtonP);
        closeButtonP.setLayout(closeButtonPLayout);
        closeButtonPLayout.setHorizontalGroup(
                closeButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(closeButtonPLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(closeButtonL)));
        closeButtonPLayout.setVerticalGroup(
                closeButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(closeButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                javax.swing.GroupLayout.PREFERRED_SIZE));

        MenuBar.add(closeButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 50, 50));

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(900, 510));

        insertButtonL1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL1.setForeground(new java.awt.Color(51, 51, 51));
        insertButtonL1.setText("Bienvenido a la base de datos del Restó del Freaky");

        insertButtonL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL2.setForeground(new java.awt.Color(51, 51, 51));
        insertButtonL2.setText("Seleccione la operación que desea realizar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel6Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(insertButtonL1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(insertButtonL2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(256, Short.MAX_VALUE)));
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(insertButtonL1)
                                .addGap(18, 18, 18)
                                .addComponent(insertButtonL2)
                                .addContainerGap(372, Short.MAX_VALUE)));

        Contenedor.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
                contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        contenedorPrincipalLayout.setVerticalGroup(
                contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contenedorPrincipalLayout.createSequentialGroup()
                                .addComponent(MenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, 130,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 900, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 640, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseClicked
        changePane(new DeletePane(consumosData, mesasData, mozosData, platosData, se_ConsumeData));
    }// GEN-LAST:event_deleteButtonPMouseClicked

    private void tablesButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablesButtonPMouseClicked
        changePane(new TablePane(consumosData, mesasData, mozosData, platosData, se_ConsumeData));
    }// GEN-LAST:event_tablesButtonPMouseClicked

    private void queryButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_queryButtonPMouseClicked
        changePane(new QueryPane(conexion));
    }// GEN-LAST:event_queryButtonPMouseClicked

    private void queryButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_queryButtonPMouseExited
        queryButtonL.setForeground(mainButtonFontColor);
    }// GEN-LAST:event_queryButtonPMouseExited

    private void queryButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_queryButtonPMouseEntered
        queryButtonL.setForeground(mainButtonFontColorOnHover);
    }// GEN-LAST:event_queryButtonPMouseEntered

    private void tablesButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablesButtonPMouseExited
        tablesButtonL.setForeground(mainButtonFontColor);
    }// GEN-LAST:event_tablesButtonPMouseExited

    private void tablesButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tablesButtonPMouseEntered
        tablesButtonL.setForeground(mainButtonFontColorOnHover);
    }// GEN-LAST:event_tablesButtonPMouseEntered

    private void deleteButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseExited
        deleteButtonL.setForeground(mainButtonFontColor);
    }// GEN-LAST:event_deleteButtonPMouseExited

    private void deleteButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_deleteButtonPMouseEntered
        deleteButtonL.setForeground(mainButtonFontColorOnHover);
    }// GEN-LAST:event_deleteButtonPMouseEntered

    private void insertButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_insertButtonPMouseExited
        insertButtonL.setForeground(mainButtonFontColor);
    }// GEN-LAST:event_insertButtonPMouseExited

    private void insertButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_insertButtonPMouseEntered
        insertButtonL.setForeground(mainButtonFontColorOnHover);
    }// GEN-LAST:event_insertButtonPMouseEntered

    private void closeButtonPMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_closeButtonPMouseEntered
        closeButtonP.setBackground(new Color(255, 0, 0));
        closeButtonL.setForeground(mainButtonFontColorOnHover);
    }// GEN-LAST:event_closeButtonPMouseEntered

    private void closeButtonPMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_closeButtonPMouseExited
        closeButtonP.setBackground(new Color(18, 33, 69));
        closeButtonL.setForeground(mainButtonFontColor);
    }// GEN-LAST:event_closeButtonPMouseExited

    private void MenuBarMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuBarMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }// GEN-LAST:event_MenuBarMouseDragged

    private void MenuBarMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_MenuBarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }// GEN-LAST:event_MenuBarMousePressed

    private void closeButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_closeButtonPMouseClicked
        System.exit(0);
    }// GEN-LAST:event_closeButtonPMouseClicked

    private void insertButtonPMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_insertButtonPMouseClicked
        changePane(new InputPane(consumosData, mesasData, mozosData, platosData, se_ConsumeData));
    }// GEN-LAST:event_insertButtonPMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Frame().setVisible(true);
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel MenuBar;
    private javax.swing.JLabel closeButtonL;
    private javax.swing.JPanel closeButtonP;
    private javax.swing.JPanel contenedorPrincipal;
    private javax.swing.JLabel deleteButtonL;
    private javax.swing.JPanel deleteButtonP;
    private javax.swing.JLabel insertButtonL;
    private javax.swing.JLabel insertButtonL1;
    private javax.swing.JLabel insertButtonL2;
    private javax.swing.JPanel insertButtonP;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel queryButtonL;
    private javax.swing.JPanel queryButtonP;
    private javax.swing.JLabel tablesButtonL;
    private javax.swing.JPanel tablesButtonP;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
