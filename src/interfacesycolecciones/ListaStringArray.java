/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesycolecciones;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



/**
 *
 * @author alumno
 */
public class ListaStringArray implements ListaString {

    private String[] arrayString;
    private int contador;
    
    public ListaStringArray(int tamaño){
        arrayString = new String[tamaño];
    }

    public String[] getArrayString() {
        return arrayString;
    }

    public int getContador() {
        return contador;
    }

    
    public String getString(int posicion) {
       return this.arrayString[posicion];
    }


    public void addString(String cadena) {
        this.arrayString[this.contador] = cadena;
        contador++;
    }


    public int size() {
       return this.contador;
    }


    public ListIterator<String> listIterator() {
        List<String> lista = Arrays.asList(this.arrayString);
        ListIterator<String> li = lista.listIterator();
        return li;
    }


    public ListIterator<String> listIteratorComienzaPor(char c) {
        ArrayList<String> lista = new ArrayList();
        for(int i=0; i<this.contador; i++){
            if(this.arrayString[i].charAt(0) == c){
                lista.add(this.arrayString[i]);
            }
        }
        ListIterator<String> li = lista.listIterator();
        return li;
    }


    public Iterator<String> iterator() {
        Iterator i = new MiIterador();
        
        return i;
    }


    @Override
    public int compareTo(ListaStringArray l) {
        Integer tamaño1 = this.arrayString.length;
        Integer tamaño2 = l.getArrayString().length;
        return tamaño1.compareTo(tamaño2);
    }

    protected class MiIterador implements Iterator<String>{

        private int posicion = 0;
        
        public MiIterador(){
            this.posicion = 0;
        }

        public boolean hasNext() {
            return (this.posicion < arrayString.length);
        }

        
        public String next() {
            this.posicion++;
            return arrayString[this.posicion-1];
        }
        
        
    }
    
}
