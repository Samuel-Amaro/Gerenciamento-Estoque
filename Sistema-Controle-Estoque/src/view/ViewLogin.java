package view;


public class ViewLogin extends javax.swing.JFrame {

    /*
     * Tela do logim, onde um usuario que deseja usar o sistema, tem que se autenticar.
     * tendo um login e senha para poder usar o sistema.
     * usuario com permissão de acesso que possui login e senha cadastrados no sistema vai poder gerenciar o estoque do sistema.
    */
    
    public ViewLogin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jpfTxtSenha = new javax.swing.JPasswordField();
        btnEntrarSistema = new javax.swing.JButton();
        btnSairSistema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AUTENTICAÇÃO SISTEMA");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(45, 58, 179));

        lblTitulo.setBackground(new java.awt.Color(0, 10, 102));
        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(179, 149, 45));
        lblTitulo.setText("GERENCIADOR DE ESTOQUE");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(179, 149, 45));
        lblLogin.setText("LOGIN");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(179, 149, 45));
        lblSenha.setText("SENHA");

        btnEntrarSistema.setBackground(new java.awt.Color(255, 255, 255));
        btnEntrarSistema.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icone-entrar-btn-login.png"))); // NOI18N
        btnEntrarSistema.setToolTipText("Entrar No Sistema");
        btnEntrarSistema.setPreferredSize(new java.awt.Dimension(48, 48));

        btnSairSistema.setBackground(new java.awt.Color(255, 255, 255));
        btnSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagensicones/icone-btn-login-sair.png"))); // NOI18N
        btnSairSistema.setToolTipText("Sair Do Sistema");
        btnSairSistema.setMinimumSize(new java.awt.Dimension(48, 48));
        btnSairSistema.setPreferredSize(new java.awt.Dimension(48, 48));
        btnSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSairSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpfTxtSenha, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lblSenha)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jpfTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSairSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(562, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSistemaActionPerformed
        //vai voltar para a tela de boas vindas
        ViewMascaraEntrada m = new ViewMascaraEntrada();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSairSistemaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JButton btnSairSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jpfTxtSenha;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
