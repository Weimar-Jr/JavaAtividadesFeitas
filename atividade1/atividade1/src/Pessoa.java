public class Pessoa
{
    private String nome;
    private int idade;

    public void EhMaiorQueDezoito()
    {
        if(idade < 18)
        {
            System.out.println("É menor de idade.");
        }
        else
        {
            System.out.println("É maior de idade.");
        }
    }

    public String getNome()
    {
        return nome;
    }
    public void setNome(String Nome)
    {
        this.nome = Nome;
    }


    public int getIdade()
    {
       return idade;
    }
    public void setIdade(int Idade)
    {
        this.idade = Idade;
    }

    public  Pessoa(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }
}
