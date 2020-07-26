package utiuls;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoSqLite {

    //metodo que faz a conexão com o banco de dados e retorna a conexão para que chamou e cria
    public static Connection conectaBanco() {
        //variavel que vai receber a conexão
        Connection conexao = null;
        try {
            String url = "jdbc:sqlite:C:/Users/SAMUE/Documents/Meus-Projetos-Git-locais-Remotos-2020/Projeto-Java-Sistema-Controle-Estoque/Banco-Dados-Arquivos/db_info_gerencia_estoque.db";
            //se o metodo se conecta ao banco, e tudo estiver ok, retorna a conexão para quem chamou
             return conexao = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println("Conexão Não Estabelicida com o banco " + e);
            return null; 
        }
    }

}
