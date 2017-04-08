/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesycolecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

/**
 *
 * @author alumno
 */
public class Biblioteca {
    
    public static int cuentaPestrados(ArrayList publicaciones){
        int contador = 0;
        for(Object o: publicaciones){
            if(o instanceof Prestable){
                Prestable l = (Prestable) o;
                if(l.prestado()) contador++;
            }
        }
        return contador;
    }
    
    public static int publicacionesAnteriores(ArrayList<Publicaciones> publicaciones, int año){
        int contador = 0;
        for(Publicaciones p:publicaciones){
            if(p.getAño()<año){
                contador++;
            }
        }
        return contador;
    }
    
    /**
     *                   MAIN
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        EJERCICIO 2
        */
        Libros libro = new Libros("1234", "Alicia, en el país de las maravillas.", 1987);
        Libros libro2 = new Libros("1235", "Pulgarcito", 1887);
        Revistas revista = new Revistas("1236", "Hola",1967,2);
        Revistas revista2 = new Revistas("1237", "Pronto",1997,6);
        
        ArrayList<Publicaciones> publicacion = new ArrayList<Publicaciones>();
        
        publicacion.add(libro);
        publicacion.add(libro2);
        publicacion.add(revista);
        publicacion.add(revista2);
        
        libro.prestar();
        
        System.out.println(publicacion);
        
        System.out.println("Número de publicaciones prestadas: " + cuentaPestrados(publicacion));
        
        int año = 1980;
        System.out.println("Número de publicaciones anterior a " +año+": " + publicacionesAnteriores(publicacion, año));
        
        /*
        EJERCICIO 4
        */
        ArrayList<Disco> discos = new ArrayList<Disco>();
        discos.ensureCapacity(3);
        DiscoPrestable d1 = new DiscoPrestable("Soy", "Lali Espósito","vinilo", 2016, "PopDance");
        DiscoPrestable d2 = new DiscoPrestable("A bailar", "Lali Espósito","vinilo", 2012, "PopDance");
        DiscoPrestable d3 = new DiscoPrestable("Cuestión de gustos", "Pignoise","CD", 2006, "Pop");
        
        discos.add(d1);
        discos.add(d2);
        discos.add(d3);
        
        d1.prestar();
        d2.prestar();
        
        System.out.println("Número de discos prestados: " + cuentaPestrados(discos));
        
        /*
        EJERCICIO 6
        */
        ArrayList<Proyecto> proyectos = new ArrayList();
        Proyecto p1 = new Proyecto("1238", "Matemáticas cotidianas",2017, "Matemáticas");
        Proyecto p2 = new Proyecto("1239", "Feminismo como forma de vida",2015, "Integración social");
        Proyecto p3 = new Proyecto("1240", "Un comunismo sostenible",2018, "Ciencias políticas");
        
        proyectos.add(p3);
        proyectos.add(p2);
        proyectos.add(p1);
        
        p1.prestar();
        p2.prestar();
        
        System.out.println("Número de proyectos prestados: " + cuentaPestrados(proyectos));
        
        Collections.sort(proyectos);
        
        System.out.println("Lista ordenada de proyectos: " + proyectos);
        
        /*
        EJERCICIO 9:
        Escribir una aplicación que declare un objeto de tipo ListaString. Crear
        ese objeto de tipo ListaStringArray con un tamaño máximo de 20
        elementos.
            a. Añadir varias cadenas de texto a la lista
            b. Haz un recorrido hacia adelante y otro hacia atrás mostrando
            todos los elementos de la lista. Utilizar para ello el iterador
            devuelto por listIterator().
            c. Haz un recorrido hacia adelante y otro hacia atrás mostrando
            los elementos de la lista que comiencen por el carácter ‘c’.
            utilizar para ello el iterador devuelto por
            lisIteratorComienzaPor().
            d. Haz un recorrido hacia adelante mostrando todos los
            elementos de la lista utilizando una versión reducida del for.
         */
        
        ListaString lista = new ListaStringArray(20);
        lista.addString("Hola madre, ¿cómo va?");
        lista.addString("Los helados están fríos.");
        lista.addString("La casa de Bernarda.");
        lista.addString("Pedro");
        
        ListIterator i = lista.listIterator();
        System.out.println("\nHacia adelante:");
        while(i.hasNext()){
            String cadena = (String) i.next();
            if(cadena!= null)System.out.println(cadena);
        }
        
        System.out.println("\nHacia atrás:");
        while(i.hasPrevious()){
            String cadena = (String)i.previous();
            if(cadena!= null)System.out.println(cadena);
        }
        
        ListIterator it = lista.listIteratorComienzaPor('L');
        System.out.println("\nHacia adelante:");
        while(it.hasNext()){
            String cadena = (String) it.next();
            if(cadena!= null)System.out.println(cadena);
        }
        
        System.out.println("\nHacia atrás:");
        while(it.hasPrevious()){
            String cadena = (String)it.previous();
            if(cadena!= null)System.out.println(cadena);
        }
        
        System.out.println("\nRecorrido con for reducido:");
        for(String str : lista){
            if(str!= null)System.out.println(str);
        }
        
        /*
        PARA PROBAR EL EJERCICIO 11
        */
        ListaString lista2 = new ListaStringArray(30);
        System.out.println(((ListaStringArray)lista).compareTo((ListaStringArray)lista2));
    }
    
}

