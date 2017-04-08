/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesycolecciones;

import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public interface ListaString extends Iterable<String>,Comparable<ListaStringArray>{
    
    public abstract String getString(int posicion);
    public abstract void addString(String cadena);
    public abstract int size();
    public abstract ListIterator<String> listIterator();
    public abstract ListIterator<String> listIteratorComienzaPor(char c);
}
