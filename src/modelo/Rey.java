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
public class Rey extends Ficha {

    public Rey(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {
        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i = movimientoX;
        int j = movimientoY;

        if (turnoBlanco) {
            for (i = movimientoX - 1; i < movimientoX + 2; i++) {
                for (j = movimientoY - 1; i < movimientoY + 2; j++) {
                    if ((i != movimientoX) || (j != movimientoY)) {
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                    TableroAjedrez.getNegro())) {
                                TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                            } else {
                                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                        TableroAjedrez.getBlanco())) {
                                    TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                                }

                            }
                        }
                    }
                }
            }
        } else {
            for (i = movimientoX - 1; i < movimientoX + 2; i++) {
                for (j = movimientoY - 1; i < movimientoY + 2; j++) {
                    if ((i != movimientoX) || (j != movimientoY)) {
                        if ((i >= 0) && (i < 8) && (j >= 0) && (j < 8)) {
                            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                    TableroAjedrez.getBlanco())) {
                                TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                            } else {
                                if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j],
                                        TableroAjedrez.getNegro())) {
                                    TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                                }

                            }
                        }
                    }
                }
            }
        }

    }
}
