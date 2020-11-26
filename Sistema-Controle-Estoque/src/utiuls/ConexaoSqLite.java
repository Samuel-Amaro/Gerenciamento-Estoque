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
