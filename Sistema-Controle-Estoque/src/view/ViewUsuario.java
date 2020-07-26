package view;

import controller.ControllerUsuario;
import dao.DAOUsuario;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelUsuario;

/*
     * Tela De Manipulação de Usuarios.
     * onde pode cadastrar, alterar, excluir usuarios, que vão ter acessos ao sistema.
 */
public class ViewUsuario extends javax.swing.JFrame {

    //variaveis essenciais
    ModelUsuario userGlobal = new ModelUsuario();
    List<ModelUsuario> listaUsuarios = new ArrayList<ModelUsuario>();
    ControllerUsuario cp = new ControllerUsuario();
    DefaultTableModel tblModeloPadrao;
    Font fonteExterna = null;
    //variavel que vai controlar as opções de um usuario, CADASTRAR,ALTERAR, POR PADRÃO JA COMEÇA COM CADASTRO
    String opcao = null;

    public ViewUsuario() {
        initComponents();
        //setando uma fonte padrão no frame
        setFontExterna();
        //ja inicia mostrando os usuarios cadastrados
        listaUsuarios();
    }

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
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewUsuario().setVisible(true);
        });
    }

    /**
     * Metodo que vai limpar os componestes do formulario, que vai estar sujo
     * com dados do usuario logado.
     */
    private void limparFormulario() {
        txtCodigoId.setText(null);
        txtNomeUser.setText(null);
        txtLoginUser.setText(null);
        txtSenhaUser.setText(null);
        opcao = "CADASTRAR";
    }

    /**
     * Metodo que lista Usuarios para mostrar na tabela
     */
    private void listaUsuarios() {
        this.listaUsuarios = cp.getUsuariosControler();
        //pegando a Jtable e trasformando ela para um modelo padrão de tabela
        tblModeloPadrao = (DefaultTableModel) this.getTbllBancoDados.getModel();
        int indice;
        //a linha abaixo inicialmente cria 0 linhas na tabela, isso faz ela so inicializar com 0 linhas
        this.tblModeloPadrao.setNumRows(0);
        //as linhas abaixo cria linhas de dados na tabela, com os dados dos usuarios cadastrados na tabela
        for (indice = 0; indice < this.listaUsuarios.size(); indice += 1) {
            //cada objeto de tipo usuario da lista de usuarios, eu adiciono na tabela, cada linha da tabela e um obejto
            this.tblModeloPadrao.addRow(new Object[]{
                this.listaUsuarios.get(indice).getCodigoId(),
                this.listaUsuarios.get(indice).getNome(),
                this.listaUsuarios.get(indice).getLogin()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblCodigoId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        txtCodigoId = new javax.swing.JTextField();
        txtNomeUser = new javax.swing.JTextField();
        txtLoginUser = new javax.swing.JTextField();
        txtSenhaUser = new javax.swing.JTextField();
        btnSalvarCadUser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        getTbllBancoDados = new javax.swing.JTable();
        btnLimparDadosTela = new javax.swing.JButton();
        btnAlterarDadosUser = new javax.swing.JButton();
        btnExcluirDadosUser = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações Usúarios");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(89, 106, 255));

        lblCodigoId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCodigoId.setForeground(new java.awt.Color(102, 82, 11));
        lblCodigoId.setText("CÓDIGO");

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(102, 82, 11));
        lblNome.setText("NOME COMPLETO *");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 82, 11));
        lblLogin.setText("LOGIN *");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(102, 82, 11));
        lblSenha.setText("SENHA *");

        txtCodigoId.setEditable(false);

        btnSalvarCadUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvarCadUser.setForeground(new java.awt.Color(102, 82, 11));
        btnSalvarCadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/disquete-salvar-usuario-btn.png"))); // NOI18N
        btnSalvarCadUser.setText("SALVAR");
        btnSalvarCadUser.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSalvarCadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadUserActionPerformed(evt);
            }
        });

        getTbllBancoDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOME", "LOGIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(getTbllBancoDados);
        if (getTbllBancoDados.getColumnModel().getColumnCount() > 0) {
            getTbllBancoDados.getColumnModel().getColumn(0).setMinWidth(100);
            getTbllBancoDados.getColumnModel().getColumn(0).setPreferredWidth(100);
            getTbllBancoDados.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        btnLimparDadosTela.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnLimparDadosTela.setForeground(new java.awt.Color(102, 82, 11));
        btnLimparDadosTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-limpar-btn-user.png"))); // NOI18N
        btnLimparDadosTela.setText("LIMPAR");
        btnLimparDadosTela.setPreferredSize(new java.awt.Dimension(48, 48));
        btnLimparDadosTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparDadosTelaActionPerformed(evt);
            }
        });

        btnAlterarDadosUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAlterarDadosUser.setForeground(new java.awt.Color(102, 82, 11));
        btnAlterarDadosUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-editar-user-btn-user.png"))); // NOI18N
        btnAlterarDadosUser.setText("ALTERAR");
        btnAlterarDadosUser.setPreferredSize(new java.awt.Dimension(48, 48));
        btnAlterarDadosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDadosUserActionPerformed(evt);
            }
        });

        btnExcluirDadosUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExcluirDadosUser.setForeground(new java.awt.Color(102, 82, 11));
        btnExcluirDadosUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-excluir-user-btn-user.png"))); // NOI18N
        btnExcluirDadosUser.setText("EXCLUIR");
        btnExcluirDadosUser.setPreferredSize(new java.awt.Dimension(48, 48));
        btnExcluirDadosUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirDadosUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarCadUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigoId)
                            .addComponent(lblCodigoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNomeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoginUser, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(lblLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaUser)
                            .addComponent(lblSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimparDadosTela, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(btnAlterarDadosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                        .addComponent(btnExcluirDadosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoId)
                    .addComponent(lblNome)
                    .addComponent(lblLogin)
                    .addComponent(lblSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvarCadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimparDadosTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterarDadosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirDadosUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
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

        setSize(new java.awt.Dimension(816, 556));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarCadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadUserActionPerformed
        //verificando qual a ação que vou trabalahr aqui no botão salvar
        switch (this.opcao) {
            case "CADASTRAR":
                //antes de salvar um usuario tenho que fazer uma validação nos campos, e ver se foram preenchidos
                //se os campos nome, senha, logim estiverem vazios eu mando uma mensagem de erro
                if (this.txtNomeUser.getText().isEmpty() && this.txtLoginUser.getText().isEmpty() && this.txtSenhaUser.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Pre-Encha os Campos Obrigatorios Marcados Com (*)", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    //obtendo dados do usuario que esta se cadastrando,dados que fica nos componentes de obtenção de texto, que são os JtextField
                    userGlobal.setNome(txtNomeUser.getText());
                    userGlobal.setLogin(txtLoginUser.getText());
                    userGlobal.setSenha(txtSenhaUser.getText());
                    //se retorna true, e porque ocorreu tudo corretamente
                    if (this.cp.controlerSalvarUsuario(userGlobal)) {
                        JOptionPane.showMessageDialog(null, "Usuario Cadastrado Com Sucesso!", "Sucesso Cadastro", JOptionPane.INFORMATION_MESSAGE);
                        //depois de salvar o usuario no banco de dados, vou limpar os dados do formulario
                        limparFormulario();
                        //a linha abaixo limpa os dados da tabela add 0 linhas na tabela
                        this.tblModeloPadrao.setNumRows(0);
                        //e ja mostro a lista de usuarios cadastrados atualizada
                        listaUsuarios();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario Não Cadastrado", "Error Cadastro Usúario", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            case "ALTERAR":
                //opção em que vai alterar um cadastro
                //validação dos campos obrigatorios se estão preenchidos
                if (this.txtNomeUser.getText().isEmpty() && this.txtLoginUser.getText().isEmpty() && this.txtSenhaUser.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Para Alterar  um Cadastro Pre-Encha os Campos Obrigatorios Marcados Com (*)", "Atenção", JOptionPane.WARNING_MESSAGE);
                } else {
                    userGlobal.setCodigoId(Integer.parseInt(txtCodigoId.getText()));
                    userGlobal.setNome(txtNomeUser.getText());
                    userGlobal.setLogin(txtLoginUser.getText());
                    userGlobal.setSenha(txtSenhaUser.getText());
                    if (this.cp.controlerAlterarCadastroUsuario(userGlobal)) {
                        JOptionPane.showMessageDialog(null, "Alteração De Cadastro Feita Com Sucesso", "SUCESSO ALTERAÇÃO", JOptionPane.INFORMATION_MESSAGE);
                        limparFormulario();
                        listaUsuarios();
                    } else {
                        JOptionPane.showMessageDialog(null, "Erro ao Alterar um Cadastro", "ERRO ALTERAÇÃO", JOptionPane.ERROR_MESSAGE);
                    }
                }
                break;
            default:
                System.out.println("Opção Não Encontrada");
                break;
        }


    }//GEN-LAST:event_btnSalvarCadUserActionPerformed

    private void btnExcluirDadosUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirDadosUserActionPerformed
        //COMO SABER QUAL USUARIO QUE VOU EXCLUIR ? VOU SABER ISSO, POR MEIO DO USUARIO TER SELECIONADO UMA LINHA DA JTABLE
        //opcao = "CADASTRAR";
        //obtendo a linha selecionada da JTABLE
        int linhaSelecionada = this.getTbllBancoDados.getSelectedRow();
        //verificando se o usuario selecionou uma linha mesmo na tabela, uma validação, -1(e porque não selecionou nada)
        if (linhaSelecionada < 0)
            JOptionPane.showMessageDialog(this, "Selecione Um Usuario Para Excluir", "Atenção", JOptionPane.WARNING_MESSAGE);
        else {
            //se o usuario selecionou uma linha na tabela, eu vou pegar os dados das colunas que essa linha possui, na tabela
            //a tabela possui 3 colunas | CODIGO == 0, NOME == 1, LOGIN == 2 | AS COLUNAS ESTÃO INDEXADAS, PARA PODEREM SER ACESSADAS, essas colunas estão  visualmente faceis de ver na View
            int colunaCodigo = 0, colunaNome = 1, colunaLogin = 2;
            //para poder selecionar os dados da linha uso o metodo abaixo, que seleciona dados de uma linha, de uma respectiva coluna e linha informados
            int codigoUser = (int) this.getTbllBancoDados.getValueAt(linhaSelecionada, colunaCodigo);
            if (this.cp.controlerExcluirUsuario(codigoUser)) {
                //a linha abaixo limpa os dados da tabela add 0 linhas na tabela
                this.tblModeloPadrao.setNumRows(0);
                //apos excluir o usuario, eu mostro a tabela atualizada com os dados de usuarios atualizados
                this.listaUsuarios();
                JOptionPane.showMessageDialog(this, "Usuario Excluido Com Sucesso", "Exclusão Ocorrida Com Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Ocorreu Um Erro ao Excluir Usuario", "Erro na Exclusão", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirDadosUserActionPerformed

    private void btnLimparDadosTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparDadosTelaActionPerformed
        //vai limpar os componentes do frame
        limparFormulario(); //limpa componentes comuns  
        this.tblModeloPadrao.setNumRows(0); //limpa dados da tabela
        //opcao = "CADASTRAR";
    }//GEN-LAST:event_btnLimparDadosTelaActionPerformed

    private void btnAlterarDadosUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDadosUserActionPerformed
        //VARIAVEIS ESSENCIAIS
        int linhaSelecionada, colunaSelecionada = 0, codigoUsuario;
        //a primeira etapa da alteração de cadastro de um usuario acontece aqui - PARTE 01 - ALTERAÇÃO
        /*
       * 1ª FASE DA ALTERAÇÃO DE CADASTRO, UM USUARIO TEM QUE SELECIONAR UM LINHA DA JTABLE(ONDE ESTÃO LISTADOS TODOS USUARIOS)
         */
        linhaSelecionada = this.getTbllBancoDados.getSelectedRow();
        if (linhaSelecionada < 0) {
            JOptionPane.showMessageDialog(this, "Para poder Alterar Um Cadastro de Um Usuario,\n Selecione Um Usuario Listado Na Tabela!", "Erro ALTERAÇÃO", JOptionPane.WARNING_MESSAGE);
        } else {
            //se tiver selecionado uma linha na tabela, vou informa a coluna que quero obter os dados, e vou pegar linha especifica da tabela que preciso para prosseguir com a a alteração no caso, e so o codigo do usuario, linha selecionada e coluna Codigo;
            //colunas existentes na tabela, são indexadas
            //CODIGO == 0 | NOME == 1 | LOGIN == 2
            codigoUsuario = (int) this.getTbllBancoDados.getValueAt(linhaSelecionada, colunaSelecionada);
            /*
            * 2º FASE E BUSCAR OS DADOS DESSE USUARIO ESCOLHIDO NO BANCO DE DADOS VER SE ELE EXISTE, E MOSTRAR PARA ELE OS DADOS NA TELA
             */
            this.userGlobal = this.cp.controlerBuscaUsuario(codigoUsuario);
            //usuario existe e possui dados
            if (userGlobal != null) {
                //antes de mostrar os dados para o usuario, e bom limpar os componentes
                limparFormulario();
                txtCodigoId.setText(userGlobal.getCodigoId().toString());
                txtNomeUser.setText(userGlobal.getNome());
                txtLoginUser.setText(userGlobal.getLogin());
                txtSenhaUser.setText(userGlobal.getSenha());
                //MARARCANDO A OPÇÃO NO CONTROLE
                opcao = "ALTERAR";
            } else {
                JOptionPane.showMessageDialog(this, "Ocorreu um Erro ao mostrar dados do usario no frame Usuario", "Erro ao mostrar Dados", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAlterarDadosUserActionPerformed

    /**
     * Metodo que seta uma fonte externa no frame por completo, nos componentes
     * e tudo que ele agrupa; Fonte externa usada nesse frame do USUARIO:
     * PlayfairDisplay-ExtraBold.ttf
     */
    private void setFontExterna() {
        try {
            //carregando a fonte de destaque
            fonteExterna = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/PlayfairDisplay-ExtraBold.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela do usuario! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        //setando fonte padrão nas labels
        lblCodigoId.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblNome.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblLogin.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        lblSenha.setFont(fonteExterna.deriveFont(Font.PLAIN, 15));
        //setando fonte padrão nos botões
        btnSalvarCadUser.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        btnLimparDadosTela.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        btnAlterarDadosUser.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        btnExcluirDadosUser.setFont(fonteExterna.deriveFont(Font.PLAIN, 20));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fonteExterna);
        this.setFont(fonteExterna);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDadosUser;
    private javax.swing.JButton btnExcluirDadosUser;
    private javax.swing.JButton btnLimparDadosTela;
    private javax.swing.JButton btnSalvarCadUser;
    private javax.swing.JTable getTbllBancoDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCodigoId;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCodigoId;
    private javax.swing.JTextField txtLoginUser;
    private javax.swing.JTextField txtNomeUser;
    private javax.swing.JTextField txtSenhaUser;
    // End of variables declaration//GEN-END:variables
}
