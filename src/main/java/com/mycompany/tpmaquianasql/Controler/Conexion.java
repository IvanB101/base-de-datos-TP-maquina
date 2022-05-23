/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Controler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ivanb
 */
public class Conexion {
    // private String DB_NAME;
    private String DB_URL;
    private String DB_USER;
    private String DB_PWD;

    private Connection conexion;

    public Conexion(String DB_NAME, String DB_URL, String DB_USER, String DB_PWD) {
        // this.DB_NAME = DB_NAME;
        this.DB_URL = DB_URL;
        this.DB_USER = DB_USER;
        this.DB_PWD = DB_PWD;
    }

    public Connection getConexion() throws SQLException {
        if (conexion == null) {
            conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);

            createTables();
        }
        return conexion;
    }

    private void createTables() throws SQLException {
        Statement query = conexion.createStatement();

        query.execute("CREATE TABLE IF NOT EXISTS Platos("
                + "P_Cod int NOT NULL, "
                + "P_Nombre varchar(30) NOT NULL, "
                + "P_Descripcion varchar(100) NOT NULL, "
                + "P_Tipo varchar(25) NOT NULL,"
                + "P_PrecioCosto int NOT NULL,"
                + "P_PrecioVenta int NOT NULL,"
                + "P_PrecioPromocion int NOT NULL,"
                + "PRIMARY KEY (P_Cod))");

        query.execute("CREATE TABLE IF NOT EXISTS Mozos("
                + "Mo_Cod int NOT NULL, "
                + "Mo_NombreApellido varchar(30) NOT NULL, "
                + "Mo_Domicilio varchar(35) NOT NULL, "
                + "Mo_Dni int NOT NULL,"
                + "PRIMARY KEY (Mo_Cod),"
                + "UNIQUE(Mo_Dni))");

        query.execute("CREATE TABLE IF NOT EXISTS Mesas("
                + "Me_Cod int NOT NULL, "
                + "Me_Sector varchar(20) NOT NULL, "
                + "Mo_Cod_Atiende int NOT NULL, "
                + "PRIMARY KEY (Me_Cod),"
                + "FOREIGN KEY (Mo_Cod_Atiende) REFERENCES Mozos(Mo_Cod))");

        query.execute("CREATE TABLE IF NOT EXISTS Consumos("
                + "C_Cod int NOT NULL, "
                + "C_Fecha date NOT NULL, "
                + "C_Hora time NOT NULL, "
                + "Me_Cod_Realiza int NOT NULL,"
                + "PRIMARY KEY (C_Cod),"
                + "FOREIGN KEY (Me_Cod_Realiza) REFERENCES Mesas(Me_Cod))");

        query.execute("CREATE TABLE IF NOT EXISTS Se_Consume("
                + "C_Cod int NOT NULL, "
                + "P_Cod int NOT NULL, "
                + "PRIMARY KEY (C_Cod, P_Cod),"
                + "FOREIGN KEY (C_Cod) REFERENCES Consumos(C_Cod),"
                + "FOREIGN KEY (P_Cod) REFERENCES Platos(P_Cod))");
    }
}
