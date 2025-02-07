package org.EmpresaX.dados;

import org.EmpresaX.Metodos.contabilidade.Contabilidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class ListarFuncionarios {

    public static void listarFuncionarios (String setor)
    {
        if(setor.equalsIgnoreCase("tudo")) {
            String query = "select * from funcionarios; ";
            try (Connection conexao = ConexaoPostegreSQL.Conexao();
                 PreparedStatement stmt = conexao.prepareStatement(query)) {
                ResultSet resultado = stmt.executeQuery();


                while (resultado.next()) {
                    System.out.println("=========================================");
                    System.out.println("Nome: " + resultado.getString("nome"));
                    System.out.println("Cpf: " + resultado.getString("cpf"));
                    System.out.println("Cargo: " + resultado.getString("cargo"));
                    System.out.println("Setor: " + resultado.getString("setor"));
                    Contabilidade.calcularFolha(resultado.getBigDecimal("salario"), resultado.getBoolean("recebe_vale_transporte"), resultado.getInt("horas_extras"), resultado.getInt("horas_faltas_injustificadas"), resultado.getInt("horas_por_semana"));
                } ;

                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            String query = "select * from funcionarios where setor = ?;";
            try (Connection conexao = ConexaoPostegreSQL.Conexao();
                 PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, setor);
                ResultSet resultado = stmt.executeQuery();


                while (resultado.next()) {
                        System.out.println("=========================================");
                        System.out.println("Nome: " + resultado.getString("nome"));
                        System.out.println("Cpf: " + resultado.getString("cpf"));
                        System.out.println("Cargo: " + resultado.getString("cargo"));
                        System.out.println("Setor: " + resultado.getString("setor"));
                        Contabilidade.calcularFolha(resultado.getBigDecimal("salario"), resultado.getBoolean("recebe_vale_transporte"), resultado.getInt("horas_extras"), resultado.getInt("horas_faltas_injustificadas"), resultado.getInt("horas_por_semana"));
                };
                resultado.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
