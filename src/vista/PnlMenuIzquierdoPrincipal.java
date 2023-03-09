/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;


import static vista.FrmChessGame.agregarPanelDerecho;
import static vista.FrmChessGame.agregarPanelIzquierdo;

/**
 *
 * @author Bidob
 */
public class PnlMenuIzquierdoPrincipal extends javax.swing.JPanel {


    static PnlRegistroDeJugadores pnlRegistroDeJugadores;
    static PnlTableroBotones pnlTablero;
    static PnlImagenIzquierda pnlImagenIzquierda;
    static PnlCreditosJuego pnlCreditosJuego;

    /**
     * Creates new form PnlMenuIzquierdoPrincipal
     */
    public PnlMenuIzquierdoPrincipal() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenuIzquierdo = new javax.swing.JPanel();
        pnlFondoAzul = new javax.swing.JPanel();
        pnlJugar = new javax.swing.JPanel();
        lblIconoJugar = new javax.swing.JLabel();
        lblJugar = new javax.swing.JLabel();
        pnlPuntuaciones = new javax.swing.JPanel();
        lblIconoPuntuaciones = new javax.swing.JLabel();
        lblPuntuaciones = new javax.swing.JLabel();
        pnlCreditos = new javax.swing.JPanel();
        lblICreditos = new javax.swing.JLabel();
        lblCreditos = new javax.swing.JLabel();

        pnlMenuIzquierdo.setBackground(new java.awt.Color(255, 255, 255));
        pnlMenuIzquierdo.setLayout(null);

        pnlFondoAzul.setBackground(new java.awt.Color(0, 109, 200));

        javax.swing.GroupLayout pnlFondoAzulLayout = new javax.swing.GroupLayout(pnlFondoAzul);
        pnlFondoAzul.setLayout(pnlFondoAzulLayout);
        pnlFondoAzulLayout.setHorizontalGroup(
            pnlFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pnlFondoAzulLayout.setVerticalGroup(
            pnlFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        pnlMenuIzquierdo.add(pnlFondoAzul);
        pnlFondoAzul.setBounds(0, 0, 650, 80);

        pnlJugar.setBackground(new java.awt.Color(0, 41, 133));
        pnlJugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlJugar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlJugar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlJugarMouseClicked(evt);
            }
        });

        lblIconoJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Jugar.png"))); // NOI18N

        lblJugar.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblJugar.setForeground(new java.awt.Color(255, 255, 255));
        lblJugar.setText("JUGAR");

        javax.swing.GroupLayout pnlJugarLayout = new javax.swing.GroupLayout(pnlJugar);
        pnlJugar.setLayout(pnlJugarLayout);
        pnlJugarLayout.setHorizontalGroup(
            pnlJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugarLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(lblIconoJugar)
                .addGap(23, 23, 23))
        );
        pnlJugarLayout.setVerticalGroup(
            pnlJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJugarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlJugarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIconoJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblJugar))
                .addGap(20, 20, 20))
        );

        pnlMenuIzquierdo.add(pnlJugar);
        pnlJugar.setBounds(50, 220, 360, 80);

        pnlPuntuaciones.setBackground(new java.awt.Color(0, 41, 133));
        pnlPuntuaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlPuntuaciones.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlPuntuaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPuntuacionesMouseClicked(evt);
            }
        });

        lblIconoPuntuaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Puntuación.png"))); // NOI18N

        lblPuntuaciones.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblPuntuaciones.setForeground(new java.awt.Color(255, 255, 255));
        lblPuntuaciones.setText("PUNTUACIONES");

        javax.swing.GroupLayout pnlPuntuacionesLayout = new javax.swing.GroupLayout(pnlPuntuaciones);
        pnlPuntuaciones.setLayout(pnlPuntuacionesLayout);
        pnlPuntuacionesLayout.setHorizontalGroup(
            pnlPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPuntuacionesLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblPuntuaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblIconoPuntuaciones)
                .addGap(23, 23, 23))
        );
        pnlPuntuacionesLayout.setVerticalGroup(
            pnlPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPuntuacionesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlPuntuacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIconoPuntuaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPuntuaciones))
                .addGap(20, 20, 20))
        );

        pnlMenuIzquierdo.add(pnlPuntuaciones);
        pnlPuntuaciones.setBounds(50, 330, 360, 80);

        pnlCreditos.setBackground(new java.awt.Color(0, 41, 133));
        pnlCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCreditos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        pnlCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCreditosMouseClicked(evt);
            }
        });

        lblICreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Créditos.png"))); // NOI18N

        lblCreditos.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        lblCreditos.setForeground(new java.awt.Color(255, 255, 255));
        lblCreditos.setText("CRÉDITOS");

        javax.swing.GroupLayout pnlCreditosLayout = new javax.swing.GroupLayout(pnlCreditos);
        pnlCreditos.setLayout(pnlCreditosLayout);
        pnlCreditosLayout.setHorizontalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditosLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(lblICreditos)
                .addGap(23, 23, 23))
        );
        pnlCreditosLayout.setVerticalGroup(
            pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCreditosLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(pnlCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblICreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreditos))
                .addGap(20, 20, 20))
        );

        pnlMenuIzquierdo.add(pnlCreditos);
        pnlCreditos.setBounds(50, 440, 360, 80);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMenuIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlMenuIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pnlJugarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlJugarMouseClicked
        // TODO add your handling code here:
        pnlRegistroDeJugadores = new PnlRegistroDeJugadores();
        agregarPanelDerecho(pnlRegistroDeJugadores);
        //Controlador controlador = new Controlador();
        pnlImagenIzquierda = new PnlImagenIzquierda();
        agregarPanelIzquierdo(pnlImagenIzquierda);

    }//GEN-LAST:event_pnlJugarMouseClicked

    private void pnlPuntuacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPuntuacionesMouseClicked
        // TODO add your handling code here:
        pnlPuntuaciones = new PnlPuntuaciones();
        agregarPanelDerecho(pnlPuntuaciones);
    }//GEN-LAST:event_pnlPuntuacionesMouseClicked

    private void pnlCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCreditosMouseClicked
        // TODO add your handling code here:
        pnlCreditosJuego = new PnlCreditosJuego();
        agregarPanelDerecho(pnlCreditosJuego);
    }//GEN-LAST:event_pnlCreditosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCreditos;
    private javax.swing.JLabel lblICreditos;
    private javax.swing.JLabel lblIconoJugar;
    private javax.swing.JLabel lblIconoPuntuaciones;
    private javax.swing.JLabel lblJugar;
    private javax.swing.JLabel lblPuntuaciones;
    private javax.swing.JPanel pnlCreditos;
    private javax.swing.JPanel pnlFondoAzul;
    private javax.swing.JPanel pnlJugar;
    public static javax.swing.JPanel pnlMenuIzquierdo;
    private javax.swing.JPanel pnlPuntuaciones;
    // End of variables declaration//GEN-END:variables
}
