package modelo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public abstract class Ficha {

    protected static boolean esFichaBlanca;
    private int tipoFicha; //1 - peon | 2 - Torre | 3 - Caballo | 4 - Alfil | 5 - Dama | 6 - Rey
    protected int identificacion;
    protected int movimientoX;
    protected int movimientoY;
    protected JButton casilla;
    

    public Ficha(boolean esBlanca, int tipo, int id, JButton casilla) {
        this.esFichaBlanca = esBlanca;
        this.tipoFicha = tipo;
        this.identificacion = id;
        this.casilla = casilla;
    }

    public JButton getCasilla() {
        return casilla;
    }

    public void setCasilla(JButton casilla) {
        this.casilla = casilla;
    }

    public int getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(int tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public int getIdentificacion() {
        return identificacion;
    }
    

    public void poneImagenes(int w, int h) {
        try {
            System.out.println("entrando al try catch");
            //if (esFichaBlanca) {
                System.out.println("entrando al if de es balnca");
                if (tipoFicha == 1) {
                    System.out.println("wenas");
                    ImageIcon pB = new ImageIcon("iconos/PeonBlanco.png");
                    ImageIcon pB2 = new ImageIcon(pB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(pB2);
                }
                if (tipoFicha == 2) {
                    ImageIcon tB = new ImageIcon("iconos/TorreBlanco.png");
                    ImageIcon tB2 = new ImageIcon(tB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(tB2);
                }
                if (tipoFicha == 3) {
                    ImageIcon cB = new ImageIcon("iconos/CaballoBlanco.png");
                    ImageIcon cB2 = new ImageIcon(cB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(cB2);
                }
                if (tipoFicha == 4) {
                    ImageIcon aB = new ImageIcon("iconos/AlfilBlanco.png");
                    ImageIcon aB2 = new ImageIcon(aB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(aB2);
                }
                if (tipoFicha == 5) {
                    ImageIcon dB = new ImageIcon("iconos/DamaBlanco.png");
                    ImageIcon dB2 = new ImageIcon(dB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(dB2);
                }
                if (tipoFicha == 6) {
                    ImageIcon rB = new ImageIcon("iconos/ReyBlanco.png");
                    ImageIcon rB2 = new ImageIcon(rB.getImage().getScaledInstance(w, h, 1));
                    casilla.setIcon(rB2);
                }
       
        } catch (Exception e) {
            System.out.println("Error en la imagen: " + e.toString());
        }
    }

    /**
     *
     * @param posicion
     * @param turnoBlanco
     * @param primerTurno
     */
    public abstract void movimiento(int posicion, boolean turnoBlanco, boolean primerTurno);

}
