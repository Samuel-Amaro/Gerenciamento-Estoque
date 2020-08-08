
package view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;


public class ViewEntrada extends javax.swing.JFrame {

    //variaveis necessarias
    Font fonteLove = null;
    
    public ViewEntrada() {
        initComponents();
        //setando uma fonte externa no frame
        setFonteExterna();
        //setando uma mensagem inicial, embutida em um html simples para poder formatar o texto da maneira que quero
        lblMensagemInicial.setText("<html><body><p align = \"center\">SISTEMA PARA GERENCIAMENTO<br/>DE ESTOQUE<p></body></html>");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensagemInicial = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PARA GERENCIAMENTO DE ESTOQUE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(48, 58, 43));

        lblMensagemInicial.setForeground(new java.awt.Color(255, 136, 17));

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/entrar.png"))); // NOI18N
        btnEntrar.setText("ENTRAR");
        btnEntrar.setPreferredSize(new java.awt.Dimension(73, 64));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/GO_OUT.png"))); // NOI18N
        btnSair.setText("SAIR");
        btnSair.setPreferredSize(new java.awt.Dimension(53, 64));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(lblMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblMensagemInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        setSize(new java.awt.Dimension(616, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        ViewLogin l = new ViewLogin();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEntrarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEntrada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ViewEntrada().setVisible(true);
        });
    }

    /**
     * Metodo que seta fontes exernas no frame
     * Seta uma Fonte de Destaque para uma mensagem inicial, fonte = LoveYaLikeASister.ttf;
     * 
     */
    private void setFonteExterna() {
        try {
            //carregando a fonte de destaque que mostra uma mensagem inicial, uma fonte bem destacada
            fonteLove = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/LoveYaLikeASister.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela de Entrada! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        lblMensagemInicial.setFont(fonteLove.deriveFont(Font.PLAIN,30));
        //setando uma fonte no botão
        btnEntrar.setFont(fonteLove.deriveFont(Font.PLAIN,15));
        btnSair.setFont(fonteLove.deriveFont(Font.PLAIN,15));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fonteLove);
        this.setFont(fonteLove);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensagemInicial;
    // End of variables declaration//GEN-END:variables
}
