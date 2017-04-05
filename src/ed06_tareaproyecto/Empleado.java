/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 * CLASE EMPLEADO
 * @author arantxa
 */
public class Empleado {

    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    /**
     * El constructor inicializa el cargo con EMPLEADO y el número de hijos a 0.
     * @param dni Será el valor que tenga el dni del objeto.
     * @param nombre Será el nombre del empleado.
     */
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
    
    /**
     * @return el dni del empleado.
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni Será el nuevo valor que tenga el dni del empleado.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Será el nuevo nombre del empleado.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return direccion del empleado
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion Domicilio del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return cargo del empleado en la empresa.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo Será el nuevo puesto del empleado en la empresa.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return número de hijos del empleado.
     */
    public int getNumHijos() {
        return numHijos;
    }

    /**
     * @param numHijos Será el nuevo número de hijos que tiene el empleado.
     */
    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
    
    /**
     * Este método calcula el sueldo del empleado según su cargo y número de hijos.
     * @return sueldo total
     */
    public double calcula_sueldo(){
        double total=1200;
        
        if(getCargo().equals("ENCARGADO"))
            total+=300;
        else if(getCargo().equals("DIRECTOR"))
            total+=1000;
        if(getNumHijos()>=3)
            total+=getNumHijos()*50;
        return total;
    }
    
    /**
     * Este método es de la clase ya que se dedica a imprimir datos.
     * @param empleado1 Empleado del que queremos visualizar los datos.
     */
    public static void imprimir_emp(Empleado empleado1) {
        System.out.println("DNI: " + empleado1.getDni());
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("Número de hijos: " + empleado1.getNumHijos());
        System.out.println("Sueldo: " + empleado1.calcula_sueldo());
    }

}
