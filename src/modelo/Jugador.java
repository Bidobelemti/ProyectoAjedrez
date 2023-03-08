/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Bidob
 */
public class Jugador {
    private final String usuario;
    private final String color;
    private ArrayList<Ficha> fichas;
    
    public Jugador(String usuario, String color, ArrayList fichas){
        this.fichas = new ArrayList<>();
        this.usuario = usuario;
        this.color = color;
        this.fichas = fichas;
    }

    public ArrayList<Ficha> getFichas() {
        return fichas;
    }
    
    public void setFichas(ArrayList<Ficha> fichas) {
        this.fichas = fichas;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getColor() {
        return color;
    }
    
    
      
}
