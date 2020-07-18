package dao;

import model.Usuario;
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
     Usuario user = new Usuario();
     /**
      * 
      * @param novoUsuario
      * @return 
      */
    //metodo que vai salvar um usuario no banco de dados, como parametro tem que receber um usuario com informações, existentes
    public boolean salvarUsuario(Usuario novoUsuario){
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
               con.close();//fechando consulta do banco e encerrando recursos de conexão com o banco
               return true;
            }else {
                //erro ao adiconar o usuario ao banco de dados
                return false;
            }
        } catch (SQLException e) {
                System.out.println("Erro ao salvar Usuario no banco de dados " + e);
                return false;
        }
      
      
    }
    
    /**
     * Metodo que vai retorna dados de todos os usuarios, vai trazer todos os usurios cadastrados no banco de dados.
     * @return 
     * @return: uma lista de objeto usuario
     */
    public List<Usuario> getListaUsuario() {
     //criando a lista de usuario, so que vazia
     List<Usuario> listaUsuarios;
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
                  user = new Usuario();
                  user.setCodigoId(rs.getInt(1)); //codigo id
                  user.setNome(rs.getString(2)); //nome
                  user.setLogin(rs.getString(3));//login
                  user.setSenha(rs.getString(4)); //senha
                  //populou o objeto, adicione ele a minha lista de usuarios
                  listaUsuarios.add(user);
            }
            ps.close();
        } catch (SQLException e) {
                System.out.println("Não foi possivel, busca a lista de usuarios no banco" + e);
                return null;
        }
        return listaUsuarios;
    }
}
