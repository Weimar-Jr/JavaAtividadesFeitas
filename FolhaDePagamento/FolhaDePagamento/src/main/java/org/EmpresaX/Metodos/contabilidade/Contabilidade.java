package org.EmpresaX.Metodos.contabilidade;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Contabilidade {
    public static void calcularFolha(BigDecimal salarioBruto, boolean seRecebeValeTransporte0, int horasExtras, int horasFaltadasInjustificadamente, int horasPorSemana)
    {
        char  seRecebeValeTransporte;
        if(seRecebeValeTransporte0)
        {
            seRecebeValeTransporte = 't';
        }else{
            seRecebeValeTransporte = 'f';
        }

        BigDecimal horasExtrasBD = new BigDecimal(horasExtras);
        BigDecimal horasPorSemanaBD = new BigDecimal(horasPorSemana);
        BigDecimal fatorMultiplicarParaMes = new BigDecimal(4.5);
        BigDecimal cargaHorariaMensal= horasPorSemanaBD.multiply(fatorMultiplicarParaMes).setScale(2, RoundingMode.HALF_UP);;
        BigDecimal valorPorHora = salarioBruto.divide(cargaHorariaMensal, 2, RoundingMode.HALF_UP);
        BigDecimal fatorCalculoHoraExtra = new BigDecimal(1.5);
        BigDecimal valorPorHoraExtra = valorPorHora .multiply(fatorCalculoHoraExtra).setScale(2, RoundingMode.HALF_UP);;
        BigDecimal valorTotalDeHorasExtras = valorPorHoraExtra.multiply(horasExtrasBD).setScale(2, RoundingMode.HALF_UP);;
        BigDecimal totalDeRemuneracao = salarioBruto.add( valorTotalDeHorasExtras).setScale(2, RoundingMode.HALF_UP);;
        BigDecimal valorDeDescontoIrrf = new BigDecimal(0);

        BigDecimal limiteInss1 = new BigDecimal("1518.00");
        BigDecimal limiteInss2 = new BigDecimal("2793.88");
        BigDecimal limiteInss3 = new BigDecimal("4190.83");
        BigDecimal taxaInss1 = new BigDecimal(0.075);
        BigDecimal taxaInss2 = new BigDecimal(0.09);
        BigDecimal taxaInss3 = new BigDecimal(0.12);
        BigDecimal taxaInss4 = new BigDecimal(0.14);

        BigDecimal limiteIrrf1 = new BigDecimal("2259.20");
        BigDecimal limiteIrrf2 = new BigDecimal("2826.65");
        BigDecimal limiteIrrf3 = new BigDecimal("3751.05");

        BigDecimal taxaIrrf1 = new BigDecimal(0.075);
        BigDecimal taxaIrrf2 = new BigDecimal(0.15);
        BigDecimal taxaIrrf3 = new BigDecimal(0.225);
        BigDecimal taxaIrrf4 = new BigDecimal(0.275);


        if(totalDeRemuneracao.compareTo(limiteInss1) <= 0)
        {
            BigDecimal valorDeDescontoInss = totalDeRemuneracao.multiply(taxaInss1).setScale(2, RoundingMode.HALF_UP);;
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDescontoIrrf, valorDeDescontoInss);
        } else if (totalDeRemuneracao.compareTo(limiteInss2) <= 0 && totalDeRemuneracao.compareTo(limiteInss1) >= 1) {
            BigDecimal valorDeDescontoInss = totalDeRemuneracao.multiply(taxaInss2).setScale(2, RoundingMode.HALF_UP);;
            BigDecimal remuneracaoMenosInss = totalDeRemuneracao.subtract(valorDeDescontoInss).setScale(2, RoundingMode.HALF_UP);;
            if(remuneracaoMenosInss.compareTo(limiteIrrf1) >= 1)
            {
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf1).setScale(2, RoundingMode.HALF_UP);;

            }
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDescontoIrrf, valorDeDescontoInss);

        }else if(totalDeRemuneracao.compareTo(limiteInss3) <= 0)
        {
            BigDecimal valorDeDescontoInss = totalDeRemuneracao.multiply(taxaInss3).setScale(2, RoundingMode.HALF_UP);;
            BigDecimal remuneracaoMenosInss = totalDeRemuneracao.subtract(valorDeDescontoInss).setScale(2, RoundingMode.HALF_UP);;

            if(remuneracaoMenosInss.compareTo(limiteIrrf1) >= 1)
            {
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf1).setScale(2, RoundingMode.HALF_UP);;
            } else if (remuneracaoMenosInss.compareTo(limiteIrrf2)  >= 1) {
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf2).setScale(2, RoundingMode.HALF_UP);;
            }else if (remuneracaoMenosInss.compareTo(limiteIrrf3 ) >= 1){
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf3).setScale(2, RoundingMode.HALF_UP);;
            }
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDescontoIrrf, valorDeDescontoInss);

        }else{
            BigDecimal valorDeDescontoInss = totalDeRemuneracao.multiply(taxaInss4).setScale(2, RoundingMode.HALF_UP);;
            BigDecimal remuneracaoMenosInss = totalDeRemuneracao.subtract(valorDeDescontoInss).setScale(2, RoundingMode.HALF_UP);;

            if(remuneracaoMenosInss.compareTo(limiteIrrf3)  >= 1 )
            {
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf3).setScale(2, RoundingMode.HALF_UP);;

            }else {
                valorDeDescontoIrrf =  remuneracaoMenosInss.multiply(taxaIrrf4).setScale(2, RoundingMode.HALF_UP);;
            }
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDescontoIrrf, valorDeDescontoInss);

        }

    }
}
