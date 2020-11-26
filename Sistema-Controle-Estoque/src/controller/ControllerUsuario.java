package controller;

import dao.DAOUsuario;
import java.util.ArrayList;
import java.util.List;
import model.ModelUsuario;

/**
 * Classe que controla a validação de dados para o banco de dados 
 * @author SAMUE
 */

public class ControllerUsuario {
   //variaveis necessaria
   private DAOUsuario user;
   private ModelUsuario usuario;
   
  /**
   * 
   * @param novoUsuario
   * @return boolean 
   */  
  public boolean controlerSalvarUsuario(ModelUsuario novoUsuario) {
      this.user = new DAOUsuario();
      return this.user.daoSalvarUsuario(novoUsuario);
  }

  /**
   * retorna todos os usuarios cadastrados no sistema
   * @return List<Usuario> 
   */
  public List<ModelUsuario> getUsuariosControler() {
      user = new DAOUsuario();
      return this.user.daoGetListaUsuario();
  }
  
  /**
   * Metodo de controle de exclusão de um usuario
   * @param codigoUser
   * @return 
   */
  public boolean controlerExcluirUsuario(int codigoUser) {
     user = new DAOUsuario();
     return this.user.daoExcluirUsuario(codigoUser);
  }
  
  /**
   * Metodo que busca um usuario existente no banco de dados atraves de seu id
   * @param codigoUser
   * @return Usuario, se ele existe
   */
  public ModelUsuario controlerBuscaUsuario(int codigoUser) {
    this.user = new DAOUsuario();
    //verifico se o usuario realmente existe no banco, vendo a validação dele aqui no controler
     if(this.user.daoBuscarUsuario(codigoUser) != null) {
         usuario = new ModelUsuario();
         return usuario = this.user.daoBuscarUsuario(codigoUser);
    }else{
         return null;
     }   
  }
  /**
   * metodo que faz alteração de um cadastro
     * @param userAtu
   * @return boolean true = se atualizar | false = se der erro
   */
  public boolean controlerAlterarCadastroUsuario(ModelUsuario userAtu) {
     return this.user.daoAlterarCadastroUsuario(userAtu);
  }
  
  /**
   * Metodo que faz a autenticação de um usuario, verifica se o usuario existe no banco
   * @param login
   * @param senha
   * @return Usuario se existe
   */
  public ModelUsuario controlerAutenticarUsuarioLogin(String login,String senha) {
     this.usuario = new ModelUsuario();
     this.user = new DAOUsuario();
     return this.usuario = this.user.daoAutenticarUsuario(login, senha);
  }
}
