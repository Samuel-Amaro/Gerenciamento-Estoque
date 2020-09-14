package model;

import java.util.Date;

/**
 * Classe de modelo do banco de dados, onde dados e objetos pertencente a essa tabela ou classe vão ser armazenados;
 * para validação do banco de dados com informações e persisitencia;
 * @author SAMUE
 */

public class ModelEstoque {
  //atriubutos da classe de acordo com a tabela do banco de dados
  private int id_pk;
  private int quantidade;
  private double preco;
  private int tipo_movimentacao;
  private int fk_usuario;
  private int fk_produto;
  private String dataMovimentacao;

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }
  
//metodos acessores de atributos
    public int getId_pk() {
        return id_pk;
    }

    public void setId_pk(int id_pk) {
        this.id_pk = id_pk;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTipo_movimentacao() {
        return tipo_movimentacao;
    }

    public void setTipo_movimentacao(int tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }

    public int getFk_usuario() {
        return fk_usuario;
    }

    public void setFk_usuario(int fk_usuario) {
        this.fk_usuario = fk_usuario;
    }

    public int getFk_produto() {
        return fk_produto;
    }

    public void setFk_produto(int fk_produto) {
        this.fk_produto = fk_produto;
    }

}
