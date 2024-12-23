package Metodos.menus.menuProcurarPessoa;

import Metodos.ScannerDeRespostas;

public class menuProcurar
{
    public static  void  menuDeProcurar()
    {
        boolean funcionando = true;

        do {
            System.out.println("Bem vindo.");
            System.out.println("Digite \"1\" para procurar alunos.");
            System.out.println("Digite \"2\" para procurar professores.");
            System.out.println("Digite \"3\" para procurar funcionarios.");
            System.out.println("Digite \"4\" para procurar pessoas");
            System.out.println("Digite \"5\" para sair desse menu");
            int resposta = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

            switch (resposta)
            {
                case 1:
                   funcionando = ProcurarPessoa.PesquisaAluno();
                   break;
                case  2:
                    funcionando = ProcurarPessoa.PesquisaProfessor();
                    break;
                case 3:
                    funcionando = ProcurarPessoa.PesquisarFuncionario();
                    break;
                case 4:
                    funcionando = ProcurarPessoa.PesquisaPessoa();
                    break;
                case 5:
                    funcionando = false;
                default:
                    System.out.println("Opção invalida.");

            }


        }while(funcionando);

    }
}
