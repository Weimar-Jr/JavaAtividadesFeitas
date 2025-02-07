package org.EmpresaX.Metodos.contabilidade;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ExibirDadosDafolha {
    public static void exibirDados(BigDecimal salario, char recebeValeTransporte0, int horasExtras, int horasFaltadas, BigDecimal valorHoraExtra, BigDecimal valorPorHora, BigDecimal impostoDeRenda, BigDecimal valorInss)
    {
        boolean recebeValeTransporte = false;
        if(recebeValeTransporte0 == 't')
        {
            recebeValeTransporte = true;
        }

        BigDecimal horasExtrasBD = new BigDecimal(horasExtras);
        BigDecimal horasFaltadasBD =new BigDecimal(horasFaltadas);
        BigDecimal taxaParaCalcularValeTransporte = new BigDecimal(0.06);
        BigDecimal paraVerificarSeTemIrrf = new BigDecimal(0);
        BigDecimal remuneracaoTotal = salario;
        BigDecimal valorDeDescontoValeTransport;
        BigDecimal valorDeDescontoIrrf;
        BigDecimal valorDeDescontoHorasFaltadas;
        BigDecimal salarioLiquido;

        System.out.println("Salario: " + salario);
        System.out.println("Total de horas extras: " + horasExtras);
        if(horasExtras != 0)
        {
            System.out.println("Valor de cada hora extra: " + valorHoraExtra);
            System.out.println("Valor total das horas extras: " + (valorHoraExtra.multiply(horasExtrasBD).setScale(2, RoundingMode.HALF_UP)));
            System.out.println("Sera somado ao valor da remuneração total");
            remuneracaoTotal = salario.add(valorHoraExtra.multiply( horasExtrasBD).setScale(2, RoundingMode.HALF_UP));
        }
        System.out.println("Valor total da remuneração: " + remuneracaoTotal);
        System.out.println("Valor de desconto do INSS: " + valorInss);
        salarioLiquido = remuneracaoTotal.subtract(valorInss).setScale(2, RoundingMode.HALF_UP);
        if(impostoDeRenda.compareTo(paraVerificarSeTemIrrf) >= 1)
        {
            System.out.println("Valor de desconto do Imposto de Renda: " + impostoDeRenda);
            valorDeDescontoIrrf = impostoDeRenda;
            salarioLiquido = salarioLiquido.subtract( valorDeDescontoIrrf).setScale(2, RoundingMode.HALF_UP);
        }else{
            System.out.println("Não é cobrado taxa de imposto de renda.");
        }
        if(recebeValeTransporte)
        {
            valorDeDescontoValeTransport = salarioLiquido.multiply(taxaParaCalcularValeTransporte).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Valor de desconto do vale transporte:  " + valorDeDescontoValeTransport );
            salarioLiquido = salarioLiquido.subtract(( valorDeDescontoValeTransport).setScale(2, RoundingMode.HALF_UP));
        }else{
            System.out.println("Não recebe vale transporte");
        }
        System.out.println("horas faltadas sem justificativa: " + horasFaltadas);
        if(horasFaltadas !=0)
        {
            System.out.println("Valor por hora: " + valorPorHora);
            valorDeDescontoHorasFaltadas = valorPorHora.multiply(horasFaltadasBD).setScale(2, RoundingMode.HALF_UP);
            System.out.println("Valor total pelas horas faltadas injustificadamente: " + valorDeDescontoHorasFaltadas);
            salarioLiquido = salarioLiquido.subtract(valorDeDescontoHorasFaltadas).setScale(2, RoundingMode.HALF_UP);

        }
        System.out.println("Salario liquido: " + salarioLiquido);
    }
}
