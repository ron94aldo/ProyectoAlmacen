
package Vista;

import javax.swing.JOptionPane;


public class Panel extends javax.swing.JFrame {


    public Panel() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        btnCerrarSesion = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        btnSalir = new javax.swing.JMenuItem();
        btnVenta = new javax.swing.JMenu();
        btnNuevaVenta = new javax.swing.JMenuItem();
        btnConsultas = new javax.swing.JMenu();
        btnProducto = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnInventario = new javax.swing.JMenuItem();
        btnReportes = new javax.swing.JMenu();
        btnInformeVentas = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 673, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        btnMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMenu.setText("Menu");
        btnMenu.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        btnCerrarSesion.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        btnMenu.add(btnCerrarSesion);
        btnMenu.add(jSeparator2);

        btnSalir.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnMenu.add(btnSalir);

        jMenuBar1.add(btnMenu);

        btnVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnVenta.setText("Venta");
        btnVenta.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        btnNuevaVenta.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        btnNuevaVenta.setText("Nueva Venta");
        btnNuevaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaVentaActionPerformed(evt);
            }
        });
        btnVenta.add(btnNuevaVenta);

        jMenuBar1.add(btnVenta);

        btnConsultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnConsultas.setText("Productos");
        btnConsultas.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        btnProducto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        btnProducto.setText("Productos");
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        btnConsultas.add(btnProducto);
        btnConsultas.add(jSeparator3);

        btnInventario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });
        btnConsultas.add(btnInventario);

        jMenuBar1.add(btnConsultas);

        btnReportes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnReportes.setText("Reportes");
        btnReportes.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        btnInformeVentas.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        btnInformeVentas.setText("Informe Ventas");
        btnInformeVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformeVentasActionPerformed(evt);
            }
        });
        btnReportes.add(btnInformeVentas);

        jMenuBar1.add(btnReportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int preguntar = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la aplicacion?", "ALERTA", JOptionPane.YES_NO_OPTION);
        
        if (preguntar==JOptionPane.YES_OPTION)
        {System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        int preguntar = JOptionPane.showConfirmDialog(null, 
                "¿Desea cerrar sesion?", "ALERTA", JOptionPane.YES_NO_OPTION);
        if (preguntar==JOptionPane.YES_OPTION){
        Login l= new Login();
            l.setVisible(true);
            this.dispose();}
    }//GEN-LAST:event_btnCerrarSesionActionPerformed
       
    private void btnNuevaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVentaActionPerformed
        Venta v= new Venta();
        this.Escritorio.add(v);
        v.setVisible(true);  
    }//GEN-LAST:event_btnNuevaVentaActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        Productos p = new Productos();
        this.Escritorio.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        Inventario i = new Inventario();
        this.Escritorio.add(i);
        i.setVisible(true);
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnInformeVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformeVentasActionPerformed
        InfoVentas iv = new InfoVentas();
        this.Escritorio.add(iv);
        iv.setVisible(true);
    }//GEN-LAST:event_btnInformeVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenu btnConsultas;
    private javax.swing.JMenuItem btnInformeVentas;
    private javax.swing.JMenuItem btnInventario;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JMenuItem btnNuevaVenta;
    private javax.swing.JMenuItem btnProducto;
    private javax.swing.JMenu btnReportes;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenu btnVenta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables

}
