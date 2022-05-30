/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import com.mycompany.tpmaquianasql.Model.Mesas;
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
public class MesasData {
    private Connection con;

    public MesasData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }

    public boolean insertMesa(Mesas mesa) {
        try {
            PreparedStatement ps = con
                    .prepareStatement("INSERT INTO Mesas (Me_Cod, Me_Sector, Mo_Cod_Atiende) VALUES (?,?,?)");

            ps.setInt(1, mesa.getMe_Cod());
            ps.setString(2, mesa.getMe_Sector());
            ps.setInt(3, mesa.getMe_Cod_Realiza());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean deleteMesa(int codigo) {
        PreparedStatement ps;

        // Control existencia de la mesa con código a eliminar
        try {
            ps = con.prepareStatement("SELECT * FROM Mesas WHERE Me_Cod=?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay ninguna mesa cargada con el código: " + codigo);
        }

        try {
            ps = con.prepareStatement("DELETE FROM Mesas WHERE Me_Cod = ?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public DefaultTableModel getMesasTable() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Mesas");
            ResultSet rs = ps.executeQuery();

            return Tabla.resultToTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return null;
    }
}
