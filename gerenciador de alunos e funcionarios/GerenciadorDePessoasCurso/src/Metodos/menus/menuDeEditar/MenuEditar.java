package Metodos.menus.menuDeEditar;

import Metodos.ScannerDeRespostas;

public class MenuEditar
{
    public static boolean menuDeEditar()
    {
        boolean funcionando = true;

        do
        {
        System.out.println("Bem vindo.");
        System.out.println("Digite \"1\" para editar informações de alunos.");
        System.out.println("Digite \"2\" para editar informações de professores.");
        System.out.println("Digite \"3\" para editar infomações de funcionarios.");
        System.out.println("Digite \"4\" para sair desse menu");

            int resposta = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
            switch (resposta)
            {
                case 1:
                    funcionando = subMenuEditar.editarAluno();
                    return funcionando;
                case 2:
                    funcionando = subMenuEditar.editarProfessor();
                    return  funcionando;
                case 3:
                    funcionando = subMenuEditar.editarFuncionario();
                    return funcionando;
                case 4:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção invalida.");
                    break;
            }

        }while(funcionando);

        return false;
    }
}
