/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class Caballo extends Ficha {

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
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

        } else {

            i = movimientoX - 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX - 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 1;
            j = movimientoY + 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }

            i = movimientoX + 2;
            j = movimientoY + 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX - 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX - 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX + 1;
            j = movimientoY - 2;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }
            i = movimientoX + 2;
            j = movimientoY - 1;
            if ((i >= 0) && (i < 8) && (j < 8) && (j >= 0)) {
                if (TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j);
                } else {
                    if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())) {
                        TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                        System.out.println(i + "," + j);
                    }
                }
            }
        }

    }

}
