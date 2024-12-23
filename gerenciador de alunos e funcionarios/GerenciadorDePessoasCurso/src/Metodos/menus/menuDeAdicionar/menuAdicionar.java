package Metodos.menus.menuDeAdicionar;

import Metodos.ScannerDeRespostas;

public class menuAdicionar
{
    public static void adicionarPessoa()
    {
        boolean funcionando = true;

        do {
            System.out.println("Bem vindo.");
            System.out.println("Digite \"1\" para adicionar alunos.");
            System.out.println("Digite \"2\" para adicionar professores.");
            System.out.println("Digite \"3\" para adicionar funcionarios.");
            System.out.println("Digite \"4\" para sair desse menu");
            int resposta = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

            switch (resposta) {
                case 1:
                    funcionando = Adicionar.AdicionarAluno();
                    break;
                case 2:
                    funcionando = Adicionar.AdicionarProfessor();
                    break;
                case 3:
                    funcionando = Adicionar.AdiconarFuncionario();
                    break;
                case 4:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção invalida.");

            }
        }while(funcionando);
    }
}
