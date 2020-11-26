/**
Copyright (C) <2020>  <name of Samuel Amaro>

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
