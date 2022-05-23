/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Model;

/**
 *
 * @author ivanb
 */
public class Mozos {
    private int Mo_Cod, Mo_DNI;
    private String Mo_NombreApellido, Mo_Domicilio;

    public Mozos(int Mo_Cod, String Mo_NombreApellido, String Mo_Domicilio, int Mo_DNI) {
        this.Mo_Cod = Mo_Cod;
        this.Mo_DNI = Mo_DNI;
        this.Mo_NombreApellido = Mo_NombreApellido;
        this.Mo_Domicilio = Mo_Domicilio;
    }

    public int getMo_Cod() {
        return Mo_Cod;
    }

    public void setMo_Cod(int Mo_Cod) {
        this.Mo_Cod = Mo_Cod;
    }

    public int getMo_DNI() {
        return Mo_DNI;
    }

    public void setMo_DNI(int Mo_DNI) {
        this.Mo_DNI = Mo_DNI;
    }

    public String getMo_NombreApellido() {
        return Mo_NombreApellido;
    }

    public void setMo_NombreApellido(String Mo_NombreApellido) {
        this.Mo_NombreApellido = Mo_NombreApellido;
    }

    public String getMo_Domicilio() {
        return Mo_Domicilio;
    }

    public void setMo_Domicilio(String Mo_Domicilio) {
        this.Mo_Domicilio = Mo_Domicilio;
    }
}
