/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adicionales;

/**
 *
 * @author DANIEL SANCHEZ
 */
public class crema extends Aderezo{
    private String nombre;

    @Override
    public void setNombre() {
        this.nombre ="crema";
    }
         
    @Override
    public String toString() {
        setNombre();
        return this.nombre.toUpperCase();
    }
}
