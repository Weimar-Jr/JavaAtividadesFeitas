package org.EmpresaX.Metodos.contabilidade;

public class Contabilidade {
    public static void calcularFolha(Double salarioBruto, boolean seRecebeValeTransporte, int horasExtras, int horasFaltadasInjustificadamente, int horasPorSemana)
    {
        double cargaHorariaMensal= horasPorSemana * 4.5;
        double valorPorHora = salarioBruto / cargaHorariaMensal;
        double valorPorHoraExtra = valorPorHora * 1.5;
        double valorTotalDeHorasExtras = valorPorHoraExtra * horasExtras;
        double totalDeRemuneracao = salarioBruto + valorTotalDeHorasExtras;
        double valorDeDEscontoIrrf = 0;

        if(totalDeRemuneracao <= 1.518)
        {
            double valorDeDescontoInss = totalDeRemuneracao * 0.075;
            double remuneracaoMenosInss = totalDeRemuneracao - valorDeDescontoInss;

            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDEscontoIrrf, valorDeDescontoInss);
        } else if (totalDeRemuneracao > 1.518 && totalDeRemuneracao <= 2.793) {
            double valorDeDescontoInss = totalDeRemuneracao * 0.09;
            double remuneracaoMenosInss = totalDeRemuneracao - valorDeDescontoInss;
            if(remuneracaoMenosInss >= 2.259)
            {
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.075;

            }
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDEscontoIrrf, valorDeDescontoInss);

        }else if(salarioBruto > 2.793 && salarioBruto <= 4.190)
        {
            double valorDeDescontoInss = totalDeRemuneracao * 0.12;
            double remuneracaoMenosInss = totalDeRemuneracao - valorDeDescontoInss;

            if(remuneracaoMenosInss <  2.826 )
            {
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.075;
            } else if (remuneracaoMenosInss > 2.826 && remuneracaoMenosInss < 3.751) {
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.15;
            }else{
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.225;
            }

        }else{
            double valorDeDescontoInss = totalDeRemuneracao * 0.14;
            double remuneracaoMenosInss = totalDeRemuneracao - valorDeDescontoInss;

            if(remuneracaoMenosInss <  4.665 )
            {
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.225;

            }else{
                valorDeDEscontoIrrf =  remuneracaoMenosInss * 0.275;
            }
            ExibirDadosDafolha.exibirDados(salarioBruto, seRecebeValeTransporte, horasExtras, horasFaltadasInjustificadamente, valorPorHoraExtra, valorPorHora, valorDeDEscontoIrrf, valorDeDescontoInss);

        }

    }
}
