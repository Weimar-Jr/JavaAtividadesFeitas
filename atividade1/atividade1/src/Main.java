public class Main {
    public static void main(String[] args) {

        BancoDeDados lista = new BancoDeDados();

        Pessoa pessoa1 = new Pessoa("João", 12);
        Pessoa pessoa2 = new Pessoa("maria", 25);
        Pessoa pessoa3 = new Pessoa("jack", 20);
        Pessoa pessoa4 = new Pessoa("joana", 17);
        Pessoa pessoa5 = new Pessoa("alan", 35);
        Pessoa pessoa6 = new Pessoa("yato", 15);

        lista.Lista.add(pessoa1);
        lista.Lista.add(pessoa2);
        lista.Lista.add(pessoa3);
        lista.Lista.add(pessoa4);
        lista.Lista.add(pessoa5);
        lista.Lista.add(pessoa6);

        int resposta = 0;

        do{
            System.out.println("Digite  \"1\" para adicionar uma pessoa ao banco de dados. ");
            System.out.println("Digite  \"2\" para editar informação de uma pessoa do banco de dados.");
            System.out.println("Digite  \"3\" para pesquisar uma pessoa no banco de dados. ");
            System.out.println("Digite  \"4\" para para excluir uma pessoa do banco de dados.");
            System.out.println("Digite  \"5\" para mostrar todas as pessoas do banco de dados. ");
            System.out.println("Digite  \"6\" para encerrar o programa.");

            try {

                resposta = Integer.parseInt(ScannerResposta.scanner.nextLine());

                switch (resposta) {
                    case 1:
                        lista.Adicionar();
                        break;
                    case 2:
                        String achou2 = lista.EditarPessoa();
                        if (achou2 == null) {
                            System.out.println("Pessoa não encontrada.");
                        }
                        break;
                    case 3:
                        String achou3 = lista.BuscarPessoa();
                        if (achou3 == null) {
                            System.out.println("Pessoa não encontrada.");
                        }
                        break;
                    case 4:
                        String achou4 = lista.ExcluirPessoa();
                        if (achou4 == null) {
                            System.out.println("Pessoa não encontrada.");
                        }
                        break;
                    case 5:
                        lista.MostrarLista();
                        break;
                    case 6:
                        System.out.println("Encerrado com sucesso");
                        break;
                    default:
                        System.out.println("Opção invalida.");
                        break;


                }
            }catch(Exception e)
            {
                System.out.println(e);
            }
        }while(resposta !=6);


    }
}