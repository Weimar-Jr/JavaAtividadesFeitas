package construtores;

public class Professores extends Pessoa{
    private String diciplina;
    private String salario;

    public String getDiciplina()
    {
        return this.diciplina;
    }
    public  void setDiciplina(String Diciplina)
    {
        this.diciplina = Diciplina;
    }

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
        System.out.println("Diciplina: " + getDiciplina());
        System.out.println("Salario: " + getSalario());
    }


    public Professores(String Nome, int Idade, int Cpf, String Funcao, String Periodo, String Diciplina, String Salario)
    {
        super(Nome, Idade, Cpf, Funcao, Periodo);
        this.diciplina = Diciplina;
        this.salario = Salario;
    }
}
