package br.com.cary.view;

import br.com.cary.bean.*;
import br.com.cary.dao.ProdutoDAO;
import br.com.cary.dao.SetorDAO;
import br.com.cary.entity.ProdutoEntrada;
import br.com.cary.entity.Setor;
import br.com.cary.exceptions.CampoVazioException;
import br.com.cary.exceptions.DataException;
import br.com.cary.exceptions.ProdutoExistenteException;
import br.com.cary.util.Validador;
import cary.utility.Alertas;
import cary.utility.Calculos;
import cary.utility.Mascaras;
import cary.utility.NovaData;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Reginaldo
 */
public class FormEntrada extends javax.swing.JDialog {

    private EntradaBean entBean;
    private FornecedorBean fb;
    private FuncionarioBean funcBean;
    private SetorBean setorBean;
    private ProdutoEntradaBean peb;
    private ProdutoEstoqueBean produtoEstoqueBean;
    private FornecedorPrecoCustoBean fpcb;
    private List<ProdutoEntrada> listaItens;
    private List<Setor> listaSetores;
    private boolean abrir;

    /**
     * Creates new form FormEntrada
     */
    public FormEntrada(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Entrada");
        entBean = new EntradaBean();
        fb = new FornecedorBean();
        funcBean = new FuncionarioBean();
        setorBean = new SetorBean();
        peb = new ProdutoEntradaBean();
        produtoEstoqueBean = new ProdutoEstoqueBean();
        fpcb = new FornecedorPrecoCustoBean();
        listaItens = new ArrayList<>();
        abrir = false;
        tfDataEntrada.setText(NovaData.getDataAtual());
        preencherSetores();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtItens = new javax.swing.JTable();
        tfCodigo = new javax.swing.JTextField();
        tfQuantidade = new javax.swing.JTextField();
        tfValorUnitario = new javax.swing.JTextField();
        tfValorTotal = new javax.swing.JTextField();
        tfDesconto = new javax.swing.JTextField();
        tfValorFinal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jbADD = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tfTotalEntrada = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        tfCodigoFornecedor = new javax.swing.JTextField();
        tfNomeFornecedor = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfFrete = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfCodigoFuncionario = new javax.swing.JTextField();
        tfNomeFuncionario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcSetor = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        tfNotaFiscal = new javax.swing.JTextField();
        tfMemorando = new javax.swing.JTextField();
        tfDataEntrada = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tfProduto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrada de Produtos");
        jLabel1.setOpaque(true);

        jtItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Item", "Produto", "Qtde", "Valor Unit.", "Valor Total", "Desconto", "Valor Final"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtItens);
        if (jtItens.getColumnModel().getColumnCount() > 0) {
            jtItens.getColumnModel().getColumn(0).setResizable(false);
            jtItens.getColumnModel().getColumn(1).setPreferredWidth(220);
            jtItens.getColumnModel().getColumn(2).setResizable(false);
            jtItens.getColumnModel().getColumn(3).setResizable(false);
            jtItens.getColumnModel().getColumn(4).setResizable(false);
            jtItens.getColumnModel().getColumn(5).setResizable(false);
            jtItens.getColumnModel().getColumn(6).setResizable(false);
        }

        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        tfCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCodigoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoKeyTyped(evt);
            }
        });

        tfQuantidade.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQuantidadeActionPerformed(evt);
            }
        });
        tfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuantidadeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfQuantidadeKeyTyped(evt);
            }
        });

        tfValorUnitario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfValorUnitario.setText("0,00");
        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });
        tfValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfValorUnitarioKeyTyped(evt);
            }
        });

        tfValorTotal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfValorTotal.setText("0,00");
        tfValorTotal.setFocusable(false);

        tfDesconto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfDesconto.setText("0,00");
        tfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescontoActionPerformed(evt);
            }
        });
        tfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDescontoKeyTyped(evt);
            }
        });

        tfValorFinal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfValorFinal.setText("0,00");
        tfValorFinal.setFocusable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Código");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Valor Unitário");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Valor Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Desconto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Valor Final");

        jbADD.setText("ADD");
        jbADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbADDActionPerformed(evt);
            }
        });

        jButton2.setText("RM");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfTotalEntrada.setBackground(new java.awt.Color(250, 250, 255));
        tfTotalEntrada.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tfTotalEntrada.setForeground(new java.awt.Color(0, 0, 255));
        tfTotalEntrada.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfTotalEntrada.setText("0,00");
        tfTotalEntrada.setFocusable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Fornecedor:");

        tfCodigoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoFornecedorActionPerformed(evt);
            }
        });
        tfCodigoFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoFornecedorKeyTyped(evt);
            }
        });

        tfNomeFornecedor.setFocusable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Frete:*");

        tfFrete.setText("0,00");
        tfFrete.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfFreteFocusLost(evt);
            }
        });
        tfFrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFreteActionPerformed(evt);
            }
        });
        tfFrete.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfFreteKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Funcionário:");

        tfCodigoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoFuncionarioActionPerformed(evt);
            }
        });
        tfCodigoFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCodigoFuncionarioKeyTyped(evt);
            }
        });

        tfNomeFuncionario.setFocusable(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Setor:");

        jcSetor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSetorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Nº Nota Fiscal");

        tfNotaFiscal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNotaFiscalActionPerformed(evt);
            }
        });

        try {
            tfDataEntrada.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Memorando*");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Data da Entrada*");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software-01.png"))); // NOI18N
        jButton3.setText(" Finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/cary/imagens/icones_software_Artboard 5.png"))); // NOI18N
        jButton4.setText(" Cancelar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tfProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tfProduto.setFocusable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbADD)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                                    .addComponent(tfTotalEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfProduto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNomeFornecedor)
                                    .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfFrete, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMemorando, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(tfDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfCodigo, tfDesconto, tfQuantidade, tfValorFinal, tfValorTotal, tfValorUnitario});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfCodigoFornecedor, tfCodigoFuncionario});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCodigoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tfFrete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfCodigoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jcSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbADD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTotalEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNotaFiscal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMemorando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDataEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jtItens.getSelectedRowCount() == 0) {
            Alertas.mensagemAviso("Selecione um item para removê-lo!");
        } else {
            int linha = jtItens.getSelectedRow();
            listaItens.remove(linha);
            preencherTabelaItens();
            calculaValorTotal();
        }
