/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosUltimos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/**
 *
 * @author alumno
 */
public class eje14 {

    public static String[] obtenerArrCad5VocalesAl(String[] array){
        ArrayList<String> cadenas = new ArrayList<String>();
        for(String cadena : array){
            if(cadena.toLowerCase().contains("a") && cadena.toLowerCase().contains("e")
                    && cadena.toLowerCase().contains("i") && cadena.toLowerCase().contains("o")
                    && cadena.toLowerCase().contains("u")) cadenas.add(cadena);
            
        }
        return cadenas.toArray(new String[cadenas.size()]);
    }
    public static ArrayList<String> obtenerArrListCad5VocalesAl(String[] array){
        ArrayList<String> cadenas = new ArrayList<String>();
        for(String cadena : array){
            if(cadena.toLowerCase().contains("a") && cadena.toLowerCase().contains("e")
                    && cadena.toLowerCase().contains("i") && cadena.toLowerCase().contains("o")
                    && cadena.toLowerCase().contains("u")) cadenas.add(cadena);
            
        }
        return cadenas;
    }
    
    public static ArrayList<String> obtenerArrListSinCadenasRepetidas(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i+1; j < lista.size(); j++) {
                if(lista.get(i).equals(lista.get(j))){
                    lista.remove(j);
                    j--;
                }
            }
            
        }
        return lista;
    }
   
    
    public static void main(String[] args) {
       String[] cadenas = {"Hola", "libro","libro", "libro", "libro","murcielago","murcielago","Hola","Pedro"};
        String[] cad = obtenerArrCad5VocalesAl(cadenas);
        for (String c : cad) {
            System.out.println(c);
        }
        
        Collection cadenasLista = Arrays.asList(cadenas);
        
        ArrayList<String> cadenasLista2 = new ArrayList<>(cadenasLista);
        
        ArrayList<String> lista = obtenerArrListCad5VocalesAl(cadenas);
        
        System.out.println(lista);

        lista = obtenerArrListSinCadenasRepetidas(cadenasLista2);
        
        System.out.println(lista);
        
    }
    
}
