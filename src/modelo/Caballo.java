package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * Clase caballo heredada de ficha
 */
public class Caballo extends Ficha {

    /**
     * Crea una ficha de tipo caballo con un color, de tipo 3, con un
     * identificador único y con una casilla única
     *
     * @param esBlanca
     * @param tipo
     * @param id
     * @param casilla
     */
    public Caballo(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {

        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i = movimientoX;
        int j = movimientoY;

        if (turnoBlanco) {
            i = movimientoX - 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

        } else {

            i = movimientoX - 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX - 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX - 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX + 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX + 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#b22222"));
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.decode("#ffff56"));
                        System.out.println(i + "," + j);
                    }
                }
            }
        }

    }

}
