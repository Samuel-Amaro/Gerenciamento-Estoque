package view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

public class ViewProduto extends javax.swing.JFrame {

    //variaveis necessarias
    Font spectral = null;

    public ViewProduto() {
        initComponents();
        //metodo abaixo seta uma fonte externa padrão no frame
        setFonteExterna();
        setMensagemObs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigoId = new javax.swing.JLabel();
        lblDescricaoProduto = new javax.swing.JLabel();
        lblQuantidadeProduto = new javax.swing.JLabel();
        lblValorProduto = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(80);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(2).setMinWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable1.getColumnModel().getColumn(3).setMinWidth(80);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(80);
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
                            .addComponent(jTextField1)
                            .addComponent(lblCodigoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(lblDescricaoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lblQuantidadeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
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
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpaCampos;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblCodigoId;
    private javax.swing.JLabel lblDescricaoProduto;
    private javax.swing.JLabel lblMensagemObs;
    private javax.swing.JLabel lblQuantidadeProduto;
    private javax.swing.JLabel lblValorProduto;
    // End of variables declaration//GEN-END:variables
}
