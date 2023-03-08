package vista;

import modelo.Ficha;
import modelo.Jugador;
import modelo.Peon;
import modelo.TableroAjedrez;
import java.awt.Color;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Alfil;
import modelo.Caballo;
import modelo.Dama;
import modelo.Rey;
import modelo.Torre;

public class PnlTableroBotones extends javax.swing.JPanel {

    JButton btnSeleccionado;
    JButton[][] matrizCasillas;
    JButton ArrayButtons[];
    TableroAjedrez tablero;
    Ficha ficha;
    static ArrayList<Ficha> fichasNegras = new ArrayList<>();
    static ArrayList<Ficha> fichasBlancas = new ArrayList<>();
    Jugador blanco;
    Jugador negro;
    JdCoronacion corona;
    PnlMenuDeJuego pnlMenuDeJuego;

    public PnlTableroBotones() {
        initComponents();
        pnlMenuDeJuego = new PnlMenuDeJuego();
        matrizCasillas = new JButton[8][8];
        ArrayButtons = new JButton[]{
            btnA8, btnB8, btnC8, btnD8, btnE8, btnF8, btnG8, btnH8,
            btnA7, btnB7, btnC7, btnD7, btnE7, btnF7, btnG7, btnH7,
            btnA6, btnB6, btnC6, btnD6, btnE6, btnF6, btnG6, btnH6,
            btnA5, btnB5, btnC5, btnD5, btnE5, btnF5, btnG5, btnH5,
            btnA4, btnB4, btnC4, btnD4, btnE4, btnF4, btnG4, btnH4,
            btnA3, btnB3, btnC3, btnD3, btnE3, btnF3, btnG3, btnH3,
            btnA2, btnB2, btnC2, btnD2, btnE2, btnF2, btnG2, btnH2,
            btnA1, btnB1, btnC1, btnD1, btnE1, btnF1, btnG1, btnH1};
        llenarMatriz();
        TableroAjedrez.pintarCasillasNormal(matrizCasillas);
        tablero = new TableroAjedrez(matrizCasillas);
        iniciarFichas();
        corona = new JdCoronacion(new Frame(), true);
        btnTorreBlanca.setVisible(false);
        btnCaballoBlanco.setVisible(false);
        btnAlfilBlanco.setVisible(false);
        btnDamaBlanca.setVisible(false);
        btnTorreNegra.setVisible(false);
        btnCaballoNegro.setVisible(false);
        btnAlfilNegro.setVisible(false);
        btnDamaNegra.setVisible(false);
        System.out.println(tablero.esTurnoBlanco()+" turno");
        colorearBordes(tablero.esTurnoBlanco());
    }

