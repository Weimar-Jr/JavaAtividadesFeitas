package construtores;

public class Alunos extends Pessoa{
    private String matricula;
    private String diciplina;

    // get e set
    public String getMatricula()
    {
        return this.matricula;
    }
    public  void setMatricula(String Matricula)
    {
        this.matricula = Matricula;
    }

    public String getDiciplina()
    {
        return this.diciplina;
    }
    public  void setDiciplina(String Diciplina)
    {
        this.diciplina = Diciplina;
    }

    //metodo
    public void mostrarInformacoes()
    {
        super.mostrarInformacoes();
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Diciplina: " + getDiciplina());

    }

    public Alunos(String Nome, int Idade, int Cpf, String Funcao, String Periodo, String Diciplina, String Matricula)
    {
        super(Nome, Idade, Cpf, Funcao, Periodo);
        this.diciplina = Diciplina;
        this.matricula = Matricula;
    }
}
