package modelo;

import javax.swing.JButton;

/**
 * Clase representa a una ficha dentro del ajedrez
 */
public abstract class Ficha {

    /**
     * Asigna a la ficha su color de acuerdo a un booleano, True para blanco,
     * False para negro
     */
    protected static boolean esFichaBlanca;
    /**
     * Asigna a la ficha un tipo 1 - peon | 2 - Torre | 3 - Caballo | 4 - Alfil
     * | 5 - Dama | 6 - Rey
     */
    private int tipoFicha;
    /**
     * Asigna un identificador de fichas, único para cada una
     */
    protected int identificacion;
    /**
     * Guarda el movimiento de la ficha en el eje x
     */
    protected int movimientoX;
    /**
     * Guarda el movimiento de la ficha en el eje y
     */
    protected int movimientoY;
    /**
     * Guarda el boton en el cual se encuentra la ficha
     */
    protected JButton casilla;

    /**
     * Crea una ficha con un color, de un tipo, con un identificador unico y con
     * una casilla enlazada
     *
     * @param esBlanca
     * @param tipo
     * @param id
     * @param casilla
     */
    public Ficha(boolean esBlanca, int tipo, int id, JButton casilla) {
        this.esFichaBlanca = esBlanca;
        this.tipoFicha = tipo;
        this.identificacion = id;
        this.casilla = casilla;
    }

    public JButton getCasilla() {
        return casilla;
    }

    public void setCasilla(JButton casilla) {
        this.casilla = casilla;
    }

    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    /**
     * Metodo asigna el movimiento de una ficha de acuerdo a su posicion actual
     * presente en el tablero, si es turno blanco o no y por ultimo si es el
     * primer turno; este es exclusivo del peón
     * @param posicion
     * @param turnoBlanco
     * @param primerTurno
     */
    public abstract void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno);

}
