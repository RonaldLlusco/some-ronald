/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author ronal
 */
public class jugador {
    
    String nombrecompleto;
    String apellidos;
     int edad;
     int ci;

    public jugador(String nombrecompleto, String apellidos, int edad, int ci) {
        this.nombrecompleto = nombrecompleto;
        this.apellidos = apellidos;
        this.edad = edad;
        this.ci = ci;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
    
    public void imprimirjugador()
    {
        System.out.println(this.nombrecompleto);
        System.out.println(this.apellidos);
        System.out.println(this.ci);
        System.out.println(this.edad);
    }
    
}
