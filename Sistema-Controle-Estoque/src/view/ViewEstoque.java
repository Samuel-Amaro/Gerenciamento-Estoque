package view;

import controller.ControlerTblEstoque;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelEstoque;
import model.ModelProduto;
import model.ModelUsuario;

public class ViewEstoque extends javax.swing.JFrame {

    //variaveis essenciais
    private Font fonteExterna;
    private ControlerTblEstoque controlEstoque;
    private ModelEstoque estoque;
    private List<ModelProduto> produtos;
    private DefaultTableModel modeloTabelaMovimentacao;
    private List<ModelEstoque> listaEstoque;
    private ModelUsuario usuarioLogado;

    public ViewEstoque(ModelUsuario user) {
        //informações do usuario logado no sistema
        this.usuarioLogado = user;

        initComponents();
        //aplicando uma fonte externa no frame de gerencimaneto de estoque
        setFontExterna();
        //metodo que mostra as movimentações atualizadas de estoque que o usuario loagado faz
        this.carregaMovimentacoesEstoque();
        //mostra a descricao dos produtos cadastrados para o usuario
        this.listDescricaoProdutos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTipoMov = new javax.swing.JLabel();
        cbTipoMov = new javax.swing.JComboBox<>();
        lblDescricaoProd = new javax.swing.JLabel();
        cbDescriProd = new javax.swing.JComboBox<>();
        lblQtdProd = new javax.swing.JLabel();
        spQtd = new javax.swing.JSpinner();
        lblValorProd = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        lblPesqEstoque = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        lblFilterPesquisa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMostraMovimentacao = new javax.swing.JTable();
        btnSalvarMovim = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        gerarRelatorioMov = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movimentação Estoque");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(83, 100, 251));

        lblTipoMov.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTipoMov.setForeground(new java.awt.Color(250, 247, 70));
        lblTipoMov.setText("TIPO MOVIMENTAÇÃO");

        cbTipoMov.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENTRADA", "SAIDÁ" }));
        cbTipoMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoMovActionPerformed(evt);
            }
        });

        lblDescricaoProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDescricaoProd.setForeground(new java.awt.Color(250, 247, 70));
        lblDescricaoProd.setText("ESCOLHA PRODUTO ABAIXO PELA DESCRIÇÃO");

        cbDescriProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a Descrição Do Produto" }));

        lblQtdProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblQtdProd.setForeground(new java.awt.Color(250, 247, 70));
        lblQtdProd.setText("QUANTIDADE");

        spQtd.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        lblValorProd.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblValorProd.setForeground(new java.awt.Color(250, 247, 70));
        lblValorProd.setText("VALOR");

        lblPesqEstoque.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblPesqEstoque.setForeground(new java.awt.Color(250, 247, 70));
        lblPesqEstoque.setText("PESQUISA NO ESTOQUE");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFilterPesquisa.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblFilterPesquisa.setForeground(new java.awt.Color(250, 247, 70));
        lblFilterPesquisa.setText("ESCOLHA UM FILTRO ABAIXO");

        tabelaMostraMovimentacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Preço", "Produto", "Quantidade", "Movimentação", "Data", "User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMostraMovimentacao);
        if (tabelaMostraMovimentacao.getColumnModel().getColumnCount() > 0) {
            tabelaMostraMovimentacao.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabelaMostraMovimentacao.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabelaMostraMovimentacao.getColumnModel().getColumn(2).setPreferredWidth(5);
            tabelaMostraMovimentacao.getColumnModel().getColumn(3).setPreferredWidth(15);
            tabelaMostraMovimentacao.getColumnModel().getColumn(4).setPreferredWidth(15);
            tabelaMostraMovimentacao.getColumnModel().getColumn(5).setPreferredWidth(5);
        }

        btnSalvarMovim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-salva-estoque-botao.png"))); // NOI18N
        btnSalvarMovim.setText("Salvar Movimentação");
        btnSalvarMovim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarMovimActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/pesquisar-btn.png"))); // NOI18N

        gerarRelatorioMov.setText("Gerar Relatorio Estoque");
        gerarRelatorioMov.setPreferredSize(new java.awt.Dimension(64, 64));
        gerarRelatorioMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarRelatorioMovActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarMovim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblTipoMov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbTipoMov, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbDescriProd, 0, 400, Short.MAX_VALUE)
                            .addComponent(lblDescricaoProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQtdProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spQtd))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco)
                            .addComponent(lblValorProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblPesqEstoque))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblFilterPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gerarRelatorioMov, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoMov)
                    .addComponent(lblDescricaoProd)
                    .addComponent(lblQtdProd)
                    .addComponent(lblValorProd))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbDescriProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarMovim, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFilterPesquisa)
                            .addComponent(lblPesqEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(11, 11, 11)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gerarRelatorioMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(824, 629));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gerarRelatorioMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarRelatorioMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gerarRelatorioMovActionPerformed

    private void cbTipoMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoMovActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoMovActionPerformed

    private void btnSalvarMovimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarMovimActionPerformed
        this.controlEstoque = new ControlerTblEstoque();
        this.estoque = new ModelEstoque();
        this.estoque.setQuantidade((int) this.spQtd.getModel().getValue());
        //o preço quando usuario digita e um string texto tem que converte para o tipo double
        try {
            this.estoque.setPreco(Double.parseDouble(this.txtPreco.getText()));  //indice comboBox - indice mov | 0 = entrada | 1 = saida
        } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this,"PREENCHA O CAMPO PREÇO CORRETAMENTE","PRENCHER CAMPOS OBRIGATORIOS",JOptionPane.WARNING_MESSAGE);
        }
        //obtendo o tipo de movimentação de um jcBox
        this.estoque.setTipo_movimentacao(this.cbTipoMov.getSelectedIndex());
        //obtendo descrição do produto selecionado no jcBox
        String descr = String.valueOf(this.cbDescriProd.getSelectedItem());
        //obtendo id do usuario logado 
        this.estoque.setFk_usuario(this.usuarioLogado.getCodigoId());
        int idProduto = -1;
        //obtendo id do produto atraves da decrição(onde usuario escolheu). percorrendo o array list onde esta armazenado todos objetos produtos;
        for (int i = 0; i < produtos.size(); i++) {
            ModelProduto produto = produtos.get(i);
            if(produto.getDescricaoProduto().equals(descr)) {
               idProduto = produto.getIdProduto();
            }
        }
        this.estoque.setFk_produto(idProduto);
        if (this.controlEstoque.controlerAddMovEstoque(estoque)) {
            JOptionPane.showMessageDialog(this, "MOVIMENTAÇÃO NO ESTOQUE EFETUADA COM SUCESSO", "MOVIMENTAÇÃO ESTOQUE", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"PREENCHA OS CAMPOS CORRETAMENTE","MOVIMENTAÇÃO ESTOQUE",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarMovimActionPerformed

/**
 * metodo que popula um jcomb box com a descrição de todos os produtos
 * cadastrados no sistema;
 */
private void listDescricaoProdutos() {
        produtos = new ArrayList<>();
        this.controlEstoque = new ControlerTblEstoque();
        produtos = this.controlEstoque.controlerGetDescricaoProdutos();
        for (int i = 0; i < produtos.size(); i++) {
            Object objetoDescricao = produtos.get(i).getDescricaoProduto();
            this.cbDescriProd.addItem(objetoDescricao.toString());
        }
    }

    /**
     * Metodo que seta uma fonte externa no frame por completo, nos componentes
     * e tudo que ele agrupa; Fonte externa usada nesse frame de movimentação de
     * estoque: PlayfairDisplay-ExtraBold.ttf
     */
    private void setFontExterna() {
        try {
            //carregando a fonte de destaque
            fonteExterna = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/PlayfairDisplay-ExtraBold.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela do gerenciamento de estoque! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        //setando fonte padrão nas labels
        lblTipoMov.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblValorProd.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblQtdProd.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblPesqEstoque.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblFilterPesquisa.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblDescricaoProd.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        //setando fonte padrão nos botoes
        btnSalvarMovim.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        gerarRelatorioMov.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fonteExterna);
        this.setFont(fonteExterna);
    }

    /**
     * Metdo que vai carrega automaticamente as movimentações de estoque do
     * usuario logado no sistema; e mostra toda essas movimentações para o
     * usuario;
     */
    private void carregaMovimentacoesEstoque() {
        //adiconando um modelo de tabela a que esta aparacendo na viewEstoque
        this.modeloTabelaMovimentacao = (DefaultTableModel) this.tabelaMostraMovimentacao.getModel();
        //a tabela se inicializa com 0 linhas
        this.modeloTabelaMovimentacao.setNumRows(0);
        this.listaEstoque = new ArrayList<>();
        this.controlEstoque = new ControlerTblEstoque();
        this.estoque = new ModelEstoque();
        this.listaEstoque = this.controlEstoque.controlerGetEstoques(usuarioLogado);
        String entr = "entrada";
        String said = "saida";
        //populando a tabela com da view estoque com os itens do array list que e cada movimentação do estoque
        for (int i = 0; i < listaEstoque.size(); i++) {
            //de acordo com o tipo de movimentação eu mudo um dado na tabela na coluna movimentação para mostra uma string ao invez de um inteiro
            int mov = this.listaEstoque.get(i).getTipo_movimentacao(); //obtendo a movimentação
            //movimentação de entrada
            if (mov == 0) {
                //add linha na tabela que mostra as movimentalçoes de estoque que o usuario fez assi mostra todas moviemntações automaticas e atualiadas
                this.modeloTabelaMovimentacao.addRow(new Object[]{
                    this.listaEstoque.get(i).getPreco(), //coluna 0
                    this.listaEstoque.get(i).getFk_produto(), //coluna 1
                    this.listaEstoque.get(i).getQuantidade(), //coluna 2
                    entr, //coluna 3
                    this.listaEstoque.get(i).getDataMovimentacao(), //coluna 4
                    this.listaEstoque.get(i).getFk_usuario() //coluna 5
                });
            } else {
                      //add um linha na tabela com dados de movimentação de estoque que ele mesmo movimentou, add no formato de um obejto json
                      //moviemntação de saida
                      this.modeloTabelaMovimentacao.addRow(new Object[]{
                           this.listaEstoque.get(i).getPreco(),
                           this.listaEstoque.get(i).getFk_produto(),
                           this.listaEstoque.get(i).getQuantidade(),
                           said,
                           this.listaEstoque.get(i).getDataMovimentacao(),
                           this.listaEstoque.get(i).getFk_usuario()
                      });
                }

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarMovim;
    private javax.swing.JComboBox<String> cbDescriProd;
    private javax.swing.JComboBox<String> cbTipoMov;
    private javax.swing.JButton gerarRelatorioMov;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lblDescricaoProd;
    private javax.swing.JLabel lblFilterPesquisa;
    private javax.swing.JLabel lblPesqEstoque;
    private javax.swing.JLabel lblQtdProd;
    private javax.swing.JLabel lblTipoMov;
    private javax.swing.JLabel lblValorProd;
    private javax.swing.JSpinner spQtd;
    private javax.swing.JTable tabelaMostraMovimentacao;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
