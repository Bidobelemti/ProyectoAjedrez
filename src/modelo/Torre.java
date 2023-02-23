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
public class Torre extends Ficha {

    public Torre(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {
        super.movimientoX = posicion / 8;
        super.movimientoY = posicion % 8;
        int i = movimientoX - 1;
        int j = movimientoY;
        boolean ocupado = false;

        //movimiento de la torre de fichas blancas
        // > <
        while ((i >= 0) && (i < 8) && !ocupado) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupado = true;
                if (turnoBlanco && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            i--;

        }

        i = movimientoX + 1;
        j = movimientoY;
        ocupado = false;

        while ((i >= 0) && (i < 8) && !ocupado) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupado = true;
                if (turnoBlanco && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            i++;

        }

        i = movimientoX;
        j = movimientoY + 1;
        ocupado = false;

        while ((i >= 0) && (i < 8) && !ocupado) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupado = true;
                if (turnoBlanco && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            j++;

        }

        i = movimientoX;
        j = movimientoY - 1;
        ocupado = false;
        
        while ((i >= 0) && (i < 8) && !ocupado) {
            if (!TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                    && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                TableroAjedrez.getTablero()[i][j].setBackground(Color.blue);
                System.out.println(i + "," + j + " Matriz");
            } else {
                ocupado = true;
                if (turnoBlanco && !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getNegro())
                        || !TableroAjedrez.casillaOcupada(TableroAjedrez.getTablero()[i][j], TableroAjedrez.getBlanco())) {
                    TableroAjedrez.getTablero()[i][j].setBackground(Color.red);
                    System.out.println(i + "," + j + " Matriz");
                }
            }

            j--;

        }

    }
    
    
    
}
