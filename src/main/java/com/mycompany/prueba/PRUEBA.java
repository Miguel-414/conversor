/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

/**
 *
 * @author Windows
 */
public class PRUEBA {

    public double dolar(double valor) {
        return valor * 0.00024;
    }

    public double euro(double valor) {
        return valor * 0.00022;
    }

    public double libra_esterlina(double valor) {
        return valor * 0.00019;
    }

    public double japon(double valor) {
        return valor * 0.035;
    }

    public double china(double valor) {
        return valor * 0.0018;
    }

    public static void main(String[] args) {
        PANTALLA p = new PANTALLA();
        p.setVisible(true);
        p.setLocationRelativeTo(null);

    }
}
