package org.EmpresaX.dados;

import org.EmpresaX.Classes.Funcionario;
import org.EmpresaX.Metodos.ScannerDeResposta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ProcurarFuncionario
{
    //aqui só vai pesquisar um funcionario e exibir as infomações dele e no final perguntar se quer editar algum dado dele

    public static Funcionario procurarFuncionario()
    {
        System.out.println("Digite o nome do funcionario ou o cpf dele só com os numeros: ");
        String nomeOuCpf = ScannerDeResposta.scannearResposta.nextLine();
        String query = "select * from funcionarios  where nome = ? or cpf = ?";
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(query))
        {
            //definindo paramentros para consulta
            stmt.setString(1, nomeOuCpf);
            stmt.setString(2, nomeOuCpf);

            //executando a query
            ResultSet resultado = stmt.executeQuery();
            Funcionario funcionario = new Funcionario(resultado.getString("nome"), resultado.getString("cargo"),
                    resultado.getString("cpf"), resultado.getString("setor"), resultado.getDouble("salario"),
                    resultado.getBoolean("recebevaletransporte"), resultado.getInt("horasporsemana"));
            return funcionario;

        } catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }

    }
}
