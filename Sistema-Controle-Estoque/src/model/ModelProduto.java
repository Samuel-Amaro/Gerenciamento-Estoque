package model;

/**
 * Esta classe e a modelagem(model VO) value object da tabela; Esta classe
 * representa o modelo da tabela tbl_produto do banco de dados; Esta classe
 * represena uma entidade do mundo real(no caso um produto);
 *
 * @author SAMUE
 */
public class ModelProduto {

//atributos de um produto(Caracteristicas) - de acordo com a tabela do banco de dados;
    private int idProduto;
    private String descricaoProduto;
    private int quantidadeProduto;
    private double valorProduto;

//metodos acessores de atributos
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

}
