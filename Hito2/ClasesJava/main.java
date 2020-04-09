/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajava;

import clases.campeonato;
import clases.equipo;
import clases.jugador;

/**
 *
 * @author ronal
 */
public class Pruebajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jugador jugador1 = new jugador("nombre1", "apellido1", 123, 12);
        jugador jugador2 = new jugador("nombre2", "apellido2", 123234, 15);
        jugador jugador3 = new jugador("nombre3", "apellido3", 13253, 17);

        jugador[] jugadoresequipo1 = new jugador[3];
        jugadoresequipo1[0] = jugador1;
        jugadoresequipo1[1] = jugador2;
        jugadoresequipo1[2] = jugador3;
        
        equipo equipo1 = new equipo("not fount","VARONES", jugadoresequipo1);
        equipo[]equipos = new equipo[1];
        equipos[0]=equipo1;
        
        campeonato camp = new campeonato("campeonato unifranz",equipos);
        camp.imprimircampeonato();
       
    }

}
