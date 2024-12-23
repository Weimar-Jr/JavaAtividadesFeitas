package Metodos.menus.menuDeEditar;

import construtores.Pessoa;
import dados.Listas;

public class EditarPessoa
{
    public  static  void atualizarNome(Pessoa pessoa, String nome)
    {
        for( Pessoa pessoas : Listas.todos)
        {
            if(pessoas.getNome().equals(pessoa.getNome()))
            {
                pessoas.setNome(nome);
            }
        }
    }

    public  static  void atualizarIdade(Pessoa pessoa, int idade)
    {
        for(Pessoa pessoas : Listas.todos)
        {
            if(pessoas.getNome().equalsIgnoreCase(pessoa.getNome()))
            {
                pessoas.setIdade(idade);
            }
        }
    }

    public static  void atualizarCpf(Pessoa pessoa, int cpf)
    {
        for(Pessoa pessoas : Listas.todos)
        {
            if(pessoas.getNome().equalsIgnoreCase(pessoa.getNome()))
            {
                pessoas.setCpf(cpf);
            }
        }
    }

    public  static void atualizarFuncao(Pessoa pessoa, String funcao)
    {
        for( Pessoa pessoas : Listas.todos)
        {
            if(pessoas.getNome().equals(pessoa.getNome()))
            {
                pessoas.setFuncao(funcao);
            }
        }
    }

    public static  void atualizarPeriodo(Pessoa pessoa, String periodo)
    {
        for( Pessoa pessoas : Listas.todos)
        {
            if(pessoas.getNome().equals(pessoa.getNome()))
            {
                pessoas.setPeriodo(periodo);
            }
        }
    }
}
