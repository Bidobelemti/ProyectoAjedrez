/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.Color;

/**
 *
 * @author pc
 */
public class PnlMenuDeJuego extends javax.swing.JPanel {

    public PnlMenuDeJuego() {
        initComponents();
    }
/*
    public PnlMenuDeJuego(String usuarioUno, String usuarioDos, boolean esBlanco) {
        initComponents();
        imprimirJugadores(usuarioUno, usuarioDos);
        colocarTurno(esBlanco);
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        lblReglasDeJuego = new javax.swing.JLabel();
        lblReyBlanco = new javax.swing.JLabel();
        lblAlfilBlanco = new javax.swing.JLabel();
        pnlFondoAzulSuperior = new javax.swing.JPanel();
        pnlFondoAzulDerecho = new javax.swing.JPanel();
        lblCaballoBlanco = new javax.swing.JLabel();
        lblDamaBlanca = new javax.swing.JLabel();
        lblTorreBlanca = new javax.swing.JLabel();
        lblPeonBlanco = new javax.swing.JLabel();
        lblReglasPeon3 = new javax.swing.JLabel();
        lblReglasPeon2 = new javax.swing.JLabel();
        lblReglasPeon1 = new javax.swing.JLabel();
        lblReglasCaballo1 = new javax.swing.JLabel();
        lblReglasCaballo2 = new javax.swing.JLabel();
        lblReglasCaballo3 = new javax.swing.JLabel();
        lblReglasAlfil1 = new javax.swing.JLabel();
        lblReglasAlfil2 = new javax.swing.JLabel();
        lblReglasAlfil3 = new javax.swing.JLabel();
        lblReglasTorre1 = new javax.swing.JLabel();
        lblReglasTorre2 = new javax.swing.JLabel();
        lblReglasTorre3 = new javax.swing.JLabel();
        lblReglasDama1 = new javax.swing.JLabel();
        lblReglasDama2 = new javax.swing.JLabel();
        lblReglasDama3 = new javax.swing.JLabel();
        lblReglasRey1 = new javax.swing.JLabel();
        lblReglasRey2 = new javax.swing.JLabel();
        lblReglasRey3 = new javax.swing.JLabel();

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReglasDeJuego.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblReglasDeJuego.setText("Reglas de Juego");
        pnlFondo.add(lblReglasDeJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        lblReyBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ReyBlanco.png"))); // NOI18N
        pnlFondo.add(lblReyBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        lblAlfilBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilBlanco.png"))); // NOI18N
        pnlFondo.add(lblAlfilBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        pnlFondoAzulSuperior.setBackground(new java.awt.Color(0, 109, 200));

        javax.swing.GroupLayout pnlFondoAzulSuperiorLayout = new javax.swing.GroupLayout(pnlFondoAzulSuperior);
        pnlFondoAzulSuperior.setLayout(pnlFondoAzulSuperiorLayout);
        pnlFondoAzulSuperiorLayout.setHorizontalGroup(
            pnlFondoAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        pnlFondoAzulSuperiorLayout.setVerticalGroup(
            pnlFondoAzulSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        pnlFondo.add(pnlFondoAzulSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlFondoAzulDerecho.setBackground(new java.awt.Color(0, 109, 200));

        javax.swing.GroupLayout pnlFondoAzulDerechoLayout = new javax.swing.GroupLayout(pnlFondoAzulDerecho);
        pnlFondoAzulDerecho.setLayout(pnlFondoAzulDerechoLayout);
        pnlFondoAzulDerechoLayout.setHorizontalGroup(
            pnlFondoAzulDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );
        pnlFondoAzulDerechoLayout.setVerticalGroup(
            pnlFondoAzulDerechoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        pnlFondo.add(pnlFondoAzulDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        lblCaballoBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoBlanco.png"))); // NOI18N
        pnlFondo.add(lblCaballoBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lblDamaBlanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaBlanca.png"))); // NOI18N
        pnlFondo.add(lblDamaBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

        lblTorreBlanca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreBlanca.png"))); // NOI18N
        pnlFondo.add(lblTorreBlanca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        lblPeonBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/PeónBlanco.png"))); // NOI18N
        pnlFondo.add(lblPeonBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        lblReglasPeon3.setText("turno y come en diagonal.");
        pnlFondo.add(lblReglasPeon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, -1));

        lblReglasPeon2.setText("el frente o dos si es su primer");
        pnlFondo.add(lblReglasPeon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 190, -1));

        lblReglasPeon1.setText("El peón se mueve una vez hacia");
        pnlFondo.add(lblReglasPeon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 190, -1));

        lblReglasCaballo1.setText("El caballo se mueve dos veces en");
        pnlFondo.add(lblReglasCaballo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, -1));

        lblReglasCaballo2.setText("horizontal y una en vertical o ");
        pnlFondo.add(lblReglasCaballo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, -1));

        lblReglasCaballo3.setText("viceversa.");
        pnlFondo.add(lblReglasCaballo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 190, -1));

        lblReglasAlfil1.setText("El alfil se mueve en cualquier");
        pnlFondo.add(lblReglasAlfil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, -1));

        lblReglasAlfil2.setText("dirección, pero únicamente en");
        pnlFondo.add(lblReglasAlfil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, -1));

        lblReglasAlfil3.setText("forma diagonal.");
        pnlFondo.add(lblReglasAlfil3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 190, -1));

        lblReglasTorre1.setText("La torre se mueve en cualquier");
        pnlFondo.add(lblReglasTorre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, -1));

        lblReglasTorre2.setText("dirección, pero únicamente en");
        pnlFondo.add(lblReglasTorre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 190, -1));

        lblReglasTorre3.setText("línea recta.");
        pnlFondo.add(lblReglasTorre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 190, -1));

        lblReglasDama1.setText("La dama puede moverse en línea");
        pnlFondo.add(lblReglasDama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 190, -1));

        lblReglasDama2.setText("recta o en diagonal el número de");
        pnlFondo.add(lblReglasDama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 190, -1));

        lblReglasDama3.setText("casillas que se desee.");
        pnlFondo.add(lblReglasDama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, 190, -1));

        lblReglasRey1.setText("El rey se mueve en cualquier");
        pnlFondo.add(lblReglasRey1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 190, -1));

        lblReglasRey2.setText("dirección, únicamente una casilla.");
        pnlFondo.add(lblReglasRey2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, 190, -1));

        lblReglasRey3.setText("Si se come al rey, termina el juego.");
        pnlFondo.add(lblReglasRey3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 570, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
/*
    public void imprimirJugadores(String usuarioUno, String usuarioDos) {
        System.out.println(usuarioUno + " nb " + usuarioDos);
        lblReglasDeJuego.setText(usuarioUno);
        lblNombreJugadorNegras.setText(usuarioDos);
    }

    public void colocarTurno(boolean esBlanco) {
        System.out.println("entrado al metodo");
        if (esBlanco) {
            System.out.println("Entra aquii");
            lblColorJugador.setText("Blanco");
        } else {
            System.out.println("Entra al else");
            lblColorJugador.setText("Negro");
        }

        pnlFondo.repaint();
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAlfilBlanco;
    private javax.swing.JLabel lblCaballoBlanco;
    private javax.swing.JLabel lblDamaBlanca;
    private javax.swing.JLabel lblPeonBlanco;
    private javax.swing.JLabel lblReglasAlfil1;
    private javax.swing.JLabel lblReglasAlfil2;
    private javax.swing.JLabel lblReglasAlfil3;
    private javax.swing.JLabel lblReglasCaballo1;
    private javax.swing.JLabel lblReglasCaballo2;
    private javax.swing.JLabel lblReglasCaballo3;
    private javax.swing.JLabel lblReglasDama1;
    private javax.swing.JLabel lblReglasDama2;
    private javax.swing.JLabel lblReglasDama3;
    public javax.swing.JLabel lblReglasDeJuego;
    private javax.swing.JLabel lblReglasPeon1;
    private javax.swing.JLabel lblReglasPeon2;
    private javax.swing.JLabel lblReglasPeon3;
    private javax.swing.JLabel lblReglasRey1;
    private javax.swing.JLabel lblReglasRey2;
    private javax.swing.JLabel lblReglasRey3;
    private javax.swing.JLabel lblReglasTorre1;
    private javax.swing.JLabel lblReglasTorre2;
    private javax.swing.JLabel lblReglasTorre3;
    private javax.swing.JLabel lblReyBlanco;
    private javax.swing.JLabel lblTorreBlanca;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlFondoAzulDerecho;
    private javax.swing.JPanel pnlFondoAzulSuperior;
    // End of variables declaration//GEN-END:variables
}
