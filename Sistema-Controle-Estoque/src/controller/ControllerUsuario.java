package controller;

import dao.DAOUsuario;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 * Classe que controla a validação de dados para o banco de dados 
 * @author SAMUE
 */

public class ControllerUsuario {
   //variaveis necessaria
   private DAOUsuario user;

    public DAOUsuario getUser() {
        return user;
    }

    public void setUser(DAOUsuario user) {
        this.user = user;
    }
  
  /**
   * 
   * @param novoUsuario
   * @return boolean 
   */  
  public boolean controlerSalvarUsuario(Usuario novoUsuario) {
      this.user = new DAOUsuario();
      return this.user.salvarUsuario(novoUsuario);
  }

  /**
   * retorna todos os usuarios cadastrados no sistema
   * @return List<Usuario> 
   */
  public List<Usuario> getUsuariosControler() {
      user = new DAOUsuario();
      return this.user.getListaUsuario();
  }
}
