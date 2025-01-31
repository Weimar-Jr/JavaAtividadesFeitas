package org.EmpresaX.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*como tudo pode ser convertido pra string e depois convertido para o tipo antenrior, fica facil conseguir usar esse metodo só
pra usar o metodo pra ja alterar sem ter que fazer isso em toda parte de um metodo de edição
 */


class EditarInformacaoFuncionario
{
    public static void Editar(String identificadorFuncionario, String sql, String identificadorTipodeDado, String novoDado)
    {
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql))
        {
            if(identificadorTipodeDado.equalsIgnoreCase("int"))
            {
                stmt.setString(1, identificadorFuncionario);
                stmt.setInt(2, Integer.parseInt(novoDado));
                stmt.executeUpdate();
                System.out.println("Dado atualizado com sucesso.");
            }else if(identificadorTipodeDado.equalsIgnoreCase("String"))
            {
                stmt.setString(1, identificadorFuncionario);
                stmt.setString(2, novoDado);
                stmt.executeUpdate();
                System.out.println("Dado atualizado com sucesso.");
            }
            else if(identificadorTipodeDado.equalsIgnoreCase("Double"))
            {
                stmt.setString(1, identificadorFuncionario);
                stmt.setDouble(2, Double.parseDouble(novoDado));
                stmt.executeUpdate();
                System.out.println("Dado atualizado com sucesso.");
            }
            else if(identificadorTipodeDado.equalsIgnoreCase("boolean"))
            {
                stmt.setString(1, identificadorFuncionario);
                stmt.setBoolean(2, Boolean.parseBoolean(novoDado));
                stmt.executeUpdate();
                System.out.println("Dado atualizado com sucesso.");
            }
            else
            {
                System.out.println("Opção inexistente.");
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
