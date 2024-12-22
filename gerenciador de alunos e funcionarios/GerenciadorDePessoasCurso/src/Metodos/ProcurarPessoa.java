package Metodos;

import dados.Listas;

public class ProcurarPessoa
{
    public static boolean PesquisaPessoa()
    {
        System.out. println("Digite o nome da pessoa que deseja procurar ou cpf: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.estaVazio(procurarPessoa))
        {
            for(int i = 0; i < Listas.todos.size(); i++)
            {
                if(Listas.todos.get(i).getNome().equals(procurarPessoa) || Listas.todos.get(i).getCpf() == (Integer.parseInt(procurarPessoa)))
                {
                    System.out.println("Pessoa numero: " + (i +1)  + "na lista total de pessoas.");
                    Listas.todos.get(i).mostrarInformacoes();

                    return true;
                }

            }

        }
        return false;
    }

    public  static boolean PesquisaAluno()
    {
        System.out. println("Digite o nome do aluno que deseja procurar, ou a matricula dele: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.ehString(procurarPessoa) && Verificador.estaVazio(procurarPessoa)) {
            for (int i = 0; i < Listas.alunos.size(); i++)
            {
                if(Listas.alunos.get(i).getNome().equals(procurarPessoa) || Listas.alunos.get(i).getMatricula().equalsIgnoreCase(procurarPessoa))
                {
                System.out.println("Aluno numero: " + (i +1)  + "na lista de alunos.");
                Listas.alunos.get(i).mostrarInformacoes();

                return true;

                }
            }
        }

        return false;
    }

    public boolean PesquisaProfessor()
    {
        System.out.println("Digite o nome do Professor que deseja achar, ou cpf: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.estaVazio(procurarPessoa)) {
            for (int i = 0; i < Listas.alunos.size(); i++)
            {
                if(Listas.professores.get(i).getNome().equals(procurarPessoa) || Listas.professores.get(i).getCpf() == (Integer.parseInt(procurarPessoa)))
                {
                    System.out.println("Professor numero: " + (i +1)  + "na lista de professores.");
                    Listas.alunos.get(i).mostrarInformacoes();

                    return true;

                }
            }
        }

        return false;

    }
    public boolean PesquisarFuncionario()
    {

        System.out.println("Digite o nome do Funcionario que deseja achar, ou cpf: ");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.estaVazio(procurarPessoa)) {
            for (int i = 0; i < Listas.alunos.size(); i++)
            {
                if(Listas.funcionarios.get(i).getNome().equals(procurarPessoa) || Listas.funcionarios.get(i).getCpf() == (Integer.parseInt(procurarPessoa)))
                {
                    System.out.println("Professor numero: " + (i +1)  + "na lista de funcionarios.");
                    Listas.alunos.get(i).mostrarInformacoes();

                    return true;

                }
            }
        }
        return  false;
    }
}
