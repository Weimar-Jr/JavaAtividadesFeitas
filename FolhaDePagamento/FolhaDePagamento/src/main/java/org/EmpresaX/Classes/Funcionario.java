package org.EmpresaX.Classes;


import java.math.BigDecimal;

public class Funcionario
{
    // propriedades
    private String nome;
    private String cargo;
    private String cpf;
    private String setor;

    private BigDecimal salario;
    private boolean recebeValeTransporte;
    private int horasExtras = 0;
    private int horasFaltasInjustificadas = 0;
    private int horasPorSemana;

    //get set

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome =  nome;
    }

    public String getCargo()
    {
        return cargo;
    }
    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public  String getCpf()
    {
        return cpf;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public String getSetor()
    {
        return  setor;
    }
    public void setSetor(String setor)
    {
        this.setor = setor;
    }

    public  BigDecimal getSalario()
    {
        return salario;
    }
    public void setSalario(BigDecimal salario)
    {
        this.salario = salario;
    }

    public boolean getRecebeValeTransporte()
    {
        return recebeValeTransporte;
    }
    public void setRecebeValeTransporte( boolean recebe)
    {
        this.recebeValeTransporte = recebe;
    }

    public int getHorasExtras()
    {
        return  horasExtras;
    }
    public void setHorasExtras(int horas)
    {
        this.horasExtras = horas;
    }

    public int getHorasFaltasInjustificadas()
    {
        return  horasFaltasInjustificadas;
    }
    public void setHorasFaltasInjustificadas(int horas)
    {
        this.horasExtras = horas;
    }

    public int getHorasPorSemana()
    {
        return horasPorSemana;
    }
    public void setHorasPorSemana(int horas)
    {
        this.horasPorSemana = horas;
    }


    public Funcionario(String nome, String cargo, String cpf, String setor, BigDecimal salario, boolean recebeValeTransporte, int horasPorSemana)
    {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.setor = setor;
        this.salario = salario;
        this.recebeValeTransporte = recebeValeTransporte;
        this .horasPorSemana = horasPorSemana;

    }

}
