package construtores;

public class Funcionarios extends  Pessoa{
    private String salario;

    public  String getSalario()
    {
        return this.salario;
    }
    public void setSalario(String Salario)
    {
        this.salario = Salario;
    }

    public void mostrarInformacoes()
    {
        super.mostrarInformacoes();
        System.out.println("Salario: " + getSalario());
    }

    public Funcionarios(String Nome, int Idade, int Cpf, String Funcao, String Periodo, String Salario)
    {
        super(Nome, Idade, Cpf, Funcao, Periodo);
        this.salario = Salario;
    }
}
