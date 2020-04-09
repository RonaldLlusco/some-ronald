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
public class campeonato {
    String nombrecampeonato;
    equipo[] equipo;

    public campeonato() {
    }

    public campeonato(String nombrecampeonato, equipo[] equipo) {
        this.nombrecampeonato = nombrecampeonato;
        this.equipo = equipo;
    }

    public String getNombrecampeonato() {
        return nombrecampeonato;
    }

    public void setNombrecampeonato(String nombrecampeonato) {
        this.nombrecampeonato = nombrecampeonato;
    }

    public equipo[] getEquipo() {
        return equipo;
    }

    public void setEquipo(equipo[] equipo) {
        this.equipo = equipo;
    }

     public void imprimircampeonato()
    {
        
        System.out.println(this.nombrecampeonato);
        for(int i = 0; i<this.equipo.length;i++)
        {
           this.equipo[i].imprimirequipo();
        }
    
    }
    
}
