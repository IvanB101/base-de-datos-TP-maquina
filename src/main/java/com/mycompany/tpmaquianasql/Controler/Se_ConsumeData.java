/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import com.mycompany.tpmaquianasql.Model.Se_Consume;
import com.mycompany.tpmaquianasql.util.Tabla;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivanb
 */
public class Se_ConsumeData {
    private Connection con;

    public Se_ConsumeData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }

    public boolean insertConsumo(Se_Consume seConsume) {
        try {
            PreparedStatement ps = con
                    .prepareStatement("INSERT INTO Se_Consume (C_Cod, P_Cod) VALUES (?,?)");

            ps.setInt(1, seConsume.getC_Cod());
            ps.setInt(2, seConsume.getP_Cod());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean deleteConsumo(int C_Cod, int P_Cod) {
        PreparedStatement ps;

        // Control existencia de la mesa con código a eliminar
        try {
            ps = con.prepareStatement("SELECT * FROM Se_Consume WHERE C_Cod = ? AND P_Cod = ?");
            ps.setInt(1, C_Cod);
            ps.setInt(2, P_Cod);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "No hay ninguna relación Se_Consume para el plato: " + P_Cod + " y el consumo: " + C_Cod);
        }

        try {
            ps = con.prepareStatement("DELETE FROM Se_Consume WHERE C_Cod = ? AND P_Cod = ?");
            ps.setInt(1, C_Cod);
            ps.setInt(2, P_Cod);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "El plato no puede ser elimiando porque hay una referencia al mismo");
            return false;
        }

        return true;
    }

    public DefaultTableModel getSeConsumeTable() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Se_Consume");
            ResultSet rs = ps.executeQuery();

            return Tabla.resultToTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return null;
    }
}