    public void llenarMatriz() {
        int n = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++, n++) {
                matrizCasillas[i][j] = ArrayButtons[n];
            }
        }
    }

    public void iniciarFichas() {
        /**
         * Declaracion de fichas 1 - peon 2 - Torre 3 - Caballo 4 - Alfil 5 -
         * Dama 6 - Rey
         */
        Ficha peonBlanco0 = new Peon(true, 1, 0, tablero.getTablero()[6][0]);
        Ficha peonBlanco1 = new Peon(true, 1, 1, tablero.getTablero()[6][1]);
        Ficha peonBlanco2 = new Peon(true, 1, 2, tablero.getTablero()[6][2]);
        Ficha peonBlanco3 = new Peon(true, 1, 3, tablero.getTablero()[6][3]);
        Ficha peonBlanco4 = new Peon(true, 1, 4, tablero.getTablero()[6][4]);
        Ficha peonBlanco5 = new Peon(true, 1, 5, tablero.getTablero()[6][5]);
        Ficha peonBlanco6 = new Peon(true, 1, 6, tablero.getTablero()[6][6]);
        Ficha peonBlanco7 = new Peon(true, 1, 7, tablero.getTablero()[6][7]);
        fichasBlancas.add(peonBlanco0);
        fichasBlancas.add(peonBlanco1);
        fichasBlancas.add(peonBlanco2);
        fichasBlancas.add(peonBlanco3);
        fichasBlancas.add(peonBlanco4);
        fichasBlancas.add(peonBlanco5);
        fichasBlancas.add(peonBlanco6);
        fichasBlancas.add(peonBlanco7);
        //torres blancos
        Ficha torreBlanco0 = new Torre(true, 2, 8, tablero.getTablero()[7][0]);
        Ficha torreBlanco1 = new Torre(true, 2, 9, tablero.getTablero()[7][7]);
        fichasBlancas.add(torreBlanco0);
        fichasBlancas.add(torreBlanco1);
        //Caballos blancos
        Ficha caballoBlanco0 = new Caballo(true, 3, 10, tablero.getTablero()[7][1]);
        Ficha caballoBlanco1 = new Caballo(true, 3, 11, tablero.getTablero()[7][6]);
        fichasBlancas.add(caballoBlanco0);
        fichasBlancas.add(caballoBlanco1);
        //Alfiles blancos
        Ficha alfilBlanco0 = new Alfil(true, 4, 12, tablero.getTablero()[7][2]);
        Ficha alfilBlanco1 = new Alfil(true, 4, 13, tablero.getTablero()[7][5]);
        fichasBlancas.add(alfilBlanco0);
        fichasBlancas.add(alfilBlanco1);
        //Dama blanco
        Ficha damaBlanco = new Dama(true, 5, 14, tablero.getTablero()[7][3]);
        fichasBlancas.add(damaBlanco);
        //Rey blanco
        Ficha reyBlanco = new Rey(true, 6, 15, tablero.getTablero()[7][4]);
        fichasBlancas.add(reyBlanco);
        //peones negros
        Ficha peonNegro0 = new Peon(false, 1, 0, tablero.getTablero()[1][0]);
        Ficha peonNegro1 = new Peon(false, 1, 1, tablero.getTablero()[1][1]);
        Ficha peonNegro2 = new Peon(false, 1, 2, tablero.getTablero()[1][2]);
        Ficha peonNegro3 = new Peon(false, 1, 3, tablero.getTablero()[1][3]);
        Ficha peonNegro4 = new Peon(false, 1, 4, tablero.getTablero()[1][4]);
        Ficha peonNegro5 = new Peon(false, 1, 5, tablero.getTablero()[1][5]);
        Ficha peonNegro6 = new Peon(false, 1, 6, tablero.getTablero()[1][6]);
        Ficha peonNegro7 = new Peon(false, 1, 7, tablero.getTablero()[1][7]);
        fichasNegras.add(peonNegro0);
        fichasNegras.add(peonNegro1);
        fichasNegras.add(peonNegro2);
        fichasNegras.add(peonNegro3);
        fichasNegras.add(peonNegro4);
        fichasNegras.add(peonNegro5);
        fichasNegras.add(peonNegro6);
        fichasNegras.add(peonNegro7);
        //Torres negras
        Ficha torreNegro0 = new Torre(false, 2, 8, tablero.getTablero()[0][0]);
        Ficha torreNegro1 = new Torre(false, 2, 9, tablero.getTablero()[0][7]);
        fichasNegras.add(torreNegro0);
        fichasNegras.add(torreNegro1);
        //Caballos negros
        Ficha caballoNegro0 = new Caballo(false, 3, 10, tablero.getTablero()[0][1]);
        Ficha caballoNegro1 = new Caballo(false, 3, 11, tablero.getTablero()[0][6]);
        fichasNegras.add(caballoNegro0);
        fichasNegras.add(caballoNegro1);
        //Alfiles negros
        Ficha alfilNegro0 = new Alfil(false, 4, 12, tablero.getTablero()[0][2]);
        Ficha alfilNegro1 = new Alfil(false, 4, 13, tablero.getTablero()[0][5]);
        fichasNegras.add(alfilNegro0);
        fichasNegras.add(alfilNegro1);
        //Dama blanco
        Ficha damaNegro = new Dama(true, 5, 14, tablero.getTablero()[0][3]);
        fichasNegras.add(damaNegro);
        //Rey negro
        Ficha reyNegro = new Rey(false, 6, 15, tablero.getTablero()[0][4]);
        fichasNegras.add(reyNegro);
        blanco = new Jugador("Camelo", "blanco", fichasBlancas);
        negro = new Jugador("Pepe", "negro", fichasNegras);
        tablero.setBlanco(blanco);
        tablero.setNegro(negro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondoTablero = new javax.swing.JPanel();
        btnH1 = new javax.swing.JButton();
        btnH2 = new javax.swing.JButton();
        btnH3 = new javax.swing.JButton();
        btnH4 = new javax.swing.JButton();
        btnH5 = new javax.swing.JButton();
        btnH6 = new javax.swing.JButton();
        btnH7 = new javax.swing.JButton();
        btnH8 = new javax.swing.JButton();
        btnG1 = new javax.swing.JButton();
        btnG2 = new javax.swing.JButton();
        btnG3 = new javax.swing.JButton();
        btnG4 = new javax.swing.JButton();
        btnG5 = new javax.swing.JButton();
        btnG6 = new javax.swing.JButton();
        btnG7 = new javax.swing.JButton();
        btnG8 = new javax.swing.JButton();
        btnF1 = new javax.swing.JButton();
        btnF2 = new javax.swing.JButton();
        btnF3 = new javax.swing.JButton();
        btnF4 = new javax.swing.JButton();
        btnF5 = new javax.swing.JButton();
        btnF6 = new javax.swing.JButton();
        btnF7 = new javax.swing.JButton();
        btnF8 = new javax.swing.JButton();
        btnE1 = new javax.swing.JButton();
        btnE2 = new javax.swing.JButton();
        btnE3 = new javax.swing.JButton();
        btnE4 = new javax.swing.JButton();
        btnE5 = new javax.swing.JButton();
        btnE6 = new javax.swing.JButton();
        btnE7 = new javax.swing.JButton();
        btnE8 = new javax.swing.JButton();
        btnD1 = new javax.swing.JButton();
        btnD2 = new javax.swing.JButton();
        btnD3 = new javax.swing.JButton();
        btnD4 = new javax.swing.JButton();
        btnD5 = new javax.swing.JButton();
        btnD6 = new javax.swing.JButton();
        btnD7 = new javax.swing.JButton();
        btnD8 = new javax.swing.JButton();
        btnC1 = new javax.swing.JButton();
        btnC2 = new javax.swing.JButton();
        btnC3 = new javax.swing.JButton();
        btnC4 = new javax.swing.JButton();
        btnC5 = new javax.swing.JButton();
        btnC6 = new javax.swing.JButton();
        btnC7 = new javax.swing.JButton();
        btnC8 = new javax.swing.JButton();
        btnB1 = new javax.swing.JButton();
        btnB2 = new javax.swing.JButton();
        btnB3 = new javax.swing.JButton();
        btnB4 = new javax.swing.JButton();
        btnB5 = new javax.swing.JButton();
        btnB6 = new javax.swing.JButton();
        btnB7 = new javax.swing.JButton();
        btnB8 = new javax.swing.JButton();
        btnA1 = new javax.swing.JButton();
        btnA2 = new javax.swing.JButton();
        btnA3 = new javax.swing.JButton();
        btnA4 = new javax.swing.JButton();
        btnA5 = new javax.swing.JButton();
        btnA6 = new javax.swing.JButton();
        btnA7 = new javax.swing.JButton();
        btnA8 = new javax.swing.JButton();
        pnlBordeIzquierdo = new javax.swing.JPanel();
        pnlBordeSuperior = new javax.swing.JPanel();
        pnlBordeDerecho = new javax.swing.JPanel();
        pnlBordeInf = new javax.swing.JPanel();
        btnTorreBlanca = new javax.swing.JButton();
        btnCaballoBlanco = new javax.swing.JButton();
        btnAlfilBlanco = new javax.swing.JButton();
        btnDamaBlanca = new javax.swing.JButton();
        btnTorreNegra = new javax.swing.JButton();
        btnDamaNegra = new javax.swing.JButton();
        btnAlfilNegro = new javax.swing.JButton();
        btnCaballoNegro = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        pnlFondoTablero.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondoTablero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreBlanca.png"))); // NOI18N
        btnH1.setBorder(null);
        btnH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 510, 70, 70));

        btnH2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnH2.setBorder(null);
        btnH2.setBorderPainted(false);
        btnH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 70, 70));

        btnH3.setBorder(null);
        btnH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 70, 70));

        btnH4.setBorder(null);
        btnH4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 70, 70));

        btnH5.setBorder(null);
        btnH5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 70, 70));

        btnH6.setBorder(null);
        btnH6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 70, 70));

        btnH7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnH7.setBorder(null);
        btnH7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 70, 70));

        btnH8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreNegra.png"))); // NOI18N
        btnH8.setBorder(null);
        btnH8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnH8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnH8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 70, 70));

        btnG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoBlanco.png"))); // NOI18N
        btnG1.setBorder(null);
        btnG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 70, 70));

        btnG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnG2.setBorder(null);
        btnG2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 70, 70));

        btnG3.setBorder(null);
        btnG3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 70, 70));

        btnG4.setBorder(null);
        btnG4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 70, 70));

        btnG5.setBorder(null);
        btnG5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 70, 70));

        btnG6.setBorder(null);
        btnG6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 70, 70));

        btnG7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnG7.setBorder(null);
        btnG7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 70, 70));

        btnG8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoNegro.png"))); // NOI18N
        btnG8.setBorder(null);
        btnG8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnG8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnG8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 70, 70));

        btnF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilBlanco.png"))); // NOI18N
        btnF1.setBorder(null);
        btnF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 70, 70));

        btnF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnF2.setBorder(null);
        btnF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 70, 70));

        btnF3.setBorder(null);
        btnF3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 70, 70));

        btnF4.setBorder(null);
        btnF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 70, 70));

        btnF5.setBorder(null);
        btnF5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 70, 70));

        btnF6.setBorder(null);
        btnF6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 70, 70));

        btnF7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnF7.setBorder(null);
        btnF7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 70, 70));

        btnF8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilNegro.png"))); // NOI18N
        btnF8.setBorder(null);
        btnF8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnF8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 70, 70));

        btnE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReyBlanco.png"))); // NOI18N
        btnE1.setBorder(null);
        btnE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 70, 70));

        btnE2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnE2.setBorder(null);
        btnE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 70, 70));

        btnE3.setBorder(null);
        btnE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 70, 70));

        btnE4.setBorder(null);
        btnE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 70, 70));

        btnE5.setBorder(null);
        btnE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 70, 70));

        btnE6.setBorder(null);
        btnE6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 70, 70));

        btnE7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnE7.setBorder(null);
        btnE7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 70, 70));

        btnE8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReyNegro.png"))); // NOI18N
        btnE8.setBorder(null);
        btnE8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnE8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnE8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 70, 70));

        btnD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaBlanca.png"))); // NOI18N
        btnD1.setBorder(null);
        btnD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 70, 70));

        btnD2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnD2.setBorder(null);
        btnD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 70, 70));

        btnD3.setBorder(null);
        btnD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 70, 70));

        btnD4.setBorder(null);
        btnD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 70, 70));

        btnD5.setBorder(null);
        btnD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 70));

        btnD6.setBorder(null);
        btnD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 70, 70));

        btnD7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnD7.setBorder(null);
        btnD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 70, 70));

        btnD8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaNegra.png"))); // NOI18N
        btnD8.setBorder(null);
        btnD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnD8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnD8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 70, 70));

        btnC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilBlanco.png"))); // NOI18N
        btnC1.setBorder(null);
        btnC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, 70, 70));

        btnC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnC2.setBorder(null);
        btnC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 70, 70));

        btnC3.setBorder(null);
        btnC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 70, 70));

        btnC4.setBorder(null);
        btnC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 70, 70));

        btnC5.setBorder(null);
        btnC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 70, 70));

        btnC6.setBorder(null);
        btnC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 70));

        btnC7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnC7.setBorder(null);
        btnC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 70, 70));

        btnC8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilNegro.png"))); // NOI18N
        btnC8.setBorder(null);
        btnC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnC8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 70));

        btnB1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoBlanco.png"))); // NOI18N
        btnB1.setBorder(null);
        btnB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 70, 70));

        btnB2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnB2.setBorder(null);
        btnB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 70, 70));

        btnB3.setBorder(null);
        btnB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 70, 70));

        btnB4.setBorder(null);
        btnB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 70, 70));

        btnB5.setBorder(null);
        btnB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 70, 70));

        btnB6.setBorder(null);
        btnB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 70, 70));

        btnB7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnB7.setBorder(null);
        btnB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 70, 70));

        btnB8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoNegro.png"))); // NOI18N
        btnB8.setBorder(null);
        btnB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnB8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnB8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 70, 70));

        btnA1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreBlanca.png"))); // NOI18N
        btnA1.setBorder(null);
        btnA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA1ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, 70, 70));

        btnA2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        btnA2.setBorder(null);
        btnA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA2ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 70, 70));

        btnA3.setBorder(null);
        btnA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA3ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 70, 70));

        btnA4.setBorder(null);
        btnA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA4ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 70, 70));

        btnA5.setBorder(null);
        btnA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA5ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 70));

        btnA6.setBorder(null);
        btnA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA6ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 70, 70));

        btnA7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónNegro.png"))); // NOI18N
        btnA7.setBorder(null);
        btnA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA7ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 70, 70));

        btnA8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreNegra.png"))); // NOI18N
        btnA8.setBorder(null);
        btnA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnA8ActionPerformed(evt);
            }
        });
        pnlFondoTablero.add(btnA8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        pnlBordeIzquierdo.setBackground(new java.awt.Color(0, 109, 200));
        pnlBordeIzquierdo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBordeIzquierdoLayout = new javax.swing.GroupLayout(pnlBordeIzquierdo);
        pnlBordeIzquierdo.setLayout(pnlBordeIzquierdoLayout);
        pnlBordeIzquierdoLayout.setHorizontalGroup(
            pnlBordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlBordeIzquierdoLayout.setVerticalGroup(
            pnlBordeIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pnlFondoTablero.add(pnlBordeIzquierdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        pnlBordeSuperior.setBackground(new java.awt.Color(0, 109, 200));
        pnlBordeSuperior.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBordeSuperiorLayout = new javax.swing.GroupLayout(pnlBordeSuperior);
        pnlBordeSuperior.setLayout(pnlBordeSuperiorLayout);
        pnlBordeSuperiorLayout.setHorizontalGroup(
            pnlBordeSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        pnlBordeSuperiorLayout.setVerticalGroup(
            pnlBordeSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlFondoTablero.add(pnlBordeSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        pnlBordeDerecho.setBackground(new java.awt.Color(0, 109, 200));
        pnlBordeDerecho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBordeDerechoLayout = new javax.swing.GroupLayout(pnlBordeDerecho);
        pnlBordeDerecho.setLayout(pnlBordeDerechoLayout);
        pnlBordeDerechoLayout.setHorizontalGroup(
            pnlBordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pnlBordeDerechoLayout.setVerticalGroup(
            pnlBordeDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        pnlFondoTablero.add(pnlBordeDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        pnlBordeInf.setBackground(new java.awt.Color(0, 109, 200));
        pnlBordeInf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlBordeInfLayout = new javax.swing.GroupLayout(pnlBordeInf);
        pnlBordeInf.setLayout(pnlBordeInfLayout);
        pnlBordeInfLayout.setHorizontalGroup(
            pnlBordeInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        pnlBordeInfLayout.setVerticalGroup(
            pnlBordeInfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        pnlFondoTablero.add(pnlBordeInf, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        btnTorreBlanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreBlanca.png"))); // NOI18N
        btnTorreBlanca.setBorder(null);
        pnlFondoTablero.add(btnTorreBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 70, 70));

        btnCaballoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoBlanco.png"))); // NOI18N
        btnCaballoBlanco.setBorder(null);
        pnlFondoTablero.add(btnCaballoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 70, 70));

        btnAlfilBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilBlanco.png"))); // NOI18N
        btnAlfilBlanco.setBorder(null);
        pnlFondoTablero.add(btnAlfilBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 70, 70));

        btnDamaBlanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaBlanca.png"))); // NOI18N
        btnDamaBlanca.setBorder(null);
        pnlFondoTablero.add(btnDamaBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 70, 70));

        btnTorreNegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreNegra.png"))); // NOI18N
        btnTorreNegra.setBorder(null);
        pnlFondoTablero.add(btnTorreNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 70, 70));

        btnDamaNegra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaNegra.png"))); // NOI18N
        btnDamaNegra.setBorder(null);
        pnlFondoTablero.add(btnDamaNegra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 70));

        btnAlfilNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilNegro.png"))); // NOI18N
        btnAlfilNegro.setBorder(null);
        pnlFondoTablero.add(btnAlfilNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 70, 70));

        btnCaballoNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoNegro.png"))); // NOI18N
        btnCaballoNegro.setBorder(null);
        pnlFondoTablero.add(btnCaballoNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 70, 70));

        add(pnlFondoTablero, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA1ActionPerformed
        accionBoton(btnA1, 56);
    }//GEN-LAST:event_btnA1ActionPerformed

    private void btnB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB1ActionPerformed
        accionBoton(btnB1, 57);
    }//GEN-LAST:event_btnB1ActionPerformed

    private void btnC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC1ActionPerformed
        accionBoton(btnC1, 58);
    }//GEN-LAST:event_btnC1ActionPerformed

    private void btnD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD1ActionPerformed
        accionBoton(btnD1, 59);
    }//GEN-LAST:event_btnD1ActionPerformed

    private void btnE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE1ActionPerformed
        accionBoton(btnE1, 60);
    }//GEN-LAST:event_btnE1ActionPerformed

    private void btnF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF1ActionPerformed
        accionBoton(btnF1, 61);
    }//GEN-LAST:event_btnF1ActionPerformed

    private void btnG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG1ActionPerformed
        accionBoton(btnG1, 62);
    }//GEN-LAST:event_btnG1ActionPerformed

    private void btnH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH1ActionPerformed
        accionBoton(btnH1, 63);
    }//GEN-LAST:event_btnH1ActionPerformed

    private void btnA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA2ActionPerformed
        accionBoton(btnA2, 48);
    }//GEN-LAST:event_btnA2ActionPerformed

    private void btnB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB2ActionPerformed
        accionBoton(btnB2, 49);
    }//GEN-LAST:event_btnB2ActionPerformed

    private void btnC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC2ActionPerformed
        accionBoton(btnC2, 50);
    }//GEN-LAST:event_btnC2ActionPerformed

    private void btnD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD2ActionPerformed
        accionBoton(btnD2, 51);
    }//GEN-LAST:event_btnD2ActionPerformed

    private void btnE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE2ActionPerformed
        accionBoton(btnE2, 52);
    }//GEN-LAST:event_btnE2ActionPerformed

    private void btnF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF2ActionPerformed
        accionBoton(btnF2, 53);
    }//GEN-LAST:event_btnF2ActionPerformed

    private void btnG2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG2ActionPerformed
        accionBoton(btnG2, 54);
    }//GEN-LAST:event_btnG2ActionPerformed

    private void btnH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH2ActionPerformed
        accionBoton(btnH2, 55);
    }//GEN-LAST:event_btnH2ActionPerformed

    private void btnA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA3ActionPerformed
        accionBoton(btnA3, 40);
    }//GEN-LAST:event_btnA3ActionPerformed

    private void btnB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB3ActionPerformed
        accionBoton(btnB3, 41);
    }//GEN-LAST:event_btnB3ActionPerformed

    private void btnC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC3ActionPerformed
        accionBoton(btnC3, 42);
    }//GEN-LAST:event_btnC3ActionPerformed

    private void btnD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD3ActionPerformed
        accionBoton(btnD3, 43);
    }//GEN-LAST:event_btnD3ActionPerformed

    private void btnE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE3ActionPerformed
        accionBoton(btnE3, 44);
    }//GEN-LAST:event_btnE3ActionPerformed

    private void btnF3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF3ActionPerformed
        accionBoton(btnF3, 45);
    }//GEN-LAST:event_btnF3ActionPerformed

    private void btnG3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG3ActionPerformed
        accionBoton(btnG3, 46);
    }//GEN-LAST:event_btnG3ActionPerformed

    private void btnH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH3ActionPerformed
        accionBoton(btnH3, 47);
    }//GEN-LAST:event_btnH3ActionPerformed

    private void btnA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA8ActionPerformed
        accionBoton(btnA8, 0);
    }//GEN-LAST:event_btnA8ActionPerformed

    private void btnB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB8ActionPerformed
        accionBoton(btnB8, 1);
    }//GEN-LAST:event_btnB8ActionPerformed

    private void btnC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC8ActionPerformed
        accionBoton(btnC8, 2);
    }//GEN-LAST:event_btnC8ActionPerformed

    private void btnD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD8ActionPerformed
        accionBoton(btnD8, 3);
    }//GEN-LAST:event_btnD8ActionPerformed

    private void btnE8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE8ActionPerformed
        accionBoton(btnE8, 4);
    }//GEN-LAST:event_btnE8ActionPerformed

    private void btnF8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF8ActionPerformed
        accionBoton(btnF8, 5);
    }//GEN-LAST:event_btnF8ActionPerformed

    private void btnG8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG8ActionPerformed
        accionBoton(btnG8, 6);
    }//GEN-LAST:event_btnG8ActionPerformed

    private void btnH8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH8ActionPerformed
        accionBoton(btnH8, 7);
    }//GEN-LAST:event_btnH8ActionPerformed

    private void btnA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA7ActionPerformed
        accionBoton(btnA7, 8);
    }//GEN-LAST:event_btnA7ActionPerformed

    private void btnB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB7ActionPerformed
        accionBoton(btnB7, 9);
    }//GEN-LAST:event_btnB7ActionPerformed

    private void btnC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC7ActionPerformed
        accionBoton(btnC7, 10);
    }//GEN-LAST:event_btnC7ActionPerformed

    private void btnD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD7ActionPerformed
        accionBoton(btnD7, 11);
    }//GEN-LAST:event_btnD7ActionPerformed

    private void btnE7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE7ActionPerformed
        accionBoton(btnE7, 12);
    }//GEN-LAST:event_btnE7ActionPerformed

    private void btnF7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF7ActionPerformed
        accionBoton(btnF7, 13);
    }//GEN-LAST:event_btnF7ActionPerformed

    private void btnG7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG7ActionPerformed
        accionBoton(btnG7, 14);
    }//GEN-LAST:event_btnG7ActionPerformed

    private void btnH7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH7ActionPerformed
        accionBoton(btnH7, 15);
    }//GEN-LAST:event_btnH7ActionPerformed

    private void btnA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA6ActionPerformed
        accionBoton(btnA6, 16);
    }//GEN-LAST:event_btnA6ActionPerformed

    private void btnB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB6ActionPerformed
        accionBoton(btnB6, 17);
    }//GEN-LAST:event_btnB6ActionPerformed

    private void btnC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC6ActionPerformed
        accionBoton(btnC6, 18);
    }//GEN-LAST:event_btnC6ActionPerformed

    private void btnD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD6ActionPerformed
        accionBoton(btnD6, 19);
    }//GEN-LAST:event_btnD6ActionPerformed

    private void btnE6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE6ActionPerformed
        accionBoton(btnE6, 20);
    }//GEN-LAST:event_btnE6ActionPerformed

    private void btnF6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF6ActionPerformed
        accionBoton(btnF6, 21);
    }//GEN-LAST:event_btnF6ActionPerformed

    private void btnG6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG6ActionPerformed
        accionBoton(btnG6, 22);
    }//GEN-LAST:event_btnG6ActionPerformed

    private void btnH6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH6ActionPerformed
        accionBoton(btnH6, 23);
    }//GEN-LAST:event_btnH6ActionPerformed

    private void btnA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA5ActionPerformed
        // TODO add your handling code here:
        accionBoton(btnA5, 24);
    }//GEN-LAST:event_btnA5ActionPerformed

    private void btnB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB5ActionPerformed
        accionBoton(btnB5, 25);
    }//GEN-LAST:event_btnB5ActionPerformed

    private void btnC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC5ActionPerformed
        accionBoton(btnC5, 26);
    }//GEN-LAST:event_btnC5ActionPerformed

    private void btnD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD5ActionPerformed
        accionBoton(btnD5, 27);
    }//GEN-LAST:event_btnD5ActionPerformed

    private void btnE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE5ActionPerformed
        accionBoton(btnE5, 28);
    }//GEN-LAST:event_btnE5ActionPerformed

    private void btnF5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF5ActionPerformed
        accionBoton(btnF5, 29);
    }//GEN-LAST:event_btnF5ActionPerformed

    private void btnG5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG5ActionPerformed
        accionBoton(btnG5, 30);
    }//GEN-LAST:event_btnG5ActionPerformed

    private void btnH5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH5ActionPerformed
        accionBoton(btnH5, 31);
    }//GEN-LAST:event_btnH5ActionPerformed

    private void btnA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnA4ActionPerformed
        accionBoton(btnA4, 32);
    }//GEN-LAST:event_btnA4ActionPerformed

    private void btnB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnB4ActionPerformed
        accionBoton(btnB4, 33);
    }//GEN-LAST:event_btnB4ActionPerformed

    private void btnC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnC4ActionPerformed
        accionBoton(btnC4, 34);
    }//GEN-LAST:event_btnC4ActionPerformed

    private void btnD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnD4ActionPerformed
        accionBoton(btnD4, 35);
    }//GEN-LAST:event_btnD4ActionPerformed

    private void btnE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnE4ActionPerformed
        accionBoton(btnE4, 36);
    }//GEN-LAST:event_btnE4ActionPerformed

    private void btnF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnF4ActionPerformed
        accionBoton(btnF4, 37);
    }//GEN-LAST:event_btnF4ActionPerformed

    private void btnG4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnG4ActionPerformed
        accionBoton(btnG4, 38);
    }//GEN-LAST:event_btnG4ActionPerformed

    private void btnH4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnH4ActionPerformed
        accionBoton(btnH4, 39);
    }//GEN-LAST:event_btnH4ActionPerformed
    private void colorearBordes(boolean esBlanco) {
        if (esBlanco) {
            pnlBordeSuperior.setBackground(Color.WHITE);
            pnlBordeInf.setBackground(Color.WHITE);
            pnlBordeIzquierdo.setBackground(Color.WHITE);
            pnlBordeDerecho.setBackground(Color.WHITE);
        } else {
            pnlBordeSuperior.setBackground(Color.BLACK);
            pnlBordeInf.setBackground(Color.BLACK);
            pnlBordeIzquierdo.setBackground(Color.BLACK);
            pnlBordeDerecho.setBackground(Color.BLACK);
        }
    }


