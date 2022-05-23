/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Model;

/**
 *
 * @author ivanb
 */
public class Mesas {
    private int Me_Cod, Me_Cod_Realiza;
    private String Me_Sector;

    public Mesas(int Me_Cod, int Mo_Cod_Atiende, String Me_Sector) {
        this.Me_Cod = Me_Cod;
        this.Me_Cod_Realiza = Mo_Cod_Atiende;
        this.Me_Sector = Me_Sector;
    }

    public int getMe_Cod() {
        return Me_Cod;
    }

    public void setMe_Cod(int Me_Cod) {
        this.Me_Cod = Me_Cod;
    }

    public int getMe_Cod_Realiza() {
        return Me_Cod_Realiza;
    }

    public void setMe_Cod_Realiza(int Mo_Cod_Atiende) {
        this.Me_Cod_Realiza = Mo_Cod_Atiende;
    }

    public String getMe_Sector() {
        return Me_Sector;
    }

    public void setMe_Sector(String Me_Sector) {
        this.Me_Sector = Me_Sector;
    }
}
