package modelo;

import javax.swing.JToggleButton;
import vista.PnlTableroBotones;

/**
 *
 * @author pc
 */
public class Tablero {

    public String tablero[][] = new String[8][8];
    Peon peon;

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

    public String getPosicionBotonesTablero(JToggleButton boton) {
        if (boton == PnlTableroBotones.btnA8) {
            return "00";
        } else if (boton == PnlTableroBotones.btnB8) {
            return "01";
        } else if (boton == PnlTableroBotones.btnC8) {
            return "02";
        } else if (boton == PnlTableroBotones.btnD8) {
            return "03";
        } else if (boton == PnlTableroBotones.btnE8) {
            return "04";
        } else if (boton == PnlTableroBotones.btnF8) {
            return "05";
        } else if (boton == PnlTableroBotones.btnG8) {
            return "06";
        } else if (boton == PnlTableroBotones.btnH8) {
            return "07";
        } else if (boton == PnlTableroBotones.btnA7) {
            return "10";
        } else if (boton == PnlTableroBotones.btnB7) {
            return "11";
        } else if (boton == PnlTableroBotones.btnC7) {
            return "12";
        } else if (boton == PnlTableroBotones.btnD7) {
            return "13";
        } else if (boton == PnlTableroBotones.btnE7) {
            return "14";
        } else if (boton == PnlTableroBotones.btnF7) {
            return "15";
        } else if (boton == PnlTableroBotones.btnG7) {
            return "16";
        } else if (boton == PnlTableroBotones.btnH7) {
            return "17";
        } else if (boton == PnlTableroBotones.btnA6) {
            return "20";
        } else if (boton == PnlTableroBotones.btnB6) {
            return "21";
        } else if (boton == PnlTableroBotones.btnC6) {
            return "22";
        } else if (boton == PnlTableroBotones.btnD6) {
            return "23";
        } else if (boton == PnlTableroBotones.btnE6) {
            return "24";
        } else if (boton == PnlTableroBotones.btnF6) {
            return "25";
        } else if (boton == PnlTableroBotones.btnG6) {
            return "26";
        } else if (boton == PnlTableroBotones.btnH6) {
            return "27";
        } else if (boton == PnlTableroBotones.btnA5) {
            return "30";
        } else if (boton == PnlTableroBotones.btnB5) {
            return "31";
        } else if (boton == PnlTableroBotones.btnC5) {
            return "32";
        } else if (boton == PnlTableroBotones.btnD5) {
            return "33";
        } else if (boton == PnlTableroBotones.btnE5) {
            return "34";
        } else if (boton == PnlTableroBotones.btnF5) {
            return "35";
        } else if (boton == PnlTableroBotones.btnG5) {
            return "36";
        } else if (boton == PnlTableroBotones.btnH5) {
            return "37";
        } else if (boton == PnlTableroBotones.btnA4) {
            return "40";
        } else if (boton == PnlTableroBotones.btnB4) {
            return "41";
        } else if (boton == PnlTableroBotones.btnC4) {
            return "42";
        } else if (boton == PnlTableroBotones.btnD4) {
            return "43";
        } else if (boton == PnlTableroBotones.btnE4) {
            return "44";
        } else if (boton == PnlTableroBotones.btnF4) {
            return "45";
        } else if (boton == PnlTableroBotones.btnG4) {
            return "46";
        } else if (boton == PnlTableroBotones.btnH4) {
            return "47";
        } else if (boton == PnlTableroBotones.btnA3) {
            return "50";
        } else if (boton == PnlTableroBotones.btnB3) {
            return "51";
        } else if (boton == PnlTableroBotones.btnC3) {
            return "52";
        } else if (boton == PnlTableroBotones.btnD3) {
            return "53";
        } else if (boton == PnlTableroBotones.btnE3) {
            return "54";
        } else if (boton == PnlTableroBotones.btnF3) {
            return "55";
        } else if (boton == PnlTableroBotones.btnG3) {
            return "56";
        } else if (boton == PnlTableroBotones.btnH3) {
            return "57";
        } else if (boton == PnlTableroBotones.btnA2) {
            return "60";
        } else if (boton == PnlTableroBotones.btnB2) {
            return "61";
        } else if (boton == PnlTableroBotones.btnC2) {
            return "62";
        } else if (boton == PnlTableroBotones.btnD2) {
            return "63";
        } else if (boton == PnlTableroBotones.btnE2) {
            return "64";
        } else if (boton == PnlTableroBotones.btnF2) {
            return "65";
        } else if (boton == PnlTableroBotones.btnG2) {
            return "66";
        } else if (boton == PnlTableroBotones.btnH2) {
            return "67";
        } else if (boton == PnlTableroBotones.btnA1) {
            return "70";
        } else if (boton == PnlTableroBotones.btnB1) {
            return "71";
        } else if (boton == PnlTableroBotones.btnC1) {
            return "72";
        } else if (boton == PnlTableroBotones.btnD1) {
            return "73";
        } else if (boton == PnlTableroBotones.btnE1) {
            return "74";
        } else if (boton == PnlTableroBotones.btnF1) {
            return "75";
        } else if (boton == PnlTableroBotones.btnG1) {
            return "76";
        } else if (boton == PnlTableroBotones.btnH1) {
            return "77";
        }
        return null;
    }

