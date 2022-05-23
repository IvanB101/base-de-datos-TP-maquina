/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Model;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author ivanb
 */
public class Consumos {
    private int C_Cod, Me_Cod_Realiza;
    private LocalDate C_Fecha;
    private LocalTime C_Hora;

    public Consumos(int Me_Cod, int Mo_Cod_Atiende, LocalDate C_Fecha, LocalTime C_Hora) {
        this.C_Cod = Me_Cod;
        this.Me_Cod_Realiza = Mo_Cod_Atiende;
        this.C_Fecha = C_Fecha;
        this.C_Hora = C_Hora;
    }

    public int getC_Cod() {
        return C_Cod;
    }

    public void setC_Cod(int Me_Cod) {
        this.C_Cod = Me_Cod;
    }

    public int getMe_Cod_Realiza() {
        return Me_Cod_Realiza;
    }

    public void setMe_Cod_Realiza(int Mo_Cod_Atiende) {
        this.Me_Cod_Realiza = Mo_Cod_Atiende;
    }

    public LocalDate getC_Fecha() {
        return C_Fecha;
    }

    public void setC_Fecha(LocalDate C_Fecha) {
        this.C_Fecha = C_Fecha;
    }

    public LocalTime getC_Hora() {
        return C_Hora;
    }

    public void setC_Hora(LocalTime C_Hora) {
        this.C_Hora = C_Hora;
    }
}
