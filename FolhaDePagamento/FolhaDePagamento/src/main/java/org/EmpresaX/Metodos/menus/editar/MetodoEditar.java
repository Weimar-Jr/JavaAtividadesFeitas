package org.EmpresaX.Metodos.menus.editar;

import org.EmpresaX.Classes.Funcionario;
import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarCpf;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class MetodoEditar {

    public  static  void editar()
    {
        boolean funcionando = true;
        Funcionario funcionario = CentralDeConexaoSql.procurar();
        if( funcionario != null) {
            while (funcionando) {
                System.out.println("Digite \"1\" para editar o nome. ");
                System.out.println("Digite \"2\" para editar o cpf.");
                System.out.println("Digite \"3\" para editar o cargo. ");
                System.out.println("Digite \"4\" para editar o setor.");
                System.out.println("Digite \"5\" para editar o salario.");
                System.out.println("Digite \"6\" para editar se recebe vale transporte.");
                System.out.println("Digite \"7\" para as horas extras.");
                System.out.println("Digite \"8\" para editar as horas faltadas injustificadamente. ");
                System.out.println("Digite \"9\" para editar as horas semanais que ele trabalha.");
                System.out.println("Digite \"10\" para para sair.");

                int resposta = Integer.parseInt(ScannerDeResposta.scannearResposta.nextLine());

                switch (resposta) {
                    case 1:
                        System.out.println("Digite o novo nome: ");
                        String resposta1 = ScannerDeResposta.scannearResposta.nextLine();
                        if (!VerificarSeEhNumero.ehNumero(resposta1)) {
                            funcionario.setNome(resposta1);
                            System.out.println("Nome modificado para  " + resposta1 + " com sucesso.");
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("cargo");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "String", resposta1);
                        } else {
                            System.out.println("Por favor escreva um nome valido.");
                        }
                        break;
                    case 2:
                        System.out.println("Digite o novo cpf: ");
                        String resposta2 = ScannerDeResposta.scannearResposta.nextLine();
                        if (VerificarCpf.verificarCpf(resposta2)) {
                            funcionario.setCpf(resposta2);
                            System.out.println("Cpf modificado para " +  resposta2 + " com sucesso.");
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("cpf");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "String", resposta2);
                        } else {
                            System.out.println("Por favor escreva um cpf valido.");
                        }
                        break;
                    case 3:
                        System.out.println("Digite o novo cargo: ");
                        String resposta3 = ScannerDeResposta.scannearResposta.nextLine();
                        if (!VerificarSeEhNumero.ehNumero(resposta3)) {
                            funcionario.setCargo(resposta3);
                            System.out.println("Cargo modificado para " + resposta3 + "Com sucesso.");
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("cargo");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "String", resposta3);
                        } else {
                            System.out.println("Por favor escreva um cargo valido.");
                        }
                        break;
                    case 4:
                        System.out.println("Digite o do setor para atribuir ao funcionario: ");
                        String resposta4 = ScannerDeResposta.scannearResposta.nextLine();
                        if (VerificarSeEhNumero.ehNumero(resposta4)) {
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
                                if (!setor.equalsIgnoreCase("nada")) {
                                    funcionario.setSetor(setor);
                                    System.out.println("Setor modificado para" + setor + " com sucesso.");
                                    String sql = CentralDeConexaoSql.editarSqlDoEditar("setor");
                                    CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "String", setor);
                                }else{
                                    System.out.println("Por favor apenas digite o numero da opção desejada;");
                                }

                            }else{
                                    System.out.println("Por favor digite só o numero da opção desejada.");
                            }

                        }else {
                            System.out.println("Por favor escreva um setor valido.");
                        }
                        break;
                    case 5:
                        System.out.println("Digite o novo salario: ");
                        String resposta5 = ScannerDeResposta.scannearResposta.nextLine();
                        if (VerificarSeEhNumero.ehNumero(resposta5)) {
                            Double respostaSalario = Double.parseDouble(resposta5);
                            funcionario.setSalario(respostaSalario);
                            System.out.println("Salario modificado para " + respostaSalario + " com sucesso.");
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("salario");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "Double", resposta5);
                        } else {
                            System.out.println("Por favor escreva um salario valido.");
                        }
                        break;
                    case 6:
                        System.out.println("Digite sim ou nao para se ele recebe vale transporte: ");
                        String resposta6 = ScannerDeResposta.scannearResposta.nextLine();
                        if(resposta6.equalsIgnoreCase("sim"))
                        {
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("recebevaletransporte");
                            funcionario.setRecebeValeTransporte(true);
                            System.out.println("modificado para \"sim\" com sucesso.");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "booleon", "true");
                        } else if (resposta6.equalsIgnoreCase("nao" ) || resposta6.equalsIgnoreCase("não")) {
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("recebevaletransporte");
                            funcionario.setRecebeValeTransporte(false);
                            System.out.println("modificado para \"não\" com sucesso.");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "booleon", "false");
                        }
                        break;
                    case 7:
                        System.out.println("Digite  o numero das novas horas extras feitas, elas seram somadas as que ja tem: ");
                        String resposta7 = ScannerDeResposta.scannearResposta.nextLine();
                        if(VerificarSeEhNumero.ehNumero(resposta7))
                        {
                            int respostaNovaHoraExtra = Integer.parseInt(resposta7) + funcionario.getHorasExtras();
                            funcionario.setHorasExtras(respostaNovaHoraExtra);
                            System.out.println("Adicionado o numero " + resposta7 + " de horas extras, no total ficou: " + respostaNovaHoraExtra);
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("horasextras");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "int", resposta7);

                        }else{
                            System.out.println("Por favor, digite um numero valido.");
                        }
                        break;
                    case 8:
                        System.out.println("Digite  o numero das novas horas faltadas injustificadas, elas seram somadas as que ja tem: ");
                        String resposta8 = ScannerDeResposta.scannearResposta.nextLine();
                        if(VerificarSeEhNumero.ehNumero(resposta8))
                        {
                            int respostaNovaHoraInjustificada = Integer.parseInt(resposta8) + funcionario.getHorasFaltasInjustificadas();
                            funcionario.setHorasFaltasInjustificadas(respostaNovaHoraInjustificada);
                            System.out.println("Adicionado o numero " + resposta8 + " de horas extras, no total ficou: " + respostaNovaHoraInjustificada);
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("horasfaltasinjustificadas");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "int", resposta8);

                        }else{
                            System.out.println("Por favor, digite um numero valido.");
                        }
                        break;
                    case 9:
                        System.out.println("Digite o novo numero de horas semanais do funcionario: ");
                        String resposta9 = ScannerDeResposta.scannearResposta.nextLine();
                        if(VerificarSeEhNumero.ehNumero(resposta9))
                        {
                            int respostaNovaHora = Integer.parseInt(resposta9);
                            funcionario.setHorasPorSemana(respostaNovaHora);
                            System.out.println("Horas semanais modificada para " + respostaNovaHora + "por semana.");
                            String sql = CentralDeConexaoSql.editarSqlDoEditar("horasporsemana");
                            CentralDeConexaoSql.editar(funcionario.getCpf(), sql, "int", resposta9);


                        }else{
                            System.out.println("Por favor digite um numero valido");
                        }
                        break;
                    case 10:
                        funcionando = false;
                        break;
                }
            }
        }else{
            System.out.println("Funcionario não encontrado.");
        }
    }
}
