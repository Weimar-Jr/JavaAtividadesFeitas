package org.EmpresaX.Metodos.menus.adicionar;

import org.EmpresaX.Classes.Funcionario;
import org.EmpresaX.Metodos.InformacoesFuncionario;
import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarCpf;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.dados.CentralDeConexaoSql;

import java.math.BigDecimal;

public class MetodoAdicionar {

    public static void adicionar()
    {
        try {
            System.out.println("Digite o nome do funcionario: ");
            String respostaNome = ScannerDeResposta.scannearResposta.nextLine();
            if (!VerificarSeEhNumero.ehNumero(respostaNome)) {
                System.out.println("Digite o cpf do funcionario: ");
                String respostaCpf = ScannerDeResposta.scannearResposta.nextLine();
                if (VerificarCpf.verificarCpf(respostaCpf)) {
                    System.out.println("Digite o cargo: ");
                    String respostaCargo = ScannerDeResposta.scannearResposta.nextLine();

                    System.out.println("Digite o numero do setor: ");
                    System.out.println("\"1\" para Administração.");
                    System.out.println("\"2\" para Contabilidade.");
                    System.out.println("\"3\" para RH.");
                    System.out.println("\"4\" para TI.");
                    String respostaSetor = ScannerDeResposta.scannearResposta.nextLine();
                    if(VerificarSeEhNumero.ehNumero(respostaSetor)) {
                        String setor;
                        int respostaSetorInt = Integer.parseInt(respostaSetor);
                        switch (respostaSetorInt) {
                            case 1:
                                setor = "Administração";
                                break;
                            case 2:
                                setor = "Contabilidade";
                                break;
                            case 3:
                                setor = "RH";
                                break;
                            case 4:
                                setor = "TI";
                                break;
                            default:
                                System.out.println("Opção invalida.");
                                setor = "nada";
                                break;

                        }

                        if(!setor.equalsIgnoreCase("nada")) {
                            System.out.println("Digite o valor do salario do funcionario, Só numeros e ponto antes dos centavos:");
                            String respostaSalario = ScannerDeResposta.scannearResposta.nextLine();
                            if(VerificarSeEhNumero.ehNumero(respostaSalario) && respostaSalario.matches("\\d+(\\.\\d+)?")) {
                                BigDecimal salario = new BigDecimal(respostaSalario);
                                System.out.println("Digite \"sim\" caso o funcionario recebera vale transporte e \"não\" caso não receba: ");
                                String respostaValeTransporte = ScannerDeResposta.scannearResposta.nextLine();
                                if (respostaValeTransporte.equalsIgnoreCase("sim") || respostaValeTransporte.equalsIgnoreCase("não")) {
                                    boolean valeTransporte;
                                    if (respostaValeTransporte.equalsIgnoreCase("Sim")) {
                                        valeTransporte = true;
                                    } else {
                                        valeTransporte = false;
                                    }

                                    System.out.println("Digite o numero de horas semanais que o funcionario atuara: ");
                                    int respostaHorasSemanais = Integer.parseInt(ScannerDeResposta.scannearResposta.nextLine());

                                    Funcionario funcionario = new Funcionario(respostaNome, respostaCargo, respostaCpf, setor, salario, valeTransporte, respostaHorasSemanais);
                                    InformacoesFuncionario.informacoesDeCadastro(funcionario);
                                    System.out.println("Esta correto? Se sim, digite \"sim\": ");
                                    String respostaFinal = ScannerDeResposta.scannearResposta.nextLine();
                                    if (respostaFinal.equalsIgnoreCase("sim")) {
                                        System.out.println("Funcionario salvo com sucesso.");
                                        CentralDeConexaoSql.adicionar(funcionario);
                                    } else {
                                        System.out.println("Cancelado com sucesso.");
                                    }

                                } else {
                                    System.out.println("Resposta invalida.");
                                }
                            }else{
                                System.out.println("Por favor escreva um salario valido com separação de centavos usando ponto.");
                            }
                        }else{
                            System.out.println("Opção invalida.");
                        }
                    }

                }

            } else {
                System.out.println("Por favor, não digite numeros ou caracteres especiais no nome do funcionario.");
            }

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
