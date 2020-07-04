package dao;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexaoSqLite {
    //metodo que cria o banco dados

    public static void criaBanco() {
        //caminho de onde o banco de dados esta salvo, se não existe o banco ele ja cria automatico
        String url = "jdbc:sqlite:C:/Users/SAMUE/Documents/Meus-Projetos-Git-locais-Remotos-2020/Projeto-Java-Sistema-Controle-Estoque/Banco-Dados-Arquivos/db_info_gerencia_estoque.db";
        //trando possiveis erros que pode ocorrer
        try ( Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "Banco de Dados Não Criado!");
        }
    }

    //metodo que faz a conexão com o banco de dados e retorna a conexão para que chamou e cria
    public static Connection conectaBanco() {
        //variavel que vai receber a conexão
        Connection conexao = null;
        try {
            String url = "dbc:sqlite:C:/Users/SAMUE/Documents/Meus-Projetos-Git-locais-Remotos-2020/Projeto-Java-Sistema-Controle-Estoque/Banco-Dados-Arquivos/db_info_gerencia_estoque.db";
            //se o metodo se conecta ao banco, e tudo estiver ok, retorna a conexão para quem chamou
            return conexao = DriverManager.getConnection(url);
            //System.out.println("Conexão Não Estabelecidada Com o banco");
        } catch (SQLException e) {
            return null;
            //System.out.println("Conexão Não Estabelecidada Com o banco");
        }
    }
    
    //metodo que cria tabelas no banco de dados
    public static boolean createTable(String sql) {
        //variaveis necessarias
        PreparedStatement ps;
        Connection conexao;
        //primeiro se conectando ao banco de dados
        String url = "dbc:sqlite:C:/Users/SAMUE/Documents/Meus-Projetos-Git-locais-Remotos-2020/Projeto-Java-Sistema-Controle-Estoque/Banco-Dados-    Arquivos/db_info_gerencia_estoque.db";
        //executando consulta sql
        try {
            //primeiro fzd conexão com o banco de dados
             conexao = DriverManager.getConnection(url);
             //tratando consulta sql de criar tabela
             ps = conexao.prepareStatement(sql);
             //mandando executar consulta
             ps.execute();
             return true;
        } catch (SQLException e) {
                 //se não de certo
                 System.out.println("Tabela Não Criada" + e);
                 return false;
        }
    }
}
