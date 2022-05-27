/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tpmaquianasql.View.Consultas;

import com.mycompany.tpmaquianasql.Controler.Conexion;
import com.mycompany.tpmaquianasql.util.Tabla;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivanb
 */
public class QueryPane extends javax.swing.JPanel {

    private Conexion conexion;

    private Color buttonFontColor = new Color(187, 187, 186);
    private Color buttonFontColorOnHover = new Color(255, 255, 255);

    /**
     * Creates new form QueryPane
     */
    public QueryPane(Conexion conexion) {
        initComponents();

        this.conexion = conexion;
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
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraLateral = new javax.swing.JPanel();
        consultaP1 = new javax.swing.JPanel();
        consultaL1 = new javax.swing.JLabel();
        consultaP2 = new javax.swing.JPanel();
        consultaL2 = new javax.swing.JLabel();
        consultaP3 = new javax.swing.JPanel();
        consultaL3 = new javax.swing.JLabel();
        consultaP4 = new javax.swing.JPanel();
        consultaL4 = new javax.swing.JLabel();
        consultaP5 = new javax.swing.JPanel();
        consultaL5 = new javax.swing.JLabel();
        consultaP6 = new javax.swing.JPanel();
        consultaL6 = new javax.swing.JLabel();
        consultaP7 = new javax.swing.JPanel();
        consultaL7 = new javax.swing.JLabel();
        consultaP8 = new javax.swing.JPanel();
        consultaL8 = new javax.swing.JLabel();
        consultaP10 = new javax.swing.JPanel();
        consultaL10 = new javax.swing.JLabel();
        consultaP9 = new javax.swing.JPanel();
        consultaL9 = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        insertButtonL2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraLateral.setBackground(new java.awt.Color(31, 115, 202));
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        consultaP1.setBackground(new java.awt.Color(31, 115, 202));
        consultaP1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP1MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP1MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP1MouseExited(evt);
            }
        });

        consultaL1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL1.setForeground(new java.awt.Color(187, 187, 186));
        consultaL1.setText("Mesas atendidas por un mozo");

        javax.swing.GroupLayout consultaP1Layout = new javax.swing.GroupLayout(consultaP1);
        consultaP1.setLayout(consultaP1Layout);
        consultaP1Layout.setHorizontalGroup(
                consultaP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP1Layout.setVerticalGroup(
                consultaP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL1, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        consultaP2.setBackground(new java.awt.Color(31, 115, 202));
        consultaP2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP2MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP2MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP2MouseExited(evt);
            }
        });

        consultaL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL2.setForeground(new java.awt.Color(187, 187, 186));
        consultaL2.setText("Platos consumidos en una mesa");

        javax.swing.GroupLayout consultaP2Layout = new javax.swing.GroupLayout(consultaP2);
        consultaP2.setLayout(consultaP2Layout);
        consultaP2Layout.setHorizontalGroup(
                consultaP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP2Layout.setVerticalGroup(
                consultaP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL2, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        consultaP3.setBackground(new java.awt.Color(31, 115, 202));
        consultaP3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP3MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP3MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP3MouseExited(evt);
            }
        });

        consultaL3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL3.setForeground(new java.awt.Color(187, 187, 186));
        consultaL3.setText("Platos consumidos entre fechas");

        javax.swing.GroupLayout consultaP3Layout = new javax.swing.GroupLayout(consultaP3);
        consultaP3.setLayout(consultaP3Layout);
        consultaP3Layout.setHorizontalGroup(
                consultaP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL3)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP3Layout.setVerticalGroup(
                consultaP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP3Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL3, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        consultaP4.setBackground(new java.awt.Color(31, 115, 202));
        consultaP4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP4MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP4MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP4MouseExited(evt);
            }
        });

        consultaL4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL4.setForeground(new java.awt.Color(187, 187, 186));
        consultaL4.setText("Plato más consumido");

        javax.swing.GroupLayout consultaP4Layout = new javax.swing.GroupLayout(consultaP4);
        consultaP4.setLayout(consultaP4Layout);
        consultaP4Layout.setHorizontalGroup(
                consultaP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP4Layout.setVerticalGroup(
                consultaP4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP4Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL4, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        consultaP5.setBackground(new java.awt.Color(31, 115, 202));
        consultaP5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP5MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP5MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP5MouseExited(evt);
            }
        });

        consultaL5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL5.setForeground(new java.awt.Color(187, 187, 186));
        consultaL5.setText("Resumen cantidades");

        javax.swing.GroupLayout consultaP5Layout = new javax.swing.GroupLayout(consultaP5);
        consultaP5.setLayout(consultaP5Layout);
        consultaP5Layout.setHorizontalGroup(
                consultaP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP5Layout.setVerticalGroup(
                consultaP5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP5Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL5, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        consultaP6.setBackground(new java.awt.Color(31, 115, 202));
        consultaP6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP6MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP6MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP6MouseExited(evt);
            }
        });

        consultaL6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL6.setForeground(new java.awt.Color(187, 187, 186));
        consultaL6.setText("Cantidad de mesas asignadas a cada mozo");

        javax.swing.GroupLayout consultaP6Layout = new javax.swing.GroupLayout(consultaP6);
        consultaP6.setLayout(consultaP6Layout);
        consultaP6Layout.setHorizontalGroup(
                consultaP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL6)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP6Layout.setVerticalGroup(
                consultaP6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP6Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL6, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        consultaP7.setBackground(new java.awt.Color(31, 115, 202));
        consultaP7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP7MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP7MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP7MouseExited(evt);
            }
        });

        consultaL7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL7.setForeground(new java.awt.Color(187, 187, 186));
        consultaL7.setText("Mozos sin mesas asignadas");

        javax.swing.GroupLayout consultaP7Layout = new javax.swing.GroupLayout(consultaP7);
        consultaP7.setLayout(consultaP7Layout);
        consultaP7Layout.setHorizontalGroup(
                consultaP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP7Layout.setVerticalGroup(
                consultaP7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP7Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL7, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        consultaP8.setBackground(new java.awt.Color(31, 115, 202));
        consultaP8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP8MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP8MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP8MouseExited(evt);
            }
        });

        consultaL8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL8.setForeground(new java.awt.Color(187, 187, 186));
        consultaL8.setText("Estadísticas costos platos principales");

        javax.swing.GroupLayout consultaP8Layout = new javax.swing.GroupLayout(consultaP8);
        consultaP8.setLayout(consultaP8Layout);
        consultaP8Layout.setHorizontalGroup(
                consultaP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP8Layout.setVerticalGroup(
                consultaP8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP8Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL8, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        consultaP10.setBackground(new java.awt.Color(31, 115, 202));
        consultaP10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP10MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP10MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP10MouseExited(evt);
            }
        });

        consultaL10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL10.setForeground(new java.awt.Color(187, 187, 186));
        consultaL10.setText("Cantidad platos consumidos en una mesa");

        javax.swing.GroupLayout consultaP10Layout = new javax.swing.GroupLayout(consultaP10);
        consultaP10.setLayout(consultaP10Layout);
        consultaP10Layout.setHorizontalGroup(
                consultaP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP10Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP10Layout.setVerticalGroup(
                consultaP10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP10Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL10, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        consultaP9.setBackground(new java.awt.Color(31, 115, 202));
        consultaP9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultaP9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaP9MouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                consultaP9MouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                consultaP9MouseExited(evt);
            }
        });

        consultaL9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        consultaL9.setForeground(new java.awt.Color(187, 187, 186));
        consultaL9.setText("Platos no consumidos");

        javax.swing.GroupLayout consultaP9Layout = new javax.swing.GroupLayout(consultaP9);
        consultaP9.setLayout(consultaP9Layout);
        consultaP9Layout.setHorizontalGroup(
                consultaP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaP9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(consultaL9)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        consultaP9Layout.setVerticalGroup(
                consultaP9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaP9Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consultaL9, javax.swing.GroupLayout.PREFERRED_SIZE, 24,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        barraLateral.add(consultaP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, -1, -1));

        add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 510));

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertButtonL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL2.setForeground(new java.awt.Color(51, 51, 51));
        insertButtonL2.setText("Seleccione la consulta que desea realizar");
        Contenedor.add(insertButtonL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 540, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void consultaP9MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseClicked
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps = con
                    .prepareStatement("SELECT P_Nombre nombre, P_Descripcion descripcion " +
                            "FROM Platos " +
                            "WHERE P_Cod NOT IN(SELECT Platos.P_Cod " +
                            "FROM Platos, Se_Consume AS SC " +
                            "WHERE Platos.P_cod=SC.P_cod)");
            ResultSet rs = ps.executeQuery();

            changePane(new QueryTablePane(Tabla.resultToTable(rs), "Platos no consumidos"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP9MouseClicked

    private void consultaP9MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseEntered
        consultaL9.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP9MouseEntered

    private void consultaP9MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseExited
        consultaL9.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP9MouseExited

    private void consultaP1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP1MouseClicked
        changePane(new OneInputPane(conexion, 0));
    }// GEN-LAST:event_consultaP1MouseClicked

    private void consultaP1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP1MouseEntered
        consultaL1.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP1MouseEntered

    private void consultaP1MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP1MouseExited
        consultaL1.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP1MouseExited

    private void consultaP2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP2MouseClicked
        changePane(new OneInputPane(conexion, 1));
    }// GEN-LAST:event_consultaP2MouseClicked

    private void consultaP2MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP2MouseEntered
        consultaL2.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP2MouseEntered

    private void consultaP2MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP2MouseExited
        consultaL2.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP2MouseExited

    private void consultaP3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP3MouseClicked
        changePane(new DateInputPane(conexion));
    }// GEN-LAST:event_consultaP3MouseClicked

    private void consultaP3MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP3MouseEntered
        consultaL3.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP3MouseEntered

    private void consultaP3MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP3MouseExited
        consultaL3.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP3MouseExited

    private void consultaP4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP4MouseClicked
        try {
            Connection con = conexion.getConexion();

            //Variables para la construccion de la tabla
            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            Vector<String> columnNames = new Vector<String>();
            columnNames.add("Tipo");
            columnNames.add("Plato más vendido");

            //Obtenemos los tipos de platos cargados en la base
            PreparedStatement ps = con.prepareStatement("SELECT DISTINCT P_Tipo FROM Platos");
            ResultSet rs = ps.executeQuery();
            List<String>tipos = new LinkedList<String>();
            while (rs.next()) {
                tipos.add(rs.getString(1));
            }

            //Consulta para saber el plato del tipo especificado mas consumido
            ps = con.prepareStatement("SELECT P_Nombre " +
                    "FROM Platos AS P, Se_Consume AS SC " +
                    "WHERE P.P_Cod=SC.P_Cod AND P.P_Tipo=? " +
                    "GROUP BY(P_Nombre, SC.P_Cod) " +
                    "HAVING COUNT(*)=( " +
                    "    SELECT MAX(contador) maxContador " +
                    "        FROM (SELECT COUNT(P.P_Cod) contador " +
                    "        FROM Platos AS P , Se_Consume as SC " +
                    "        WHERE P.P_Cod=SC.P_Cod AND P.P_Tipo=? " +
                    "    GROUP BY(P.P_Cod)) AS T)");

            for (int i = 0; i < tipos.size(); i++) {
                //Ejecutamos la consulta para los tipos obtenidos antes
                String tipo = tipos.get(i);
                ps.setString(1, tipo);
                ps.setString(2, tipo);
                rs = ps.executeQuery();
                rs.next();

                //Añadimos el plato y su tipo a la tabla
                Vector<Object> vector = new Vector<Object>();
                vector.add(tipo);
                vector.add(rs.getString(1));
                data.add(vector);
            }

            changePane(new QueryTablePane(new DefaultTableModel(data, columnNames), "Platos más consumidos"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP4MouseClicked

    private void consultaP4MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP4MouseEntered
        consultaL4.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP4MouseEntered

    private void consultaP4MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP4MouseExited
        consultaL4.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP4MouseExited

    private void consultaP5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP5MouseClicked
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps;
            ResultSet rs;

            Vector<String> columnNames = new Vector<String>();
            columnNames.add("");
            columnNames.add("Cantidad");

            Vector<Vector<Object>> data = new Vector<Vector<Object>>();
            String[] consultas = {
                    "SELECT COUNT(*) mozos FROM Mozos",
                    "SELECT COUNT(*) mesas FROM Mesas",
                    "SELECT P_Tipo, COUNT(*) FROM Platos GROUP BY(P_Tipo)"
            };

            for (int i = 0; i < 2; i++) {
                ps = con.prepareStatement(consultas[i]);
                rs = ps.executeQuery();
                rs.next();
                Vector<Object> vector = new Vector<Object>();
                vector.add(rs.getMetaData().getColumnName(1));
                vector.add(rs.getInt(1));
                data.add(vector);
            }

            ps = con.prepareStatement(consultas[2]);
            rs = ps.executeQuery();
            while (rs.next()) {
                Vector<Object> vector = new Vector<Object>();
                vector.add("Platos de tipo: " + rs.getString(1));
                vector.add(rs.getInt(2));
                data.add(vector);
            }

            changePane(new QueryTablePane(new DefaultTableModel(data, columnNames), "Resumen de cantidades"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP5MouseClicked

    private void consultaP5MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP5MouseEntered
        consultaL5.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP5MouseEntered

    private void consultaP5MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP5MouseExited
        consultaL5.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP5MouseExited

    private void consultaP6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP6MouseClicked
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps = con
                    .prepareStatement("SELECT Mo_NombreApellido mozo, COUNT(Me_Cod) mesas_atendidas" +
                            " FROM Mozos, Mesas" +
                            " WHERE Mo_Cod_Atiende=Mo_Cod" +
                            " GROUP BY(Mo_Cod_Atiende, Mo_NombreApellido)");
            ResultSet rs = ps.executeQuery();

            changePane(new QueryTablePane(Tabla.resultToTable(rs), "Cantidad de mesas atendidas por cada mozo"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP6MouseClicked

    private void consultaP6MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP6MouseEntered
        consultaL6.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP6MouseEntered

    private void consultaP6MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP6MouseExited
        consultaL6.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP6MouseExited

    private void consultaP7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP7MouseClicked
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps = con
                    .prepareStatement(
                            "SELECT Mo_Cod codigo, Mo_NombreApellido nombre " +
                                    "FROM Mozos " +
                                    "WHERE Mo_Cod NOT IN (SELECT Mo_Cod " +
                                    "   FROM Mozos, Mesas " +
                                    "   WHERE Mo_Cod_Atiende=Mo_Cod)");
            ResultSet rs = ps.executeQuery();

            changePane(new QueryTablePane(Tabla.resultToTable(rs), "Mesas atendidas por cada mozo"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP7MouseClicked

    private void consultaP7MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP7MouseEntered
        consultaL7.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP7MouseEntered

    private void consultaP7MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP7MouseExited
        consultaL7.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP7MouseExited

    private void consultaP8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP8MouseClicked
        try {
            Connection con = conexion.getConexion();
            PreparedStatement ps = con
                    .prepareStatement(
                            "SELECT MAX(P_PrecioCosto) máximo, MIN(P_PrecioCosto) mínimo, AVG(P_PrecioCosto) promedio "
                                    + "FROM Platos " +
                                    "WHERE P_Tipo='Plato Principal'");
            ResultSet rs = ps.executeQuery();

            changePane(new QueryTablePane(Tabla.resultToTable(rs), "Costos Platos Principales"));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }// GEN-LAST:event_consultaP8MouseClicked

    private void consultaP8MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP8MouseEntered
        consultaL8.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP8MouseEntered

    private void consultaP8MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP8MouseExited
        consultaL8.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP8MouseExited

    private void consultaP10MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseClicked
        changePane(new OneInputPane(conexion, 2));
    }// GEN-LAST:event_consultaP9MouseClicked

    private void consultaP10MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseEntered
        consultaL10.setForeground(buttonFontColorOnHover);
    }// GEN-LAST:event_consultaP9MouseEntered

    private void consultaP10MouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_consultaP9MouseExited
        consultaL10.setForeground(buttonFontColor);
    }// GEN-LAST:event_consultaP9MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JLabel consultaL1;
    private javax.swing.JLabel consultaL10;
    private javax.swing.JLabel consultaL2;
    private javax.swing.JLabel consultaL3;
    private javax.swing.JLabel consultaL4;
    private javax.swing.JLabel consultaL5;
    private javax.swing.JLabel consultaL6;
    private javax.swing.JLabel consultaL7;
    private javax.swing.JLabel consultaL8;
    private javax.swing.JLabel consultaL9;
    private javax.swing.JPanel consultaP1;
    private javax.swing.JPanel consultaP10;
    private javax.swing.JPanel consultaP2;
    private javax.swing.JPanel consultaP3;
    private javax.swing.JPanel consultaP4;
    private javax.swing.JPanel consultaP5;
    private javax.swing.JPanel consultaP6;
    private javax.swing.JPanel consultaP7;
    private javax.swing.JPanel consultaP8;
    private javax.swing.JPanel consultaP9;
    private javax.swing.JLabel insertButtonL2;
    // End of variables declaration//GEN-END:variables
}