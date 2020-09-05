package controller;

import dao.DaoTblEstoque;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ModelEstoque;
import model.ModelProduto;

/**
 * CLASSE QUE FAZ O INTERMEDIO ENTRE A VIEW E O MODEL;
 * ONDE CONTROLA OS ACESSOS A DADOS E VALIDAÇÕES DO SISTEMA DENTRO DE UM CONTEXTO;
 * @author SAMUE
 */
public class ControlerTblEstoque {
  
    //variaveis esscencias
    private ModelProduto produto;
    private List<ModelProduto> produtos;
    private DaoTblEstoque daoEstoque;
    /**
     * Metodo que faz o controle e verificações para poder acessar os dados do banco de dados relacionados aos produtos; 
     * @return 
     */
  public List<ModelProduto> controlerGetDescricaoProdutos() {
      try {     
          this.daoEstoque = new DaoTblEstoque();
          this.produtos = new ArrayList<>();
          this.produtos = this.daoEstoque.daoGetDescricaoProdutos();
          return this.produtos;
      } catch (SQLException e) {
               System.out.println("Erro ao buscar DESCRIÇÃO PRODUTOS NO METODO controlerGetDescriçãoProduto()" + e);
               return null; 
      }
  }
/**
 * metodo que faz o controle e validação de dados para poder mandar para a 3 camada dao para add na tabela;
 * @param estoque
 * @return 
 */
public boolean controlerAddMovEstoque(ModelEstoque estoque) {
  return false;  
}  
}
