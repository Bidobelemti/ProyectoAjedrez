/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

/**
 *
 * @author Bidob
 */
public class JdCoronacion extends javax.swing.JDialog {

    static int tipoFicha;
    
    public JdCoronacion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlFondo = new javax.swing.JPanel();
        lblEscojaUnaFicha = new javax.swing.JLabel();
        pnlCaballo = new javax.swing.JPanel();
        lblIconoCaballo = new javax.swing.JLabel();
        lblTextoCaballo = new javax.swing.JLabel();
        pnlTorre = new javax.swing.JPanel();
        lblIconoTorre = new javax.swing.JLabel();
        lblTextoTorre = new javax.swing.JLabel();
        pnlAlfil = new javax.swing.JPanel();
        lblIconoAlfil = new javax.swing.JLabel();
        lblTextoAlfil = new javax.swing.JLabel();
        pnlDama = new javax.swing.JPanel();
        lblIconoCaballo3 = new javax.swing.JLabel();
        lblTextoDama = new javax.swing.JLabel();
        sprEscogerFicha = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        pnlFondo.setBackground(new java.awt.Color(255, 255, 255));
        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEscojaUnaFicha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblEscojaUnaFicha.setText("Escoja una ficha");
        pnlFondo.add(lblEscojaUnaFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pnlCaballo.setBackground(new java.awt.Color(0, 109, 200));
        pnlCaballo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCaballoMouseClicked(evt);
            }
        });

        lblIconoCaballo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/CaballoBlanco.png"))); // NOI18N

        lblTextoCaballo.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoCaballo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTextoCaballo.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoCaballo.setText("Caballo");

        javax.swing.GroupLayout pnlCaballoLayout = new javax.swing.GroupLayout(pnlCaballo);
        pnlCaballo.setLayout(pnlCaballoLayout);
        pnlCaballoLayout.setHorizontalGroup(
            pnlCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaballoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblTextoCaballo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblIconoCaballo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlCaballoLayout.setVerticalGroup(
            pnlCaballoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCaballoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoCaballo, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCaballoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextoCaballo)
                .addGap(23, 23, 23))
        );

        pnlFondo.add(pnlCaballo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 80));

        pnlTorre.setBackground(new java.awt.Color(0, 109, 200));
        pnlTorre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlTorreMouseClicked(evt);
            }
        });

        lblIconoTorre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/TorreBlanca.png"))); // NOI18N

        lblTextoTorre.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoTorre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTextoTorre.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoTorre.setText("Torre");

        javax.swing.GroupLayout pnlTorreLayout = new javax.swing.GroupLayout(pnlTorre);
        pnlTorre.setLayout(pnlTorreLayout);
        pnlTorreLayout.setHorizontalGroup(
            pnlTorreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTorreLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblTextoTorre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblIconoTorre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlTorreLayout.setVerticalGroup(
            pnlTorreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTorreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoTorre, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlTorreLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTextoTorre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlTorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 210, 80));

        pnlAlfil.setBackground(new java.awt.Color(0, 109, 200));
        pnlAlfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAlfilMouseClicked(evt);
            }
        });

        lblIconoAlfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/AlfilBlanco.png"))); // NOI18N

        lblTextoAlfil.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoAlfil.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTextoAlfil.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoAlfil.setText("Alfil");

        javax.swing.GroupLayout pnlAlfilLayout = new javax.swing.GroupLayout(pnlAlfil);
        pnlAlfil.setLayout(pnlAlfilLayout);
        pnlAlfilLayout.setHorizontalGroup(
            pnlAlfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlfilLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTextoAlfil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(lblIconoAlfil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAlfilLayout.setVerticalGroup(
            pnlAlfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoAlfil, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnlAlfilLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTextoAlfil)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFondo.add(pnlAlfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 210, 80));

        pnlDama.setBackground(new java.awt.Color(0, 109, 200));
        pnlDama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDamaMouseClicked(evt);
            }
        });

        lblIconoCaballo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/DamaBlanca.png"))); // NOI18N

        lblTextoDama.setBackground(new java.awt.Color(255, 255, 255));
        lblTextoDama.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTextoDama.setForeground(new java.awt.Color(255, 255, 255));
        lblTextoDama.setText("Dama");

        javax.swing.GroupLayout pnlDamaLayout = new javax.swing.GroupLayout(pnlDama);
        pnlDama.setLayout(pnlDamaLayout);
        pnlDamaLayout.setHorizontalGroup(
            pnlDamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDamaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblTextoDama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblIconoCaballo3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        pnlDamaLayout.setVerticalGroup(
            pnlDamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDamaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIconoCaballo3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDamaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTextoDama)
                .addGap(21, 21, 21))
        );

        pnlFondo.add(pnlDama, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 210, 80));
        pnlFondo.add(sprEscogerFicha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlCaballoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCaballoMouseClicked
        
        System.out.println("Caballo select");
        tipoFicha = 1;
        dispose();
    }//GEN-LAST:event_pnlCaballoMouseClicked

    private void pnlTorreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTorreMouseClicked
        
        System.out.println("Torre select");
        tipoFicha = 0;
        dispose();
    }//GEN-LAST:event_pnlTorreMouseClicked

    private void pnlAlfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAlfilMouseClicked
        
        System.out.println("Alfil select");
        tipoFicha = 2;
        dispose();
    }//GEN-LAST:event_pnlAlfilMouseClicked

    private void pnlDamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDamaMouseClicked
        
        System.out.println("Dama select");
        tipoFicha = 3;
        dispose();
    }//GEN-LAST:event_pnlDamaMouseClicked
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JdCoronacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JdCoronacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JdCoronacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JdCoronacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JdCoronacion dialog = new JdCoronacion(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblEscojaUnaFicha;
    private javax.swing.JLabel lblIconoAlfil;
    private javax.swing.JLabel lblIconoCaballo;
    private javax.swing.JLabel lblIconoCaballo3;
    private javax.swing.JLabel lblIconoTorre;
    private javax.swing.JLabel lblTextoAlfil;
    private javax.swing.JLabel lblTextoCaballo;
    private javax.swing.JLabel lblTextoDama;
    private javax.swing.JLabel lblTextoTorre;
    private javax.swing.JPanel pnlAlfil;
    private javax.swing.JPanel pnlCaballo;
    private javax.swing.JPanel pnlDama;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JPanel pnlTorre;
    private javax.swing.JSeparator sprEscogerFicha;
    // End of variables declaration//GEN-END:variables
}