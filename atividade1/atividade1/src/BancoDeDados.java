import java.util.ArrayList;

public  class BancoDeDados
{
     ArrayList<Pessoa> Lista;

     public void MostrarLista()
    {
        if (Lista.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            for (int i = 0; i < Lista.size(); i++) {
                Pessoa pessoa = Lista.get(i);
                System.out.println("Pessoa numero: " + (i + 1));
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                pessoa.EhMaiorQueDezoito();
                System.out.println("===================================");

            }
        }
    }

    public void Adicionar()
    {
        System.out.println("Digite o nome da pessoa: ");
        String respostaNome = ScannerResposta.scanner.nextLine();
        int respostaIdade = Integer.parseInt(ScannerResposta.scanner.nextLine());
        System.out.println("Nome: " + respostaNome);
        System.out.println("Idade: " + respostaIdade);
        System .out.println("Esta correto? [s/n]");
        String resposta = ScannerResposta.scanner.nextLine();
        if(resposta.equalsIgnoreCase("s"))
        {
            System.out.println("Pessoa salva com sucesso.");
            Pessoa pessoa = new Pessoa(respostaNome, respostaIdade);
            Lista.add(pessoa);
        }
        else if(resposta.equalsIgnoreCase("n"))
        {
            System.out.println("Cancelado com sucesso");
        }
        else
        {
            System.out.println("Opção invalida.");
        }

    }

    public String BuscarPessoa()
    {
        System.out.println("Digite o nome da pessoa: ");
        String nome = ScannerResposta.scanner.nextLine();
        for(int i = 0 ; i < Lista.size(); i++)
        {
            Pessoa pessoa = Lista.get(i);
            if(pessoa.getNome().equalsIgnoreCase(nome))
            {
                System.out.println("Pessoa numero: " + (i+1));
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: "+ pessoa.getIdade());
                pessoa.EhMaiorQueDezoito();
                return " ";
            }
        }
        return null;
    }

    public String EditarPessoa()
    {
        System.out.println("Digite o nome da pessoa: ");
        String nome = ScannerResposta.scanner.nextLine();

        for(Pessoa pessoa : Lista)
        {
            if(pessoa.getNome().equalsIgnoreCase(nome))
            {
                System.out.println("Digite \"1\" para editar o nome.");
                System.out.println("Digite \"2\" para editar a idade.");
                System.out.println("Digite \"3\" para sair.");

                int resposta = Integer.parseInt(ScannerResposta.scanner.nextLine());
                if(resposta == 1)
                {
                    System.out.println("Digite o novo nome: ");
                    String respostaNome = ScannerResposta.scanner.nextLine();
                    pessoa.setNome(respostaNome);
                    System.out.println("Nome alterado com sucesso");
                    return "";
                } else if (resposta == 2)
                {
                    System.out.println("Digite a nova idade: ");
                    int respostaIdade = Integer.parseInt(ScannerResposta.scanner.nextLine());
                    pessoa.setIdade(respostaIdade);
                    System.out.println("Idade alterada com sucesso");
                    return"";
                } else if (resposta == 3)
                {
                    System.out.println("Você saiu com sucesso.");
                    return"";
                }
                else
                {
                    System.out.println("Opção invalida");
                    return "";
                }
            }
        }
            return null;
    }

    public String ExcluirPessoa()
    {
        System.out.println("Digite o nome da pessoa: ");
        String nome = ScannerResposta.scanner.nextLine();

        for(Pessoa pessoa : Lista) {
            if (pessoa.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Nome: "+ pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("Deseja mesmo excluir essa pessoa? [s/n]");
                String resposta = ScannerResposta.scanner.nextLine();
                if(resposta.equalsIgnoreCase("s"))
                {
                    Lista.remove(pessoa);
                    System.out.println("Pessoa removida com sucesso.");
                    return "";
                }
                else if(resposta.equalsIgnoreCase("n"))
                {
                    System.out.println("Cancelado com sucesso.");
                    return "";
                }
                else
                {
                 System.out.println("Opção invalida");
                 return "";
                }
            }

        }
        return null;
    }


}
