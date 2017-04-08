/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosUltimos;

/**
 *
 * @author alumno
 */
public class testPilaPalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PilaPalabras pila = new PilaPalabras();
        pila.apilarPalabra("Hola");
        pila.apilarPalabra("Marikarmen");
        pila.apilarPalabra("tu");
        pila.apilarPalabra("hijo");
        while(!pila.pilaPalabrasVacia()) {
           System.out.println(pila.desapilarPalabra());
        }
        System.out.println(pila.obtenerPalabraCima());
    }
    
}
