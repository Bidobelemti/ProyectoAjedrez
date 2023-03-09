package modelo;

import java.util.ArrayList;

/**
 * Clase representa a un jugador en el ajedrez
 */
public class Jugador {

    /**
     * Guarda un usuario
     */
    private final String usuario;
    /**
     * Guarda un color
     */
    private final String color;
    /**
     * Asigna a cada jugador el tipo de fichas de aceurdo a su color
     */
    private ArrayList<Ficha> fichas;
    
    private String ganador;
    
    /**
     * Crea un jugador con un usuario, un color y le asigna un arreglo de fichas
     *
     * @param usuario
     * @param color
     * @param fichas
     */
    public Jugador(String usuario, String color, ArrayList fichas) {
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

    public String getGanador() {
        return ganador;
    }

    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    
    
    
}
