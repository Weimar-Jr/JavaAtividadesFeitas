package org.EmpresaX.Metodos;

import org.EmpresaX.Classes.Funcionario;

public class InformacoesFuncionario {

    public static void informacoesBasicas(Funcionario funcionario)
    {
        System.out.println("================================================");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Setor: " + funcionario.getSetor());
    }

    public static void informacoesCompletas(Funcionario funcionario)
    {
        System.out.println("================================================");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Cargo: " + funcionario.getCargo());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Salario: " + funcionario.getSalario());
        if(funcionario.getRecebeValeTransporte())
        {
            System.out.println("Recebe vale transporte");
        }else{
            System.out.println("Não recebe vale transporte");
        }
        System.out.println("Realizou um total de : " + funcionario.getHorasExtras() + " de horas extras");
        System.out.println("Tem um total de: " + funcionario.getHorasFaltasInjustificadas() + " de horas faltadas injustificadamente");
        System.out.println("Trabalha um total de: " + funcionario.getHorasPorSemana() + " de horas por semana");
    }
}
