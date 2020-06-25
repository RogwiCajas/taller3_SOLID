/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Leche;

import Postres.*;
/**
 *
 * @author Pedro Mendoza
 */
public class LecheDeslactosada extends LecheEntera {

    @Override
    public void usar(Postre postre) throws RuntimeException {
        // Lanzar error No se puede usar en pastel
        // throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
        if (!postre.getClass().equals(Pastel.class)) {
            System.out.println("Usando leche deslactosada");
        } else {
            throw new RuntimeException(this.getClass() + ": No se puede usar en pastel");
            
        }
    }
}