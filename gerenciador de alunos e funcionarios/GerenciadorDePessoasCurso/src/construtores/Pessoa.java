package construtores;

public class Pessoa {
    private String nome;
    private int idade;
    private int cpf;
    private String funcao;
    private String periodo;


    // get e set
    public String getNome()
    {
        return this.nome;
    }
    public void  setNome(String Nome)
    {
        this.nome  = Nome;
    }

    public int getIdade()
    {
        return this.idade;
    }
    public void setIdade(int Idade)
    {
        this.idade = Idade;
    }

    public int  getCpf()
    {
        return this.cpf;
    }
    public void setCpf(int Cpf)
    {
        this.cpf = Cpf;
    }

    public String  getFuncao()
    {
        return this.funcao;
    }
    public void setFuncao(String Funcao)
    {
        this.funcao = Funcao;
    }
    public String getPeriodo()
    {
        return  this.periodo;
    }
    public void setPeriodo(String Periodo)
    {
        this.periodo = Periodo;
    }

    //Função
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Cpf: " + getCpf());
        System.out.println("Função: " + getFuncao());
        System.out.println("Periodo: " + getPeriodo());
    }

    //construtor
    public Pessoa(String nome, int idade, int Cpf, String Funcao, String Periodo)
    {
        this.nome = nome;
        this.idade = idade;
        this.cpf = Cpf;
        this.funcao = Funcao;
        this.periodo = Periodo;
    }

}
