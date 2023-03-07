/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import modelo.TableroAjedrez;

/**
 *
 * @author pc
 */
public class PnlMenuDeJuego extends javax.swing.JPanel {

    TableroAjedrez tablero = new TableroAjedrez();
    
    boolean esBlanca = tablero.esTurnoBlanco();
    String jugadorUno = "x";
    String jugadorDos = "y";
    
    public PnlMenuDeJuego() {
        initComponents();
        //colocarTurno(esBlanca);
        imprimirJugadores(jugadorUno, jugadorDos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        pnlColorJugador = new javax.swing.JPanel();
        lblColorJugador = new javax.swing.JLabel();
        lblNombreJugadorBlancas = new javax.swing.JLabel();
        lblMensajeBlancas = new javax.swing.JLabel();
        lblNombreJugadorNegras = new javax.swing.JLabel();
        lblMensajeNegras = new javax.swing.JLabel();
        lblReyBlanco = new javax.swing.JLabel();
        lblReyNegro = new javax.swing.JLabel();

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlColorJugador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblColorJugador.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblColorJugador.setText("jLabel1");

        javax.swing.GroupLayout pnlColorJugadorLayout = new javax.swing.GroupLayout(pnlColorJugador);
        pnlColorJugador.setLayout(pnlColorJugadorLayout);
        pnlColorJugadorLayout.setHorizontalGroup(
            pnlColorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlColorJugadorLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblColorJugador)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pnlColorJugadorLayout.setVerticalGroup(
            pnlColorJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlColorJugadorLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblColorJugador)
                .addGap(41, 41, 41))
        );

        pnlFondo.add(pnlColorJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 280, -1));

        lblNombreJugadorBlancas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreJugadorBlancas.setText("jLabel1");
        pnlFondo.add(lblNombreJugadorBlancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        lblMensajeBlancas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensajeBlancas.setText("Está jugando como blancas");
        pnlFondo.add(lblMensajeBlancas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        lblNombreJugadorNegras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblNombreJugadorNegras.setText("jLabel2");
        pnlFondo.add(lblNombreJugadorNegras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        lblMensajeNegras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMensajeNegras.setText("Está jugando como negras");
        pnlFondo.add(lblMensajeNegras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        lblReyBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReyBlanco.png"))); // NOI18N
        pnlFondo.add(lblReyBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        lblReyNegro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReyNegro.png"))); // NOI18N
        pnlFondo.add(lblReyNegro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void imprimirJugadores(String usuarioUno,String usuarioDos){
        System.out.println(usuarioUno+" "+usuarioDos);
        lblNombreJugadorBlancas.setText(usuarioUno);
        lblNombreJugadorNegras.setText(usuarioDos);
    }
    
    public void colocarTurno(boolean esBlanco){
        
        if(esBlanco == true){
        System.out.println("entrado al metodo");
        if(esBlanco){
            System.out.println("Entra aquii");
            lblColorJugador.setText("Blanco");
        } else {
            System.out.println("Entra al else");
            lblColorJugador.setText("Negro");
        }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblColorJugador;
    private javax.swing.JLabel lblMensajeBlancas;
    private javax.swing.JLabel lblMensajeNegras;
    private javax.swing.JLabel lblNombreJugadorBlancas;
    private javax.swing.JLabel lblNombreJugadorNegras;
    private javax.swing.JLabel lblReyBlanco;
    private javax.swing.JLabel lblReyNegro;
    public static javax.swing.JPanel pnlColorJugador;
    private javax.swing.JPanel pnlFondo;
    // End of variables declaration//GEN-END:variables
}
