/**
 * Copyright (C) <2020>  <name of Samuel Amaro>

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

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
import model.ModelUsuario;
import utiuls.FormatadorDados;

public class ViewProduto extends javax.swing.JFrame {

    //variaveis necessarias
    private Font spectral = null;
    private ModelProduto produto;
    private ControlerTblProduto controlaProduto;
    private DefaultTableModel tblModeloPadrao;
    private List<ModelProduto> listaProdutos;
    private String controlaOpcaoUsuario = "";
    private ModelUsuario userLogado = new ModelUsuario();

    public ViewProduto(ModelUsuario user) {
        //usuario logado no sistema
        this.userLogado = user;
        //inicia componentes graficos no frame
        initComponents();
        //metodo abaixo seta uma fonte externa padrão no frame
        setFonteExterna();
        // setMensagemObs();
        //mostra produtos ja cadastrados no banco de dados
        listaProdutosTbl();
        this.controlaOpcaoUsuario = "CADASTRAR";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteinerAgrupaElementosFrame = new javax.swing.JPanel();
        lblCodigoId = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        txtCodigoIdProduto = new javax.swing.JTextField();
        txtDescricaoProduto = new javax.swing.JTextField();
        txtValorProduto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostraProdutos = new javax.swing.JTable();
        conteinerAgrupaButtons = new javax.swing.JPanel();
        btnSalvarProduto = new javax.swing.JButton();
        btnLimpaCampos = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnVoltarView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manipulação de Produtos");
        setResizable(false);

        conteinerAgrupaElementosFrame.setBackground(new java.awt.Color(183, 183, 183));

        lblCodigoId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCodigoId.setText("CÓDIGO");

        lblDescricaoProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblDescricaoProduto.setText("DESCRIÇÃO PRODUTO *");

        lblValorProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblValorProduto.setText("VALOR *");

        txtCodigoIdProduto.setEditable(false);

        tblMostraProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "DESCRIÇÃO PRODUTO", "VALOR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
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
        }

        conteinerAgrupaButtons.setBackground(new java.awt.Color(102, 102, 102));

        btnSalvarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-salvar-btn-produto.png"))); // NOI18N
        btnSalvarProduto.setText("SALVAR PRODUTO");
        btnSalvarProduto.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnLimpaCampos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimpaCampos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-limpeza-btn-produto.png"))); // NOI18N
        btnLimpaCampos.setText("LIMPAR");
        btnLimpaCampos.setPreferredSize(new java.awt.Dimension(48, 48));
        btnLimpaCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaCamposActionPerformed(evt);
            }
        });

        btnAlterarProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-alterar-produ-btn.png"))); // NOI18N
        btnAlterarProduto.setText("ALTERAR");
        btnAlterarProduto.setPreferredSize(new java.awt.Dimension(48, 48));
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-deletar-product-btn-produto.png"))); // NOI18N
        btnExcluirProduto.setText("EXCLUIR");
        btnExcluirProduto.setPreferredSize(new java.awt.Dimension(48, 48));
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerAgrupaButtonsLayout = new javax.swing.GroupLayout(conteinerAgrupaButtons);
        conteinerAgrupaButtons.setLayout(conteinerAgrupaButtonsLayout);
        conteinerAgrupaButtonsLayout.setHorizontalGroup(
            conteinerAgrupaButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerAgrupaButtonsLayout.createSequentialGroup()
                .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        conteinerAgrupaButtonsLayout.setVerticalGroup(
            conteinerAgrupaButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSalvarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnLimpaCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(conteinerAgrupaButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVoltarView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-voltar-view.png"))); // NOI18N
        btnVoltarView.setPreferredSize(new java.awt.Dimension(32, 32));
        btnVoltarView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerAgrupaElementosFrameLayout = new javax.swing.GroupLayout(conteinerAgrupaElementosFrame);
        conteinerAgrupaElementosFrame.setLayout(conteinerAgrupaElementosFrameLayout);
        conteinerAgrupaElementosFrameLayout.setHorizontalGroup(
            conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 852, Short.MAX_VALUE)
                    .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                        .addComponent(lblCodigoId)
                        .addGap(18, 18, 18)
                        .addComponent(lblDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblValorProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                        .addComponent(txtCodigoIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtValorProduto))
                    .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conteinerAgrupaButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(btnVoltarView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        conteinerAgrupaElementosFrameLayout.setVerticalGroup(
            conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerAgrupaElementosFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltarView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoId)
                    .addComponent(lblDescricaoProduto)
                    .addComponent(lblValorProduto))
                .addGap(18, 18, 18)
                .addGroup(conteinerAgrupaElementosFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigoIdProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(txtDescricaoProduto)
                    .addComponent(txtValorProduto))
                .addGap(18, 18, 18)
                .addComponent(conteinerAgrupaButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteinerAgrupaElementosFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteinerAgrupaElementosFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(888, 635));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //ao clicar no botão vai salvar um produto no banco de dados
    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        //opções que devo verificar no btn salvar
        switch (this.controlaOpcaoUsuario) {
            //cadastrando um produto
            case "CADASTRAR":
                //se os campos obrigatorios estiverem vazios
                if (this.txtDescricaoProduto.getText().isEmpty() || this.txtValorProduto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Para cadastrar um Produto Prencha os campos obrigatorios", "Falha ao Cadastrar", JOptionPane.WARNING_MESSAGE);
                } else {
                    //se todos campos estiver preenchido
                    this.controlaProduto = new ControlerTblProduto();
                    this.produto = new ModelProduto();
                    this.produto.setDescricaoProduto(this.txtDescricaoProduto.getText()); //descrição produto
                    //trata a conversão de uma string vazia para um valor
                    try {
                        FormatadorDados f = new FormatadorDados();
                        this.produto.setValorProduto(f.formataValor(this.txtValorProduto.getText())); //valor do produto     
                    } catch (NumberFormatException e) {
                        //se a string for vazia passo um valor 0 para as quantidades
                        this.produto.setValorProduto(0);//valor do produto
                        System.out.println("O campor valor do produto não pode ficar vazio!: " + e);
                    }
                    this.controlaProduto = new ControlerTblProduto();
                    if (this.controlaProduto.controlerCadastraProduto(produto)) {
                        JOptionPane.showMessageDialog(this, "Produto Cadastrado Com Sucesso", "Sucesso Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        listaProdutosTbl();
                        limpaCamposView();
                    } else {
                        JOptionPane.showMessageDialog(this, "Produto Não Cadastrado\n Preencha os Campos Corretamente!", "Erro no Cadastro", JOptionPane.ERROR_MESSAGE);
                        limpaCamposView();
                    }
                }
                break;
            //alterando um produto    
            case "ALTERAR":
                //campos obrigatorios vazios não atualiza
                if (this.txtDescricaoProduto.getText().isEmpty() || this.txtValorProduto.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Para Alterar um Produto Prencha os campos obrigatorios", "Falha ao Atualizar", JOptionPane.WARNING_MESSAGE);
                } else {
                    //todos campos possui dados
                    this.produto = new ModelProduto();
                    this.controlaProduto = new ControlerTblProduto();
                    this.produto.setDescricaoProduto(this.txtDescricaoProduto.getText()); //descrição produto
                    try {
                        this.produto.setIdProduto(Integer.parseInt(this.txtCodigoIdProduto.getText()));
                        FormatadorDados f = new FormatadorDados();
                        this.produto.setValorProduto(f.formataValor(this.txtValorProduto.getText())); //valor do produto     
                    } catch (NumberFormatException e) {
                        //se a string for vazia passo um valor 0 para as quantidades
                        this.produto.setValorProduto(0);//valor do produto
                        System.out.println("O campor valor do produto não pode ficar vazio!: " + e);
                    }
                    if (this.controlaProduto.controlerAtualizaProduto(this.produto)) {
                        JOptionPane.showMessageDialog(this, "Atualização Ocorrida Com Sucesso", "Sucesso Atualição", JOptionPane.INFORMATION_MESSAGE);
                        limpaCamposView();
                        listaProdutosTbl();
                        this.controlaOpcaoUsuario = "CADASTRAR";
                    } else {
                        limpaCamposView();
                        JOptionPane.showMessageDialog(this, "Falha ao Atualizar Produto", "Erro Atualização", JOptionPane.ERROR_MESSAGE);
                        this.controlaOpcaoUsuario = "CADASTRAR";
                    }

                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Opção Invalida", "Opção Invalida", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    /**
     * altera um produto
     *
     * @param evt
     */
    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        //obtendo o codigo do produto atraves da linha selecionada da tabela
        int linhaSelecionada, ColunaIdTabela = 0, codigoProduto;
        linhaSelecionada = this.tblMostraProdutos.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Para poder Alterar Informações de Um Produto,\n Selecione Um Produto Listado na Tabela!", "Erro ALTERAÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            //obtendo codigo do produto
            codigoProduto = (int) this.tblMostraProdutos.getValueAt(linhaSelecionada, ColunaIdTabela);
            //buscando informações do produto na tbl_produto do banco de dados
            this.produto = new ModelProduto();
            this.controlaProduto = new ControlerTblProduto();
            this.produto = this.controlaProduto.controlerGetProduto(codigoProduto);
            //setando os dados do produto nos campos da view
            if (this.produto != null) {
                this.txtCodigoIdProduto.setText(String.valueOf(this.produto.getIdProduto()));
                this.txtDescricaoProduto.setText(this.produto.getDescricaoProduto());
                this.txtValorProduto.setText(String.valueOf(this.produto.getValorProduto()));
                this.controlaOpcaoUsuario = "ALTERAR";
            } else {
                //produto não existe na tbl_produto
                this.txtCodigoIdProduto.setText("Sem Codigo");
                this.txtDescricaoProduto.setText("Não Possui Descrição");
                this.txtValorProduto.setText("Não Possui Valor");
            }
        }
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed
    /**
     * Ao usuario clicar nese botão vai excluir um produto cadastrado;
     *
     * @param evt
     */
    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // COMO SABER QUAL PRODUTO VOU EXCLUIR ?
        // APOS USUARIO SELECIONAR UM LINHA DA JTABLE ONDE TEM UM PRODUTO CADASTRADO
        //OBTENDO LINHA SELECIONADA
        int linhaSelecionada = this.tblMostraProdutos.getSelectedRow();
        //se a linha for negativa selecionou nenhuma linha 
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "SELECIONE UM PRODUTO PARA SER EXCLUIDO", "EXCLUSÃO PRODUTO", JOptionPane.ERROR_MESSAGE);
        } else {
            //se o usuario selecionou uma linha na tabela, eu vou pegar os dados das colunas que essa linha possui, na tabela
            //a tabela possui 3 colunas | CODIGO == 0,DESCRIÇÃO PRODUTO == 1, VALOR == 2 | AS COLUNAS ESTÃO INDEXADAS, PARA PODEREM SER ACESSADAS, essas colunas estão  visualmente faceis de ver na View
            int colunaCodigo = 0, colunaDescricaoProduto = 1, colunaValor = 2;
            //obtendo valor da linha selecionada, e coluna que o programador informa para obter o valor especifico que deseja
            int codigoProduto = (int) this.tblMostraProdutos.getValueAt(linhaSelecionada, colunaCodigo);
            //chamando metodo de excluir produto
            this.controlaProduto = new ControlerTblProduto();
            if (this.controlaProduto.controlerExcluirProduto(codigoProduto)) {
                JOptionPane.showMessageDialog(this, "Exclusão de produto ocorrida com sucesso!", "EXLUIR PRODUTO", JOptionPane.INFORMATION_MESSAGE);
                //mostra a tabela da view atualizada 
                this.listaProdutosTbl();
            } else {
                JOptionPane.showMessageDialog(this, "Ocorreu um erro ao excluir produto!", "EXLUIR PRODUTO", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    /**
     * Metodo que recebe uma ação de clique em um botão, e ao usuario clicar,
     * vai voltar para a tela principal do sistema, com, informações do usuario
     * logado;
     *
     * @param evt
     */
    private void btnVoltarViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarViewActionPerformed
        //chamando a tela principal
        ViewPrincipalResponsiva p = new ViewPrincipalResponsiva(this.userLogado);
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarViewActionPerformed

    /**
     * Ao usuario clicar nesse botão, ele vai limpar as caixas de texto, e a
     * tabela de protudos na view;
     *
     * @param evt
     */
    private void btnLimpaCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaCamposActionPerformed
        //limpando os campos do formulario
        this.limpaCamposView();
        //limpando a tabela
        this.tblModeloPadrao.setNumRows(0);
    }//GEN-LAST:event_btnLimpaCamposActionPerformed

    /**
     * Metodo que vai listar produtos cadastrados no banco de dados,na tabela da
     * view Produto, vai listar os produtos do banco de dados na tabela, da
     * interface da View Produto;
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
        for (int indice = 0; indice < this.listaProdutos.size(); indice += 1) {
            //lembrando que as colunas da tabela que esta na view são indexadas
            this.tblModeloPadrao.addRow(new Object[]{
                this.listaProdutos.get(indice).getIdProduto(), //seta id produto na coluna id da tabela | coluna == 0
                this.listaProdutos.get(indice).getDescricaoProduto(), //seta descrição produto na coluna descrição | coluna == 1
                this.listaProdutos.get(indice).getValorProduto() //seta valor do produto na coluna produto da tabela | coluna == 2
            });
            //coloca o simbolo de R$ na coluna onde fica o valor do produto e concatena com o valor do produto, usando a indexação de colunas, e setando
            //umas linhas na tabela em uma so coluna a de valor do produto
            this.tblModeloPadrao.setValueAt("R$ " + this.listaProdutos.get(indice).getValorProduto(), indice, 2);
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
        this.lblValorProduto.setFont(spectral.deriveFont(Font.PLAIN, 18)); //valorProduto
        // this.lblMensagemObs.setFont(spectral.deriveFont(Font.PLAIN, 18)); //mensagemObs
        //setando a fonte nos botoes - estilo(constante e simples) tamanho(18)
        btnSalvarProduto.setFont(spectral.deriveFont(Font.PLAIN, 16)); //botão salvar produto - tem tamanho maio para ter um destque
        btnLimpaCampos.setFont(spectral.deriveFont(Font.PLAIN, 16)); //botão limpar componentes do formulario
        btnAlterarProduto.setFont(spectral.deriveFont(Font.PLAIN, 16)); //botão de alterar cadastro de um produto
        btnExcluirProduto.setFont(spectral.deriveFont(Font.PLAIN, 16)); //botão de excluir cadastro de um produto
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(spectral);
        this.setFont(spectral);
    }

    /**
     * Metodo que vai setar uma mensagem automatica de aviso em uma label; a
     * mensagem vai ser embutida em um html5 Puro, para criar uma formatação na
     * mensagem;
     */
    /*  private void setMensagemObs() {
        this.lblMensagemObs.setText("<html><body>"
                + "<p align =\"center\">"
                + "Campos Marcados Com (*) São de Pre-Enchimento "
                + "Obrigatório Para Prosseguir Com Sua Ação!"
                + "</p>"
                + "</body></html>");
    }*/
    /**
     * Metodo que limpa campos do formulario, apos uma ação que deixou os campos
     * com varios dados;
     */
    private void limpaCamposView() {
        this.txtCodigoIdProduto.setText(null);
        this.txtDescricaoProduto.setText(null);
        this.txtValorProduto.setText(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpaCampos;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JButton btnVoltarView;
    private javax.swing.JPanel conteinerAgrupaButtons;
    private javax.swing.JPanel conteinerAgrupaElementosFrame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigoId;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblValorProduto;
    private javax.swing.JTable tblMostraProdutos;
    private javax.swing.JTextField txtCodigoIdProduto;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables
}
