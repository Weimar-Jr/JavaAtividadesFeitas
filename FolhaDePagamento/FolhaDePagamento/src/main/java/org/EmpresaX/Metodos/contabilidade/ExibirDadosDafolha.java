package org.EmpresaX.Metodos.contabilidade;


public class ExibirDadosDafolha {
    public static void exibirDados(Double salario, boolean recebeValeTransporte, int horasExtras, int horasFaltadas, double valorHoraExtra, double valorPorHora, double impostoDeRenda, double valorInss)
    {
        double remuneracaoTotal = salario;
        double valorDeDescontoValeTransport;
        double valorDeDescontoIrrf;
        double valorDeDescontoHorasFaltadas;
        double salarioLiquido;

        System.out.println("Salario: " + salario);
        System.out.println("Total de horas extras: " + horasExtras);
        if(horasExtras != 0)
        {
            System.out.println("Valor de cada hora extra: " + valorHoraExtra);
            System.out.println("Valor total das horas extras: " + (valorHoraExtra * horasExtras));
            System.out.println("Sera somado ao valor da remuneração total");
            remuneracaoTotal = salario + (valorHoraExtra * horasExtras);
        }
        System.out.println("Valor total da remuneração: " + remuneracaoTotal);
        System.out.println("Valor de desconto do INSS: " + valorInss);
        salarioLiquido = remuneracaoTotal - valorInss;
        if(impostoDeRenda != 0)
        {
            System.out.println("Valor de desconto do Imposto de Renda: " + impostoDeRenda);
            valorDeDescontoIrrf = impostoDeRenda;
            salarioLiquido = salarioLiquido - valorDeDescontoIrrf;
        }else{
            System.out.println("Não é cobrado taxa de imposto de renda.");
        }
        if(recebeValeTransporte)
        {
            valorDeDescontoValeTransport = salarioLiquido * 0.06;
            System.out.println("Valor de desconto do vale transporte:  " + valorDeDescontoValeTransport );
            salarioLiquido = salarioLiquido - (salarioLiquido * valorDeDescontoValeTransport);
        }else{
            System.out.println("Não recebe vale transporte");
        }
        System.out.println("horas faltadas sem justificativa: " + horasFaltadas);
        if(horasFaltadas !=0)
        {
            System.out.println("Valor por hora: " + valorPorHora);
            valorDeDescontoHorasFaltadas = valorPorHora * horasFaltadas;
            System.out.println("Valor total pelas horas faltadas injustificadamente: " + valorDeDescontoHorasFaltadas);
            salarioLiquido = salarioLiquido - valorDeDescontoHorasFaltadas;

        }
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