private void accionBoton(JButton boton, int posicion) {
        boolean turnoBlanco = tablero.esTurnoBlanco();
        if (boton.getBackground().equals(Color.blue)) {
            ficha.setCasilla(null);
            boton.setIcon(btnSeleccionado.getIcon());
            btnSeleccionado.setIcon(null);
            ficha.setCasilla(boton);
            if (ficha.getTipoFicha() == 1 && ((posicion >= 0) && (posicion <= 7)
                    || (posicion >= 56) && (posicion <= 63))) {
                if (turnoBlanco && (posicion >= 0) && (posicion <= 7)) {
                    corona.setLocationRelativeTo(this);
                    corona.setVisible(true);
                    if (JdCoronacion.tipoFicha == 0) {
                        //Torre
                        Ficha torreBlancoCoronacion = new Torre(true, 2, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                        ficha = null;
                        int i = 0;
                        while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                            if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                    tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                    tablero.getBlanco().getFichas().set(i, torreBlancoCoronacion);
                                }
                            }
                            i++;
                        }
                        boton.setIcon(btnTorreBlanca.getIcon());
                    }
                    if (JdCoronacion.tipoFicha == 1) {
                        //caballo
                        Ficha caballoBlancoCoronacion = new Caballo(true, 3, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                        ficha = null;
                        int i = 0;
                        while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                            if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                    tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                    tablero.getBlanco().getFichas().set(i, caballoBlancoCoronacion);
                                }
                            }
                            i++;
                        }
                        boton.setIcon(btnCaballoBlanco.getIcon());
                    }
                    if (JdCoronacion.tipoFicha == 2) {
                        //alfil 4
                        Ficha alfilBlancoCoronacion = new Alfil(true, 4, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                        ficha = null;
                        int i = 0;
                        while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                            if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                    tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                    tablero.getBlanco().getFichas().set(i, alfilBlancoCoronacion);
                                }
                            }
                            i++;
                        }
                        boton.setIcon(btnAlfilBlanco.getIcon());
                    }
                    if (JdCoronacion.tipoFicha == 3) {
                        //dama 5
                        Ficha damaBlancoCoronacion = new Dama(true, 5, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                        ficha = null;
                        int i = 0;
                        while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                            if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                    tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                    tablero.getBlanco().getFichas().set(i, damaBlancoCoronacion);
                                }
                            }
                            i++;
                        }
                        boton.setIcon(btnDamaBlanca.getIcon());
                    }
                } else {
                    if (!turnoBlanco && (posicion >= 56) && (posicion <= 63)) {
                        corona.setLocationRelativeTo(this);
                        corona.setVisible(true);
                        if (JdCoronacion.tipoFicha == 0) {
                            //Torre
                            Ficha torreNegroCoronacion = new Torre(false, 2, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                            ficha = null;
                            int i = 0;
                            while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                    if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                        tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                        tablero.getNegro().getFichas().set(i, torreNegroCoronacion);
                                    }
                                }
                                i++;
                            }
                            boton.setIcon(btnTorreNegra.getIcon());
                        }
                        if (JdCoronacion.tipoFicha == 1) {
                            //caballo
                            Ficha caballoNegroCoronacion = new Caballo(false, 3, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                            ficha = null;
                            int i = 0;
                            while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                    if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                        tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                        tablero.getNegro().getFichas().set(i, caballoNegroCoronacion);
                                    }
                                }
                                i++;
                            }
                            boton.setIcon(btnCaballoNegro.getIcon());
                        }
                        if (JdCoronacion.tipoFicha == 2) {
                            //alfil 4
                            Ficha alfilNegroCoronacion = new Alfil(false, 4, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                            ficha = null;
                            int i = 0;
                            while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                    if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                        tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                        tablero.getNegro().getFichas().set(i, alfilNegroCoronacion);
                                    }
                                }
                                i++;
                            }
                            boton.setIcon(btnAlfilNegro.getIcon());
                        }
                        if (JdCoronacion.tipoFicha == 3) {
                            //dama 5
                            Ficha damaNegroCoronacion = new Dama(false, 5, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                            ficha = null;
                            int i = 0;
                            while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                    if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                        tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                        tablero.getNegro().getFichas().set(i, damaNegroCoronacion);
                                    }
                                }
                                i++;
                            }
                            boton.setIcon(btnDamaNegra.getIcon());
                        }
                    } else {
                        System.out.println("Error");
                    }
                }
            }
            TableroAjedrez.pintarCasillasNormal(tablero.getTablero());
            tablero.cambiarTurno();
            colorearBordes(tablero.esTurnoBlanco());
            btnSeleccionado = null;
            ficha = null;
        } else {
            if (boton.getBackground().equals(Color.red)) {
                Ficha comida = null;
                if (turnoBlanco) {
                    if (TableroAjedrez.casillaOcupada(boton, tablero.getNegro())) {
                        for (int i = 0; i < tablero.getNegro().getFichas().size(); i++) {
                            if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                comida = tablero.getNegro().getFichas().get(i);
                            }
                        }
                    }
                } else {
                    if (TableroAjedrez.casillaOcupada(boton, tablero.getBlanco())) {
                        for (int i = 0; i < tablero.getBlanco().getFichas().size(); i++) {
                            if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                comida = tablero.getBlanco().getFichas().get(i);
                            }
                        }
                    }
                }
                if (comida != null) {
                    if (turnoBlanco) {
                        if (tablero.comer(tablero.getNegro(), comida)) {
                            JOptionPane.showMessageDialog(null, "¡Las fichas BLANCAS gana la partida!");
                            PnlMenuIzquierdoPrincipal pnlMenu = new PnlMenuIzquierdoPrincipal();
                            FrmChessGame.agregarPanelIzquierdo(pnlMenu);
                        }
                    } else {
                        if (tablero.comer(tablero.getBlanco(), comida)) {
                            JOptionPane.showMessageDialog(null, "¡Las fichas NEGRAS gana la partida!");
                            PnlMenuIzquierdoPrincipal pnlMenu = new PnlMenuIzquierdoPrincipal();
                            FrmChessGame.agregarPanelIzquierdo(pnlMenu);
                        }
                    }
                    ficha.setCasilla(null);
                    boton.setIcon(btnSeleccionado.getIcon());
                    btnSeleccionado.setIcon(null);
                    ficha.setCasilla(boton);
                    if (ficha.getTipoFicha() == 1 && ((posicion >= 0) && (posicion <= 7) || (posicion >= 56) && (posicion <= 63))) {
                        if (turnoBlanco && (posicion >= 0) && (posicion <= 7)) {
                            corona.setLocationRelativeTo(this);
                            corona.setVisible(true);
                            if (JdCoronacion.tipoFicha == 0) {
                                //Torre
                                Ficha torreBlancoCoronacion = new Torre(true, 2, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                                ficha = null;
                                int i = 0;
                                while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                                    if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                        if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                            tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                            tablero.getBlanco().getFichas().set(i, torreBlancoCoronacion);
                                        }
                                    }
                                    i++;
                                }
                                boton.setIcon(btnTorreBlanca.getIcon());
                            }
                            if (JdCoronacion.tipoFicha == 1) {
                                //caballo
                                Ficha caballoBlancoCoronacion = new Caballo(true, 3, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                                ficha = null;
                                int i = 0;
                                while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                                    if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                        if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                            tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                            tablero.getBlanco().getFichas().set(i, caballoBlancoCoronacion);
                                        }
                                    }
                                    i++;
                                }
                                boton.setIcon(btnCaballoBlanco.getIcon());
                            }
                            if (JdCoronacion.tipoFicha == 2) {
                                //alfil 4
                                Ficha alfilBlancoCoronacion = new Alfil(true, 4, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                                ficha = null;
                                int i = 0;
                                while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                                    if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                        if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                            tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                            tablero.getBlanco().getFichas().set(i, alfilBlancoCoronacion);
                                        }
                                    }
                                    i++;
                                }
                                boton.setIcon(btnAlfilBlanco.getIcon());
                            }
                            if (JdCoronacion.tipoFicha == 3) {
                                //dama 5
                                Ficha damaBlancoCoronacion = new Dama(true, 5, ficha.getIdentificacion(), tablero.getTablero()[0][posicion % 8]);
                                ficha = null;
                                int i = 0;
                                while (ficha == null && (i < tablero.getBlanco().getFichas().size())) {
                                    if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                                        if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                            tablero.getBlanco().getFichas().get(i).setCasilla(boton);
                                            tablero.getBlanco().getFichas().set(i, damaBlancoCoronacion);
                                        }
                                    }
                                    i++;
                                }
                                boton.setIcon(btnDamaBlanca.getIcon());
                            }
                        } else {
                            if (!turnoBlanco && (posicion >= 56) && (posicion <= 63)) {
                                corona.setLocationRelativeTo(this);
                                corona.setVisible(true);
                                if (JdCoronacion.tipoFicha == 0) {
                                    //Torre
                                    Ficha torreNegroCoronacion = new Torre(false, 2, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                                    ficha = null;
                                    int i = 0;
                                    while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                        if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                            if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                                tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                                tablero.getNegro().getFichas().set(i, torreNegroCoronacion);
                                            }
                                        }
                                        i++;
                                    }
                                    boton.setIcon(btnTorreNegra.getIcon());
                                }
                                if (JdCoronacion.tipoFicha == 1) {
                                    //caballo
                                    Ficha caballoNegroCoronacion = new Caballo(false, 3, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                                    ficha = null;
                                    int i = 0;
                                    while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                        if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                            if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                                tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                                tablero.getNegro().getFichas().set(i, caballoNegroCoronacion);
                                            }
                                        }
                                        i++;
                                    }
                                    boton.setIcon(btnCaballoNegro.getIcon());
                                }
                                if (JdCoronacion.tipoFicha == 2) {
                                    //alfil 4
                                    Ficha alfilNegroCoronacion = new Alfil(false, 4, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                                    ficha = null;
                                    int i = 0;
                                    while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                        if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                            if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                                tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                                tablero.getNegro().getFichas().set(i, alfilNegroCoronacion);
                                            }
                                        }
                                        i++;
                                    }
                                    boton.setIcon(btnAlfilNegro.getIcon());
                                }
                                if (JdCoronacion.tipoFicha == 3) {
                                    //dama 5
                                    Ficha damaNegroCoronacion = new Dama(false, 5, ficha.getIdentificacion(), tablero.getTablero()[7][posicion % 8]);
                                    ficha = null;
                                    int i = 0;
                                    while (ficha == null && (i < tablero.getNegro().getFichas().size())) {
                                        if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                                            if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                                                tablero.getNegro().getFichas().get(i).setCasilla(boton);
                                                tablero.getNegro().getFichas().set(i, damaNegroCoronacion);
                                            }
                                        }
                                        i++;
                                    }
                                    boton.setIcon(btnDamaNegra.getIcon());
                                }
                            } else {
                                System.out.println("Error");
                            }
                        }
                    }
                    TableroAjedrez.pintarCasillasNormal(tablero.getTablero());
                    tablero.cambiarTurno();
                    colorearBordes(tablero.esTurnoBlanco());
                    btnSeleccionado = null;
                    ficha = null;
                }
            } else {
                btnSeleccionado = null;
                ficha = null;
                TableroAjedrez.pintarCasillasNormal(tablero.getTablero());
                int i;
                i = 0;
                while (ficha == null && (i < tablero.getNegro().getFichas().size() || i
                        < tablero.getBlanco().getFichas().size())) {
                    if (i < tablero.getNegro().getFichas().size() && !turnoBlanco) {
                        System.out.println("turno negro");
                        if (tablero.getNegro().getFichas().get(i).getCasilla().equals(boton)) {
                            btnSeleccionado = tablero.getNegro().getFichas().get(i).getCasilla();
                            ficha = tablero.getNegro().getFichas().get(i);
                        }
                    } else {
                        if (i < tablero.getBlanco().getFichas().size() && turnoBlanco) {
                            System.out.println("turno blanco");
                            if (tablero.getBlanco().getFichas().get(i).getCasilla().equals(boton)) {
                                btnSeleccionado = tablero.getBlanco().getFichas().get(i).getCasilla();
                                ficha = tablero.getBlanco().getFichas().get(i);
                            }
                        }
                    }
                    i++;
                }
                if (ficha != null) {
                    for (Ficha f : tablero.getBlanco().getFichas()) {
                        System.out.println(f);
                    }
                    if (ficha.getTipoFicha() == 1) {
                        if ((posicion >= 48) && (posicion <= 55) || (posicion >= 8) && (posicion <= 15)) {
                            System.out.println("posicion inicial");
                            ficha.movimiento(posicion, turnoBlanco, true);
                        } else {
                            System.out.println("no esta posicion inicial");
                            ficha.movimiento(posicion, turnoBlanco, false);
                        }
                        System.out.println("peon");
                    }
                    if (ficha.getTipoFicha() == 2) {
                        System.out.println("torre");
                        ficha.movimiento(posicion, turnoBlanco, false);
                    }
                    if (ficha.getTipoFicha() == 3) {
                        System.out.println("caballo");
                        ficha.movimiento(posicion, turnoBlanco, false);
                    }
                    if (ficha.getTipoFicha() == 4) {
                        System.out.println("alfil");
                        ficha.movimiento(posicion, turnoBlanco, false);
                    }
                    if (ficha.getTipoFicha() == 5) {
                        System.out.println("dama");
                        ficha.movimiento(posicion, turnoBlanco, false);
                    }
                    if (ficha.getTipoFicha() == 6) {
                        System.out.println("rey");
                        ficha.movimiento(posicion, turnoBlanco, false);
                    }
                } else {
                    System.out.println("no guarda nada ficha");
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnA1;
    public static javax.swing.JButton btnA2;
    public static javax.swing.JButton btnA3;
    public static javax.swing.JButton btnA4;
    public static javax.swing.JButton btnA5;
    public static javax.swing.JButton btnA6;
    public static javax.swing.JButton btnA7;
    public static javax.swing.JButton btnA8;
    public static javax.swing.JButton btnAlfilBlanco;
    public static javax.swing.JButton btnAlfilNegro;
    public static javax.swing.JButton btnB1;
    public static javax.swing.JButton btnB2;
    public static javax.swing.JButton btnB3;
    public static javax.swing.JButton btnB4;
    public static javax.swing.JButton btnB5;
    public static javax.swing.JButton btnB6;
    public static javax.swing.JButton btnB7;
    public static javax.swing.JButton btnB8;
    public static javax.swing.JButton btnC1;
    public static javax.swing.JButton btnC2;
    public static javax.swing.JButton btnC3;
    public static javax.swing.JButton btnC4;
    public static javax.swing.JButton btnC5;
    public static javax.swing.JButton btnC6;
    public static javax.swing.JButton btnC7;
    public static javax.swing.JButton btnC8;
    public static javax.swing.JButton btnCaballoBlanco;
    public static javax.swing.JButton btnCaballoNegro;
    public static javax.swing.JButton btnD1;
    public static javax.swing.JButton btnD2;
    public static javax.swing.JButton btnD3;
    public static javax.swing.JButton btnD4;
    public static javax.swing.JButton btnD5;
    public static javax.swing.JButton btnD6;
    public static javax.swing.JButton btnD7;
    public static javax.swing.JButton btnD8;
    public static javax.swing.JButton btnDamaBlanca;
    public static javax.swing.JButton btnDamaNegra;
    public static javax.swing.JButton btnE1;
    public static javax.swing.JButton btnE2;
    public static javax.swing.JButton btnE3;
    public static javax.swing.JButton btnE4;
    public static javax.swing.JButton btnE5;
    public static javax.swing.JButton btnE6;
    public static javax.swing.JButton btnE7;
    public static javax.swing.JButton btnE8;
    public static javax.swing.JButton btnF1;
    public static javax.swing.JButton btnF2;
    public static javax.swing.JButton btnF3;
    public static javax.swing.JButton btnF4;
    public static javax.swing.JButton btnF5;
    public static javax.swing.JButton btnF6;
    public static javax.swing.JButton btnF7;
    public static javax.swing.JButton btnF8;
    public static javax.swing.JButton btnG1;
    public static javax.swing.JButton btnG2;
    public static javax.swing.JButton btnG3;
    public static javax.swing.JButton btnG4;
    public static javax.swing.JButton btnG5;
    public static javax.swing.JButton btnG6;
    public static javax.swing.JButton btnG7;
    public static javax.swing.JButton btnG8;
    public static javax.swing.JButton btnH1;
    public static javax.swing.JButton btnH2;
    public static javax.swing.JButton btnH3;
    public static javax.swing.JButton btnH4;
    public static javax.swing.JButton btnH5;
    public static javax.swing.JButton btnH6;
    public static javax.swing.JButton btnH7;
    public static javax.swing.JButton btnH8;
    public static javax.swing.JButton btnTorreBlanca;
    public static javax.swing.JButton btnTorreNegra;
    private javax.swing.JPanel pnlBordeDerecho;
    private javax.swing.JPanel pnlBordeInf;
    private javax.swing.JPanel pnlBordeIzquierdo;
    private javax.swing.JPanel pnlBordeSuperior;
    private javax.swing.JPanel pnlFondoTablero;
    // End of variables declaration//GEN-END:variables
}
