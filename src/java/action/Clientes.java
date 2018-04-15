/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author ingarukal11
 */
public class Clientes extends ActionSupport{
    
    private String nombre;
    private int edad;

    @Override
    public String execute(){
        return "ok";
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void validate(){
        if(nombre == null || nombre.equals(""))
            addFieldError("nombre", "USTED DEBE INGRESAR UN NOMBRE");
        
        if(!(edad >= 18 && edad <= 30))
            addFieldError("edad", "LA EDAD DEBE ESTAR ENTRE 18 Y 30");
    }
    
}
