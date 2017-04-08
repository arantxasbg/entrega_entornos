/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosUltimos;

import java.util.*;
/**
 *
 * @author alumno
 */
public class PilaPalabras {

    LinkedList<String> pila = new LinkedList();

    public void apilarPalabra(String palabra) {
        pila.add(palabra);
    }
    
    public String desapilarPalabra(){
        if(!this.pilaPalabrasVacia())return pila.removeLast();
        else return "La pila está vacía";
    }
    
    public String obtenerPalabraCima(){
        if(!this.pilaPalabrasVacia())return pila.getLast();
        else return "La pila está vacía";
    }

    public boolean pilaPalabrasVacia(){
        return pila.isEmpty();
    }
}
