/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import clases.jugador;

/**
 *
 * @author ronal
 */
public class equipo {

    private String nombreequipo;
    String categoria;
    jugador[] jugadores;

    public equipo() {
    }

    public equipo(String nombreequipo, String categoria, jugador[] jugadores) {
        this.nombreequipo = nombreequipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public void imprimirequipo() {
        System.out.println(this.nombreequipo);
        System.out.println(this.categoria);
        for (int i = 0; i < this.jugadores.length; i++) {
           
            this.jugadores[i].imprimirjugador();
        }

    }

}
