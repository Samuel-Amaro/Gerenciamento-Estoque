package controller;

import dao.DaoTblEstoque;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelEstoque;
import model.ModelProduto;
import model.ModelUsuario;

/**
 * CLASSE QUE FAZ O INTERMEDIO ENTRE A VIEW E O MODEL; ONDE CONTROLA OS ACESSOS
 * A DADOS E VALIDAÇÕES DO SISTEMA DENTRO DE UM CONTEXTO;
 *
 * @author SAMUE
 */
public class ControlerTblEstoque {

    //variaveis esscencias
    private ModelProduto produto;
    private List<ModelProduto> produtos;
    private DaoTblEstoque daoEstoque;
    private List<ModelEstoque> listaEstoque;

    /**
     * Metodo que faz o controle e verificações para poder acessar os dados do
     * banco de dados relacionados aos produtos;
     *
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
     * @param novoModEstoque
     * @return
     */
    public boolean controlerAddMovEstoque(ModelEstoque novoModEstoque) {
        // movimentação de entrada no estoque
        if (novoModEstoque.getTipo_movimentacao() == 0) {
            try {
                this.daoEstoque = new DaoTblEstoque();
                if (this.daoEstoque.daoSetEstoque(novoModEstoque)) {
                    return true;
                }
            } catch (SQLException ex) {
                System.out.println("Ocorreu um erro no metodo controlerAddMovEstoque ao adiconar uma nova movimentação de entrada no estoque \n " + ex);
                return false;
            }
        }
        return false;
    }
    /**
     * Metodo que faz a validação e verifica se pode mostrar todas as movimentações de estoque relacionado a um usuario;
     * @param userLogado
     * @return list objetos de tipo model estoque
     */
    public List<ModelEstoque> controlerGetEstoques(ModelUsuario userLogado) {
       this.daoEstoque = new DaoTblEstoque();
       this.listaEstoque = new ArrayList<ModelEstoque>();
        try {
            this.listaEstoque = this.daoEstoque.daoGetEstoques(userLogado);
            return this.listaEstoque;
        } catch (SQLException ex) {
                System.out.println("Erro ao buscar lista de estoque e movimentações de estoque do usuario logado no metodo controlerGetEstoques: " + ex);
                return null;
        }
    }
}
