package Metodos.menus.excluirPessoa;

import Metodos.ScannerDeRespostas;
import Metodos.Verificador;
import construtores.Alunos;
import construtores.Funcionarios;
import construtores.Pessoa;
import construtores.Professores;
import dados.Listas;

public class subMenuExcluirPessoa
{
    public static boolean excluirAluno()
    {
        System.out.println("Digite o nome ou matricula do aluno que sera excluido do banco de dados: ");
        String resposta  = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.estaVazio(resposta))
        {
            for(Alunos aluno : Listas.alunos)
            {
                if (aluno.getNome().equalsIgnoreCase(resposta) || aluno.getMatricula().equalsIgnoreCase(resposta))
                {
                    aluno.mostrarInformacoes();
                    System.out.println("Deseja mesmo excluir esse aluno? [s/n]");
                    String resposta2 = ScannerDeRespostas.scannearResposta.nextLine();

                    if(resposta2.equalsIgnoreCase("S"))
                    {
                        excluirPessoa(aluno);
                        Listas.alunos.remove(aluno);
                        System.out.println("Aluno exluido com sucesso");
                        return false;
                    }
                    System.out.println("Cancelado com sucesso.");
                    return false;
                }
            }
        }

        System.out.println("resposta invalida.");
        return true;
    }

    public static boolean excluirProfessor()
    {
        System.out.println("Digite o nome ou cpf do professor que sera excluido: ");
        String resposta = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.estaVazio(resposta))
        {
            for(Professores professor : Listas.professores)
            {
                if(professor.getNome().equalsIgnoreCase(resposta) || professor.getCpf() == Integer.parseInt(resposta))
                {
                    professor.mostrarInformacoes();
                    System.out.println("Deseja mesmo excluir o professor? [s/n]");
                    String resposta2 = ScannerDeRespostas.scannearResposta.nextLine();
                    if(resposta2.equalsIgnoreCase(resposta2))
                    {
                        excluirPessoa(professor);
                        Listas.professores.remove(professor);
                        System.out.println("Professor excluido com sucesso.");
                        return false;
                    }

                    System.out.println("Cancelado com sucesso.");
                    return false;
                }
            }
        }

        System.out.println("resposta invalida.");
        return  true;
    }

    public  static  boolean excluirFuncionario()
    {
        System.out.println("Digite o nome ou cpf do funcionario que sera excluir: ");
        String resposta = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.estaVazio(resposta))
        {
            for(Funcionarios funcionario : Listas.funcionarios)
            {
                if(funcionario.getNome().equalsIgnoreCase(resposta) || funcionario.getCpf() == Integer.parseInt(resposta))
                {

                    funcionario.mostrarInformacoes();
                    System.out.println("Deseja mesmo excluir o funcionario? [s/n]");
                    String resposta2 = ScannerDeRespostas.scannearResposta .nextLine();

                    if(resposta2.equalsIgnoreCase("s"))
                    {
                        Listas.funcionarios.remove(funcionario);
                        excluirPessoa(funcionario);
                        System.out.println("Funcionario excluido com sucesso.");
                        return false;
                    }

                    System.out.println("Cancelado com sucesso.");
                    return false;
                }
            }

        }

        System.out.println("Resposta invalida.");
        return true;
    }

    public  static void excluirPessoa(Pessoa pessoa)
    {
        for (Pessoa pessoa1 : Listas.todos)
        {
            if(pessoa1.equals(pessoa))
            {
                Listas.todos.remove(pessoa1);
            }
        }
    }

}
