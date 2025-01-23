package org.EmpresaX.dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ListarFuncionarios {

    public static void listarTodosOsFuncionario()
    {
        String query = "select * from funcionarios";
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(query))
        {
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next())
            {
                System.out.println("=========================================");
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Cpf: " + resultado.getString("cpf"));
                System.out.println("Cargo: " + resultado.getString("cargo"));
                System.out.println("Setor: " + resultado.getString("setor"));
                System.out.println("Salario: " + resultado.getDouble("salario"));
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void listarFuncionariosAdministracao()
    {
        String query = "select * from funcionarios where = Administração";
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(query))
        {
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next())
            {
                System.out.println("=========================================");
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Cpf: " + resultado.getString("cpf"));
                System.out.println("Cargo: " + resultado.getString("cargo"));
                System.out.println("Salario: " + resultado.getDouble("salario"));
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void listarFuncionariosContabilidade()
    {
        String query = "select * from funcionarios where = Contabilidade";
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(query))
        {
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next())
            {
                System.out.println("=========================================");
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Cpf: " + resultado.getString("cpf"));
                System.out.println("Cargo: " + resultado.getString("cargo"));
                System.out.println("Salario: " + resultado.getDouble("salario"));
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    public static void listarFuncionariosTI()
    {
        String query = "select * from funcionarios where = TI";
        try(Connection conexao = ConexaoPostegreSQL.Conexao();
            PreparedStatement stmt = conexao.prepareStatement(query))
        {
            ResultSet resultado = stmt.executeQuery();
            while(resultado.next())
            {
                System.out.println("=========================================");
                System.out.println("Nome: " + resultado.getString("nome"));
                System.out.println("Cpf: " + resultado.getString("cpf"));
                System.out.println("Cargo: " + resultado.getString("cargo"));
                System.out.println("Salario: " + resultado.getDouble("salario"));
            }

        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

}
