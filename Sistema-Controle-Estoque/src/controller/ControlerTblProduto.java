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
    * @return produto(se existir)
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
}
