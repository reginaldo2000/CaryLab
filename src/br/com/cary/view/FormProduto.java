package br.com.cary.view;

import br.com.cary.bean.ProdutoBean;
import br.com.cary.bean.ProdutoEstoqueBean;
import br.com.cary.bean.SetorBean;
import br.com.cary.bean.TabelaProdutoBean;
import br.com.cary.dao.ProdutoDAO;
import br.com.cary.dao.ProdutoEstoqueDAO;
import br.com.cary.dao.TabelaPrecoDAO;
import br.com.cary.dao.TabelaProdutoDAO;
import br.com.cary.entity.Produto;
import br.com.cary.entity.ProdutoEstoque;
import br.com.cary.entity.TabelaPreco;
import br.com.cary.entity.TabelaProduto;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.ProdutoExistenteException;
import br.com.cary.exceptions.RelacionamentoException;
import cary.utility.Alertas;
import cary.utility.Mascaras;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reginaldo
 */
public class FormProduto extends javax.swing.JInternalFrame {

    private ProdutoBean pb;
    private List<TabelaPreco> listaPrecos;
    private TabelaProdutoBean tpb;
    private List<TabelaProduto> listaTabelaProdutos;
    private List<Produto> listaProdutos;
    private ProdutoEstoqueBean peb;

