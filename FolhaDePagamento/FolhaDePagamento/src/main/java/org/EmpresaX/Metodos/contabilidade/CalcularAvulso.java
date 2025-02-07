package org.EmpresaX.Metodos.contabilidade;

import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarSeEhNumero;

import java.math.BigDecimal;

public class CalcularAvulso {
    public static void calcularFolhaAvulso()
    {

        System.out.println("Digite o salario: ");
        String respostaSalarioString = ScannerDeResposta.scannearResposta.nextLine();
        if(VerificarSeEhNumero.ehNumero(respostaSalarioString))
        {
            BigDecimal respostaSalarioBD = new BigDecimal(respostaSalarioString);

            System.out.println("Digite quantas horas extras a pessoa fez. Se não fez nenhuma, digite 0: ");
            String respostaHorasExtras = ScannerDeResposta.scannearResposta.nextLine();
            if(VerificarSeEhNumero.ehNumero(respostaHorasExtras))
            {
                int respostaHorasExtrasInt = Integer.parseInt(respostaHorasExtras);
                System.out.println("Digite a carga horaria semanal do funcionario: ");
                String respostaHoraSemanal = ScannerDeResposta.scannearResposta.nextLine();

                if(VerificarSeEhNumero.ehNumero(respostaHoraSemanal))
                {
                    int respostaHoraSemanalInt = Integer.parseInt(respostaHoraSemanal);
                    System.out.println("Recebe vale transporte? [s/n]");

                    String respostaValeTransporte = ScannerDeResposta.scannearResposta.nextLine();
                    boolean recebeVale;

                    if(respostaValeTransporte.equalsIgnoreCase("s"))
                    {
                        recebeVale = true;
                    } else if (respostaValeTransporte.equalsIgnoreCase("n")) {
                        recebeVale = false;
                    }else{
                        System.out.println("Resposta invalida.");
                        System.out.println("Recebe vale transporte? [s/n]");

                        respostaValeTransporte = ScannerDeResposta.scannearResposta.nextLine();

                        if(respostaValeTransporte.equalsIgnoreCase("s"))
                        {
                            recebeVale = true;
                        } else if (respostaValeTransporte.equalsIgnoreCase("n")) {
                            recebeVale = false;
                        }else{
                            System.out.println("Resposta invalida.");
                            System.out.println("Marcado como sim");
                            recebeVale = true;
                        }
                    }

                    System.out.println("Horas que ele faltou injustidicadamente, caso nenhuma, digite 0: ");
                    String respostaHorasFaltadas = ScannerDeResposta.scannearResposta.nextLine();
                    if(VerificarSeEhNumero.ehNumero(respostaHorasFaltadas))
                    {
                        int horasFaltadasInt = Integer.parseInt(respostaHorasFaltadas);
                        Contabilidade.calcularFolha(respostaSalarioBD, recebeVale, respostaHorasExtrasInt, horasFaltadasInt, respostaHoraSemanalInt);

                    }else{
                        System.out.println("Por favor, digite apenas numeros");
                    }

                }else{
                    System.out.println("Por favor, digite apenas numeros");
                }

            }else{
                System.out.println("Por favor, digite apenas numeros");
            }
        }else{
            System.out.println("Por favor, digite apenas numeros");
        }

    }
}
