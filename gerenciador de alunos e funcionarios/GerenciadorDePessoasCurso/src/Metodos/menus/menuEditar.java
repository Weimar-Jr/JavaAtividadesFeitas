package Metodos.menus;

import Metodos.ScannerDeRespostas;
import Metodos.Verificador;
import dados.Listas;

public class menuEditar
{
    public boolean editarAluno()
    {
        System.out.println("Digite o nome ou matricula do aluno de quem voçê deseja aeditar");
        String procurarPessoa = ScannerDeRespostas.scannearResposta.nextLine();

        if(Verificador.ehString(procurarPessoa) && Verificador.estaVazio(procurarPessoa)) {
            for (int i = 0; i < Listas.alunos.size(); i++)
            {
                if(Listas.alunos.get(i).getNome().equals(procurarPessoa) || Listas.alunos.get(i).getMatricula().equalsIgnoreCase(procurarPessoa))
                {



                }
            }
        }


        return false;
    }
}
