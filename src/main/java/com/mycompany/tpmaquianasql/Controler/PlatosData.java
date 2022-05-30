/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import com.mycompany.tpmaquianasql.Model.Platos;
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
public class PlatosData {
    private Connection con;

    public PlatosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }

    public boolean insertPlato(Platos plato) {
        try {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO Platos (P_Cod, P_Nombre, P_Descripcion, P_Tipo, " +
                            "P_PrecioCosto, P_PrecioVenta, P_PrecioPromocion) VALUES (?,?,?,?,?,?,?)");

            ps.setInt(1, plato.getP_Cod());
            ps.setString(2, plato.getP_Nombre());
            ps.setString(3, plato.getP_Descripcion());
            ps.setString(4, plato.getP_Tipo());
            ps.setInt(5, plato.getP_PrecioCosto());
            ps.setInt(6, plato.getP_PrecioVenta());
            ps.setInt(7, plato.getP_PrecioPromocion());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public boolean deletePlato(int codigo) {
        PreparedStatement ps;

        // Control existencia de la mesa con código a eliminar
        try {
            ps = con.prepareStatement("SELECT * FROM Platos WHERE P_Cod=?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay ningún plato cargado con el código: " + codigo);
        }

        try {
            ps = con.prepareStatement("DELETE FROM Platos WHERE P_Cod = ?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "El plato no puede ser elimiando porque hay una referencia al mismo");
            return false;
        }

        return true;
    }

    public DefaultTableModel getPlatosTable() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Platos");
            ResultSet rs = ps.executeQuery();

            return Tabla.resultToTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

        return null;
    }
}
