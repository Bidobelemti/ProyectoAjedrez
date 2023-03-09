package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase representa a un tablero de ajedrez
 */
public class TableroAjedrez {

    /**
     * Guarda una matriz de botones
     */
    private static JButton tablero[][];
    /**
     * Guarda el penultimo boton seleccionado
     */
    private JButton btnSeleccionado;
    /**
     * Guarda la casilla seleccionada de acuerdo a un número
     */
    private int casilla;
    /**
     * Guarda los jugadores, blanco y negro
     */
    private static Jugador blanco;
    private static Jugador negro;
    /**
     * Asigna el turno del juego, iniciando las fichas blancas
     */
    private boolean esTurnoBlanco = true;

    /**
     * Crea un tablero de ajedrez de acuerdo al tablero mandado
     *
     * @param tablero
     */
    public TableroAjedrez(JButton[][] tablero) {
        this.tablero = new JButton[8][8];
        this.tablero = tablero;

    }

    public JButton getBtnSeleccionado() {
        return btnSeleccionado;
    }

    public void setBtnSeleccionado(JButton btnSeleccionado) {
        this.btnSeleccionado = btnSeleccionado;
    }

    public int getCasilla() {
        return casilla;
    }

    public void setCasilla(int casilla) {
        this.casilla = casilla;
    }

    public static Jugador getBlanco() {
        return blanco;
    }

    public static Jugador getNegro() {
        return negro;
    }

    public static JButton[][] getTablero() {
        return tablero;
    }

    public void setBlanco(Jugador blanco) {
        this.blanco = blanco;
    }

    public void setNegro(Jugador negro) {
        this.negro = negro;
    }

    public boolean esTurnoBlanco() {
        return esTurnoBlanco;
    }

    public void setEsTurnoBlanco(boolean esTurnoBlanco) {
        this.esTurnoBlanco = esTurnoBlanco;
    }

    /**
     * Verifica si una casilla esta ocupada o no, para esto necesita la casilla
     * destino y el jugador que realiza el movimiento
     *
     * @param casilla
     * @param jugador
     * @return
     */
    public static boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for (int i = 0; i < jugador.getFichas().size(); i++) {
            if (casilla.equals(jugador.getFichas().get(i).getCasilla())) {
                ocupada = true;
            }
        }
        return ocupada;
    }

    /**
     * Invierte el turno, pasando de blancas a negras
     */
    public void cambiarTurno() {
        if (this.esTurnoBlanco) {
            this.esTurnoBlanco = false;
        } else {
            this.esTurnoBlanco = true;
        }
    }

    /**
     * Verifica si el rey es comido, se envia el jugador rival y su ficha
     *
     * @param rival
     * @param eliminada
     * @return
     */
    public boolean JaqueMate(Jugador rival, Ficha eliminada) {
        boolean acabado = false;
        for (int i = 0; i < rival.getFichas().size(); i++) {
            if (rival.getFichas().get(i).equals(eliminada)) {
                if (rival.getFichas().get(i).getTipoFicha() == 6) {
                    acabado = true;
                }
                rival.getFichas().remove(i);
            }
        }
        return acabado;
    }

    /**
     * Dado la matriz de casillas pintamos con los colores del tablero
     * @param MatrizCasillas
     */

    public static void pintarCasillasNormal(JButton[][] MatrizCasillas) {
        int i, j;
        for (i = 0; i < 8; i++) {
            if (i == 0 || i == 2 || i == 4 || i == 6) {
                for (j = 0; j < 8; j += 2) {
                    //MatrizCasillas[i][j].setBackground(Color.decode("CCCCCC"));
                    MatrizCasillas[i][j].setBackground(Color.WHITE);

                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    //MatrizCasillas[i][j].setBackground(Color.decode("CCCCCC"));
                    MatrizCasillas[i][j].setBackground(Color.WHITE);
                }
            }
        }
        for (i = 0; i < 8; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7) {
                for (j = 0; j < 8; j += 2) {
                    //MatrizCasillas[i][j].setBackground(Color.decode("#3399FF"));
                    MatrizCasillas[i][j].setBackground(Color.decode("#7EA2D6"));
                }
            } else {
                for (j = 1; j < 8; j += 2) {
                    //MatrizCasillas[i][j].setBackground(Color.decode("#3399FF"));
                    MatrizCasillas[i][j].setBackground(Color.decode("#7EA2D6"));
                }
            }
        }
    }

}
