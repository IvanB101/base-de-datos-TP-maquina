/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Model;

/**
 *
 * @author ivanb
 */
public class Platos {
    private int P_Cod, P_PrecioCosto, P_PrecioVenta, P_PrecioPromocion;
    private String P_Descripcion, P_Nombre, P_Tipo;

    public Platos(int P_Cod, int P_PrecioCosto, int P_PrecioVenta, int P_PrecioPromocion, String P_Descripcion,
            String P_Nombre, String P_Tipo) {
        this.P_Cod = P_Cod;
        this.P_PrecioCosto = P_PrecioCosto;
        this.P_PrecioVenta = P_PrecioVenta;
        this.P_PrecioPromocion = P_PrecioPromocion;
        this.P_Descripcion = P_Descripcion;
        this.P_Nombre = P_Nombre;
        this.P_Tipo = P_Tipo;
    }

    public int getP_Cod() {
        return P_Cod;
    }

    public void setP_Cod(int P_Cod) {
        this.P_Cod = P_Cod;
    }

    public int getP_PrecioCosto() {
        return P_PrecioCosto;
    }

    public void setP_PrecioCosto(int P_PrecioCosto) {
        this.P_PrecioCosto = P_PrecioCosto;
    }

    public int getP_PrecioVenta() {
        return P_PrecioVenta;
    }

    public void setP_PrecioVenta(int P_PrecioVenta) {
        this.P_PrecioVenta = P_PrecioVenta;
    }

    public int getP_PrecioPromocion() {
        return P_PrecioPromocion;
    }

    public void setP_PrecioPromocion(int P_PrecioPromocion) {
        this.P_PrecioPromocion = P_PrecioPromocion;
    }

    public String getP_Descripcion() {
        return P_Descripcion;
    }

    public void setP_Descripcion(String P_Descripcion) {
        this.P_Descripcion = P_Descripcion;
    }

    public String getP_Nombre() {
        return P_Nombre;
    }

    public void setP_Nombre(String P_Nombre) {
        this.P_Nombre = P_Nombre;
    }

    public String getP_Tipo() {
        return P_Tipo;
    }

    public void setP_Tipo(String P_Tipo) {
        this.P_Tipo = P_Tipo;
    }
}