    private JToggleButton boton(String posicion) {
        if (posicion.equals("00")) {
            return PnlTableroBotones.btnA8;
        } else if (posicion.equals("01")) {
            return PnlTableroBotones.btnB8;
        } else if (posicion.equals("02")) {
            return PnlTableroBotones.btnC8;
        } else if (posicion.equals("03")) {
            return PnlTableroBotones.btnD8;
        } else if (posicion.equals("04")) {
            return PnlTableroBotones.btnE8;
        } else if (posicion.equals("05")) {
            return PnlTableroBotones.btnF8;
        } else if (posicion.equals("06")) {
            return PnlTableroBotones.btnG8;
        } else if (posicion.equals("07")) {
            return PnlTableroBotones.btnH8;
        } else if (posicion.equals("10")) {
            return PnlTableroBotones.btnA7;
        } else if (posicion.equals("11")) {
            return PnlTableroBotones.btnB7;
        } else if (posicion.equals("12")) {
            return PnlTableroBotones.btnC7;
        } else if (posicion.equals("13")) {
            return PnlTableroBotones.btnD7;
        } else if (posicion.equals("14")) {
            return PnlTableroBotones.btnE7;
        } else if (posicion.equals("15")) {
            return PnlTableroBotones.btnF7;
        } else if (posicion.equals("16")) {
            return PnlTableroBotones.btnG7;
        } else if (posicion.equals("17")) {
            return PnlTableroBotones.btnH7;
        } else if (posicion.equals("20")) {
            return PnlTableroBotones.btnA6;
        } else if (posicion.equals("21")) {
            return PnlTableroBotones.btnB6;
        } else if (posicion.equals("22")) {
            return PnlTableroBotones.btnC6;
        } else if (posicion.equals("23")) {
            return PnlTableroBotones.btnD6;
        } else if (posicion.equals("24")) {
            return PnlTableroBotones.btnE6;
        } else if (posicion.equals("25")) {
            return PnlTableroBotones.btnF6;
        } else if (posicion.equals("26")) {
            return PnlTableroBotones.btnG6;
        } else if (posicion.equals("27")) {
            return PnlTableroBotones.btnH6;
        } else if (posicion.equals("30")) {
            return PnlTableroBotones.btnA5;
        } else if (posicion.equals("31")) {
            return PnlTableroBotones.btnB5;
        } else if (posicion.equals("32")) {
            return PnlTableroBotones.btnC5;
        } else if (posicion.equals("33")) {
            return PnlTableroBotones.btnD5;
        } else if (posicion.equals("34")) {
            return PnlTableroBotones.btnE5;
        } else if (posicion.equals("35")) {
            return PnlTableroBotones.btnF5;
        } else if (posicion.equals("36")) {
            return PnlTableroBotones.btnG5;
        } else if (posicion.equals("37")) {
            return PnlTableroBotones.btnH5;
        } else if (posicion.equals("40")) {
            return PnlTableroBotones.btnA4;
        } else if (posicion.equals("41")) {
            return PnlTableroBotones.btnB4;
        } else if (posicion.equals("42")) {
            return PnlTableroBotones.btnC4;
        } else if (posicion.equals("43")) {
            return PnlTableroBotones.btnD4;
        } else if (posicion.equals("44")) {
            return PnlTableroBotones.btnE4;
        } else if (posicion.equals("45")) {
            return PnlTableroBotones.btnF4;
        } else if (posicion.equals("46")) {
            return PnlTableroBotones.btnG4;
        } else if (posicion.equals("47")) {
            return PnlTableroBotones.btnH4;
        } else if (posicion.equals("50")) {
            return PnlTableroBotones.btnA3;
        } else if (posicion.equals("51")) {
            return PnlTableroBotones.btnB3;
        } else if (posicion.equals("52")) {
            return PnlTableroBotones.btnC3;
        } else if (posicion.equals("53")) {
            return PnlTableroBotones.btnD3;
        } else if (posicion.equals("54")) {
            return PnlTableroBotones.btnE3;
        } else if (posicion.equals("55")) {
            return PnlTableroBotones.btnF3;
        } else if (posicion.equals("56")) {
            return PnlTableroBotones.btnG3;
        } else if (posicion.equals("57")) {
            return PnlTableroBotones.btnH3;
        } else if (posicion.equals("60")) {
            return PnlTableroBotones.btnA2;
        } else if (posicion.equals("61")) {
            return PnlTableroBotones.btnB2;
        } else if (posicion.equals("62")) {
            return PnlTableroBotones.btnC2;
        } else if (posicion.equals("63")) {
            return PnlTableroBotones.btnD2;
        } else if (posicion.equals("64")) {
            return PnlTableroBotones.btnE2;
        } else if (posicion.equals("65")) {
            return PnlTableroBotones.btnF2;
        } else if (posicion.equals("66")) {
            return PnlTableroBotones.btnG2;
        } else if (posicion.equals("67")) {
            return PnlTableroBotones.btnH2;
        } else if (posicion.equals("70")) {
            return PnlTableroBotones.btnA1;
        } else if (posicion.equals("71")) {
            return PnlTableroBotones.btnB1;
        } else if (posicion.equals("72")) {
            return PnlTableroBotones.btnC1;
        } else if (posicion.equals("73")) {
            return PnlTableroBotones.btnD1;
        } else if (posicion.equals("74")) {
            return PnlTableroBotones.btnE1;
        } else if (posicion.equals("75")) {
            return PnlTableroBotones.btnF1;
        } else if (posicion.equals("76")) {
            return PnlTableroBotones.btnG1;
        } else if (posicion.equals("77")) {
            return PnlTableroBotones.btnH1;
        }

        return null;
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

    public void cambiarEnString(String posAntigua, String posNueva) {
        int xA = Character.getNumericValue(posAntigua.charAt(0));
        int yA = Character.getNumericValue(posAntigua.charAt(1));
        int xN = Character.getNumericValue(posNueva.charAt(0));
        int yN = Character.getNumericValue(posNueva.charAt(1));
        tablero[xN][yN] = tablero[xA][yA];
        tablero[xA][yA] = "";
    }

    public void moverFicha(String nombreFicha) {

        switch (nombreFicha) {

            case "peonBlanco":
                boolean validacion = peon.validarMovimiento(posicionActual.charAt(1),
                        posicionNueva.charAt(1));
                if (validacion == true) {
                    //    validarMovimiento();

                }
                break;
            case "peonNegro":
                break;
        }

    }

    public void validarMovimiento(JToggleButton btn1, JToggleButton btn2) {
        if (btn1.isSelected() && retornarIdentificadorBotonesPorTablero().
                equals("peonBlanco")) {
            btn2.setIcon(btn1.getIcon());
            btn1.setIcon(null);
        } else {
            System.out.println("prueba de no hay ese icono");
        }
    }

}

/*
if(direcion).equals(la direccion){
nombreFicha == "peonBlanco";

void (String){

swtich (String){
case 1: "peonBlanco"

posicionActual
posicionFinal

if (posF > psI){
posF == btn2
psI == btn1

{
btn2.setIcon(btn1);


to 6 o 12:

}
 */
