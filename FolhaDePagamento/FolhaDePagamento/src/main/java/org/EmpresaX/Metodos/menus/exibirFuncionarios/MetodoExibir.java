package org.EmpresaX.Metodos.menus.exibirFuncionarios;

import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class MetodoExibir {
    public static void exibirFuncionarios()
    {
        System.out.println("digite \"1\" para listar todos os funcionarios." );
        System.out.println("digite \"2\" para listar funcionarios do setor de administração." );
        System.out.println("digite \"3\" para listar funcionarios do setor de contabilidade." );
        System.out.println("digite \"4\" para listar funcionarios do setor de Rh." );
        System.out.println("digite \"5\" para listar funcionarios do setor de TI." );
        System.out.println("digite \"6\" para sair." );

        String resposta = ScannerDeResposta.scannearResposta.nextLine();
        if(VerificarSeEhNumero.ehNumero(resposta))
        {
            int respostaInt = Integer.parseInt(resposta);

            switch (respostaInt)
            {
                case 1:
                    CentralDeConexaoSql.listarFuncionarios("tudo");
                    break;
                case 2:
                    CentralDeConexaoSql.listarFuncionarios("Administração");
                    break;
                case 3:
                    CentralDeConexaoSql.listarFuncionarios("Contabilidade");
                    break;
                case 4:
                    CentralDeConexaoSql.listarFuncionarios("RH");
                    break;
                case 5:
                    CentralDeConexaoSql.listarFuncionarios("TI");
                    break;
                case 6:
                    System.out.println("Saido com sucesso.");
                    break;
                default:
                    System.out.println("Por favor apenas digite os numeros que constam no menu.");
                    break;
            }

        }else{
            System.out.println("Por favor apenas digite numeros para esse menu.");
        }
    }
}
