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

import controller.ControlerTblEstoque;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.ModelEstoque;
import model.ModelProduto;
import model.ModelUsuario;


/**
 * Tela principal do sistema, com designer responsivo, e com todas as funcionalidades, disponiilizadas para o usuario, efetuar;
 * @author SAMUE
 * Frame esta, sem decoração de titulo, de maximização,de minimização, de icone de java,e se o botão de fechar a janela, tudo, isso esta implementado, manualmente pelo programador dentro da janela;
 * 
 */
public class ViewPrincipalResponsiva extends javax.swing.JFrame {

    
    //VARIAVEIS DE CLASSE
    private  boolean controleMostraOcultaPainel;
    private Font fonteExterna;
    private ModelUsuario usuarioLogado;
    private DefaultTableModel tabelaModeloPadrao;
    private ControlerTblEstoque controlaEstoque;
    private ModelEstoque movEstoque;
    private ArrayList<ModelEstoque> listaEstoques;
    private ModelProduto produto;
    private ModelUsuario userMovimentacao;
    
    
    //METODO COSTRUTOR ORIGINAL QUE RECEBE UM USUARIO LOGADO NO SISTEMA
    public ViewPrincipalResponsiva(ModelUsuario pUsuarioLogado) {
        initComponents();
        //setando uma fonte externa no titulo do cabeçalho
        setFontExterna();
        //recebendo o usuario logado no sistema
        this.usuarioLogado = pUsuarioLogado;
        //mostrando as movimentações de estoque de todos os usuarios na tabela da view principal
        carregaMovimentacoesTabela();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        conteinerCabecalho = new javax.swing.JPanel();
        conteinerRedimensionamentoIcons = new javax.swing.JPanel();
        conteinerButtonFechar = new javax.swing.JPanel();
        iconeFecharJanela = new javax.swing.JLabel();
        conteinerBotaoMinimizar = new javax.swing.JPanel();
        iconeMinimizarJanela = new javax.swing.JLabel();
        conteinerButtonMaximizar = new javax.swing.JPanel();
        iconeMaximizarJanela = new javax.swing.JLabel();
        lblTituloCabecalho = new javax.swing.JLabel();
        conteinerMenuEsquerdo = new javax.swing.JPanel();
        conteinerMenuIcone = new javax.swing.JPanel();
        linhaDivisaoAcimaMenuBurger = new javax.swing.JPanel();
        conteinerMenuHamburguerIcon = new javax.swing.JPanel();
        iconMenuHanburguer = new javax.swing.JLabel();
        linhaDivisaoAcimaMenuEngrenagem = new javax.swing.JPanel();
        conteinerEngrenagemIcon = new javax.swing.JPanel();
        iconeMenuEngrenagem = new javax.swing.JLabel();
        conteinerPainelControle = new javax.swing.JPanel();
        conteinerBotao01 = new javax.swing.JPanel();
        botaoUsuariosSistema = new javax.swing.JButton();
        conteinerBotao02 = new javax.swing.JPanel();
        botaoProdutosSistema = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        conteinerBotao03 = new javax.swing.JPanel();
        botaoEstoqueSistema = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        conteinerBotao04 = new javax.swing.JPanel();
        botaoSobreSistema = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        conteinerBotao05 = new javax.swing.JPanel();
        botaoLicencaSistemaVersionInformation = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        conteinerConteudo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMostraMovimentacoes = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        conteinerCabecalho.setBackground(new java.awt.Color(15, 19, 52));
        conteinerCabecalho.setLayout(new java.awt.BorderLayout());

        conteinerRedimensionamentoIcons.setBackground(new java.awt.Color(5, 10, 46));
        conteinerRedimensionamentoIcons.setPreferredSize(new java.awt.Dimension(150, 100));
        conteinerRedimensionamentoIcons.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conteinerButtonFechar.setBackground(new java.awt.Color(5, 10, 46));
        conteinerButtonFechar.setLayout(new java.awt.BorderLayout());

        iconeFecharJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeFecharJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/close.png"))); // NOI18N
        iconeFecharJanela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeFecharJanelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeFecharJanelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeFecharJanelaMouseExited(evt);
            }
        });
        conteinerButtonFechar.add(iconeFecharJanela, java.awt.BorderLayout.CENTER);

        conteinerRedimensionamentoIcons.add(conteinerButtonFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 100));

        conteinerBotaoMinimizar.setBackground(new java.awt.Color(5, 10, 46));
        conteinerBotaoMinimizar.setLayout(new java.awt.BorderLayout());

        iconeMinimizarJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeMinimizarJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/minimize.png"))); // NOI18N
        conteinerBotaoMinimizar.add(iconeMinimizarJanela, java.awt.BorderLayout.CENTER);

        conteinerRedimensionamentoIcons.add(conteinerBotaoMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 100));

        conteinerButtonMaximizar.setBackground(new java.awt.Color(5, 10, 46));
        conteinerButtonMaximizar.setLayout(new java.awt.BorderLayout());

        iconeMaximizarJanela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeMaximizarJanela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/maximize.png"))); // NOI18N
        iconeMaximizarJanela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeMaximizarJanelaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeMaximizarJanelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeMaximizarJanelaMouseExited(evt);
            }
        });
        conteinerButtonMaximizar.add(iconeMaximizarJanela, java.awt.BorderLayout.CENTER);

        conteinerRedimensionamentoIcons.add(conteinerButtonMaximizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 100));

        conteinerCabecalho.add(conteinerRedimensionamentoIcons, java.awt.BorderLayout.LINE_END);

        lblTituloCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCabecalho.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloCabecalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/iconfinder_customer-satisfaction-system-review-evaluation_3709746.png"))); // NOI18N
        lblTituloCabecalho.setText("GERENCIADOR ESTOQUE VERSION 1.0");
        conteinerCabecalho.add(lblTituloCabecalho, java.awt.BorderLayout.CENTER);

        getContentPane().add(conteinerCabecalho, java.awt.BorderLayout.PAGE_START);

        conteinerMenuEsquerdo.setPreferredSize(new java.awt.Dimension(270, 450));
        conteinerMenuEsquerdo.setLayout(new java.awt.BorderLayout());

        conteinerMenuIcone.setBackground(new java.awt.Color(15, 19, 52));
        conteinerMenuIcone.setPreferredSize(new java.awt.Dimension(50, 450));
        conteinerMenuIcone.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linhaDivisaoAcimaMenuBurger.setBackground(new java.awt.Color(5, 10, 46));
        linhaDivisaoAcimaMenuBurger.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linhaDivisaoAcimaMenuBurgerLayout = new javax.swing.GroupLayout(linhaDivisaoAcimaMenuBurger);
        linhaDivisaoAcimaMenuBurger.setLayout(linhaDivisaoAcimaMenuBurgerLayout);
        linhaDivisaoAcimaMenuBurgerLayout.setHorizontalGroup(
            linhaDivisaoAcimaMenuBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linhaDivisaoAcimaMenuBurgerLayout.setVerticalGroup(
            linhaDivisaoAcimaMenuBurgerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        conteinerMenuIcone.add(linhaDivisaoAcimaMenuBurger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 10));

        conteinerMenuHamburguerIcon.setBackground(new java.awt.Color(5, 10, 46));
        conteinerMenuHamburguerIcon.setLayout(new java.awt.BorderLayout());

        iconMenuHanburguer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconMenuHanburguer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/burguer-menu.png"))); // NOI18N
        iconMenuHanburguer.setToolTipText("MENU");
        iconMenuHanburguer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMenuHanburguerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconMenuHanburguerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconMenuHanburguerMouseExited(evt);
            }
        });
        conteinerMenuHamburguerIcon.add(iconMenuHanburguer, java.awt.BorderLayout.CENTER);

        conteinerMenuIcone.add(conteinerMenuHamburguerIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 50));

        linhaDivisaoAcimaMenuEngrenagem.setBackground(new java.awt.Color(5, 10, 46));
        linhaDivisaoAcimaMenuEngrenagem.setPreferredSize(new java.awt.Dimension(50, 5));

        javax.swing.GroupLayout linhaDivisaoAcimaMenuEngrenagemLayout = new javax.swing.GroupLayout(linhaDivisaoAcimaMenuEngrenagem);
        linhaDivisaoAcimaMenuEngrenagem.setLayout(linhaDivisaoAcimaMenuEngrenagemLayout);
        linhaDivisaoAcimaMenuEngrenagemLayout.setHorizontalGroup(
            linhaDivisaoAcimaMenuEngrenagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        linhaDivisaoAcimaMenuEngrenagemLayout.setVerticalGroup(
            linhaDivisaoAcimaMenuEngrenagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        conteinerMenuIcone.add(linhaDivisaoAcimaMenuEngrenagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 50, 10));

        conteinerEngrenagemIcon.setBackground(new java.awt.Color(5, 10, 46));
        conteinerEngrenagemIcon.setLayout(new java.awt.BorderLayout());

        iconeMenuEngrenagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconeMenuEngrenagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icones/engrenagem (1).png"))); // NOI18N
        iconeMenuEngrenagem.setToolTipText("CONFIGURAÇÕES");
        iconeMenuEngrenagem.setPreferredSize(new java.awt.Dimension(50, 50));
        iconeMenuEngrenagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconeMenuEngrenagemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconeMenuEngrenagemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconeMenuEngrenagemMouseExited(evt);
            }
        });
        conteinerEngrenagemIcon.add(iconeMenuEngrenagem, java.awt.BorderLayout.CENTER);

        conteinerMenuIcone.add(conteinerEngrenagemIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 50, 50));

        conteinerMenuEsquerdo.add(conteinerMenuIcone, java.awt.BorderLayout.LINE_START);

        conteinerPainelControle.setBackground(new java.awt.Color(25, 29, 74));
        conteinerPainelControle.setPreferredSize(new java.awt.Dimension(150, 400));

        conteinerBotao01.setBackground(new java.awt.Color(15, 19, 52));
        conteinerBotao01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conteinerBotao01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conteinerBotao01MouseExited(evt);
            }
        });

        botaoUsuariosSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/user-btn-1.png"))); // NOI18N
        botaoUsuariosSistema.setToolTipText("GERENCIAR USUARIOS SISTEMA");
        botaoUsuariosSistema.setPreferredSize(new java.awt.Dimension(32, 32));
        botaoUsuariosSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUsuariosSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerBotao01Layout = new javax.swing.GroupLayout(conteinerBotao01);
        conteinerBotao01.setLayout(conteinerBotao01Layout);
        conteinerBotao01Layout.setHorizontalGroup(
            conteinerBotao01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerBotao01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoUsuariosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteinerBotao01Layout.setVerticalGroup(
            conteinerBotao01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao01Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoUsuariosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conteinerBotao02.setBackground(new java.awt.Color(15, 19, 52));

        botaoProdutosSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-produto-btn-2.png"))); // NOI18N
        botaoProdutosSistema.setToolTipText("GERENCIAR PRODUTOS ESTOQUE");
        botaoProdutosSistema.setPreferredSize(new java.awt.Dimension(32, 32));
        botaoProdutosSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProdutosSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerBotao02Layout = new javax.swing.GroupLayout(conteinerBotao02);
        conteinerBotao02.setLayout(conteinerBotao02Layout);
        conteinerBotao02Layout.setHorizontalGroup(
            conteinerBotao02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerBotao02Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoProdutosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteinerBotao02Layout.setVerticalGroup(
            conteinerBotao02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao02Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoProdutosSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conteinerBotao03.setBackground(new java.awt.Color(15, 19, 52));

        botaoEstoqueSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/icone-estoque-btn-3.png"))); // NOI18N
        botaoEstoqueSistema.setToolTipText("GERENCIAR ESTOQUE");
        botaoEstoqueSistema.setPreferredSize(new java.awt.Dimension(32, 32));
        botaoEstoqueSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEstoqueSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout conteinerBotao03Layout = new javax.swing.GroupLayout(conteinerBotao03);
        conteinerBotao03.setLayout(conteinerBotao03Layout);
        conteinerBotao03Layout.setHorizontalGroup(
            conteinerBotao03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao03Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoEstoqueSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteinerBotao03Layout.setVerticalGroup(
            conteinerBotao03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao03Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botaoEstoqueSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conteinerBotao04.setBackground(new java.awt.Color(15, 19, 52));

        botaoSobreSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/about-btn-04.png"))); // NOI18N
        botaoSobreSistema.setToolTipText("SABER MAIS SOBRE SISTEMA");
        botaoSobreSistema.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout conteinerBotao04Layout = new javax.swing.GroupLayout(conteinerBotao04);
        conteinerBotao04.setLayout(conteinerBotao04Layout);
        conteinerBotao04Layout.setHorizontalGroup(
            conteinerBotao04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao04Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoSobreSistema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        conteinerBotao04Layout.setVerticalGroup(
            conteinerBotao04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoSobreSistema, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        conteinerBotao05.setBackground(new java.awt.Color(15, 19, 52));

        botaoLicencaSistemaVersionInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens_icones/licenciamento.png"))); // NOI18N
        botaoLicencaSistemaVersionInformation.setToolTipText("LICENÇA USADA");
        botaoLicencaSistemaVersionInformation.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout conteinerBotao05Layout = new javax.swing.GroupLayout(conteinerBotao05);
        conteinerBotao05.setLayout(conteinerBotao05Layout);
        conteinerBotao05Layout.setHorizontalGroup(
            conteinerBotao05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conteinerBotao05Layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(botaoLicencaSistemaVersionInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        conteinerBotao05Layout.setVerticalGroup(
            conteinerBotao05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoLicencaSistemaVersionInformation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout conteinerPainelControleLayout = new javax.swing.GroupLayout(conteinerPainelControle);
        conteinerPainelControle.setLayout(conteinerPainelControleLayout);
        conteinerPainelControleLayout.setHorizontalGroup(
            conteinerPainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conteinerBotao05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(conteinerBotao04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator4)
            .addComponent(jSeparator3)
            .addComponent(conteinerBotao03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(conteinerBotao02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator2)
            .addComponent(conteinerBotao01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
        );
        conteinerPainelControleLayout.setVerticalGroup(
            conteinerPainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(conteinerPainelControleLayout.createSequentialGroup()
                .addComponent(conteinerBotao01, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conteinerBotao02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(conteinerBotao03, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(conteinerBotao04, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(conteinerBotao05, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );

        conteinerMenuEsquerdo.add(conteinerPainelControle, java.awt.BorderLayout.CENTER);

        getContentPane().add(conteinerMenuEsquerdo, java.awt.BorderLayout.LINE_START);

        conteinerConteudo.setBackground(new java.awt.Color(73, 128, 242));

        tabelaMostraMovimentacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Operação", "Produto", "Quantidade", "Usúario", "Preço ", "Data"
            }
        ));
        jScrollPane1.setViewportView(tabelaMostraMovimentacoes);

        javax.swing.GroupLayout conteinerConteudoLayout = new javax.swing.GroupLayout(conteinerConteudo);
        conteinerConteudo.setLayout(conteinerConteudoLayout);
        conteinerConteudoLayout.setHorizontalGroup(
            conteinerConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        conteinerConteudoLayout.setVerticalGroup(
            conteinerConteudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        getContentPane().add(conteinerConteudo, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(800, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Label que vai conter o icone de fechar a janela;
     *  é chamado uma vez que há um movimento do mouse dentro do quadro, no caso uma label,com um icone;
     * @param evt 
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * Chamado logo após o usuário clicar no componente de escuta, no caso ao usuario clicar na label com o icone de fechar o sistema.
     */
    private void iconeFecharJanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeFecharJanelaMouseClicked
       //encerra a janela, sai do sistema
        System.exit(0);
    }//GEN-LAST:event_iconeFecharJanelaMouseClicked

    /**
     * Metodo que muda a cor de um conteiner;
     * @param conteiner
     * @param novaCor 
     */
    public void mudarCor(JPanel conteiner,Color novaCor) {
        //seta uma nova cor de fundo no conteiner
        conteiner.setBackground(novaCor);
    }
    
    /**
     * Label de fechar a janela;
     *  evento de mouse ,é chamado quando o mouse vem de uma janela exterior ao quadro, no caso e uma label.
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * Chamado logo após o cursor entrar nos limites do componente escutado. ao o mouse entrar na label ou passar por cima, ja chama esse metodo;
     * @param evt 
     */
    private void iconeFecharJanelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeFecharJanelaMouseEntered
        mudarCor(conteinerButtonFechar,new Color(25,29,74));
    }//GEN-LAST:event_iconeFecharJanelaMouseEntered
    /**
     * Label de fechar a janela;
     * é chamado quando o mouse passa fora do quadro, no caso uma label, com um icone;
     * @param evt 
     * Chamado logo após o cursor sair dos limites do componente escutado, ao o mouse sair da label, em qualquer momento, que o mouse não estiver mais sobre a label, chama esse metodo;
     */
    private void iconeFecharJanelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeFecharJanelaMouseExited
       mudarCor(conteinerButtonFechar,new Color(5,10,46)); 
    }//GEN-LAST:event_iconeFecharJanelaMouseExited

    /**
     * Icone de maximizar janela dentro de uma label;
     * esse evento é chamado quando o mouse vem de uma janela exterior ao no caso a essa label;
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * @param evt 
     * Chamado logo após o cursor entrar nos limites do componente escutado. ao o mouse entrar na label ou passar por cima, ja chama esse metodo;
     * Ao mouse passar por cima, da label, ou permanecer o mouse encima da label, vai mudar a cor da label, para dar, um efeito de mudança de estado;
     */
    private void iconeMaximizarJanelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMaximizarJanelaMouseEntered
        mudarCor(conteinerButtonMaximizar,new Color(25,29,74)); 
    }//GEN-LAST:event_iconeMaximizarJanelaMouseEntered

    /**
     * Icone de maximizar janela dentro de uma label;
     * evento que e chamado quando é chamado quando o mouse passa fora do quadro i.e.
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * @param evt 
     * Chamado logo após o cursor sair dos limites do componente escutado, ao o mouse sair da label, em qualquer momento, que o mouse não estiver mais sobre a label, chama esse metodo;
     * Ao usuario, tirar o mouse, de cima da label, ou ao tirar o mouse da label, vai criar um efeito de mudança de cor;
     */
    private void iconeMaximizarJanelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMaximizarJanelaMouseExited
        mudarCor(conteinerButtonMaximizar,new Color(5,10,46));
    }//GEN-LAST:event_iconeMaximizarJanelaMouseExited

    /**
     * Icone de maximizar janela dentro de uma label;
     * evento que e chamado quando é chamado quando o mouse passa fora do quadro i.e.
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * @param evt 
     *  Chamado logo após o usuário clicar no componente de escuta, no caso ao usuario clicar na label com o icone de maximixar o sistema
     * Ao usuario clicar no icone de maximizar a janela, verifica antes se ela ja esta maximizada, se ja estiver não maximiza a janela, se não estiver faz a maximização da janela;
     */
    private void iconeMaximizarJanelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMaximizarJanelaMouseClicked
        //VERIFICANDO SE O ESTADO ATUAL DA JANELA,  E DIFERENTE DA JANELA ESTAR TOTALMENTE MAXIMIXADA, VERTICALMENTE E HORIZONTALMENTE
        //SE A JANELA ATUAL NÃO ESTIVER TOTALMENTE MAXIMIZADA, VAI PODER MAXIMIZAR A JANELA POR COMPLETO
        if(this.getExtendedState() != ViewPrincipalResponsiva.MAXIMIZED_BOTH) {
            //faz uma maximização na janela, horizontalmente e verticalmente;
            this.setExtendedState(ViewPrincipalResponsiva.MAXIMIZED_BOTH);
        }else{
            //se a janela ja estiver maximizada, não meche no estado atual dela, deixa ela do jeito que esta
            this.setExtendedState(ViewPrincipalResponsiva.NORMAL);
        }
    }//GEN-LAST:event_iconeMaximizarJanelaMouseClicked

    /**
     * Icone de hamburger de menus da janela;
     * evento que e chamado quando é chamado quando o mouse passa fora do quadro i.e.
     * Os eventos do mouse notificam quando o usuário usa o mouse (ou dispositivo de entrada semelhante) para interagir com um componente. Os eventos do mouse ocorrem quando o cursor entra ou sai da área na tela de um componente e quando o usuário pressiona ou solta um dos botões do mouse.
     * @param evt 
     *  Chamado logo após o usuário clicar no componente de escuta, no caso ao usuario clicar na label com o icone de maximixar o sistema
     * usuario vai clicar no menu de hamburguer e vai ocorrer um efeito visual de clique no conteiner;
     * @param evt 
     */
    private void iconMenuHanburguerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMenuHanburguerMouseClicked
        clicouMenu(conteinerMenuHamburguerIcon,conteinerEngrenagemIcon,1);
        //criar um metodo que retorna vazio,para ocultar e mostrar o menu do painel de hamburguer
    }//GEN-LAST:event_iconMenuHanburguerMouseClicked

    /**
     * Chamado logo após o cursor entrar nos limites do componente escutado. ao o mouse entrar na label ou passar por cima, ja chama esse metodo;
     * Ao usuario passa o mouse por cima do menu ahmburguer, vai mudar o estado atual do componente acima do menu amburguer, esse compoennte esta la so para efeito visual do usuario, ao usuario passar o mouse por cima, vai dar um efeito nesse compoenente e mudar a sua cor atual;
     * @param evt 
     */
    private void iconMenuHanburguerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMenuHanburguerMouseEntered
        //muda a cor do componente de divisão dos conteiner
        mudarCor(linhaDivisaoAcimaMenuBurger,new Color(247,78,105));
    }//GEN-LAST:event_iconMenuHanburguerMouseEntered

    /**
     * na hora que o usuario tirar o mouse de cima do compoennte do menu amburguer, vai parar de ocorrer  o efeito de mudança de cor no compoennte de linha acima do menu amburguer, o efeito vai para de ocorrer, e o estado do compoennte volta ao normal;
     * Na hora que o mouse do uusario sair de cima do compoennte do menu amburguer, ou para de passar o mouse por cima do compoennte, o efeito não ocorrera mais;
     * usuario clicou no menu amburger, dependendo do estado do conteiner do painel de controle, ele tem que ser oculto, ou mostrado, ao ser clicado ou não, painel de controle sendo mostrado ou ocultado;
     * @param evt 
     */
    private void iconMenuHanburguerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMenuHanburguerMouseExited
        //muda a cor do compoente de divisão dos conteiner
        mudarCor(linhaDivisaoAcimaMenuBurger,new Color(247,78,105));
        //usuario clicou no menu amburguer e para mostrar o painel
        //true = painel deve ser mostrado
        if(controleMostraOcultaPainel== true) {
            //metodo que dependendo do controlador do painel vai mostrar ou não
            ocultarMostrarMenu(conteinerMenuEsquerdo,controleMostraOcultaPainel);
            //apos o painel ter sido expandido, todo os compoenntes precisam ser redesenhados na tela, para ver o efeito do expansão ou redimensionamento do componente ocorrendo
            SwingUtilities.updateComponentTreeUI(this);           
            //painel ja mostrado, deve-se dar false para o controlador, para que na proxima execução ou clique no menu, o painel seje oculto
            //criar metodo que muda imagen
            controleMostraOcultaPainel = false;  
        }else{
            //false = menu precisa ser oculto(painel de controle)
            ocultarMostrarMenu(conteinerMenuEsquerdo,controleMostraOcultaPainel);
            //todos os componentes graficos precisam ser redesenhados na tela para que veja o redimensionamento do componetene acontecendo para ver o ocultamento
            SwingUtilities.updateComponentTreeUI(this);
            //apos o painel ter sido oculto, devo atualizar o controlador para que na proximo clique no menu ele seja expandido
            controleMostraOcultaPainel = true;
        }
    }//GEN-LAST:event_iconMenuHanburguerMouseExited

    /**
     * Ao usuario passar o mouse por cima, do componente de menu de engrenagem, vai gerar um efeito visual, no componente de divisão de compoennte acima, e so um efeito visual de mudança de cor, no componente;
     * @param evt 
     */
    private void iconeMenuEngrenagemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMenuEngrenagemMouseEntered
        //muda a cor do compoente de divisão dos conteiner
        mudarCor(linhaDivisaoAcimaMenuEngrenagem,new Color(8,177,150));
    }//GEN-LAST:event_iconeMenuEngrenagemMouseEntered

    /**
     * Ao usuario tirar o mouse de cima do compoentne de menui de engrenagem, ao o mouse sair das extremidades do componente, ao não passar mais por cima dele, ou ao não estar mais sobre o componte o efeito visual não e executado mais;
     * @param evt 
     */
    private void iconeMenuEngrenagemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMenuEngrenagemMouseExited
         //muda a cor do compoente de divisão dos conteiner
        mudarCor(linhaDivisaoAcimaMenuEngrenagem,new Color(8,177,150));
    }//GEN-LAST:event_iconeMenuEngrenagemMouseExited

    /**
     * Ao usuario clicar no menu de engrenagem, vai acontecer um efeito visual, de mudar a cor do conteiner, para pensar que o menu esta clicado e selecionado, vai mudar quado clicar em um outro, menu, no caso o menu de hamburguer;
     * @param evt 
     */
    private void iconeMenuEngrenagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconeMenuEngrenagemMouseClicked
        //troca as cores dos conteiner
        clicouMenu(conteinerEngrenagemIcon,conteinerMenuHamburguerIcon,1);
    }//GEN-LAST:event_iconeMenuEngrenagemMouseClicked

    /**
     * Botão que ao ser clicado pelo cursor do mouse, vai ter uma açaõ de chamar a interface de gerenciamento de estoque;
     * @param evt 
     */
    private void botaoEstoqueSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEstoqueSistemaActionPerformed
        ViewEstoque gerenciarEstoque = new ViewEstoque(this.usuarioLogado);
        gerenciarEstoque.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoEstoqueSistemaActionPerformed

    /**
     * quando o cursor do mouse, não estiver mais por cima, do conteiner do botão 01, o destaque do conteiner para de ocorrer;
     * @param evt 
     */
    private void conteinerBotao01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conteinerBotao01MouseExited

    }//GEN-LAST:event_conteinerBotao01MouseExited

    /**
     * enquanto o cursor do mouser ficar por cima, do conteiner do botão 01, o botão de gerenciar usuarios, o conteiner vai ter um destque na sua cor, para mostrar que vai estar selecionado;
     * @param evt 
     */
    private void conteinerBotao01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conteinerBotao01MouseEntered

    }//GEN-LAST:event_conteinerBotao01MouseEntered

    /**
     * usuario clicou no botão de gerenciar usuarios, vai para a View de manipulação de usuarios do sistema;
     * @param evt 
     */
    private void botaoUsuariosSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUsuariosSistemaActionPerformed
        ViewUsuario gerenciarUsuario = new ViewUsuario(this.usuarioLogado);
        gerenciarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoUsuariosSistemaActionPerformed

    /**
     * Ao usuario clicar com o cursor do mouse no botão de gerenciar os produto do estoque, vai chamar a tela de manipulaçaõ de produtos;
     * @param evt 
     */
    private void botaoProdutosSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProdutosSistemaActionPerformed
        ViewProduto gerenciarProduto = new ViewProduto(this.usuarioLogado);
        gerenciarProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoProdutosSistemaActionPerformed

    /**
     * De acorodo com um numero logico vindo por paramentro, vou setar novas cores de fundo, nos conteiner informados por parametro, tudo isso ocorrendo enquanto o usuario clica no menu hamburguer;
     * @param conteiner1
     * @param conteiner2
     * @param numeroLogico 
     */
    public void clicouMenu(JPanel conteiner1,JPanel conteiner2, int numeroLogico) {
        if(numeroLogico == 1) {
            //seta uma nova cor de fundo no conteiner 1
            conteiner1.setBackground(new Color(25,29,74));
            //seta um nova cor de fundo no conteiner 2
            conteiner2.setBackground(new Color(5,10,46));   
        }else{
              //seta uma nova cor de fundo no conteiner 1
              conteiner1.setBackground(new Color(5,10,46));
              //seta um nova cor de fundo no conteiner 2
              conteiner2.setBackground(new Color(25,29,74)); 
        }
    }
    
    /**
     * Metodo que vai mostrar ou ocultar um menu, esse menu, pode ser o menu de hamurguer ou menu de engrenagem;
     * @param conteinerMenuMostraOculta
     * @param painelControle 
     */
    public void ocultarMostrarMenu(JPanel conteinerMenuMostraOculta,boolean painelControle) {
        //painel de controle igual a verdade, e porque ele esta sendo mostrado, então vai ser ocultado
        if(painelControle == true){
            //para o ocultar o painel de controle, basta so redimensionalo,  na sua largura, para que ele fique bem encondido, de uma maneira que pareça que ele foi ocultado automaticamente
                                                                //largura altura(obtida automa pelo tamn atual do componente)   
            conteinerMenuMostraOculta.setPreferredSize(new Dimension(50,conteinerMenuMostraOculta.getHeight()));
        }else{
            //se o painel de controle for false, e porque ele esta oculto, e necessita de ser mostrado
            //par poder mostrar o painel de controle e so redimensionalo, para medidas bem grandes para que ele fique bem visivel para o usuario ver que o painel foi mostrado
            conteinerMenuMostraOculta.setPreferredSize(new Dimension(270,conteinerMenuMostraOculta.getHeight()));
        }
    }
    
    /**
     * Metodo que seta uma fonte externa no frame por completo, nos componentes
     * e tudo que ele agrupa; Fonte externa usada nesse frame de movimentação de estoque:
     * PlayfairDisplay-ExtraBold.ttf
     */
    private void setFontExterna() {
        try {
            //carregando a fonte de destaque
            fonteExterna = Font.createFont(Font.TRUETYPE_FONT, getClass().getClassLoader().getResourceAsStream("fontes_externas/Gayathri-Regular.ttf"));
        } catch (IOException | FontFormatException e) {
            System.out.println("Não carregou as fonte externa padrão da tela principal! " + e);
        }
        //setando a fonte nos componentes com o estilo e tamanho
        //setando fonte padrão nas labels
        lblTituloCabecalho.setFont(fonteExterna.deriveFont(Font.PLAIN,20));
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(fonteExterna);
        this.setFont(fonteExterna);
    }
   
    /**
     * metodo que carrega as movimentações de estoque no formulario, no componente da tabela, para o usuario ver como estão as movimentações efetuadas no estoque
     * 
     */
    private void carregaMovimentacoesTabela() {
        //o modelo padrão da tabela que mostra as movimentações
        this.tabelaModeloPadrao = (DefaultTableModel)this.tabelaMostraMovimentacoes.getModel();
        //inicialmente a tabela começa com 0 linhas
        this.tabelaModeloPadrao.setNumRows(0);
        this.controlaEstoque = new ControlerTblEstoque();
        this.listaEstoques = new ArrayList<>();
        this.listaEstoques = (ArrayList<ModelEstoque>) this.controlaEstoque.controlerGetEstoques();
        //verificando se o array list possui movimentações de estoque itens para ser iterado
        if(this.listaEstoques.isEmpty()) {
           //lista vazia e  não possui movimentaçções de estoque
           //tabela vai ficar vazia sem movimentações
           this.tabelaModeloPadrao.setNumRows(0);
        }else{
            //populando a tabela da View, com todoas as movimentações de estoque efetuadas por todos os usuarios
             this.controlaEstoque = new ControlerTblEstoque();
            for (int indice = 0; indice < listaEstoques.size(); indice++) {
                 //movimentação de estoque
                 ModelEstoque itemEstoque = listaEstoques.get(indice);
                 //obtendo os detalhes do produto que esta sendo movimentado     
                 this.produto = new ModelProduto();
                 this.produto = this.controlaEstoque.controlerGetDetalhesProduto(itemEstoque.getFk_produto());
                 //obtendo detalhes do usuario que fez a movimentação
                 this.userMovimentacao = new ModelUsuario();
                 this.userMovimentacao = this.controlaEstoque.controlerGetUsuario(itemEstoque.getFk_usuario());
                 //produto não esta mais cadastrado no sistema ou usuario tambem não esta cadastrado
                 if(this.produto == null || this.userMovimentacao == null) {
                     this.tabelaModeloPadrao.addRow(new Object[]{
                         (itemEstoque.getTipo_movimentacao() == 0) ? "ENTRADA" : "SAIDA", //0 = ENTRADA 1 = SAIDA
                         "PRODUTO NÃO CADASTRADO",//produto
                         itemEstoque.getQuantidade(), //quantidade
                         "USUARIO NÃO CADASTRADO",//usuario
                         itemEstoque.getPreco(),//preco
                         itemEstoque.getDataMovimentacao()//data
                     });
                 }else{
                     this.tabelaModeloPadrao.addRow(new Object[]{
                         (itemEstoque.getTipo_movimentacao() == 0) ? "ENTRADA" : "SAIDA", //0 = ENTRADA 1 = SAIDA
                         this.produto.getDescricaoProduto(),//produto
                         itemEstoque.getQuantidade(), //quantidade
                         this.userMovimentacao.getNome(),//usuario
                         itemEstoque.getPreco(),//preco
                         itemEstoque.getDataMovimentacao()//data
                     });
                 }
                 
                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEstoqueSistema;
    private javax.swing.JButton botaoLicencaSistemaVersionInformation;
    private javax.swing.JButton botaoProdutosSistema;
    private javax.swing.JButton botaoSobreSistema;
    private javax.swing.JButton botaoUsuariosSistema;
    private javax.swing.JPanel conteinerBotao01;
    private javax.swing.JPanel conteinerBotao02;
    private javax.swing.JPanel conteinerBotao03;
    private javax.swing.JPanel conteinerBotao04;
    private javax.swing.JPanel conteinerBotao05;
    private javax.swing.JPanel conteinerBotaoMinimizar;
    private javax.swing.JPanel conteinerButtonFechar;
    private javax.swing.JPanel conteinerButtonMaximizar;
    private javax.swing.JPanel conteinerCabecalho;
    private javax.swing.JPanel conteinerConteudo;
    private javax.swing.JPanel conteinerEngrenagemIcon;
    private javax.swing.JPanel conteinerMenuEsquerdo;
    private javax.swing.JPanel conteinerMenuHamburguerIcon;
    private javax.swing.JPanel conteinerMenuIcone;
    private javax.swing.JPanel conteinerPainelControle;
    private javax.swing.JPanel conteinerRedimensionamentoIcons;
    private javax.swing.JLabel iconMenuHanburguer;
    private javax.swing.JLabel iconeFecharJanela;
    private javax.swing.JLabel iconeMaximizarJanela;
    private javax.swing.JLabel iconeMenuEngrenagem;
    private javax.swing.JLabel iconeMinimizarJanela;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblTituloCabecalho;
    private javax.swing.JPanel linhaDivisaoAcimaMenuBurger;
    private javax.swing.JPanel linhaDivisaoAcimaMenuEngrenagem;
    private javax.swing.JTable tabelaMostraMovimentacoes;
    // End of variables declaration//GEN-END:variables
}
