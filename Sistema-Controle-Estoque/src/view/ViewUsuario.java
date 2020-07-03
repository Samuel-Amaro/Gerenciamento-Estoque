package view;


public class ViewUsuario extends javax.swing.JFrame {

    /*
     * Tela De Manipulação de Usuarios.
     * onde pode cadastrar, alterar, excluir usuarios, que vão ter acessos ao sistema.
    */
    public ViewUsuario() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações Usúarios");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(89, 106, 255));

        lblCodigoId.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblCodigoId.setForeground(new java.awt.Color(102, 82, 11));
        lblCodigoId.setText("CÓDIGO");

        lblNome.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(102, 82, 11));
        lblNome.setText("NOME COMPLETO");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(102, 82, 11));
        lblLogin.setText("LOGIN");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(102, 82, 11));
        lblSenha.setText("SENHA");

        btnSalvarCadUser.setBackground(new java.awt.Color(45, 58, 179));
        btnSalvarCadUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalvarCadUser.setForeground(new java.awt.Color(102, 82, 11));
        btnSalvarCadUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/disquete-salvar-usuario-btn.png"))); // NOI18N
        btnSalvarCadUser.setText("SALVAR");
        btnSalvarCadUser.setPreferredSize(new java.awt.Dimension(48, 48));

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

        btnAlterarDadosUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAlterarDadosUser.setForeground(new java.awt.Color(102, 82, 11));
        btnAlterarDadosUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-editar-user-btn-user.png"))); // NOI18N
        btnAlterarDadosUser.setText("ALTERAR");
        btnAlterarDadosUser.setPreferredSize(new java.awt.Dimension(48, 48));

        btnExcluirDadosUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExcluirDadosUser.setForeground(new java.awt.Color(102, 82, 11));
        btnExcluirDadosUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-excluir-user-btn-user.png"))); // NOI18N
        btnExcluirDadosUser.setText("EXCLUIR");
        btnExcluirDadosUser.setPreferredSize(new java.awt.Dimension(48, 48));

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLoginUser, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(179, 179, 179)
                                .addComponent(lblLogin)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaUser)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblSenha)
                                .addGap(0, 142, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLimparDadosTela, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAlterarDadosUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarDadosUser;
    private javax.swing.JButton btnExcluirDadosUser;
    private javax.swing.JButton btnLimparDadosTela;
    private javax.swing.JButton btnSalvarCadUser;
    private javax.swing.JTable getTbllBancoDados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
