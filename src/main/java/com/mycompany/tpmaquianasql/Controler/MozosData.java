/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import com.mycompany.tpmaquianasql.Model.Mozos;
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
public class MozosData {
    private Connection con;

    public MozosData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    }

    public boolean insertMozo(Mozos mozo) {
        try {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO Mozos (Mo_Cod, Mo_NombreApellido, Mo_Domicilio, Mo_Dni) VALUES (?,?,?,?)");

            ps.setInt(1, mozo.getMo_Cod());
            ps.setString(2, mozo.getMo_NombreApellido());
            ps.setString(3, mozo.getMo_Domicilio());
            ps.setInt(4, mozo.getMo_DNI());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }

        return true;
    }

    public boolean deleteMozo(int Mo_Cod) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM Mozos WHERE Mo_Cod = ?");

            ps.setInt(1, Mo_Cod);

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            return false;
        }

        return true;
    }
    
    public DefaultTableModel getMozosTable() {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Mozos");
            ResultSet rs = ps.executeQuery();
            
            return Tabla.resultToTable(rs);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
        return null;
    }
}
