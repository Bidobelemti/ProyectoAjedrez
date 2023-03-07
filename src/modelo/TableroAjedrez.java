package modelo;

import java.awt.Color;
import javax.swing.JButton;

public class TableroAjedrez {

    private static JButton tablero[][];
    private JButton btnSeleccionado;
    private int casilla;
    private static Jugador blanco;
    private static Jugador negro;
    private boolean esTurnoBlanco = true;

    public TableroAjedrez(JButton[][] tablero/*, Jugador blanco, Jugador negro*/) {
        this.tablero = new JButton[8][8];
        this.tablero = tablero;
        //this.blanco = blanco;
        //this.negro = negro;
        
    }
    
    public TableroAjedrez(){
        
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

    public  void setNegro(Jugador negro) {
        this.negro = negro;
    }

    public boolean esTurnoBlanco() {
        return esTurnoBlanco;
    }

    public void setEsTurnoBlanco(boolean esTurnoBlanco) {
        this.esTurnoBlanco = esTurnoBlanco;
    }

    public static boolean casillaOcupada(JButton casilla, Jugador jugador) {
        boolean ocupada = false;
        for (int i = 0; i < jugador.getFichas().size(); i++) {
            if (casilla.equals(jugador.getFichas().get(i).getCasilla())) {
                ocupada = true;
            }
        }
        return ocupada;
    }

    public void cambiarTurno() {
        if (this.esTurnoBlanco) {
            this.esTurnoBlanco = false;
        } else {
            this.esTurnoBlanco = true;
        }
    }

    public boolean comer(Jugador rival, Ficha eliminada) {
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
