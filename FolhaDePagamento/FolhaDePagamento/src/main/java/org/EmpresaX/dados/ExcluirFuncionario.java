package org.EmpresaX.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class ExcluirFuncionario
{
    public static void excluirFuncionario(String identificadorFuncionario)
    {
        String sql = "delete from funcionarios where nome = ? or cpf = ?";

        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt  = conexao.prepareStatement(sql))
        {
            stmt.setString(1, identificadorFuncionario);
            stmt.setString(2, identificadorFuncionario);
            stmt.executeUpdate();
            System.out.println("Funcionario excluido com sucesso.");

        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
