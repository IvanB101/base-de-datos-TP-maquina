/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import com.mycompany.tpmaquianasql.Model.Consumos;
import com.mycompany.tpmaquianasql.util.Tabla;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ivanb
 */
public class ConsumosData {
    private Connection con;

    public ConsumosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public boolean insertConsumo(Consumos consumo) {
        try {
            PreparedStatement ps = con
                    .prepareStatement("INSERT INTO Consumos (C_Cod, C_Fecha, C_Hora, Me_Cod_Realiza) VALUES (?,?,?,?)");

            ps.setInt(1, consumo.getC_Cod());
            ps.setDate(2, Date.valueOf(consumo.getC_Fecha()));
            ps.setTime(3, Time.valueOf(consumo.getC_Hora()));
            ps.setInt(4, consumo.getMe_Cod_Realiza());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean deleteConsumo(int codigo) {
        PreparedStatement ps;

        // Control existencia del consumo con código a eliminar
        try {
            ps = con.prepareStatement("SELECT * FROM Consumos WHERE C_Cod=?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay ningún consumo cargado con el código: " + codigo);
        }

        try {
            ps = con.prepareStatement("DELETE FROM Consumos WHERE C_Cod = ?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "El consumo np puede ser eliminado porque está referenciado en Se_Consume");
            return false;
        }

        return true;
    }

    public DefaultTableModel getConsumosTable() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Consumos");
            ResultSet rs = ps.executeQuery();

            return Tabla.resultToTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return null;
    }
}