//        if (listaItens.size() == 0) {
//            tfCodigoFornecedor.setFocusable(true);
//            tfCodigoFuncionario.setFocusable(true);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        try {
            if (tfCodigo.getText().isEmpty()) {
                Alertas.mensagemAviso("Por favor escolha um produto!");
            } else {
                ProdutoBean p = new ProdutoBean();
                if (tfCodigo.getText().contains("*")) {
                    FormBuscaProduto formBuscaProd = new FormBuscaProduto(null, true);
                    formBuscaProd.setLocation(this.getX() + 12, this.getY() + 180);
                    formBuscaProd.setVisible(true);
                    if (formBuscaProd.status() == true) {
                        peb.getProdutoEntrada().setProduto(formBuscaProd.getProdutoBean().getProduto());
                        tfCodigo.setText(peb.getProdutoEntrada().getProduto().getCodigo().toString());
                    }
                } else {
                    p.getProduto().setCodigo(Long.parseLong(tfCodigo.getText()));
                    peb.getProdutoEntrada().setProduto(ProdutoDAO.getInstance().pesquisaProduto(p.getProduto()));
                }
                tfProduto.setText(peb.getProdutoEntrada().getProduto().getDescricao()+" - "+peb.getProdutoEntrada().getProduto().getUnidade());
                tfValorUnitario.setText(new DecimalFormat("0.0000").format(peb.getProdutoEntrada().getProduto().getPrecoCusto()));
                tfValorTotal.setText(new DecimalFormat("0.0000").format(peb.getProdutoEntrada().getProduto().getPrecoCusto()));
                tfValorFinal.setText(new DecimalFormat("0.0000").format(peb.getProdutoEntrada().getProduto().getPrecoCusto()));
                tfQuantidade.requestFocus();
            }
        } catch (NullPointerException e) {
            Alertas.mensagemAviso("Produto não encontrado!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQuantidadeActionPerformed
        if (!tfQuantidade.getText().isEmpty()) {
            double valorUnit = Double.parseDouble(tfValorUnitario.getText().replace(",", "."));
            double qnt = Double.parseDouble(tfQuantidade.getText().replace(",", "."));
            tfValorTotal.setText(new DecimalFormat("0.0000").format(Calculos.calculaPrecoTotal(valorUnit, qnt)));
            tfValorFinal.setText(new DecimalFormat("0.0000").format(Calculos.calculaPrecoTotal(valorUnit, qnt)));
            tfValorUnitario.requestFocus();
        }
    }//GEN-LAST:event_tfQuantidadeActionPerformed

    private void tfQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantidadeKeyReleased
        if (peb.getProdutoEntrada().getProduto().getUnidade().equals("UN")) {
            String aux = tfQuantidade.getText();
            if (aux.contains(",") || aux.contains(".")) {
                tfQuantidade.setText(aux.replace(",", "").replace(".", ""));
            }

        }
    }//GEN-LAST:event_tfQuantidadeKeyReleased

    private void tfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorUnitarioActionPerformed
        double valorUnit = Double.parseDouble(tfValorUnitario.getText().replace(",", "."));
        double qnt = Double.parseDouble(tfQuantidade.getText().replace(",", "."));
        tfValorTotal.setText(new DecimalFormat("0.0000").format(Calculos.calculaPrecoTotal(valorUnit, qnt)));
        tfValorFinal.setText(new DecimalFormat("0.0000").format(Calculos.calculaPrecoTotal(valorUnit, qnt)));
        tfValorUnitario.setText(new DecimalFormat("0.0000").format(valorUnit));
        tfDesconto.requestFocus();
        tfDesconto.selectAll();
    }//GEN-LAST:event_tfValorUnitarioActionPerformed

    private void tfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescontoActionPerformed
        if (!tfDesconto.getText().isEmpty()) {
            if (tfDesconto.getText().contains("%")) {
                double valorTotal = Double.parseDouble(tfValorTotal.getText().replace(",", "."));
                double porcentagem = Double.parseDouble(tfDesconto.getText().replace(",", ".").replace("%", ""));
                double valorFinal = Calculos.darDesconto(valorTotal, porcentagem);
                tfValorFinal.setText(new DecimalFormat("0.0000").format(valorFinal));
                tfDesconto.setText(Mascaras.formataDinheiro(valorTotal - valorFinal));
                jbADD.requestFocus();
            } else {
                double valorTotal = Double.parseDouble(tfValorTotal.getText().replace(",", "."));
                double desc = Double.parseDouble(tfDesconto.getText().replace(",", "."));
                tfValorFinal.setText(new DecimalFormat("0.0000").format(valorTotal - desc));
                tfDesconto.setText(Mascaras.formataDinheiro(desc));
                jbADD.requestFocus();
            }
        }
    }//GEN-LAST:event_tfDescontoActionPerformed

    private void jbADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbADDActionPerformed
