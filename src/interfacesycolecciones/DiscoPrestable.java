/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesycolecciones;

/**
 *
 * @author alumno
 */
public class DiscoPrestable extends Disco implements Prestable{

    private boolean prestado;
    
    public DiscoPrestable(String titulo, String autor, String formato,double duracion, String genero){
        super(titulo, autor, formato, 0, genero);
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
    
}
