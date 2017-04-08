/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesycolecciones;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Proyecto extends Publicaciones implements Prestable, Comparable<Proyecto>{
    private String nombre_carrera;
    private boolean prestado;
    
    public Proyecto(String codigo, String titulo, int año, String carrera) {
        super(codigo, titulo, año);
        this.nombre_carrera = carrera;
        this.prestado = false;
    }
    
    public void prestar() {
        this.prestado = true;
    }


    public void devolver() {
       this.prestado = false;
    }


    public boolean prestado() {
       return this.prestado;
    }

    public int compareTo(Proyecto p) {
        return this.codigo.compareTo(p.getCodigo());
    }

    
    public String toString(){
        return super.toString() + "\nCarrera: " + nombre_carrera;
    }
    
}
