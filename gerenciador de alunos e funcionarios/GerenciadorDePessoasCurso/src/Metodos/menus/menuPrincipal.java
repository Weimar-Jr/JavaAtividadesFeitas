package Metodos.menus;
import Metodos.*;
import Metodos.menus.menuDeAdicionar.menuAdicionar;
import Metodos.menus.excluirPessoa.menuExcluirPessoa;
import Metodos.menus.menuProcurarPessoa.menuProcurar;
import  Metodos.menus.menuDeEditar.MenuEditar;
import construtores.Pessoa;
import dados.Listas;


public class menuPrincipal
{
    public static boolean Menu()
    {
        boolean funcionando = true;
        do{
            System.out.println("Bem vindo.");
            System.out.println("Digite \"1\" para adicionar pessoa ao banco de dados..");
            System.out.println("Digite \"2\" para pesquisar pessoa no banco de dados.");
            System.out.println("Digite \"3\" para editar infomações de uma pessoa do banco de dados.");
            System.out.println("Digite \"4\" para excluir pessoa do banco de dados.");
            System.out.println("Digite \"5\" para ver lista completa de pessoas.");
            System.out.println("Digite \"6\" para sair");
            int resposta = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

            switch (resposta)
            {
                case 1:
                    menuAdicionar.adicionarPessoa();
                    break;
                case 2:
                    menuProcurar.menuDeProcurar();
                    break;
                case 3:
                    MenuEditar.menuDeEditar();
                    break;
                case 4:
                    menuExcluirPessoa.excluirPessoa();
                    break;
                case 5:
                    for(Pessoa pessoa : Listas.todos)
                    {
                        pessoa.mostrarInformacoes();
                        break;
                    }
                case 6:
                    funcionando = false;
                    break;
                default:
                    System.out.println("Opção invalida.");

            }



        }while(funcionando);

        return funcionando;
    }
}
