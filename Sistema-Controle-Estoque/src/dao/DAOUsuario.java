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
package dao;

import utiuls.ConexaoSqLite;
import model.ModelUsuario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Nessa classe e onde vai acontecer toda manipulação do usuario, onde vou salvar,altera,excluir usuario.
 * o CRUD usuario, vai se encontrar nessa classe
*/

//trabalhando com herança aqui, a classe DAOusuario vai herdar tudo da classe De Conexão, que faz conexão com o banco de dados
public class DAOUsuario extends ConexaoSqLite{
 
    //variaveis necessarias
    //variavel que prepara consulta sql
    PreparedStatement ps;
    //variavel que armazena a conexão com o banco de dados
    Connection con;
    //variavel que vai armazenar os dados vindo do banco de dados, vão ser muitos dados
     ResultSet rs = null;
     ModelUsuario user = new ModelUsuario();
     /**
      * 
      * @param novoUsuario
      * @return 
      */
    //metodo que vai salvar um usuario no banco de dados, como parametro tem que receber um usuario com informações, existentes
    public boolean daoSalvarUsuario(ModelUsuario novoUsuario){
      //consulta sql
      String sql = "INSERT INTO "
              + "tbl_usuario("
              + "nome,"
              + "login,"
              + "senha)"
              + "VALUES(?,?,?);";
        try {
            //preparando inserção para o banco de dados
            con = conectaBanco();
            ps = con.prepareStatement(sql);
            //setando dados na consulta sql
            ps.setString(1,novoUsuario.getNome());
            ps.setString(2,novoUsuario.getLogin());
            ps.setString(3,novoUsuario.getSenha());
            int adicionado = ps.executeUpdate();
            //retorna a quantidade de linhas inseridas ou atualizadas no banco de dados
            if(adicionado > 0) {
               //adiconou usuario com sucesso no banco de dados 
               ps.close();//fechando consulta do banco e encerrando recursos de conexão com o banco
               con.close();
               return true;
            }else {
                //erro ao adiconar o usuario ao banco de dados
                return false;
            }
        } catch (SQLException e) {
                System.out.println("Erro ao salvar Usuario no banco de dados\n daoSalvarUsuario: " + e);
                return false;
        } 
    }
    
    /**
     * Metodo que vai retorna dados de todos os usuarios, vai trazer todos os usurios cadastrados no banco de dados.
     * @return 
     * @return: uma lista de objeto usuario
     */
    public List<ModelUsuario> daoGetListaUsuario() {
     //criando a lista de usuario, so que vazia
     List<ModelUsuario> listaUsuarios;
     //criando um obejto usuario que vai receber os dados temporariamente, de um usuario que veio do banco de dados
     listaUsuarios = new ArrayList<>();
     
     //consulta sql que traz todos os usuarios cadastrados no banco de dados
     String sql = "SELECT * FROM tbl_usuario";
        try {
            con = conectaBanco();//istanciando conexão
            ps = con.prepareStatement(sql);//preparando consulta
            rs = ps.executeQuery();//executando consulta
            //o rs vai receber muitos dados, por isso temos que percorrer todo o rs para tratar os dados
            while(rs.next()) {
                  //enquanto tiver dados no rs, faça o seguinte
                  //popule um obejto usuario com os dados
                  user = new ModelUsuario();
                  user.setCodigoId(rs.getInt(1)); //codigo id
                  user.setNome(rs.getString(2)); //nome
                  user.setLogin(rs.getString(3));//login
                  user.setSenha(rs.getString(4)); //senha
                  //populou o objeto, adicione ele a minha lista de usuarios
                  listaUsuarios.add(user);
            }
            ps.close();
            con.close();
        } catch (SQLException e) {
                System.out.println("Não foi possivel, busca a lista de usuarios no banco\n daoGetListaUsuario: " + e);
                return null;
        }
        return listaUsuarios;
    }
    
