package modelo;

import javax.swing.JToggleButton;
import vista.PnlTableroBotones;

/**
 *
 * @author pc
 */
public class Tablero {

    public String tablero[][] = new String[8][8];
    public String posicionActual;
    public String posicionNueva;

    public void setTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "";
            }
        }
        for (int i = 0; i < 8; i++) {
            tablero[1][i] = "peonNegro";
            tablero[6][i] = "peonBlanco";
        }
        tablero[0][0] = "torreNegro";
        tablero[0][1] = "caballoNegro";
        tablero[0][2] = "alfilNegro";
        tablero[0][3] = "damaNegro";
        tablero[0][4] = "reyNegro";
        tablero[0][5] = "alfilNegro";
        tablero[0][6] = "caballoNegro";
        tablero[0][7] = "torreNegro";

        tablero[7][0] = "torreBlanco";
        tablero[7][1] = "caballoBlanco";
        tablero[7][2] = "alfilBlanco";
        tablero[7][3] = "damaBlanco";
        tablero[7][4] = "reyBlanco";
        tablero[7][5] = "alfilBlanco";
        tablero[7][6] = "caballoBlanco";
        tablero[7][7] = "torreBlanco";
    }

    public String getPosicionActual() {
        //setPosicionBotonesTablero(boton);
        return posicionActual;
    }

    public void setPosicionBotonesTablero(JToggleButton boton) {
        if (boton == PnlTableroBotones.btnA8) {
            this.posicionActual = "00";
        } else if (boton == PnlTableroBotones.btnB8) {
            this.posicionActual = "01";
        } else if (boton == PnlTableroBotones.btnC8) {
            this.posicionActual = "02";
        } else if (boton == PnlTableroBotones.btnD8) {
            this.posicionActual = "03";
        } else if (boton == PnlTableroBotones.btnE8) {
            this.posicionActual = "04";
        } else if (boton == PnlTableroBotones.btnF8) {
            this.posicionActual = "05";
        } else if (boton == PnlTableroBotones.btnG8) {
            this.posicionActual = "06";
        } else if (boton == PnlTableroBotones.btnH8) {
            this.posicionActual = "07";
        } else if (boton == PnlTableroBotones.btnA7) {
            this.posicionActual = "10";
        } else if (boton == PnlTableroBotones.btnB7) {
            this.posicionActual = "11";
        } else if (boton == PnlTableroBotones.btnC7) {
            this.posicionActual = "12";
        } else if (boton == PnlTableroBotones.btnD7) {
            this.posicionActual = "13";
        } else if (boton == PnlTableroBotones.btnE7) {
            this.posicionActual = "14";
        } else if (boton == PnlTableroBotones.btnF7) {
            this.posicionActual = "15";
        } else if (boton == PnlTableroBotones.btnG7) {
            this.posicionActual = "16";
        } else if (boton == PnlTableroBotones.btnH7) {
            this.posicionActual = "17";
        } else if (boton == PnlTableroBotones.btnA6) {
            this.posicionActual = "20";
        } else if (boton == PnlTableroBotones.btnB6) {
            this.posicionActual = "21";
        } else if (boton == PnlTableroBotones.btnC6) {
            this.posicionActual = "22";
        } else if (boton == PnlTableroBotones.btnD6) {
            this.posicionActual = "23";
        } else if (boton == PnlTableroBotones.btnE6) {
            this.posicionActual = "24";
        } else if (boton == PnlTableroBotones.btnF6) {
            this.posicionActual = "25";
        } else if (boton == PnlTableroBotones.btnG6) {
            this.posicionActual = "26";
        } else if (boton == PnlTableroBotones.btnH6) {
            this.posicionActual = "27";
        } else if (boton == PnlTableroBotones.btnA5) {
            this.posicionActual = "30";
        } else if (boton == PnlTableroBotones.btnB5) {
            this.posicionActual = "31";
        } else if (boton == PnlTableroBotones.btnC5) {
            this.posicionActual = "32";
        } else if (boton == PnlTableroBotones.btnD5) {
            this.posicionActual = "33";
        } else if (boton == PnlTableroBotones.btnE5) {
            this.posicionActual = "34";
        } else if (boton == PnlTableroBotones.btnF5) {
            this.posicionActual = "35";
        } else if (boton == PnlTableroBotones.btnG5) {
            this.posicionActual = "36";
        } else if (boton == PnlTableroBotones.btnH5) {
            this.posicionActual = "37";
        } else if (boton == PnlTableroBotones.btnA4) {
            this.posicionActual = "40";
        } else if (boton == PnlTableroBotones.btnB4) {
            this.posicionActual = "41";
        } else if (boton == PnlTableroBotones.btnC4) {
            this.posicionActual = "42";
        } else if (boton == PnlTableroBotones.btnD4) {
            this.posicionActual = "43";
        } else if (boton == PnlTableroBotones.btnE4) {
            this.posicionActual = "44";
        } else if (boton == PnlTableroBotones.btnF4) {
            this.posicionActual = "45";
        } else if (boton == PnlTableroBotones.btnG4) {
            this.posicionActual = "46";
        } else if (boton == PnlTableroBotones.btnH4) {
            this.posicionActual = "47";
        } else if (boton == PnlTableroBotones.btnA3) {
            this.posicionActual = "50";
        } else if (boton == PnlTableroBotones.btnB3) {
            this.posicionActual = "51";
        } else if (boton == PnlTableroBotones.btnC3) {
            this.posicionActual = "52";
        } else if (boton == PnlTableroBotones.btnD3) {
            this.posicionActual = "53";
        } else if (boton == PnlTableroBotones.btnE3) {
            this.posicionActual = "54";
        } else if (boton == PnlTableroBotones.btnF3) {
            this.posicionActual = "55";
        } else if (boton == PnlTableroBotones.btnG3) {
            this.posicionActual = "56";
        } else if (boton == PnlTableroBotones.btnH3) {
            this.posicionActual = "57";
        } else if (boton == PnlTableroBotones.btnA2) {
            this.posicionActual = "60";
        } else if (boton == PnlTableroBotones.btnB2) {
            this.posicionActual = "61";
        } else if (boton == PnlTableroBotones.btnC2) {
            this.posicionActual = "62";
        } else if (boton == PnlTableroBotones.btnD2) {
            this.posicionActual = "63";
        } else if (boton == PnlTableroBotones.btnE2) {
            this.posicionActual = "64";
        } else if (boton == PnlTableroBotones.btnF2) {
            this.posicionActual = "65";
        } else if (boton == PnlTableroBotones.btnG2) {
            this.posicionActual = "66";
        } else if (boton == PnlTableroBotones.btnH2) {
            this.posicionActual = "67";
        } else if (boton == PnlTableroBotones.btnA1) {
            this.posicionActual = "70";
        } else if (boton == PnlTableroBotones.btnB1) {
            this.posicionActual = "71";
        } else if (boton == PnlTableroBotones.btnC1) {
            this.posicionActual = "72";
        } else if (boton == PnlTableroBotones.btnD1) {
            this.posicionActual = "73";
        } else if (boton == PnlTableroBotones.btnE1) {
            this.posicionActual = "74";
        } else if (boton == PnlTableroBotones.btnF1) {
            this.posicionActual = "75";
        } else if (boton == PnlTableroBotones.btnG1) {
            this.posicionActual = "76";
        } else if (boton == PnlTableroBotones.btnH1) {
            this.posicionActual = "77";
        }

    }

    public String retornarIdentificadorBotonesPorTablero() {
        try {
            int x = Character.getNumericValue(posicionActual.charAt(0));
            int y = Character.getNumericValue(posicionActual.charAt(1));
            return tablero[x][y];
        } catch (NullPointerException npe) {
            System.out.println("chale");
            return "";
        }

    }

    private void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(0));
        int yA = Character.getNumericValue(posAntigua.charAt(1));
        int xN = Character.getNumericValue(posNueva.charAt(0));
        int yN = Character.getNumericValue(posNueva.charAt(1));
        tablero[xN][yN] = tablero[xA][yA];
        tablero[xA][yA] = "";
    }

}
