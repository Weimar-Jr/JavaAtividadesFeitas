package org.EmpresaX.Metodos.menus.exibirFuncionarios;

import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class MetodoExibir {
    public static void exbirFuncionarios()
    {
        System.out.println("digite \"1\" para listar todos os funcionarios." );
        System.out.println("digite \"2\" para listar funcionarios do setor de administração." );
        System.out.println("digite \"3\" para listar funcionarios do setor de contabilidade." );
        System.out.println("digite \"4\" para listar funcionarios do setor de TI." );
        System.out.println("digite \"5\" para sair." );

        String resposta = ScannerDeResposta.scannearResposta.nextLine();
        if(VerificarSeEhNumero.ehNumero(resposta))
        {
            int respostaInt = Integer.parseInt(resposta);

            switch (respostaInt)
            {
                case 1:
                    CentralDeConexaoSql.listarTodosFuncionarios();
                    break;
                case 2:
                    CentralDeConexaoSql.listarFuncionariosAdministracao();
                    break;
                case 3:
                    CentralDeConexaoSql.listarFuncionariosContabilidade();
                    break;
                case 4:
                    CentralDeConexaoSql.listarFuncionariosTI();
                    break;
                case 5:
                    System.out.println("Saido com sucesso.");
                default:
                    System.out.println("Por favor apenas digite os numeros que constam no menu.");
            }

        }else{
            System.out.println("Por favor apenas digite numeros para esse menu.");
        }
    }
}
