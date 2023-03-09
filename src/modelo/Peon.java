package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase peon heredada de ficha
 */
public class Peon extends Ficha {

    /**
     * Crea una ficha de tipo peon, con un color, de tipo 1, con un único
     * identificador y con una única casilla
     *
     * @param esBlanca
     * @param tipo
     * @param id
     * @param casilla
     */
    public Peon(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {
        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i, j;

        System.out.println("Mensaje en PEON a ver si vale :V");

        //fichas blancas hacia arriba
        if (turnoBlanco) {
            i = movimientoX - 1;
            j = movimientoY;
            if (i >= 0 && i < 8 && j < 8 && j >= 0) {
                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                    System.out.println(i + "," + j + " Matriz");
                }
            }
            i = movimientoX - 2;
            j = movimientoY;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && primerTurno) {
                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                        TableroAjedrez.getNegro()) && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));

                    System.out.println(i + "," + j + " Matriz");

                }
            }
            i = movimientoX - 1;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                }
            }
            i = movimientoX - 1;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                }
            }

        } else {
            i = movimientoX + 1;
            j = movimientoY;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                    System.out.println(i + "," + j);
                }
            }
            i = movimientoX + 2;
            j = movimientoY;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && primerTurno) {
                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                    System.out.println(i + "," + j);
                }
            }
            i = movimientoX + 1;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                }
            }
            i = movimientoX + 1;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                }
            }
        }

    }

}
