package Metodos.menus.menuDeEditar;

import Metodos.ScannerDeRespostas;
import Metodos.Verificador;
import construtores.Alunos;
import construtores.Funcionarios;
import construtores.Professores;
import dados.Listas;

public class subMenuEditar
{
    public static boolean editarAluno()
    {
        System.out.println("Digite o nome ou matricula do aluno de quem voçê deseja editar");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.ehString(procurarPessoa) && Verificador.estaVazio(procurarPessoa)) {
            for (int i = 0; i < Listas.alunos.size(); i++)
            {
                if(Listas.alunos.get(i).getNome().equals(procurarPessoa) || Listas.alunos.get(i).getMatricula().equalsIgnoreCase(procurarPessoa))
                {
                    Alunos pessoas =  Listas.alunos.get(i);
                    if(pessoas.getNome().equalsIgnoreCase(procurarPessoa) || pessoas.getMatricula().equalsIgnoreCase(procurarPessoa))
                    {
                        boolean concluiuCadastro = ContinuacaoSubMenuEditar.editarAluno(pessoas);
                        if(!concluiuCadastro)
                        {
                            return concluiuCadastro;
                        }
                    }
                }
            }
        }
        System.out.println("Aluno não encontrado ou resposta invalida");
        return true;
    }

    public static boolean editarProfessor()
    {
        System.out.println("Digite o nome ou o cpf do professor que deseja editar: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.estaVazio(procurarPessoa))
        {
            for(Professores professor : Listas.professores)
            {
                if(professor.getNome().equalsIgnoreCase(procurarPessoa) || professor.getCpf() == Integer.parseInt(procurarPessoa))
                {
                    boolean continuar = ContinuacaoSubMenuEditar.editarProfessor(professor);
                    if(!continuar)
                    {
                        return  continuar;
                    }
                }
            }
            return true;
        }
        System.out.println("Professor não emcpmtrado ou resposta invalida.");
        return true;
    }

    public static boolean editarFuncionario()
    {
        System.out.println("Digite o nome ou o cpf do funcionario que deseja editar: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.estaVazio(procurarPessoa))
        {
            for(Funcionarios funcionario : Listas.funcionarios)
            {
                if(funcionario.getNome().equalsIgnoreCase(procurarPessoa) || funcionario.getCpf() == Integer.parseInt(procurarPessoa))
                {
                    boolean continuar = ContinuacaoSubMenuEditar.editarFuncionario(funcionario);
                    if(!continuar)
                    {
                        return  continuar;
                    }
                }
            }
            return true;
        }
        System.out.println("Professor não emcpmtrado ou resposta invalida.");
        return true;
    }
}
