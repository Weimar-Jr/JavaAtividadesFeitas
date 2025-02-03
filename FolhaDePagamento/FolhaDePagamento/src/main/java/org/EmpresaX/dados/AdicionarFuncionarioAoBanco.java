package org.EmpresaX.dados;

import org.EmpresaX.Classes.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


class AdicionarFuncionarioAoBanco
{
    public static void adicionarAoBanco(Funcionario funcionario)
    {
        String sql = "INSERT INTO funcionarios (nome, cargo, cpf, setor, salario, recebevaletransporte, horasextras, horasfaltasinjustificadas, horasporsemana) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(sql))
        {
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCargo());
            stmt.setString(3, funcionario.getCpf());
            stmt.setString(4, funcionario.getSetor());
            stmt.setDouble(5, funcionario.getSalario());
            stmt.setBoolean(6, funcionario.getRecebeValeTransporte());
            stmt.setInt(7, funcionario.getHorasExtras());
            stmt.setInt(8, funcionario.getHorasFaltasInjustificadas());
            stmt.setInt(9, funcionario.getHorasPorSemana());

            stmt.executeUpdate();
            System.out.println("Funcionario inserido com sucesso.");

        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
