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

package controller;

import dao.DaoTblProduto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelProduto;

/**
 * CLASSE QUE FAZ O INTERMEDIO ENTRE A VIEW E O MODEL;
 * ONDE CONTROLA OS ACESSOS A DADOS E VALIDAÇÕES DO SISTEMA DE UM CONTEXTO;
 * AQUI NO CASO E DA TABELA tbl_produtos;
 * @author SAMUE
 */
public class ControlerTblProduto {

   //variaveis necessarias
   public DaoTblProduto daoProduto;
   public ModelProduto produto;
   public List<ModelProduto> produtos;
   
   /**
    * Metodo que faz o controle de acesso a camada daoTblProduto, para acessar dados, ou inserir, na TBL_PRODUTO do banco de dados;
    * @param novoProduto
    * @return true(se cadastrou) false(erro no cadastro)
    */
   public boolean controlerCadastraProduto(ModelProduto novoProduto) {
       try {
           //fazendo uma validação de dados para ver se os campos obrigatorios estão preenchidos 
           //se estiverem vazios
           if(novoProduto.getDescricaoProduto().isEmpty() || novoProduto.getValorProduto() == 0) {
              return false; 
           }else{
                this.daoProduto = new DaoTblProduto();
                return this.daoProduto.daoCadastraProduto(novoProduto);    
           }
       } catch (SQLException e) {
                System.out.println("OCORREU UM ERRO AO CADASTRA UM NOVO PRODUTO\n METODO: daoCadastraProduto\n erro: " + e);
                return false;
       }
   }
   
   /**
    * Metodo que controla o acesso aos produtos cadastrados na tabela TBL_PRODUTO do banco de dados;
    * @return ListModelProduto(se existir)
    */
   public List<ModelProduto> controlerGetListaProdutos() {
       try {
           this.produtos = new ArrayList<>();
           this.daoProduto = new DaoTblProduto();
           this.produto = new ModelProduto();
           this.produtos = this.daoProduto.daoGetListaProdutos();
           return this.produtos;
       } catch (SQLException e) {
               System.out.println("OCORREU UM ERRO AO LISTAR PRODUTOS CADASTRADOS\n METODO: daoGetListaProduto\n erro: " + e);
               return null;
       }
   }
   /**
    * Metodo que controla a entrada e saida ao metodo daoGetProduto;
    * Metodo que busca um produto no banco de dados, atraves de seu id, correspodente na tbl_produto;
    * @param codigoProduto
    * @return ModelProduto se existir
    */
   public ModelProduto controlerGetProduto(int codigoProduto) {
       try {
           this.daoProduto = new DaoTblProduto();
           this.produto = new ModelProduto();
           this.produto = this.daoProduto.daoGetProduto(codigoProduto);
           return this.produto;
       } catch (SQLException e) {
               System.out.println("OCORREU UM ERRO AO BUSCAR PRODUTO ATRAVES DE SEU CODIGO ID\n METODO: daoGetProduto\n erro: " + e);
               return null;
       }
   }
    
    /**
     * Metdo que faz o controle de atualização de um produto na tbl_produto
     * @param produto
     * @return true se atualizou false se não
     */
    public boolean controlerAtualizaProduto(ModelProduto produto) {
        try {
            this.daoProduto = new DaoTblProduto();
            return this.daoProduto.daoAtualizaProduto(produto);
        } catch (SQLException e) {
                System.out.println("OCORREU UM ERRO AO atualizar PRODUTO\n METODO: daoAtualizarProduto\n erro: " + e);
               return false;
        }
    }
    /**
     * Metodo que faz verificações antes de excluir um produto;
     * @param idProduto
     * @return 
     */
    public boolean controlerExcluirProduto(int idProduto) {
        if(idProduto > 0) {
          this.daoProduto = new DaoTblProduto();
          try{
              return this.daoProduto.daoExcluirProduto(idProduto);
          }catch(SQLException ex) {
                  System.out.println("erro na exclusão de um produto : " + ex);
                  return false;
          }
        }else{
             return false;
        }
    }
}
