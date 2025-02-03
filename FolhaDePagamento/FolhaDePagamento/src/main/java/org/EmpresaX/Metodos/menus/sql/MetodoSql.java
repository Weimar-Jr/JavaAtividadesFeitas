package org.EmpresaX.Metodos.menus.sql;

import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class MetodoSql {
    public static void configurarSql()
    {
        boolean funcionando = true;
        while (funcionando) {
            System.out.println("Digite \"1\" para exibir nome do banco de dados.");
            System.out.println("Digite \"2\" para editar o nome do banco de dados.");
            System.out.println("Digite \"3\" para exibir o url da conexão.");
            System.out.println("Digite \"4\" para para editar o url da conexão.");
            System.out.println("Digite \"5\" para exibir o url completo.");
            System.out.println("Digite \"6\" para exibir o nome de usuario.");
            System.out.println("Digite \"7\" para editar o nome de usuario.");
            System.out.println("Digite \"8\" para exibir a senha sql.");
            System.out.println("Digite \"9\" para editar a senha sql.");
            System.out.println("Digite \"10\" para verificar se ja tem a tabela criada e se não estiver criada, criar automaticamente.");
            System.out.println("Digite \"11\" para sair.");

            String resposta = ScannerDeResposta.scannearResposta.nextLine();
            if(VerificarSeEhNumero.ehNumero(resposta))
            {
                int respostaInt = Integer.parseInt(resposta);

                switch (respostaInt)
                {
                    case 1:
                        System.out.println(CentralDeConexaoSql.getNomeBanco());
                        break;
                    case 2:
                        System.out.println("Digite o nome para alterar no sistema.");
                        String resposta2 = ScannerDeResposta.scannearResposta.nextLine();
                        CentralDeConexaoSql.setNomeBanco(resposta2);
                        System.out.println("Nome alterado com sucesso.");
                        break;
                    case 3:
                        System.out.println(CentralDeConexaoSql.getUrl());
                        break;
                    case 4:
                        System.out.println("Digite o url para alterar no sistema.");
                        String resposta4 = ScannerDeResposta.scannearResposta.nextLine();
                        CentralDeConexaoSql.setNomeBanco(resposta4);
                        System.out.println("Url alterado com sucesso.");
                        break;
                    case 5:
                        System.out.println(CentralDeConexaoSql.getUrlSqlCompleto());
                        break;
                    case 6:
                        System.out.println(CentralDeConexaoSql.getNomeUsuarioSql());
                        break;
                    case 7:
                        System.out.println("Digite o nome de usuario para alterar no sistema.");
                        String resposta7 = ScannerDeResposta.scannearResposta.nextLine();
                        CentralDeConexaoSql.setNomeBanco(resposta7);
                        System.out.println("Nome de usuario alterado com sucesso.");
                        break;
                    case 8:
                        System.out.println(CentralDeConexaoSql.getSenhaSql());
                        break;
                    case 9:
                        System.out.println("Digite a senha para alterar no sistema.");
                        String resposta8 = ScannerDeResposta.scannearResposta.nextLine();
                        CentralDeConexaoSql.setNomeBanco(resposta8);
                        System.out.println("NSenha alterada com sucesso.");
                        break;
                    case 10:
                        CentralDeConexaoSql.VerificarTabela();
                        break;
                    case 11:
                        System.out.println("saindo...");
                        funcionando = false;
                        break;
                    default:
                        System.out.println("Apenas digite os numeros das opções mostradas.");


                }
            }else{
                System.out.println("Por favor só digite numeros das opções");
            }
        }
    }
}
