
package pruebasenclase;


public class REWORDT1 extends javax.swing.JFrame {

    public REWORDT1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txPRODUCTO = new javax.swing.JLabel();
        txPRECIO = new javax.swing.JLabel();
        txCANTIDAD = new javax.swing.JLabel();
        txIMPORTE = new javax.swing.JLabel();
        txCALCULAR = new javax.swing.JButton();
        txNUEVO = new javax.swing.JButton();
        PRODUCTO = new javax.swing.JTextField();
        PRECIO = new javax.swing.JTextField();
        CANTIDAD = new javax.swing.JTextField();
        IMPORTE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 51));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTA DE PRODUCTO");
        jLabel1.setOpaque(true);

        txPRODUCTO.setBackground(new java.awt.Color(255, 255, 204));
        txPRODUCTO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txPRODUCTO.setText("PRODUCTO");
        txPRODUCTO.setOpaque(true);

        txPRECIO.setBackground(new java.awt.Color(255, 255, 204));
        txPRECIO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txPRECIO.setText("PRECIO");
        txPRECIO.setOpaque(true);

        txCANTIDAD.setBackground(new java.awt.Color(255, 255, 204));
        txCANTIDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txCANTIDAD.setText("CANTIDAD");
        txCANTIDAD.setOpaque(true);

        txIMPORTE.setBackground(new java.awt.Color(255, 255, 204));
        txIMPORTE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txIMPORTE.setText("IMPORTE");
        txIMPORTE.setOpaque(true);

        txCALCULAR.setText("CALCULAR");
        txCALCULAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCALCULARActionPerformed(evt);
            }
        });

        txNUEVO.setText("NUEVO");
        txNUEVO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNUEVOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txIMPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCANTIDAD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txPRECIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txPRODUCTO, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PRODUCTO)
                            .addComponent(PRECIO)
                            .addComponent(CANTIDAD)
                            .addComponent(IMPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(txCALCULAR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136)
                        .addComponent(txNUEVO, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PRODUCTO, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(txPRODUCTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txPRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PRECIO, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txIMPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IMPORTE, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txNUEVO, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txCALCULAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txCALCULARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCALCULARActionPerformed
        int canti= Integer.parseInt(CANTIDAD.getText());
        double pre = Double.parseDouble(PRECIO.getText());
        double vtotal = canti * pre;
        IMPORTE.setText(String.format("%.3f", vtotal));
    }//GEN-LAST:event_txCALCULARActionPerformed

    private void txNUEVOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNUEVOActionPerformed
        PRODUCTO.setText("");
        CANTIDAD.setText("");
        PRECIO.setText("");
        IMPORTE.setText("");
    }//GEN-LAST:event_txNUEVOActionPerformed

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
            java.util.logging.Logger.getLogger(REWORDT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REWORDT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REWORDT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REWORDT1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REWORDT1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CANTIDAD;
    private javax.swing.JTextField IMPORTE;
    private javax.swing.JTextField PRECIO;
    private javax.swing.JTextField PRODUCTO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton txCALCULAR;
    private javax.swing.JLabel txCANTIDAD;
    private javax.swing.JLabel txIMPORTE;
    private javax.swing.JButton txNUEVO;
    private javax.swing.JLabel txPRECIO;
    private javax.swing.JLabel txPRODUCTO;
    // End of variables declaration//GEN-END:variables
}