//        if (listaItens.size() == 0) {
//            tfCodigoFornecedor.setFocusable(false);
//            tfCodigoFuncionario.setFocusable(false);
//        }
        double valorUnit = Double.parseDouble(tfValorUnitario.getText().replace(",", "."));
        double qnt = Double.parseDouble(tfQuantidade.getText().replace(",", "."));
        double valorTotal = Double.parseDouble(tfValorTotal.getText().replace(",", "."));
        double desc = Double.parseDouble(tfDesconto.getText().replace(",", "."));
        double valorFinal = Double.parseDouble(tfValorFinal.getText().replace(",", "."));
        peb.getProdutoEntrada().setQuantidade(qnt);
        peb.getProdutoEntrada().setValorUnitario(valorUnit);
        peb.getProdutoEntrada().setValorTotal(valorTotal);
        peb.getProdutoEntrada().setValorFinal(valorFinal);
        peb.getProdutoEntrada().setDesconto(desc);
        listaItens.add(peb.getProdutoEntrada());
        preencherTabelaItens();
        calculaValorTotal();
        peb = new ProdutoEntradaBean();
        tfCodigo.requestFocus();
        limpaCampos();
    }//GEN-LAST:event_jbADDActionPerformed

    private void tfCodigoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoFornecedorActionPerformed
        try {
            FormBuscaFornecedor fbusc = new FormBuscaFornecedor(null, true);
            fbusc.setLocation(this.getX() + 90, this.getY() + 80);
            fbusc.setVisible(true);
            if (fbusc.status() == true) {
                fb = fbusc.getForncedorBean();
                tfNomeFornecedor.setText(fb.getFornecedor().getNomeFantasia());
                tfCodigoFornecedor.setText(fb.getFornecedor().getCodigo().toString());
            }
        } catch (NullPointerException e) {
            Alertas.mensagemAviso(e.getMessage());
            tfCodigoFornecedor.setText("");
        }
    }//GEN-LAST:event_tfCodigoFornecedorActionPerformed

    private void tfCodigoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoFuncionarioActionPerformed
        try {
            FormBuscaFuncionario formBuscaFunc = new FormBuscaFuncionario(null, true);
            formBuscaFunc.setLocation(this.getX() + 90, this.getY() + 111);
            formBuscaFunc.setVisible(true);
            if (formBuscaFunc.status() == true) {
                funcBean = formBuscaFunc.getFuncionarioBean();
                tfCodigoFuncionario.setText(funcBean.getFuncionario().getCodigo().toString());
                tfNomeFuncionario.setText(funcBean.getFuncionario().getNome());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tfCodigoFuncionarioActionPerformed

    private void jcSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSetorActionPerformed
        if (abrir == true) {
            int index = jcSetor.getSelectedIndex();
            if (index == 0) {
                Alertas.mensagemAviso("Por favor selecione um setor!");
            } else {
                setorBean.setSetor(listaSetores.get(index - 1));
                //Alertas.mensagemConfirmacao(setorBean.getSetor().getNomeSetor());
            }
        }
    }//GEN-LAST:event_jcSetorActionPerformed

    private void tfFreteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfFreteFocusLost
        double valor = Double.parseDouble(tfFrete.getText().replace(",", "."));
        tfFrete.setText(Mascaras.formataDinheiro(valor));
    }//GEN-LAST:event_tfFreteFocusLost

    private void tfFreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFreteActionPerformed
        double valor = Double.parseDouble(tfFrete.getText().replace(",", "."));
        tfFrete.setText(Mascaras.formataDinheiro(valor));
    }//GEN-LAST:event_tfFreteActionPerformed

    private void tfDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDescontoKeyTyped
        String str = "0123456789,.%";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfDescontoKeyTyped

    private void tfValorUnitarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfValorUnitarioKeyTyped
        String str = "0123456789,.";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfValorUnitarioKeyTyped

    private void tfQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantidadeKeyTyped
        String str = "0123456789,.";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfQuantidadeKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (listaItens.size() == 0) {
            Alertas.mensagemAviso("Nenhum item lançado!");
        } else if (tfCodigoFornecedor.getText().isEmpty()) {
            Alertas.mensagemAviso("Selecione um fornecedor!");
            tfCodigoFornecedor.requestFocus();
        } else if (tfCodigoFuncionario.getText().isEmpty()) {
            Alertas.mensagemAviso("Selecione um funcionário!");
            tfCodigoFuncionario.requestFocus();
        } else if (setorBean.getSetor().getCodigo() == null) {
            Alertas.mensagemAviso("Selecione um setor!");
        } else if (tfFrete.getText().isEmpty() || tfNotaFiscal.getText().isEmpty()) {
            Alertas.mensagemAviso("Por favor, preencha os campos obrigatórios!");
        } else {
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente finalizar a entrada!", "Atenção", 0, 3, null);
            if (opcao == JOptionPane.YES_OPTION) {
                finalizarEntrada();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfFreteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfFreteKeyTyped
        String str = "0123456789,";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfFreteKeyTyped

    private void tfCodigoFornecedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoFornecedorKeyTyped
        String str = "";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoFornecedorKeyTyped

    private void tfCodigoFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoFuncionarioKeyTyped
        String str = "";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoFuncionarioKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated

    }//GEN-LAST:event_formWindowDeactivated

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            novaEntrada();
        }
    }//GEN-LAST:event_formKeyPressed

    private void tfCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyTyped
        String str = "0123456789*";
        if (!str.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCodigoKeyTyped

    private void tfCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F5) {
            novaEntrada();
        }
    }//GEN-LAST:event_tfCodigoKeyPressed

    private void tfNotaFiscalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNotaFiscalActionPerformed
        
    }//GEN-LAST:event_tfNotaFiscalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(entBean.getEntrada().getCodigo() == null) {
            Alertas.mensagemAviso("Nenhuma entrada finalizada!");
        } else {
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormEntrada dialog = new FormEntrada(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbADD;
    private javax.swing.JComboBox jcSetor;
    private javax.swing.JTable jtItens;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigoFornecedor;
    private javax.swing.JTextField tfCodigoFuncionario;
    private javax.swing.JFormattedTextField tfDataEntrada;
    private javax.swing.JTextField tfDesconto;
    private javax.swing.JTextField tfFrete;
    private javax.swing.JTextField tfMemorando;
    private javax.swing.JTextField tfNomeFornecedor;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfNotaFiscal;
    private javax.swing.JTextField tfProduto;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tfTotalEntrada;
    private javax.swing.JTextField tfValorFinal;
    private javax.swing.JTextField tfValorTotal;
    private javax.swing.JTextField tfValorUnitario;
    // End of variables declaration//GEN-END:variables

    private void preencherTabelaItens() {
        DefaultTableModel tb = (DefaultTableModel) jtItens.getModel();
        tb.setNumRows(0);
        try {
            int cont = 1;
            for (ProdutoEntrada pe : listaItens) {
                if (pe.getProduto().getUnidade().equals("UN")) {
                    tb.addRow(new Object[]{cont, pe.getProduto().getDescricao(), new DecimalFormat("0").format(pe.getQuantidade()),
                        new DecimalFormat("0.0000").format(pe.getValorUnitario()), new DecimalFormat("0.0000").format(pe.getValorTotal()),
                        new DecimalFormat("0.0000").format(pe.getDesconto()), new DecimalFormat("0.0000").format(pe.getValorFinal())});
                } else {
                    tb.addRow(new Object[]{cont, pe.getProduto().getDescricao(), new DecimalFormat("0.000").format(pe.getQuantidade()),
                        new DecimalFormat("0.0000").format(pe.getValorUnitario()), new DecimalFormat("0.0000").format(pe.getValorTotal()),
                        new DecimalFormat("0.0000").format(pe.getDesconto()), new DecimalFormat("0.0000").format(pe.getValorFinal())});
                }
                cont++;
            }
        } catch (Exception e) {
            Alertas.mensagemErro(e.getMessage());
            e.printStackTrace();
        }
    }

    private void calculaValorTotal() {
        double valor = 0.0;
        for (ProdutoEntrada p : listaItens) {
            valor += p.getValorFinal();
        }
        tfTotalEntrada.setText(new DecimalFormat("0.00").format(valor));
    }

    private void limpaCampos() {
        tfCodigo.setText("");
        tfQuantidade.setText("");
        tfValorUnitario.setText("0,00");
        tfValorTotal.setText("0,00");
        tfValorFinal.setText("0,00");
        tfDesconto.setText("0,00");
        tfProduto.setText("");
    }

    private void preencherSetores() {
        try {
            listaSetores = SetorDAO.getInstance().listar(new Setor());
            jcSetor.removeAllItems();
            jcSetor.addItem("Selecione um setor");
            for (Setor s : listaSetores) {
                jcSetor.addItem(s.getNomeSetor());
            }
            abrir = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void finalizarEntrada() {
        try {
            entBean.getEntrada().setFornecedor(fb.getFornecedor());
            entBean.getEntrada().setFuncionario(funcBean.getFuncionario());
            entBean.getEntrada().setSetor(setorBean.getSetor());
            entBean.getEntrada().setFrete(Double.parseDouble(tfFrete.getText().replace(",", ".")));
            entBean.getEntrada().setNotaFiscal(Long.parseLong(tfNotaFiscal.getText()));
            entBean.getEntrada().setMemorando(tfMemorando.getText());
            Validador.getInstance().validarData(tfDataEntrada.getText());
            entBean.getEntrada().setDataEntrada(NovaData.converterStringParaDate(tfDataEntrada.getText()));
            entBean.getEntrada().setValorTotal(Double.parseDouble(tfTotalEntrada.getText().replace(",", ".")));
            entBean.salvar();
            inserirNoEstoque();
            Alertas.mensagemConfirmacao("Entrada finalizada com sucesso!");
            new FormEntradaParcelamento(null, true, entBean).setVisible(true);
            tfCodigo.requestFocus();
        } catch (CampoVazioException | DataException e) {
            Alertas.mensagemAviso(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inserirNoEstoque() throws CampoVazioException, ProdutoExistenteException {
        for (ProdutoEntrada pent : listaItens) {
            //inseri os itens da entrada na tabela de produtos_entrada
            pent.setEntrada(entBean.getEntrada());
            peb.setProdutoEntrada(pent);
            peb.salvar();

            //atualiza o estoque dos produtos colocando-os no setor correspondente a entrada
            produtoEstoqueBean.getProdutoEstoque().setProduto(pent.getProduto());
            produtoEstoqueBean.getProdutoEstoque().setQuantidade(pent.getQuantidade());
            produtoEstoqueBean.getProdutoEstoque().setSetor(setorBean.getSetor());
            produtoEstoqueBean.atualizarEstoque();

            //inseri o preço de custo do produto para o fornecedor selecionado na entrada
            fpcb.getPrecoCusto().setFornecedor(fb.getFornecedor());
            fpcb.getPrecoCusto().setPreco(peb.getProdutoEntrada().getValorUnitario());
            fpcb.getPrecoCusto().setProduto(peb.getProdutoEntrada().getProduto());
            fpcb.cadastrar();

            //muda o preço de custo do produto
            ProdutoBean pb = new ProdutoBean();
            pb.setProduto(peb.getProdutoEntrada().getProduto());
            pb.getProduto().setPrecoCusto(peb.getProdutoEntrada().getValorUnitario());
            pb.editar();
            
            peb = new ProdutoEntradaBean();
            produtoEstoqueBean = new ProdutoEstoqueBean();
            fpcb = new FornecedorPrecoCustoBean();
        }
    }

    private void novaEntrada() {
        entBean = new EntradaBean();
        fb = new FornecedorBean();
        funcBean = new FuncionarioBean();
        setorBean = new SetorBean();
        peb = new ProdutoEntradaBean();
        produtoEstoqueBean = new ProdutoEstoqueBean();
        listaItens = new ArrayList<>();
        abrir = false;
        tfDataEntrada.setText(NovaData.getDataAtual());
        tfFrete.setText("0,00");
        preencherSetores();
        preencherTabelaItens();
        limpaCampos();
        calculaValorTotal();
        JTextField tf[] = new JTextField[]{tfCodigoFornecedor, tfCodigoFuncionario, tfNomeFornecedor, tfNomeFuncionario, tfNotaFiscal, tfMemorando};
        for (JTextField t : tf) {
            t.setText("");
        }
    }
}
