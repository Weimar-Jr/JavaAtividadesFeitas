package Metodos.menus.excluirPessoa;

import Metodos.ScannerDeRespostas;

public class menuExcluirPessoa
{

    public static boolean excluirPessoa()
    {
        boolean funcionando = true;

        do {
            System.out.println("Bem vindo.");
            System.out.println("Digite \"1\" para excluir alunos.");
            System.out.println("Digite \"2\" para ecluir professores.");
            System.out.println("Digite \"3\" para excluir funcionarios.");
            System.out.println("Digite \"4\" para sair desse menu");

            int resposta = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

            switch (resposta) {
                case 1:
                    funcionando = subMenuExcluirPessoa.excluirAluno();
                    break;
                case 2:
                    funcionando = subMenuExcluirPessoa.excluirProfessor();
                    break;
                case 3:
                    funcionando = subMenuExcluirPessoa.excluirFuncionario();
                    break;
                case 4:
                    System.out.println("saindo...");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }while (funcionando);
        return false;
    }

}
