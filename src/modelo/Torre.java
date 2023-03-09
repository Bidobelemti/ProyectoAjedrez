package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 * Clase torre heredada de ficha
 */
public class Torre extends Ficha {

    /**
     * Crea una ficha de tipo torre, con un color, de tipo 2 con un
     * identificador único, y una casiilla única
     *
     * @param esBlanca
     * @param tipo
     * @param id
     * @param casilla
     */
    public Torre(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {
        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i = movimientoX - 1;
        int j = movimientoY;
        boolean ocupada = false;

        System.out.println("Mensaje en torre a ver si vale :V");
        //movimiento de la torre de fichas blancas
        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                System.out.println(i + "," + j + " Matriz");

            } else {
                ocupada = true;
                if (turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            i--;

        }

        i = movimientoX + 1;
        j = movimientoY;
        ocupada = false;

        while ((i >= 0) && (i < 8) && !ocupada) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                System.out.println(i + "," + j + " Matriz");

            } else {
                ocupada = true;
                if (turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            i++;

        }

        i = movimientoX;
        j = movimientoY + 1;
        ocupada = false;

        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupada = true;
                if (turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            j++;

        }

        i = movimientoX;
        j = movimientoY - 1;
        ocupada = false;

        while ((i >= 0) && (i < 8) && (j < 8) && (j >= 0) && !ocupada) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupada = true;
                if (turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !turnoBlanco && TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {

                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            j--;

        }

    }

}
