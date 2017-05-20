package br.com.cary.view;

import br.com.cary.bean.EntradaBean;
import br.com.cary.bean.EntradaParcelaBean;
import br.com.cary.bean.FinanceiroBean;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.DataException;
import br.com.cary.util.Validador;
import cary.utility.Alertas;
import cary.utility.NovaData;
import java.text.DecimalFormat;

/**
 *
 * @author Reginaldo
 */
public class FormEntradaParcelamento extends javax.swing.JDialog {

    private EntradaBean entBean;
    private EntradaParcelaBean epb;
    private int cont = 0;
    private FinanceiroBean fincBean;
    /**
     * Creates new form FormEntradaParcelamento
     */
    public FormEntradaParcelamento(java.awt.Frame parent, boolean modal, EntradaBean entBean) {
        super(parent, modal);
        initComponents();
        this.entBean = entBean;
        epb = new EntradaParcelaBean();
        fincBean = new FinanceiroBean();
        tfValorTotal.setText(new DecimalFormat("0.00").format(entBean.getEntrada().getValorFinal()));
        escolherPlano();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcPlanoPagamento = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tfValorTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNumeroParcelas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfValorParcelas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfVencimento = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Plano de Pagamento");

        jcPlanoPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcPlanoPagamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A VISTA", "PARCELADO" }));
        jcPlanoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPlanoPagamentoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Valor Total");

        tfValorTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfValorTotal.setFocusable(false);
        tfValorTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorTotalActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Parcelas");

        tfNumeroParcelas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNumeroParcelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNumeroParcelasActionPerformed(evt);
            }
        });
        tfNumeroParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNumeroParcelasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroParcelasKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor da Parcela");

        tfValorParcelas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfValorParcelas.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Vencimento");

        try {
            tfVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfVencimento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software-01.png"))); // NOI18N
        jButton1.setText(" Concluir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfVencimento)
                    .addComponent(tfValorParcelas)
                    .addComponent(tfNumeroParcelas)
                    .addComponent(tfValorTotal)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 246, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcPlanoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcPlanoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNumeroParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfValorParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfValorTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorTotalActionPerformed

    }//GEN-LAST:event_tfValorTotalActionPerformed

    private void tfNumeroParcelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNumeroParcelasActionPerformed

    }//GEN-LAST:event_tfNumeroParcelasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        epb = new EntradaParcelaBean();
        int qtdParc = 0;
        if (jcPlanoPagamento.getSelectedIndex() == 0) {
            try {
                fincBean.getFinanceiro().setDescricao(entBean.getEntrada().getMemorando());
                fincBean.getFinanceiro().setEmpresa(entBean.getEntrada().getFornecedor().getNomeFantasia());
                fincBean.getFinanceiro().setTipo("DESPESA");
                fincBean.getFinanceiro().setNumeroRecibo(entBean.getEntrada().getNotaFiscal());
                fincBean.getFinanceiro().setValor(entBean.getEntrada().getValorFinal());
                fincBean.getFinanceiro().setData(entBean.getEntrada().getDataEntrada());
                fincBean.salvar();
                Alertas.mensagemConfirmacao("Financeiro efetivado com sucesso!");
                this.dispose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                if (tfNumeroParcelas.getText().isEmpty()) {
                    Alertas.mensagemAviso("Informe a quantidade de parcelas!");
                } else {
                    qtdParc = Integer.parseInt(tfNumeroParcelas.getText());
                    epb.getEntradaParcela().setEntrada(entBean.getEntrada());
                    epb.getEntradaParcela().setQtdeParcelas(qtdParc);
                    Validador.getInstance().validarData(tfVencimento.getText());
                    epb.getEntradaParcela().setNumeroParcela(cont+1);
                    epb.getEntradaParcela().setDataVencimento(NovaData.converterStringParaDate(tfVencimento.getText()));
                    epb.getEntradaParcela().setValorParcela(Double.parseDouble(tfValorParcelas.getText().replace(",", ".")));
                    epb.salvarParcelas();
                    tfVencimento.setText(NovaData.calculaPeriodoPorDias(15, tfVencimento.getText()));
                    cont++;
                    Alertas.mensagemConfirmacao("Parcela "+cont+" de "+qtdParc+" lançada com sucesso!");
                    if (cont == qtdParc) {
                        this.dispose();
                    }
                }
            } catch (CampoVazioException | DataException e) {
                Alertas.mensagemAviso(e.getMessage());
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNumeroParcelasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroParcelasKeyTyped
        String str = "1234567890";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroParcelasKeyTyped

    private void jcPlanoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPlanoPagamentoActionPerformed
        escolherPlano();
    }//GEN-LAST:event_jcPlanoPagamentoActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Alertas.mensagemAviso("Finalize a ação para sair desta tela!");
    }//GEN-LAST:event_formWindowClosing

    private void tfNumeroParcelasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroParcelasKeyReleased
        if(!tfNumeroParcelas.getText().isEmpty()) {
            int parc = Integer.parseInt(tfNumeroParcelas.getText());
            tfValorParcelas.setText(new DecimalFormat("0.00").format(entBean.getEntrada().getValorFinal()/parc));
        }
    }//GEN-LAST:event_tfNumeroParcelasKeyReleased

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
            java.util.logging.Logger.getLogger(FormEntradaParcelamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEntradaParcelamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEntradaParcelamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEntradaParcelamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormEntradaParcelamento dialog = new FormEntradaParcelamento(new javax.swing.JFrame(), true, new EntradaBean());
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox jcPlanoPagamento;
    private javax.swing.JTextField tfNumeroParcelas;
    private javax.swing.JTextField tfValorParcelas;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JFormattedTextField tfVencimento;
    // End of variables declaration//GEN-END:variables

    private void escolherPlano() {
        if (jcPlanoPagamento.getSelectedIndex() == 0) {
            tfVencimento.setEnabled(false);
            tfNumeroParcelas.setText("1");
            tfNumeroParcelas.setEnabled(false);
            tfValorParcelas.setEnabled(false);
        } else {
            tfNumeroParcelas.setEnabled(true);
            tfVencimento.setEnabled(true);
            tfValorParcelas.setEnabled(true);
        }
    }
}