    /**
     * Metodo que exclui um usuario do banco de dados, informando o codigo dele
     * @param codigoUser
     * @return boolean
     */
    public boolean daoExcluirUsuario(int codigoUser) {
       String sqlDelete = "DELETE FROM tbl_usuario WHERE pk_codigo_usuario = " + codigoUser + ";"; 
        try {
            con = conectaBanco();
            ps = con.prepareStatement(sqlDelete);
            int resultadoSql = ps.executeUpdate();
            if(resultadoSql > 0) {
               ps.close();
               con.close();
               return true; 
            }else{
                 return false;
            }   
        } catch (SQLException e) {
                 System.out.println("Erro ao Excluir Usuario do banco de dados, DaoExcluirUsuario: " + e);
                 return false;
        }
    }
    
    /**
     * Metodo que busca um usuario no banco de dados, se tiver como uma informação previa o codigo dele no banco de dados
     * @param codigoUser
     * @return Usuario
     */
    public ModelUsuario daoBuscarUsuario(int codigoUser) {
      String sqlSelect = "SELECT pk_codigo_usuario,"
              +          "nome,"
              +          "login,"
              +          "senha "
              +          "FROM tbl_usuario "
              +          "WHERE pk_codigo_usuario = " + codigoUser;  
        try {
            con = conectaBanco();
            ps = con.prepareStatement(sqlSelect);
            rs = ps.executeQuery();
            //usuario existe no banco ? true
            if(rs.next()) {
               this.user = new ModelUsuario();
               user.setCodigoId(rs.getInt(1));
               user.setNome(rs.getString(2));
               user.setLogin(rs.getString(3));
               user.setSenha(rs.getString(4));
               ps.close();
               con.close();
               return user;
            }else{
                return null;
            }
        } catch (SQLException e) {
                 System.out.println("Erro ao Buscar Usuario do banco de dados, daoBuscarUsuario:\n" + e);
                 return null;
        }
    }
    /**
     * Metodo que altera o cadastro de um usuario existente
     * @param user
     * @return true = se alterou | false = se não alterou
     */
    public boolean daoAlterarCadastroUsuario(ModelUsuario user) {
        String sqlUpdate = "UPDATE tbl_usuario SET "
                         + "nome = ?,"
                         + "login = ?,"
                         + "senha = ? "
                         + "WHERE pk_codigo_usuario = ?;";
        try {
            con = conectaBanco();
            ps = con.prepareStatement(sqlUpdate);
            ps.setString(1,user.getNome());
            ps.setString(2,user.getLogin());
            ps.setString(3,user.getSenha());
            //qual cadastro de usuario vou atualizar
            ps.setInt(4,user.getCodigoId());
            //executando consulta
            int resultSql = ps.executeUpdate();
            //modificou uma linha no banco
            if(resultSql > 0) {
               ps.close();
               con.close();
               return true; 
            }else{
                return false;
            }
        } catch (SQLException e) {
                System.out.println("Atualização de Cadastro de um usuario Falhou\n daoAlterarCadastroUsuario: \n" + e);
        }
        return false;
    }
    /**
     * Metodo que faz a autenticação de um usuario(login) verificar se o usuario existe no banco, se esta cadastrado
     * @param login
     * @param senha
     * @return ModelUsaurio(Se existe) | null(se não existe)
     */
    public ModelUsuario daoAutenticarUsuario(String login,String senha) {
      String sqlSelect = "SELECT pk_codigo_usuario,"
                       + "nome,"
                       + "login,"
                       + "senha FROM tbl_usuario "
                       + "WHERE login = ?"
                       + " AND senha = ?;"; 
        try {
            con = conectaBanco();
            ps = con.prepareStatement(sqlSelect);
            ps.setString(1, login);
            ps.setString(2, senha);
            rs = ps.executeQuery();
            if(rs.next()) {
               this.user = new ModelUsuario();
               this.user.setCodigoId(rs.getInt(1));
               this.user.setNome(rs.getString(2));
               this.user.setLogin(rs.getString(3));
               this.user.setSenha(rs.getString(4));
               ps.close();
               con.close();
               return this.user;
            }else{
                 return null;
            }
        } catch (SQLException e) {
                 System.out.println("Autenticação de Usuario Falhou\n daoAutenticarUsuario: \n" + e);
                 return null;
        }
    }
}
