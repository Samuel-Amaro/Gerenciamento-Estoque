package view;

import controller.ControllerUsuario;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.JOptionPane;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame {
    /*
     * Tela do logim, onde um usuario que deseja usar o sistema, tem que se autenticar.
     * tendo um login e senha para poder usar o sistema.
     * usuario com permissão de acesso que possui login e senha cadastrados no sistema vai poder gerenciar o estoque do sistema.
     */
    
    //variaveis essenciais
    Font fonteShaded = null;
    Font fontePlay = null;
    ControllerUsuario controleUsuario;
    ModelUsuario usuario;
    
    
    public ViewLogin() {
        initComponents();
        setFonteExterna();
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

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(179, 149, 45));
        lblTitulo.setText("GERENCIADOR DE ESTOQUE");

        lblLogin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(179, 149, 45));
        lblLogin.setText("LOGIN");

        lblSenha.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(179, 149, 45));
        lblSenha.setText("SENHA");

        btnEntrarSistema.setForeground(new java.awt.Color(179, 149, 45));
        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/entrar-certo.png"))); // NOI18N
        btnEntrarSistema.setText("ENTRAR!");
        btnEntrarSistema.setToolTipText("Entrar No Sistema");
        btnEntrarSistema.setPreferredSize(new java.awt.Dimension(48, 48));
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        btnSairSistema.setForeground(new java.awt.Color(179, 149, 45));
        btnSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/sair-certo.png"))); // NOI18N
        btnSairSistema.setText("VOLTAR!");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnSairSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(179, 179, 179)
                            .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSenha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jpfTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogin))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenha)
                    .addComponent(jpfTxtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(562, 353));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairSistemaActionPerformed
        
    }//GEN-LAST:event_btnSairSistemaActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
       //vai fazer autenticação de um usuario no sistema
       if(this.txtLogin.getText().isEmpty() && new String(this.jpfTxtSenha.getPassword()).isEmpty()) {
           JOptionPane.showMessageDialog(this,"Digite Um Usuario e Senha","Campos Vazios",JOptionPane.WARNING_MESSAGE);
       }else{
            this.usuario = new ModelUsuario();
            this.controleUsuario = new ControllerUsuario();
            this.usuario =  this.controleUsuario.controlerAutenticarUsuarioLogin(this.txtLogin.getText(),new String(this.jpfTxtSenha.getPassword()));    
            if(this.usuario != null) {
                ViewPrincipal telaPrincipalSistema = new ViewPrincipal();
                telaPrincipalSistema.setVisible(true);
                dispose();
               // JOptionPane.showMessageDialog(this,"Logado Com Sucesso!","Login Efetuado Com Sucesso",JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Usuario e Senha Não Cadastrados!","Erro ao Fazer Logon",JOptionPane.ERROR_MESSAGE);
            }
       }
       
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed
    
    /**
     * Metodo que seta fontes exernas no frame
     * Seta uma Fonte de Destaque para uma mensagem inicial, fonte = GrutchShaded.ttf;
     * SETA UMA FONTE PADRÃO NO FRAME = PlayfairDisplay-ExtraBold.ttf;
     */
    private void setFonteExterna() {
        try {
            //carregando a fonte de destaque que mostra uma mensagem inicial, uma fonte bem destacada
            fonteShaded = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/GrutchShaded.ttf"));
            //caregando a fonte padrão do frame
            fontePlay = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/PlayfairDisplay-ExtraBold.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela de Login! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        //setando fonte padrão na label que mostra mensagem de destaque 
        lblTitulo.setFont(fonteShaded.deriveFont(Font.PLAIN,35));
        lblTitulo.setOpaque(true);
        //setando fonte nos labels de informações de caixas de textos
        lblLogin.setFont(fontePlay.deriveFont(Font.PLAIN,20));
        lblSenha.setFont(fontePlay.deriveFont(Font.PLAIN,20));
        //SETANDO FONTE NOS BOTÕES
        btnEntrarSistema.setFont(fontePlay.deriveFont(Font.PLAIN,17));
        btnSairSistema.setFont(fontePlay.deriveFont(Font.PLAIN,17));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fonteShaded);
        ge.registerFont(fontePlay);
        this.setFont(fontePlay);
    }


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

    private static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
