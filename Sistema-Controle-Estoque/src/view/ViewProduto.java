package view;

import controller.ControlerTblProduto;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.ModelProduto;

public class ViewProduto extends javax.swing.JFrame {

    //variaveis necessarias
    Font spectral = null;
    ModelProduto produto;
    ControlerTblProduto controlaProduto;
    DefaultTableModel tblModeloPadrao;
    List<ModelProduto> listaProdutos;
    
    public ViewProduto() {
        initComponents();
        //metodo abaixo seta uma fonte externa padrão no frame
        setFonteExterna();
        setMensagemObs();
        //mostra produtos ja cadastrados no banco de dados
        listaProdutosTbl();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigoId = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        txtCodigoIdProduto = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        txtQuantidadeProduto = new javax.swing.JTextField();
        txtValorProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostraProdutos = new javax.swing.JTable();
        btnLimpaCampos = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        lblMensagemObs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manipulação de Produtos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 10, 102));

        lblCodigoId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCodigoId.setForeground(new java.awt.Color(179, 149, 45));
        lblCodigoId.setText("CÓDIGO");

        lblDescricaoProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDescricaoProduto.setForeground(new java.awt.Color(179, 149, 45));
        lblDescricaoProduto.setText("DESCRIÇÃO PRODUTO *");

        lblQuantidadeProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblQuantidadeProduto.setForeground(new java.awt.Color(179, 149, 45));
        lblQuantidadeProduto.setText("QUANTIDADE");

        lblValorProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblValorProduto.setForeground(new java.awt.Color(179, 149, 45));
        lblValorProduto.setText("VALOR *");

        btnSalvarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvarProduto.setForeground(new java.awt.Color(179, 149, 45));
        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-salvar-btn-produto.png"))); // NOI18N
        btnSalvarProduto.setText("SALVAR");
        btnSalvarProduto.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        tblMostraProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO PRODUTO", "QUANTIDADE", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMostraProdutos);
        if (tblMostraProdutos.getColumnModel().getColumnCount() > 0) {
            tblMostraProdutos.getColumnModel().getColumn(0).setMinWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(0).setMaxWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(2).setMinWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(2).setMaxWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(3).setMinWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblMostraProdutos.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        btnLimpaCampos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimpaCampos.setForeground(new java.awt.Color(179, 149, 45));
        btnLimpaCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-limpeza-btn-produto.png"))); // NOI18N
        btnLimpaCampos.setText("LIMPAR");
        btnLimpaCampos.setPreferredSize(new java.awt.Dimension(48, 48));

        btnAlterarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAlterarProduto.setForeground(new java.awt.Color(179, 149, 45));
        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-alterar-produ-btn.png"))); // NOI18N
        btnAlterarProduto.setText("ALTERAR");
        btnAlterarProduto.setPreferredSize(new java.awt.Dimension(48, 48));

        btnExcluirProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(179, 149, 45));
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-deletar-product-btn-produto.png"))); // NOI18N
        btnExcluirProduto.setText("EXCLUIR");
        btnExcluirProduto.setPreferredSize(new java.awt.Dimension(48, 48));

        lblMensagemObs.setForeground(new java.awt.Color(179, 149, 45));
        lblMensagemObs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigoIdProduto)
                            .addComponent(lblCodigoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(lblDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lblQuantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValorProduto)
                            .addComponent(lblValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimpaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMensagemObs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoId)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(lblQuantidadeProduto)
                    .addComponent(lblValorProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMensagemObs, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
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

        setSize(new java.awt.Dimension(812, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ao clicar no botão vai salvar um produto no banco de dados
    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
      this.produto = new ModelProduto();
      this.produto.setDescricaoProduto(this.txtDescricaoProduto.getText()); //descrição produto
      //trata a conversão de uma string vazia para um valor
      try {
            this.produto.setQuantidadeProduto(Integer.parseInt(this.txtQuantidadeProduto.getText())); //quantidade produto
            this.produto.setValorProduto(Double.parseDouble(this.txtValorProduto.getText())); //valor do produto     
        } catch (NumberFormatException e) {
              //se a string for vazia passo um valor 0 para as quantidades
              this.produto.setQuantidadeProduto(0); //quantidade produto
              this.produto.setValorProduto(0);//valor do produto
        }
      this.controlaProduto = new ControlerTblProduto();
      if(this.controlaProduto.controlerCadastraProduto(produto)) {
          JOptionPane.showMessageDialog(this,"Produto Cadastrado Com Sucesso","Sucesso Cadastro",JOptionPane.INFORMATION_MESSAGE);
          listaProdutosTbl();
          limpaCamposView();
      }else{
          JOptionPane.showMessageDialog(this,"Produto Não Cadastrado\n Preencha os Campos Corretamente!","Erro no Cadastro",JOptionPane.ERROR_MESSAGE);
          limpaCamposView();
      }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    /**
     * Metodo que vai listar produtos cadastrados no banco de dados,na tabela da view Produto, vai listar os produtos do banco de dados na tabela,
     * da interface da View Produto;
     */
    private void listaProdutosTbl() {
      //POR SER UMA TABELA QUE VAI MOSTRAR SO TEXTO, NÃO PRECISA SER UMA TABELA DE MODELO MUITO PERSONALIZADO, UMA TABELA PADRÃO JA BASTA  
      this.tblModeloPadrao = (DefaultTableModel) this.tblMostraProdutos.getModel();
      //inicializa a tabela com 0 linhas
      this.tblModeloPadrao.setNumRows(0);
      this.produto = new ModelProduto();
      this.listaProdutos = new ArrayList<>();
      this.controlaProduto = new ControlerTblProduto();
      this.listaProdutos = this.controlaProduto.controlerGetListaProdutos();
      //vai percorre a lista de objetos, acessando objeto por objeto, e adiconaodo cada dado de um obejto nas colunas, prenchendo uma linha completa com
      //dados de objeto
      for(int indice = 0; indice < this.listaProdutos.size(); indice += 1) {
          //lembrando que as colunas da tabela que esta na view são indexadas
          this.tblModeloPadrao.addRow(new Object[] {
            this.listaProdutos.get(indice).getIdProduto(), //seta id produto na coluna id da tabela | coluna == 0
            this.listaProdutos.get(indice).getDescricaoProduto(), //seta descrição produto na coluna descrição | coluna == 1
            this.listaProdutos.get(indice).getQuantidadeProduto(), //seta quantidade do produto na coluna quantidade | coluna == 2
            this.listaProdutos.get(indice).getValorProduto() //seta valor do produto na coluna produto da tabela | coluna == 3
            });
            //coloca o simbolo de R$ na coluna onde fica o valor do produto e concatena com o valor do produto, usando a indexação de colunas, e setando
            //umas linhas na tabela em uma so coluna a de valor do produto
            this.tblModeloPadrao.setValueAt("R$ " + this.listaProdutos.get(indice).getValorProduto(),indice,3);
      }
    }
    
    
    
    
    
    
    
    /**
     * Metodo que vai setar uma fonte externa no frame de produtos; Fonte padrão
     * do frame = Spectral-Bold.ttf;
     */
    private void setFonteExterna() {
        //caregando a fonte padrão do frame produtos
        try {
            spectral = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/Spectral-Bold.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela de produtos! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        //setando a fonte nos labels dos campos - estilo(constante e simples) tamanho(18)
        this.lblCodigoId.setFont(spectral.deriveFont(Font.PLAIN, 18)); //codigoId
        this.lblDescricaoProduto.setFont(spectral.deriveFont(Font.PLAIN, 18)); //descriçãoProduto
        this.lblQuantidadeProduto.setFont(spectral.deriveFont(Font.PLAIN, 18)); //quantidadeProduto
        this.lblValorProduto.setFont(spectral.deriveFont(Font.PLAIN, 18)); //valorProduto
        this.lblMensagemObs.setFont(spectral.deriveFont(Font.PLAIN,18)); //mensagemObs
        //setando a fonte nos botoes - estilo(constante e simples) tamanho(18)
        btnSalvarProduto.setFont(spectral.deriveFont(Font.PLAIN,20)); //botão salvar produto - tem tamanho maio para ter um destque
        btnLimpaCampos.setFont(spectral.deriveFont(Font.PLAIN,18)); //botão limpar componentes do formulario
        btnAlterarProduto.setFont(spectral.deriveFont(Font.PLAIN,18)); //botão de alterar cadastro de um produto
        btnExcluirProduto.setFont(spectral.deriveFont(Font.PLAIN,18)); //botão de excluir cadastro de um produto
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(spectral);
        this.setFont(spectral);
    }
    /**
     * Metodo que vai setar uma mensagem automatica de aviso em uma label;
     * a mensagem vai ser embutida em um html5 Puro, para criar uma formatação na mensagem;
     */
    private void setMensagemObs() {
      this.lblMensagemObs.setText("<html><body>"
                                + "<p align =\"center\">"
                                + "Campos Marcados Com (*) São de Pre-Enchimento "
                                + "Obrigatório Para Prosseguir Com Sua Ação!"
                                + "</p>"
                                + "</body></html>");
    }
    /**
     * Metodo que limpa campos do formulario, apos uma ação que deixou os campos com varios dados; 
     */
    private void limpaCamposView() {
     this.txtCodigoIdProduto.setText(null);
     this.txtDescricaoProduto.setText(null);
     this.txtQuantidadeProduto.setText(null);
     this.txtValorProduto.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpaCampos;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoId;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblMensagemObs;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JTable tblMostraProdutos;
    private javax.swing.JTextField txtCodigoIdProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtQuantidadeProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
