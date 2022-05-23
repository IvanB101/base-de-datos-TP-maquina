/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpmaquianasql.Model;

/**
 *
 * @author ivanb
 */
public class Se_Consume {
    private int C_Cod, P_Cod;

    public Se_Consume(int C_Cod, int P_Cod) {
        this.C_Cod = C_Cod;
        this.P_Cod = P_Cod;
    }

    public int getC_Cod() {
        return C_Cod;
    }

    public void setC_Cod(int C_Cod) {
        this.C_Cod = C_Cod;
    }

    public int getP_Cod() {
        return P_Cod;
    }

    public void setP_Cod(int P_Cod) {
        this.P_Cod = P_Cod;
    }
}
