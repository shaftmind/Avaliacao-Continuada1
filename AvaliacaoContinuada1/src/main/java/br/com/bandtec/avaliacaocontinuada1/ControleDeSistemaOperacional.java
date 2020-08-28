/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.avaliacaocontinuada1;

import java.util.Random;

/**
 *
 * @author adais
 */
public class ControleDeSistemaOperacional extends javax.swing.JFrame {

    /**
     * Creates new form ControleDeSistemaOperacional
     */
    public ControleDeSistemaOperacional() {
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

        lblTitulo = new javax.swing.JLabel();
        lblSubTitulo = new javax.swing.JLabel();
        bprCPU = new javax.swing.JProgressBar();
        bprMemoria = new javax.swing.JProgressBar();
        bprDisco = new javax.swing.JProgressBar();
        lblCPU = new javax.swing.JLabel();
        lblMemoria = new javax.swing.JLabel();
        lblDisco = new javax.swing.JLabel();
        lblPorcentagemCpu = new javax.swing.JLabel();
        lblPorcentagemMem = new javax.swing.JLabel();
        lblPorcentagemDis = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();
        lblMaxCpu = new javax.swing.JLabel();
        lblMinCpu = new javax.swing.JLabel();
        lblMedCpu = new javax.swing.JLabel();
        lblMaxMemoria = new javax.swing.JLabel();
        lblMinMemoria = new javax.swing.JLabel();
        lblMedMemoria = new javax.swing.JLabel();
        lblMaxDisco = new javax.swing.JLabel();
        lblMinDisco = new javax.swing.JLabel();
        lblMedDisco = new javax.swing.JLabel();
        bntNovaLeitura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Gerenciador de Tarefas");

        lblSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSubTitulo.setText("Desempenho");

        lblCPU.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblCPU.setText("CPU");

        lblMemoria.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblMemoria.setText("Memória");

        lblDisco.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        lblDisco.setText("Disco");

        lblPorcentagemCpu.setText("0%");

        lblPorcentagemMem.setText("0%");

        lblPorcentagemDis.setText("0%");

        lblMin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMin.setText("Minimo");

        lblMax.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMax.setText("Máximo");

        lblMed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMed.setText("Média");

        lblMaxCpu.setText("0");

        lblMinCpu.setText("0");

        lblMedCpu.setText("0");

        lblMaxMemoria.setText("0");

        lblMinMemoria.setText("0");

        lblMedMemoria.setText("0");

        lblMaxDisco.setText("0");

        lblMinDisco.setText("0");

        lblMedDisco.setText("0");

        bntNovaLeitura.setText("Nova Leitura");
        bntNovaLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNovaLeituraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bprDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMemoria)
                    .addComponent(lblDisco)
                    .addComponent(lblCPU)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bprCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPorcentagemCpu))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bprMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPorcentagemDis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPorcentagemMem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMaxDisco)
                    .addComponent(lblMaxCpu)
                    .addComponent(lblMax)
                    .addComponent(lblMaxMemoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMin, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblMinCpu))
                    .addComponent(lblMinMemoria)
                    .addComponent(lblMinDisco))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMed)
                    .addComponent(lblMedMemoria)
                    .addComponent(lblMedCpu)
                    .addComponent(lblMedDisco))
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblSubTitulo)))
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bntNovaLeitura, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMin)
                    .addComponent(lblMed)
                    .addComponent(lblMax))
                .addGap(8, 8, 8)
                .addComponent(lblCPU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaxCpu)
                                .addComponent(lblMinCpu)
                                .addComponent(lblMedCpu))
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblMaxMemoria)
                                .addComponent(lblMinMemoria)
                                .addComponent(lblMedMemoria))
                            .addGap(62, 62, 62))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblPorcentagemCpu)
                            .addGap(63, 63, 63)
                            .addComponent(lblPorcentagemMem)
                            .addGap(49, 49, 49)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bprCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblMemoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bprMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(lblDisco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bprDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMaxDisco)
                        .addComponent(lblMinDisco)
                        .addComponent(lblMedDisco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPorcentagemDis)
                .addGap(49, 49, 49)
                .addComponent(bntNovaLeitura)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNovaLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNovaLeituraActionPerformed
        Random aleatorioCPU = new Random();
        Random aleatorioMem = new Random();
        Random aleatorioDis = new Random();
        
        //Integer contador = 0;
        //contador++;
        
       String sorteCPU = Integer.toString(aleatorioCPU.nextInt(101));
       String sorteMEM = Integer.toString(aleatorioCPU.nextInt(101));
       String sorteDIS = Integer.toString(aleatorioCPU.nextInt(101));
       
       Integer numCPU = Integer.valueOf(sorteCPU);
       Integer numMEM = Integer.valueOf(sorteMEM);
       Integer numDIS = Integer.valueOf(sorteDIS);
       
       Integer maxCPU = Integer.valueOf(lblMaxCpu.getText());
       Integer maxMEM = Integer.valueOf(lblMaxMemoria.getText());
       Integer maxDIS = Integer.valueOf(lblMaxDisco.getText());
       
       Integer minCPU = Integer.valueOf(lblMinCpu.getText());
       Integer minMEM = Integer.valueOf(lblMinMemoria.getText());
       Integer minDIS = Integer.valueOf(lblMinDisco.getText());
       
       //Integer medCPU = Integer.valueOf(lblPorcentagemCpu.getText());
       //Integer medMEM = Integer.valueOf(lblMaxCpu.getText());
       //Integer medDIS = Integer.valueOf(lblMaxCpu.getText());
       
       if(numCPU > maxCPU){
            lblMaxCpu.setText(sorteCPU); 
             //System.out.println(sorteCPU);
      }else if(numCPU < minCPU){
           lblMinCpu.setText(sorteCPU);
           //System.out.println(sorteCPU);
       }
      
      if(numMEM > maxMEM){
             lblMaxMemoria.setText(sorteMEM); 
         
       }else if(numMEM < minMEM){
          lblMinMemoria.setText(sorteMEM);
         
       }
      
      if(numDIS > maxDIS){
             lblMaxDisco.setText(sorteDIS); 
         
       }else if(numDIS < minDIS){
          lblMinDisco.setText(sorteDIS);
           
      }
       
       //Integer valorCPU = numCPU + medCPU;
       //Double mediaCPU = new Double(valorCPU / contador).doubleValue();
       //String lindo = Double.toString(mediaCPU);
       //lblMedCpu.setText(lindo);
       // System.out.println(lindo);
       
       
        
        //System.out.println(contador);
        
        lblPorcentagemCpu.setText(sorteCPU + "%");
        bprCPU.setValue(numCPU);
        
        lblPorcentagemMem.setText(sorteMEM + "%");
        bprMemoria.setValue(numMEM);
        
        lblPorcentagemDis.setText(sorteDIS + "%");
        bprDisco.setValue(numDIS);
        
        
        
        
        
        
    }//GEN-LAST:event_bntNovaLeituraActionPerformed

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
            java.util.logging.Logger.getLogger(ControleDeSistemaOperacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControleDeSistemaOperacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControleDeSistemaOperacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControleDeSistemaOperacional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControleDeSistemaOperacional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntNovaLeitura;
    private javax.swing.JProgressBar bprCPU;
    private javax.swing.JProgressBar bprDisco;
    private javax.swing.JProgressBar bprMemoria;
    private javax.swing.JLabel lblCPU;
    private javax.swing.JLabel lblDisco;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMaxCpu;
    private javax.swing.JLabel lblMaxDisco;
    private javax.swing.JLabel lblMaxMemoria;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblMedCpu;
    private javax.swing.JLabel lblMedDisco;
    private javax.swing.JLabel lblMedMemoria;
    private javax.swing.JLabel lblMemoria;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblMinCpu;
    private javax.swing.JLabel lblMinDisco;
    private javax.swing.JLabel lblMinMemoria;
    private javax.swing.JLabel lblPorcentagemCpu;
    private javax.swing.JLabel lblPorcentagemDis;
    private javax.swing.JLabel lblPorcentagemMem;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
