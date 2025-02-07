package org.EmpresaX.Metodos.menus;

import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.Metodos.VerificarSeEhNumero;
import org.EmpresaX.Metodos.contabilidade.CalcularAvulso;
import org.EmpresaX.Metodos.menus.adicionar.MetodoAdicionar;
import org.EmpresaX.Metodos.menus.editar.MetodoEditar;
import org.EmpresaX.Metodos.menus.excluir.MetodoExcluir;
import org.EmpresaX.Metodos.menus.exibirFuncionarios.MetodoExibir;
import org.EmpresaX.Metodos.menus.sql.MetodoSql;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class Menu {
    public static void menu()
    {
        boolean funcionando = true;
        while(funcionando)
        {
            try {
                System.out.println("Digite \"1\" para adicionar funcionario.");
                System.out.println("Digite \"2\" para Calcular folha avulso.");
                System.out.println("Digite \"3\" para procurar um funcionario.");
                System.out.println("Digite \"4\" para editar funcionario.");
                System.out.println("Digite \"5\" para excluir funcionario.");
                System.out.println("Digite \"6\" para listar funcionarios.");
                System.out.println("Digite \"7\" para configurar sql.");
                System.out.println("Digite \"8\" para encerrar o programa.");

                String resposta = ScannerDeResposta.scannearResposta.nextLine();
                if (VerificarSeEhNumero.ehNumero(resposta)) {
                    int respostaInt = Integer.parseInt(resposta);
                    switch (respostaInt)
                    {
                        case 1:
                            MetodoAdicionar.adicionar();
                            break;
                        case 2:
                            CalcularAvulso.calcularFolhaAvulso();
                            break;
                        case 3:
                            CentralDeConexaoSql.procurar();
                            break;
                        case 4:
                            MetodoEditar.editar();
                            break;
                        case 5:
                            MetodoExcluir.excluirFuncionario();
                            break;
                        case 6:
                            MetodoExibir.exibirFuncionarios();
                            break;
                        case 7:
                            MetodoSql.configurarSql();
                            break;
                        case 8:
                            funcionando = false;
                            break;
                        default:
                            System.out.println("Apenas digite os numeros das opções do menu.");
                    }

                } else {
                    System.out.println("Por favor apenas digite numeros.");
                }
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
