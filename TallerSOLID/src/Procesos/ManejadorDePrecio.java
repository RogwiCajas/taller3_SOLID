/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;
import Adicionales.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author cajas
 */
public class ManejadorDePrecio {
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }
    public String showPrecioFinal(){
        return "Precio Final: $ " + calcularPrecioFinal();
    }
}