package modelo;

import javax.swing.JToggleButton;
import vista.PnlTableroBotonesAntiguo;

/**
 *
 * @author pc
 */
public class TableroAntiguo {

    public static String tablero[][] = new String[8][8];
    //Peon peon;

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
        if (boton == PnlTableroBotonesAntiguo.btnA8) {
            this.posicionActual = "00";
        } else if (boton == PnlTableroBotonesAntiguo.btnB8) {
            this.posicionActual = "01";
        } else if (boton == PnlTableroBotonesAntiguo.btnC8) {
            this.posicionActual = "02";
        } else if (boton == PnlTableroBotonesAntiguo.btnD8) {
            this.posicionActual = "03";
        } else if (boton == PnlTableroBotonesAntiguo.btnE8) {
            this.posicionActual = "04";
        } else if (boton == PnlTableroBotonesAntiguo.btnF8) {
            this.posicionActual = "05";
        } else if (boton == PnlTableroBotonesAntiguo.btnG8) {
            this.posicionActual = "06";
        } else if (boton == PnlTableroBotonesAntiguo.btnH8) {
            this.posicionActual = "07";
        } else if (boton == PnlTableroBotonesAntiguo.btnA7) {
            this.posicionActual = "10";
        } else if (boton == PnlTableroBotonesAntiguo.btnB7) {
            this.posicionActual = "11";
        } else if (boton == PnlTableroBotonesAntiguo.btnC7) {
            this.posicionActual = "12";
        } else if (boton == PnlTableroBotonesAntiguo.btnD7) {
            this.posicionActual = "13";
        } else if (boton == PnlTableroBotonesAntiguo.btnE7) {
            this.posicionActual = "14";
        } else if (boton == PnlTableroBotonesAntiguo.btnF7) {
            this.posicionActual = "15";
        } else if (boton == PnlTableroBotonesAntiguo.btnG7) {
            this.posicionActual = "16";
        } else if (boton == PnlTableroBotonesAntiguo.btnH7) {
            this.posicionActual = "17";
        } else if (boton == PnlTableroBotonesAntiguo.btnA6) {
            this.posicionActual = "20";
        } else if (boton == PnlTableroBotonesAntiguo.btnB6) {
            this.posicionActual = "21";
        } else if (boton == PnlTableroBotonesAntiguo.btnC6) {
            this.posicionActual = "22";
        } else if (boton == PnlTableroBotonesAntiguo.btnD6) {
            this.posicionActual = "23";
        } else if (boton == PnlTableroBotonesAntiguo.btnE6) {
            this.posicionActual = "24";
        } else if (boton == PnlTableroBotonesAntiguo.btnF6) {
            this.posicionActual = "25";
        } else if (boton == PnlTableroBotonesAntiguo.btnG6) {
            this.posicionActual = "26";
        } else if (boton == PnlTableroBotonesAntiguo.btnH6) {
            this.posicionActual = "27";
        } else if (boton == PnlTableroBotonesAntiguo.btnA5) {
            this.posicionActual = "30";
        } else if (boton == PnlTableroBotonesAntiguo.btnB5) {
            this.posicionActual = "31";
        } else if (boton == PnlTableroBotonesAntiguo.btnC5) {
            this.posicionActual = "32";
        } else if (boton == PnlTableroBotonesAntiguo.btnD5) {
            this.posicionActual = "33";
        } else if (boton == PnlTableroBotonesAntiguo.btnE5) {
            this.posicionActual = "34";
        } else if (boton == PnlTableroBotonesAntiguo.btnF5) {
            this.posicionActual = "35";
        } else if (boton == PnlTableroBotonesAntiguo.btnG5) {
            this.posicionActual = "36";
        } else if (boton == PnlTableroBotonesAntiguo.btnH5) {
            this.posicionActual = "37";
        } else if (boton == PnlTableroBotonesAntiguo.btnA4) {
            this.posicionActual = "40";
        } else if (boton == PnlTableroBotonesAntiguo.btnB4) {
            this.posicionActual = "41";
        } else if (boton == PnlTableroBotonesAntiguo.btnC4) {
            this.posicionActual = "42";
        } else if (boton == PnlTableroBotonesAntiguo.btnD4) {
            this.posicionActual = "43";
        } else if (boton == PnlTableroBotonesAntiguo.btnE4) {
            this.posicionActual = "44";
        } else if (boton == PnlTableroBotonesAntiguo.btnF4) {
            this.posicionActual = "45";
        } else if (boton == PnlTableroBotonesAntiguo.btnG4) {
            this.posicionActual = "46";
        } else if (boton == PnlTableroBotonesAntiguo.btnH4) {
            this.posicionActual = "47";
        } else if (boton == PnlTableroBotonesAntiguo.btnA3) {
            this.posicionActual = "50";
        } else if (boton == PnlTableroBotonesAntiguo.btnB3) {
            this.posicionActual = "51";
        } else if (boton == PnlTableroBotonesAntiguo.btnC3) {
            this.posicionActual = "52";
        } else if (boton == PnlTableroBotonesAntiguo.btnD3) {
            this.posicionActual = "53";
        } else if (boton == PnlTableroBotonesAntiguo.btnE3) {
            this.posicionActual = "54";
        } else if (boton == PnlTableroBotonesAntiguo.btnF3) {
            this.posicionActual = "55";
        } else if (boton == PnlTableroBotonesAntiguo.btnG3) {
            this.posicionActual = "56";
        } else if (boton == PnlTableroBotonesAntiguo.btnH3) {
            this.posicionActual = "57";
        } else if (boton == PnlTableroBotonesAntiguo.btnA2) {
            this.posicionActual = "60";
        } else if (boton == PnlTableroBotonesAntiguo.btnB2) {
            this.posicionActual = "61";
        } else if (boton == PnlTableroBotonesAntiguo.btnC2) {
            this.posicionActual = "62";
        } else if (boton == PnlTableroBotonesAntiguo.btnD2) {
            this.posicionActual = "63";
        } else if (boton == PnlTableroBotonesAntiguo.btnE2) {
            this.posicionActual = "64";
        } else if (boton == PnlTableroBotonesAntiguo.btnF2) {
            this.posicionActual = "65";
        } else if (boton == PnlTableroBotonesAntiguo.btnG2) {
            this.posicionActual = "66";
        } else if (boton == PnlTableroBotonesAntiguo.btnH2) {
            this.posicionActual = "67";
        } else if (boton == PnlTableroBotonesAntiguo.btnA1) {
            this.posicionActual = "70";
        } else if (boton == PnlTableroBotonesAntiguo.btnB1) {
            this.posicionActual = "71";
        } else if (boton == PnlTableroBotonesAntiguo.btnC1) {
            this.posicionActual = "72";
        } else if (boton == PnlTableroBotonesAntiguo.btnD1) {
            this.posicionActual = "73";
        } else if (boton == PnlTableroBotonesAntiguo.btnE1) {
            this.posicionActual = "74";
        } else if (boton == PnlTableroBotonesAntiguo.btnF1) {
            this.posicionActual = "75";
        } else if (boton == PnlTableroBotonesAntiguo.btnG1) {
            this.posicionActual = "76";
        } else if (boton == PnlTableroBotonesAntiguo.btnH1) {
            this.posicionActual = "77";
        }
    }
    
    

    public String getPosicionBotonesTablero(JToggleButton boton) {
        if (boton == PnlTableroBotonesAntiguo.btnA8) {
            return "00";
        } else if (boton == PnlTableroBotonesAntiguo.btnB8) {
            return "01";
        } else if (boton == PnlTableroBotonesAntiguo.btnC8) {
            return "02";
        } else if (boton == PnlTableroBotonesAntiguo.btnD8) {
            return "03";
        } else if (boton == PnlTableroBotonesAntiguo.btnE8) {
            return "04";
        } else if (boton == PnlTableroBotonesAntiguo.btnF8) {
            return "05";
        } else if (boton == PnlTableroBotonesAntiguo.btnG8) {
            return "06";
        } else if (boton == PnlTableroBotonesAntiguo.btnH8) {
            return "07";
        } else if (boton == PnlTableroBotonesAntiguo.btnA7) {
            return "10";
        } else if (boton == PnlTableroBotonesAntiguo.btnB7) {
            return "11";
        } else if (boton == PnlTableroBotonesAntiguo.btnC7) {
            return "12";
        } else if (boton == PnlTableroBotonesAntiguo.btnD7) {
            return "13";
        } else if (boton == PnlTableroBotonesAntiguo.btnE7) {
            return "14";
        } else if (boton == PnlTableroBotonesAntiguo.btnF7) {
            return "15";
        } else if (boton == PnlTableroBotonesAntiguo.btnG7) {
            return "16";
        } else if (boton == PnlTableroBotonesAntiguo.btnH7) {
            return "17";
        } else if (boton == PnlTableroBotonesAntiguo.btnA6) {
            return "20";
        } else if (boton == PnlTableroBotonesAntiguo.btnB6) {
            return "21";
        } else if (boton == PnlTableroBotonesAntiguo.btnC6) {
            return "22";
        } else if (boton == PnlTableroBotonesAntiguo.btnD6) {
            return "23";
        } else if (boton == PnlTableroBotonesAntiguo.btnE6) {
            return "24";
        } else if (boton == PnlTableroBotonesAntiguo.btnF6) {
            return "25";
        } else if (boton == PnlTableroBotonesAntiguo.btnG6) {
            return "26";
        } else if (boton == PnlTableroBotonesAntiguo.btnH6) {
            return "27";
        } else if (boton == PnlTableroBotonesAntiguo.btnA5) {
            return "30";
        } else if (boton == PnlTableroBotonesAntiguo.btnB5) {
            return "31";
        } else if (boton == PnlTableroBotonesAntiguo.btnC5) {
            return "32";
        } else if (boton == PnlTableroBotonesAntiguo.btnD5) {
            return "33";
        } else if (boton == PnlTableroBotonesAntiguo.btnE5) {
            return "34";
        } else if (boton == PnlTableroBotonesAntiguo.btnF5) {
            return "35";
        } else if (boton == PnlTableroBotonesAntiguo.btnG5) {
            return "36";
        } else if (boton == PnlTableroBotonesAntiguo.btnH5) {
            return "37";
        } else if (boton == PnlTableroBotonesAntiguo.btnA4) {
            return "40";
        } else if (boton == PnlTableroBotonesAntiguo.btnB4) {
            return "41";
        } else if (boton == PnlTableroBotonesAntiguo.btnC4) {
            return "42";
        } else if (boton == PnlTableroBotonesAntiguo.btnD4) {
            return "43";
        } else if (boton == PnlTableroBotonesAntiguo.btnE4) {
            return "44";
        } else if (boton == PnlTableroBotonesAntiguo.btnF4) {
            return "45";
        } else if (boton == PnlTableroBotonesAntiguo.btnG4) {
            return "46";
        } else if (boton == PnlTableroBotonesAntiguo.btnH4) {
            return "47";
        } else if (boton == PnlTableroBotonesAntiguo.btnA3) {
            return "50";
        } else if (boton == PnlTableroBotonesAntiguo.btnB3) {
            return "51";
        } else if (boton == PnlTableroBotonesAntiguo.btnC3) {
            return "52";
        } else if (boton == PnlTableroBotonesAntiguo.btnD3) {
            return "53";
        } else if (boton == PnlTableroBotonesAntiguo.btnE3) {
            return "54";
        } else if (boton == PnlTableroBotonesAntiguo.btnF3) {
            return "55";
        } else if (boton == PnlTableroBotonesAntiguo.btnG3) {
            return "56";
        } else if (boton == PnlTableroBotonesAntiguo.btnH3) {
            return "57";
        } else if (boton == PnlTableroBotonesAntiguo.btnA2) {
            return "60";
        } else if (boton == PnlTableroBotonesAntiguo.btnB2) {
            return "61";
        } else if (boton == PnlTableroBotonesAntiguo.btnC2) {
            return "62";
        } else if (boton == PnlTableroBotonesAntiguo.btnD2) {
            return "63";
        } else if (boton == PnlTableroBotonesAntiguo.btnE2) {
            return "64";
        } else if (boton == PnlTableroBotonesAntiguo.btnF2) {
            return "65";
        } else if (boton == PnlTableroBotonesAntiguo.btnG2) {
            return "66";
        } else if (boton == PnlTableroBotonesAntiguo.btnH2) {
            return "67";
        } else if (boton == PnlTableroBotonesAntiguo.btnA1) {
            return "70";
        } else if (boton == PnlTableroBotonesAntiguo.btnB1) {
            return "71";
        } else if (boton == PnlTableroBotonesAntiguo.btnC1) {
            return "72";
        } else if (boton == PnlTableroBotonesAntiguo.btnD1) {
            return "73";
        } else if (boton == PnlTableroBotonesAntiguo.btnE1) {
            return "74";
        } else if (boton == PnlTableroBotonesAntiguo.btnF1) {
            return "75";
        } else if (boton == PnlTableroBotonesAntiguo.btnG1) {
            return "76";
        } else if (boton == PnlTableroBotonesAntiguo.btnH1) {
            return "77";
        }
        return null;
    }

    private JToggleButton boton(String posicion) {
        if (posicion.equals("00")) {
            return PnlTableroBotonesAntiguo.btnA8;
        } else if (posicion.equals("01")) {
            return PnlTableroBotonesAntiguo.btnB8;
        } else if (posicion.equals("02")) {
            return PnlTableroBotonesAntiguo.btnC8;
        } else if (posicion.equals("03")) {
            return PnlTableroBotonesAntiguo.btnD8;
        } else if (posicion.equals("04")) {
            return PnlTableroBotonesAntiguo.btnE8;
        } else if (posicion.equals("05")) {
            return PnlTableroBotonesAntiguo.btnF8;
        } else if (posicion.equals("06")) {
            return PnlTableroBotonesAntiguo.btnG8;
        } else if (posicion.equals("07")) {
            return PnlTableroBotonesAntiguo.btnH8;
        } else if (posicion.equals("10")) {
            return PnlTableroBotonesAntiguo.btnA7;
        } else if (posicion.equals("11")) {
            return PnlTableroBotonesAntiguo.btnB7;
        } else if (posicion.equals("12")) {
            return PnlTableroBotonesAntiguo.btnC7;
        } else if (posicion.equals("13")) {
            return PnlTableroBotonesAntiguo.btnD7;
        } else if (posicion.equals("14")) {
            return PnlTableroBotonesAntiguo.btnE7;
        } else if (posicion.equals("15")) {
            return PnlTableroBotonesAntiguo.btnF7;
        } else if (posicion.equals("16")) {
            return PnlTableroBotonesAntiguo.btnG7;
        } else if (posicion.equals("17")) {
            return PnlTableroBotonesAntiguo.btnH7;
        } else if (posicion.equals("20")) {
            return PnlTableroBotonesAntiguo.btnA6;
        } else if (posicion.equals("21")) {
            return PnlTableroBotonesAntiguo.btnB6;
        } else if (posicion.equals("22")) {
            return PnlTableroBotonesAntiguo.btnC6;
        } else if (posicion.equals("23")) {
            return PnlTableroBotonesAntiguo.btnD6;
        } else if (posicion.equals("24")) {
            return PnlTableroBotonesAntiguo.btnE6;
        } else if (posicion.equals("25")) {
            return PnlTableroBotonesAntiguo.btnF6;
        } else if (posicion.equals("26")) {
            return PnlTableroBotonesAntiguo.btnG6;
        } else if (posicion.equals("27")) {
            return PnlTableroBotonesAntiguo.btnH6;
        } else if (posicion.equals("30")) {
            return PnlTableroBotonesAntiguo.btnA5;
        } else if (posicion.equals("31")) {
            return PnlTableroBotonesAntiguo.btnB5;
        } else if (posicion.equals("32")) {
            return PnlTableroBotonesAntiguo.btnC5;
        } else if (posicion.equals("33")) {
            return PnlTableroBotonesAntiguo.btnD5;
        } else if (posicion.equals("34")) {
            return PnlTableroBotonesAntiguo.btnE5;
        } else if (posicion.equals("35")) {
            return PnlTableroBotonesAntiguo.btnF5;
        } else if (posicion.equals("36")) {
            return PnlTableroBotonesAntiguo.btnG5;
        } else if (posicion.equals("37")) {
            return PnlTableroBotonesAntiguo.btnH5;
        } else if (posicion.equals("40")) {
            return PnlTableroBotonesAntiguo.btnA4;
        } else if (posicion.equals("41")) {
            return PnlTableroBotonesAntiguo.btnB4;
        } else if (posicion.equals("42")) {
            return PnlTableroBotonesAntiguo.btnC4;
        } else if (posicion.equals("43")) {
            return PnlTableroBotonesAntiguo.btnD4;
        } else if (posicion.equals("44")) {
            return PnlTableroBotonesAntiguo.btnE4;
        } else if (posicion.equals("45")) {
            return PnlTableroBotonesAntiguo.btnF4;
        } else if (posicion.equals("46")) {
            return PnlTableroBotonesAntiguo.btnG4;
        } else if (posicion.equals("47")) {
            return PnlTableroBotonesAntiguo.btnH4;
        } else if (posicion.equals("50")) {
            return PnlTableroBotonesAntiguo.btnA3;
        } else if (posicion.equals("51")) {
            return PnlTableroBotonesAntiguo.btnB3;
        } else if (posicion.equals("52")) {
            return PnlTableroBotonesAntiguo.btnC3;
        } else if (posicion.equals("53")) {
            return PnlTableroBotonesAntiguo.btnD3;
        } else if (posicion.equals("54")) {
            return PnlTableroBotonesAntiguo.btnE3;
        } else if (posicion.equals("55")) {
            return PnlTableroBotonesAntiguo.btnF3;
        } else if (posicion.equals("56")) {
            return PnlTableroBotonesAntiguo.btnG3;
        } else if (posicion.equals("57")) {
            return PnlTableroBotonesAntiguo.btnH3;
        } else if (posicion.equals("60")) {
            return PnlTableroBotonesAntiguo.btnA2;
        } else if (posicion.equals("61")) {
            return PnlTableroBotonesAntiguo.btnB2;
        } else if (posicion.equals("62")) {
            return PnlTableroBotonesAntiguo.btnC2;
        } else if (posicion.equals("63")) {
            return PnlTableroBotonesAntiguo.btnD2;
        } else if (posicion.equals("64")) {
            return PnlTableroBotonesAntiguo.btnE2;
        } else if (posicion.equals("65")) {
            return PnlTableroBotonesAntiguo.btnF2;
        } else if (posicion.equals("66")) {
            return PnlTableroBotonesAntiguo.btnG2;
        } else if (posicion.equals("67")) {
            return PnlTableroBotonesAntiguo.btnH2;
        } else if (posicion.equals("70")) {
            return PnlTableroBotonesAntiguo.btnA1;
        } else if (posicion.equals("71")) {
            return PnlTableroBotonesAntiguo.btnB1;
        } else if (posicion.equals("72")) {
            return PnlTableroBotonesAntiguo.btnC1;
        } else if (posicion.equals("73")) {
            return PnlTableroBotonesAntiguo.btnD1;
        } else if (posicion.equals("74")) {
            return PnlTableroBotonesAntiguo.btnE1;
        } else if (posicion.equals("75")) {
            return PnlTableroBotonesAntiguo.btnF1;
        } else if (posicion.equals("76")) {
            return PnlTableroBotonesAntiguo.btnG1;
        } else if (posicion.equals("77")) {
            return PnlTableroBotonesAntiguo.btnH1;
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
/*
    public void moverFicha(String nombreFicha) {

        switch (nombreFicha) {

            case "peonBlanco":
                boolean validacion = peon.validarMovimiento(posicionActual.charAt(1),
                        posicionNueva.charAt(1));
                if (validacion == true) {
                        cambiarEnPantalla(posicionActual, posicionNueva);

                }
                break;
            case "peonNegro":
                break;
        }

    }*/

    public void cambiarEnPantalla(String posAntigua, String posNueva) {
        boton(posNueva).setIcon(boton(posAntigua).getIcon());
        boton(posAntigua).setIcon(null);
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
