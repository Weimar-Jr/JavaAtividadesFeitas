package org.EmpresaX.dados;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

class VerificarSeTemTabela {

    public static void criarTabelaSeNaoExistir()
    {
        // para que se n tiver a tabela, ela ser criada
        String sql = "CREATE TABLE IF NOT EXISTS funcionarios ( id SERIAL PRIMARY KEY,  nome VARCHAR(255), cargo VARCHAR(100)," +
                " cpf VARCHAR(14), setor VARCHAR(100), salario DECIMAL(10, 2), recebe_vale_transporte BOOLEAN, " +
                "horas_extras INT DEFAULT 0, horas_faltas_injustificadas INT DEFAULT 0, horas_por_semana INT);";



        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            Statement stmt = conexao.createStatement())
        {
            stmt.executeUpdate(sql);
        }catch (SQLException e)
        {
            System.out.println("Não foi possivel ser criado o banco de dados, por favor configure as informações do sql no menu");
            System.out.println(e.getMessage());
        }
    }
}
