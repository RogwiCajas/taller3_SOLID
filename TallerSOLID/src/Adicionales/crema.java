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
    

    
     public String toString() {
        return this.nombre.toUpperCase();
    }



    @Override
    public void setNombre() {
        this.nombre ="crema";
    }
}
