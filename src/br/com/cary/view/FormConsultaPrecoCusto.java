/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cary.view;

import br.com.cary.bean.FornecedorPrecoCustoBean;
import br.com.cary.dao.FornecedorPrecoCustoDAO;
import br.com.cary.entity.FornecedorPrecoCusto;
import cary.utility.Mascaras;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reginaldo
 */
public class FormConsultaPrecoCusto extends javax.swing.JInternalFrame {

    private FornecedorPrecoCustoBean fpcb;
    private List<FornecedorPrecoCusto> lista;

    public FormConsultaPrecoCusto() {
        initComponents();
        this.setTitle("Consultar Preços de Custo");
        fpcb = new FornecedorPrecoCustoBean();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCodigoProduto = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrecos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Produto:");

        tfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoProdutoActionPerformed(evt);
            }
        });
        tfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoProdutoKeyTyped(evt);
            }
        });

        tfDescricao.setFocusable(false);

        jtPrecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPrecos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtPrecos);
        if (jtPrecos.getColumnModel().getColumnCount() > 0) {
            jtPrecos.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(tfCodigoProduto, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoProdutoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoProdutoKeyTyped
        String str = "*";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoProdutoKeyTyped

    private void tfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoProdutoActionPerformed
        if (tfCodigoProduto.getText().equals("*")) {
            FormBuscaProduto formP = new FormBuscaProduto(null, true);
            formP.setLocation(this.getX() + 12, this.getY() + 125);
            formP.setVisible(true);
            if (formP.getProdutoBean() != null) {
                fpcb.getPrecoCusto().setProduto(formP.getProdutoBean().getProduto());
                tfCodigoProduto.setText(fpcb.getPrecoCusto().getProduto().getCodigo().toString());
                tfDescricao.setText(fpcb.getPrecoCusto().getProduto().getDescricao());
            }
        }
    }//GEN-LAST:event_tfCodigoProdutoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        preencherTabela();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtPrecos;
    private javax.swing.JTextField tfCodigoProduto;
    private javax.swing.JTextField tfDescricao;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {
        DefaultTableModel tb = (DefaultTableModel) jtPrecos.getModel();
        tb.setNumRows(0);
        try {
            lista = FornecedorPrecoCustoDAO.getInstance().listar(fpcb.getPrecoCusto().getProduto());
            for (FornecedorPrecoCusto fpc : lista) {
                tb.addRow(new Object[]{fpc.getFornecedor().getNomeFantasia(), "R$ " + new DecimalFormat("0.0000").format(fpc.getPreco())});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