    /**
     * Creates new form FormProduto
     */
    public FormProduto() {
        initComponents();
        pb = new ProdutoBean();
        tpb = new TabelaProdutoBean();
        peb = new ProdutoEstoqueBean();
        preencherTabelaProdutos();

        //preencherTabelaDePrecos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpProduto = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        tfCodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jcTipo = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        tfLucro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfReferencia = new javax.swing.JTextField();
        tfPrecoCusto = new javax.swing.JTextField();
        jcUnidade = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrecos = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtEstoque = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();

        setClosable(true);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software-02.png"))); // NOI18N
        jButton3.setText(" Novo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software-01.png"))); // NOI18N
        jButton4.setText(" Salvar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software-03.png"))); // NOI18N
        jButton5.setText(" Editar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software_Artboard 5.png"))); // NOI18N
        jButton6.setText(" Excluir");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText(" Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        tfCodigo.setFocusable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Unidade:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Referência:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Preço de Custo:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código:*");

        jcTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Produto", "Insumo" }));

        jButton2.setText("P");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLucroActionPerformed(evt);
            }
        });
        tfLucro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfLucroKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Descrição:*");

        tfPrecoCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPrecoCustoKeyTyped(evt);
            }
        });

        jcUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UN", "ML", "UL" }));
        jcUnidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcUnidadeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Lucro:*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tipo:*");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(tfReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jcTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfDescricao, tfReferencia});

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfLucro, tfPrecoCusto});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4, jButton5, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );

        tpProduto.addTab("Cadastro", jPanel1);

        jtPrecos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tabela de Preços", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPrecos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtPrecos);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("Alterar Preços");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        tpProduto.addTab("Preços", jPanel2);

        jtEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Setor", "Valor(R$)", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtEstoque);
        if (jtEstoque.getColumnModel().getColumnCount() > 0) {
            jtEstoque.getColumnModel().getColumn(0).setResizable(false);
            jtEstoque.getColumnModel().getColumn(1).setResizable(false);
            jtEstoque.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 333, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 223, Short.MAX_VALUE))
        );

        tpProduto.addTab("Estoque", jPanel5);

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Produto", "Referência", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setResizable(false);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(260);
            jtProdutos.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Selecionar");

        jLabel1.setText("Pesquisar:");

        tfPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Selecionar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpProduto.addTab("Consultar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpProduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcUnidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcUnidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcUnidadeActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        tpProduto.setSelectedIndex(2);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (ProdutoDAO.getInstance().getLastCodigo() == null) {
            tfCodigo.setText("1");
        } else {
            tfCodigo.setText((ProdutoDAO.getInstance().getLastCodigo() + 1) + "");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            if (tfCodigo.getText().isEmpty()) {
                Alertas.mensagemAviso("Por favor, preencha os campos obrigatórios(*)!");
            } else {
                pb.getProduto().setCodigo(Long.parseLong(tfCodigo.getText()));
                pb.getProduto().setDescricao(tfDescricao.getText().toUpperCase());
                pb.getProduto().setReferencia(tfReferencia.getText().toUpperCase());
                pb.getProduto().setUnidade(jcUnidade.getSelectedItem().toString());
                pb.getProduto().setPrecoCusto(Double.parseDouble(tfPrecoCusto.getText().replace(",", ".")));
                pb.getProduto().setLucro(Double.parseDouble(tfLucro.getText().replace(",", ".")));
                pb.getProduto().setTipo(jcTipo.getSelectedItem().toString());
                pb.salvar();

                salvarPrecoDeVenda();

                //salvarProdutoEstoque();
                preencherTabelaDePrecos();

                preencherTabelaProdutos();

                Alertas.mensagemConfirmacao("Produto cadastrado com sucesso!");
            }
        } catch (CampoVazioException | ProdutoExistenteException e) {
            Alertas.mensagemAviso(e.getMessage());
        } catch (NumberFormatException e) {
            Alertas.mensagemAviso("Erro na conversão de dados, por favor fornceça um dado válido!");
        } catch (RelacionamentoException e) {
            Alertas.mensagemErro(e.getMessage());
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            int index = 0;
            for (TabelaProduto tp : listaTabelaProdutos) {
                Double vlr = Double.parseDouble(jtPrecos.getValueAt(index, 1).toString().replace(",", "."));
                tpb.setTabelaProduto(tp);
                tpb.getTabelaProduto().setPrecoVenda(vlr);
                tpb.atualizar();
                tpb = new TabelaProdutoBean();
                index++;
            }
            Alertas.mensagemConfirmacao("Preços alterados com sucesso!");
        } catch (NullPointerException e) {
            Alertas.mensagemAviso("Impossível concluir a ação!");
        } catch (NumberFormatException e) {
            Alertas.mensagemErro("Valor informado inválido!");
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (jtProdutos.getSelectedRowCount() == 1) {
            int linha = jtProdutos.getSelectedRow();
            pb.setProduto(listaProdutos.get(linha));
            tfCodigo.setText(pb.getProduto().getCodigo().toString());
            tfDescricao.setText(pb.getProduto().getDescricao());
            tfReferencia.setText(pb.getProduto().getReferencia());
            jcUnidade.setSelectedItem(pb.getProduto().getUnidade());
            tfPrecoCusto.setText(new DecimalFormat("0.00").format(pb.getProduto().getPrecoCusto()));
            tfLucro.setText(new DecimalFormat("0.00").format(pb.getProduto().getLucro()));
            preencherTabelaDePrecos();
            preencherTabelaEstoque();
            tpProduto.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            if (tfCodigo.getText().isEmpty()) {
                Alertas.mensagemAviso("Selecione um produto!");
            } else {
                pb.getProduto().setDescricao(tfDescricao.getText().toUpperCase());
                pb.getProduto().setReferencia(tfReferencia.getText().toUpperCase());
                pb.getProduto().setUnidade(jcUnidade.getSelectedItem().toString());
                pb.getProduto().setPrecoCusto(Double.parseDouble(tfPrecoCusto.getText().replace(",", ".")));
                pb.getProduto().setLucro(Double.parseDouble(tfLucro.getText().replace(",", ".")));
                pb.getProduto().setTipo(jcTipo.getSelectedItem().toString());
                pb.editar();

                preencherTabelaProdutos();

                Alertas.mensagemConfirmacao("Dados do produto atualizados com sucesso!");
            }
        } catch (CampoVazioException | ProdutoExistenteException e) {
            Alertas.mensagemAviso(e.getMessage());
        } catch (NumberFormatException e) {
            Alertas.mensagemAviso("Erro na conversão de dados, por favor fornceça um dado válido!");
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage());
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        novo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfPrecoCustoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPrecoCustoKeyTyped
        String str = "0123456789,";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfPrecoCustoKeyTyped

    private void tfLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLucroActionPerformed

    private void tfLucroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLucroKeyTyped
        String str = "0123456789,";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfLucroKeyTyped

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            excluirTabelaPrecoProdutos();
            pb.excluir();
            novo();
        } catch (CampoVazioException e) {
            Alertas.mensagemAviso(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            Alertas.mensagemErro(e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tfPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaActionPerformed
        preencherTabelaProdutos();
    }//GEN-LAST:event_tfPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox jcTipo;
    private javax.swing.JComboBox jcUnidade;
    private javax.swing.JTable jtEstoque;
    private javax.swing.JTable jtPrecos;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfLucro;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfPrecoCusto;
    private javax.swing.JTextField tfReferencia;
    private javax.swing.JTabbedPane tpProduto;
    // End of variables declaration//GEN-END:variables

    private void preencherTabelaDePrecos() {
        DefaultTableModel tb = (DefaultTableModel) jtPrecos.getModel();
        tb.setNumRows(0);
        listaTabelaProdutos = TabelaProdutoDAO.getInstance().listaTabelasPrecoProduto(pb.getProduto());
        try {
            for (TabelaProduto tab : listaTabelaProdutos) {
                tb.addRow(new Object[]{tab.getTabelaPreco().getNomeTabela(), new DecimalFormat("0.00").format(tab.getPrecoVenda())});
            }
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage());
        }
    }

    private void salvarPrecoDeVenda() throws Exception {
        listaPrecos = TabelaPrecoDAO.getInstance().listar(new TabelaPreco());
        for (TabelaPreco tp : listaPrecos) {
            tpb.getTabelaProduto().setPrecoVenda(0.00);
            tpb.getTabelaProduto().setProduto(pb.getProduto());
            tpb.getTabelaProduto().setTabelaPreco(tp);
            tpb.salvar();
            tpb = new TabelaProdutoBean();
        }
    }

    private void preencherTabelaProdutos() {
        DefaultTableModel tb = (DefaultTableModel) jtProdutos.getModel();
        tb.setNumRows(0);
        try {
            if (tfPesquisa.getText().isEmpty()) {
                listaProdutos = ProdutoDAO.getInstance().listaProdutosOrdenados(null);
            } else {
                listaProdutos = ProdutoDAO.getInstance().listaProdutosOrdenados(tfPesquisa.getText());
            }
            for (Produto ls : listaProdutos) {
                tb.addRow(new Object[]{ls.getCodigo(), ls.getDescricao(), ls.getReferencia(), ls.getTipo()});
            }
        } catch (Exception e) {
            e.printStackTrace();
            Alertas.mensagemErro(e.getMessage());
        }
    }

    private void novo() {
        pb = new ProdutoBean();
        tpb = new TabelaProdutoBean();
        DefaultTableModel tb = (DefaultTableModel) jtPrecos.getModel();
        tb.setNumRows(0);
        DefaultTableModel tb2 = (DefaultTableModel) jtEstoque.getModel();
        tb2.setNumRows(0);
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfLucro.setText("");
        tfPrecoCusto.setText("");
        tfReferencia.setText("");
        jcTipo.setSelectedIndex(0);
        jcUnidade.setSelectedIndex(0);

        preencherTabelaProdutos();
    }

    public void excluirTabelaPrecoProdutos() {
        for (TabelaProduto tp : listaTabelaProdutos) {
            tpb.setTabelaProduto(tp);
            tpb.excluir();
            tpb = new TabelaProdutoBean();
        }
    }

    public void salvarProdutoEstoque() throws CampoVazioException {
//        SetorBean s = new SetorBean();
//        s.getSetor().setCodigo(1L);
//        peb.getProdutoEstoque().setProduto(pb.getProduto());
//        peb.getProdutoEstoque().setSetor(s.getSetor());
//        peb.getProdutoEstoque().setQuantidade(0.0);
//        peb.salvar();
    }

    private void preencherTabelaEstoque() {
        if (pb.getProduto().getCodigo() != null) {
            DefaultTableModel tb = (DefaultTableModel) jtEstoque.getModel();
            tb.setNumRows(0);
            try {
                List<ProdutoEstoque> lista = ProdutoEstoqueDAO.getInstance().listar(pb.getProduto());
                for (ProdutoEstoque pe : lista) {
                    tb.addRow(new Object[]{pe.getSetor().getNomeSetor(), 
                        new DecimalFormat("0.0000").format(pe.getProduto().getPrecoCusto() * pe.getQuantidade()), pe.getQuantidade().toString().replace(".", ",")});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
