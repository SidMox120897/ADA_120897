/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pVentanas;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;
import pClases.cOrdenadores;
/**
 *
 * @author sidmox
 */
public class vGeneral extends javax.swing.JFrame {

    /**
     * Creates new form vVentanaGeneral
     */
    public vGeneral() {
        initComponents();
    }
    /*######################## UNSAAC 120897 ########################*/
    /*Atributos*/
    ArrayList<Integer> aDesordenado=new ArrayList();
    String aImpri;
    cOrdenadores Oper=new cOrdenadores();
    static long tiempoInicio;
    static long tiempoFinal;
    /*Atributos*/

    /*######################## UNSAAC 120897 ########################*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        tfNvalores = new javax.swing.JTextField();
        bAgregar = new javax.swing.JButton();
        bGenerar = new javax.swing.JButton();
        lTiempoEje = new javax.swing.JLabel();
        bMostrarLista = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        bInsertion_Sort = new javax.swing.JButton();
        bMostrarListaNueva = new javax.swing.JButton();
        lTiempoEje1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel1.setText("Ingresar numero a la ista");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel2.setText("Crear n valores aleatorios");

        tfNumero.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N

        tfNvalores.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N

        bAgregar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        bAgregar.setText("Agregar");
        bAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarActionPerformed(evt);
            }
        });

        bGenerar.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        bGenerar.setText("Generar");
        bGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGenerarActionPerformed(evt);
            }
        });

        lTiempoEje.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        lTiempoEje.setText("0000000");

        bMostrarLista.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        bMostrarLista.setText("Mostar Lista");
        bMostrarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarListaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        jLabel4.setText("Botones para ordenar listas");

        bInsertion_Sort.setText("Insertion_Sort");
        bInsertion_Sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInsertion_SortActionPerformed(evt);
            }
        });

        bMostrarListaNueva.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        bMostrarListaNueva.setText("Mostar Listas");
        bMostrarListaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrarListaNuevaActionPerformed(evt);
            }
        });

        lTiempoEje1.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        lTiempoEje1.setText("Tiempo de Ejecucion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(bMostrarLista))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(tfNvalores)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bInsertion_Sort)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lTiempoEje1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(bMostrarListaNueva))
                            .addComponent(lTiempoEje))))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bGenerar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNvalores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bMostrarLista)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bInsertion_Sort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lTiempoEje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lTiempoEje)
                .addGap(18, 18, 18)
                .addComponent(bMostrarListaNueva)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarActionPerformed
        // TODO add your handling code here:
        try{
            String f= tfNumero.getText();
            int i=Integer.parseInt(f);
            this.aDesordenado.add(i);
            aImpri="Viejos"+Oper.TodosLosValores(this.aDesordenado);            
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(this, "No es un numero Entero");
        }
        tfNumero.setText("");
    }//GEN-LAST:event_bAgregarActionPerformed

    private void bGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGenerarActionPerformed
        // TODO add your handling code here:
        try{
        String f=tfNvalores.getText();
        int i=Integer.parseInt(f);
        Oper.LlenarArreglo(this.aDesordenado, i);
        aImpri="Viejos"+Oper.TodosLosValores(this.aDesordenado);
        JOptionPane.showMessageDialog(this, "Se genero una Lista de "+i+"\n valores, aun puedes agregar valores a la lista,\n pero al generar una nueva se perdera la anterior.");
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(this, "No es un numero Entero");
        }
        tfNumero.setText("");
    }//GEN-LAST:event_bGenerarActionPerformed

    private void bMostrarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarListaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, aImpri);
    }//GEN-LAST:event_bMostrarListaActionPerformed

    private void bInsertion_SortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInsertion_SortActionPerformed
        try{
            tiempoInicio = System.nanoTime();
            Oper.Insertion_sort(this.aDesordenado);
            tiempoFinal = System.nanoTime();
            long nanoSeg=(tiempoFinal-tiempoInicio);
            double Seg= ((double)nanoSeg)/1000000000;
            String l= Seg + " Segundos.";
            lTiempoEje.setText(l);
            JOptionPane.showMessageDialog(this, "Se Logro Ordenar la Lista por medio de Insertion_Sort");
        }catch(InputMismatchException ex){
            JOptionPane.showMessageDialog(this, "Upps!!! Hay Problemas: \n"+ex.toString());
        }
    }//GEN-LAST:event_bInsertion_SortActionPerformed

    private void bMostrarListaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrarListaNuevaActionPerformed
        // TODO add your handling code here:
        String p=Oper.TodosLosValores(this.aDesordenado);
        JOptionPane.showMessageDialog(this, p);
    }//GEN-LAST:event_bMostrarListaNuevaActionPerformed

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
            java.util.logging.Logger.getLogger(vGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregar;
    private javax.swing.JButton bGenerar;
    private javax.swing.JButton bInsertion_Sort;
    private javax.swing.JButton bMostrarLista;
    private javax.swing.JButton bMostrarListaNueva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTiempoEje;
    private javax.swing.JLabel lTiempoEje1;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfNvalores;
    // End of variables declaration//GEN-END:variables
}