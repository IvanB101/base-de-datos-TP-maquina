/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tpmaquianasql.View.ingresar;

import com.mycompany.tpmaquianasql.Controler.ConsumosData;
import com.mycompany.tpmaquianasql.Controler.MesasData;
import com.mycompany.tpmaquianasql.Controler.MozosData;
import com.mycompany.tpmaquianasql.Controler.PlatosData;
import com.mycompany.tpmaquianasql.Controler.Se_ConsumeData;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class InputPane extends javax.swing.JPanel {

    private ConsumosData consumosData;
    private MesasData mesasData;
    private MozosData mozosData;
    private PlatosData platosData;
    private Se_ConsumeData se_ConsumeData;
    
    private Color buttonFontColor = new Color(187, 187, 186);
    private Color buttonFontColorOnHover = new Color(255,255,255);
    /**
     * Creates new form InputPane
     */
    public InputPane(ConsumosData consumosData, MesasData mesasData, MozosData mozosData, PlatosData platosData,
            Se_ConsumeData se_ConsumeData) {
        initComponents();
        
        this.platosData = platosData;
        this.consumosData = consumosData;
        this.mesasData = mesasData;
        this.mozosData = mozosData;
        this.se_ConsumeData = se_ConsumeData;
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
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        barraLateral = new javax.swing.JPanel();
        insertPlatoButtonP = new javax.swing.JPanel();
        insertPlatoButtonL = new javax.swing.JLabel();
        Contenedor = new javax.swing.JPanel();
        insertButtonL2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraLateral.setBackground(new java.awt.Color(31, 115, 202));
        barraLateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertPlatoButtonP.setBackground(new java.awt.Color(31, 115, 202));
        insertPlatoButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertPlatoButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertPlatoButtonPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertPlatoButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertPlatoButtonPMouseExited(evt);
            }
        });

        insertPlatoButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertPlatoButtonL.setForeground(new java.awt.Color(187, 187, 186));
        insertPlatoButtonL.setText("Plato");

        javax.swing.GroupLayout insertPlatoButtonPLayout = new javax.swing.GroupLayout(insertPlatoButtonP);
        insertPlatoButtonP.setLayout(insertPlatoButtonPLayout);
        insertPlatoButtonPLayout.setHorizontalGroup(
            insertPlatoButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPlatoButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertPlatoButtonL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertPlatoButtonPLayout.setVerticalGroup(
            insertPlatoButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPlatoButtonPLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(insertPlatoButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        barraLateral.add(insertPlatoButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 50, -1));

        jPanel5.add(barraLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 510));

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertButtonL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL2.setForeground(new java.awt.Color(51, 51, 51));
        insertButtonL2.setText("Seleccione el tipo de dato que desea cargar");
        Contenedor.add(insertButtonL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, -1, -1));

        jPanel5.add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 650, 510));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void insertPlatoButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPlatoButtonPMouseEntered
        insertPlatoButtonL.setForeground(buttonFontColorOnHover);
    }//GEN-LAST:event_insertPlatoButtonPMouseEntered

    private void insertPlatoButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPlatoButtonPMouseExited
        insertPlatoButtonL.setForeground(buttonFontColor);
    }//GEN-LAST:event_insertPlatoButtonPMouseExited

    private void insertPlatoButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPlatoButtonPMouseClicked
        changePane(new PlatoPane(platosData));
    }//GEN-LAST:event_insertPlatoButtonPMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel barraLateral;
    private javax.swing.JLabel insertButtonL2;
    private javax.swing.JLabel insertPlatoButtonL;
    private javax.swing.JPanel insertPlatoButtonP;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
