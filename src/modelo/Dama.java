/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import javax.swing.JButton;

/**
 *
 * @author pc
 */
public class Dama extends Ficha{
    Alfil alfil;
    Torre torre;

    public Dama(boolean esBlanca, int tipo, int id, JButton casilla) {
        super(esBlanca, tipo, id, casilla);
    }

    @Override
    public void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno) {
        alfil.movimiento(posicion, turnoBlanco,false);
        torre.movimiento(posicion, turnoBlanco, false);
    }

    
}
