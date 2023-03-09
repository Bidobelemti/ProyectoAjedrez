package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase rey heredada de ficha
 */
public class Rey extends Ficha {

    /**
     * Crea una ficha de tipo rey,con un color, de tipo 6, con un único
     * identificador y con una única casilla
     *
     * @param esBlanca
     * @param tipo
     * @param id
     * @param casilla
     */
    public Rey(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {

        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i = movimientoX;
        int j = movimientoY;

        //movimiento del rey de fichas blancas
        if (turnoBlanco) {
            System.out.println("entra al metodo del rey");
            for (i = movimientoX - 1; i < movimientoX + 2; i++) {
                for (j = movimientoY - 1; j < movimientoY + 2; j++) {
                    if ((i != movimientoX) || (j != movimientoY)) {
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                    TableroAjedrez.getNegro())) {
                                TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                                System.out.println(i + "," + j + " Matriz");

                            } else {
                                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                        TableroAjedrez.getBlanco())) {
                                    TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                                    System.out.println(i + "," + j + " Matriz");
                                }

                            }
                        }
                    }
                }
            }
        } else {
            for (i = movimientoX - 1; i < movimientoX + 2; i++) {
                for (j = movimientoY - 1; j < movimientoY + 2; j++) {
                    if ((i != movimientoX) || (j != movimientoY)) {
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                    TableroAjedrez.getBlanco())) {
                                TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                                System.out.println(i + "," + j + " Matriz");
                            } else {
                                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                        TableroAjedrez.getNegro())) {
                                    TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                                    System.out.println(i + "," + j + " Matriz");
                                }

                            }
                        }
                    }
                }
            }
        }
    }
}
