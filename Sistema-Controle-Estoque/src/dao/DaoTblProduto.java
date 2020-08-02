package dao;

import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.ModelProduto;
import utiuls.ConexaoSqLite;

/**
 * CLASSE QUE FAZ O ACESSO A DADOS DO BANCO DE DADOS DE UMA TABELA; Aqui e onde
 * ocorre entrada e saida de dados do sistema para a tbl_produto do banco de
 * dados; entrada e saida de dados, com metodos e manipulação relacioandos a
 * banco de dados;
 *
 * @author SAMUE
 */
public class DaoTblProduto extends ConexaoSqLite{
    //variaveis necessarias
    private Connection conexaoBanco;
    private PreparedStatement preparaSql;
    private ResultSet resultadoSql;
    private ModelProduto produto;
    private List<ModelProduto> produtos;
    /**
     * Metodo que faz acesso ao banco de dados na tabela tbl_produto para inserir dados, para cadastrar um novo produto na tabela;
     * @param novoProduto
     * @return true(se cadastrou) false(não cadastrou)
     * @throws java.sql.SQLException - (manda essa exception para o controlerCadastraProduto, tratar ela)
     */
    public boolean daoCadastraProduto(ModelProduto novoProduto) throws SQLException {
      String insertSql = "INSERT INTO tbl_produto"
                       + "(descricao,"
                       + "quantidade,"
                       + "valor) "
                       + "VALUES(?,?,?);";
      this.conexaoBanco = conectaBanco();
      this.preparaSql = this.conexaoBanco.prepareStatement(insertSql);
      this.preparaSql.setString(1,novoProduto.getDescricaoProduto());
      this.preparaSql.setInt(2,novoProduto.getQuantidadeProduto());
      this.preparaSql.setDouble(3,novoProduto.getValorProduto());
      int adicionou = this.preparaSql.executeUpdate();
      //inseriu uma linha na tabela tbl_produto
      if(adicionou > 0) {
         this.preparaSql.close();
         return true; 
      }else{
          this.preparaSql.close();
          return false;
      }
    }
    /**
     * Metodo que faz uma busca na tbl_produto e mostra todos produtos que estão cadastrados na tabela do banco de dados
     * @return Lista de objetos cadastrados de tipo ModelProduto
     * @throws java.sql.SQLException  (manda essa exception para o controlerListaProduto, tratar ela)
     */
    public List<ModelProduto> daoGetListaProdutos() throws SQLException {
      String selectSql = "SELECT "
              +          "pk_codigo_produto,"
              +          "descricao,"
              +          "quantidade,"
              +          "valor "
              +          "FROM tbl_produto;";
      this.conexaoBanco = conectaBanco();
      this.preparaSql = this.conexaoBanco.prepareStatement(selectSql);
      this.resultadoSql = this.preparaSql.executeQuery();
      this.produtos = new ArrayList<>();
      while(resultadoSql.next()) {
          this.produto = new ModelProduto();
          this.produto.setIdProduto(this.resultadoSql.getInt(1)); //CODIGO ID
          this.produto.setDescricaoProduto(this.resultadoSql.getString(2)); //DESCRIÇÃO DO PRODUTO
          this.produto.setQuantidadeProduto(this.resultadoSql.getInt(3)); //QUANTIDADE PRODUTO
          this.produto.setValorProduto(this.resultadoSql.getDouble(4)); //VALOR DO PRODUTO
          this.produtos.add(produto);
      }
      this.preparaSql.close();
      this.resultadoSql.close();
      return this.produtos;
    }
}
