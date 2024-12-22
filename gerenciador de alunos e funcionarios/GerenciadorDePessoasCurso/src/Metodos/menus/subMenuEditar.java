package Metodos.menus;

import Metodos.EditarPessoa;
import Metodos.ScannerDeRespostas;
import Metodos.Verificador;
import construtores.Alunos;
import construtores.Funcionarios;
import construtores.Professores;

public class subMenuEditar
{
    public  boolean editarAluno(Alunos aluno)
    {
        boolean continuar = true;

        System.out.println("Digite \"1\" para editar o nome.");
        System.out.println("Digite \"2\" para editar a idade.");
        System.out.println("Digite \"3\" para editar o cpf.");
        System.out.println("Digite \"4\" para editar a função.");
        System.out.println("Digite \"5\" para editar o periodo.");
        System.out.println("Digite \"6\" para editar a diciplina matricuada.");
        System.out.println("Digite \"7\" para editar o codigo da matricula.");
        System.out.println("Digite \"8\" para sair.");

        int opcao = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo nome:");
                String novoNome = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoNome) && Verificador.estaVazio(novoNome)) {
                    EditarPessoa.atualizarNome(aluno, novoNome);
                    aluno.setNome(novoNome);
                    System.out.println("Nome alterado para " + aluno.getNome() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 2:
                System.out.println("Digite a nova idade:");
                int novaIdade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novaIdade))) {
                    EditarPessoa.atualizarIdade(aluno, novaIdade);
                    aluno.setIdade(novaIdade);
                    System.out.println("Idade alterada para " + aluno.getIdade() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 3:
                System.out.println("Digite o novo cpf: ");
                int novoCpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novoCpf))) {
                    EditarPessoa.atualizarCpf(aluno, novoCpf);
                    aluno.setCpf(novoCpf);
                    System.out.println("Cpf alterado para " + aluno.getCpf() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 4:
                System.out.println("Digite a nova função: ");
                String novaFuncao = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novaFuncao) && Verificador.estaVazio(novaFuncao)) {
                    EditarPessoa.atualizarFuncao(aluno, novaFuncao);
                    aluno.setFuncao(novaFuncao);
                    System.out.println("Função altera para " + aluno.getFuncao() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 5:
                System.out.println("Digite o novo periodo: ");
                String novoPeriodo = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoPeriodo) && Verificador.estaVazio(novoPeriodo)) {
                    EditarPessoa.atualizarPeriodo(aluno, novoPeriodo);
                    aluno.setPeriodo(novoPeriodo);
                    System.out.println("Periodo alterado " + aluno.getPeriodo() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 6:
                System.out.println("Digite a diciplina matriculada: ");
                String novaDiciplina = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novaDiciplina) && Verificador.estaVazio(novaDiciplina))
                {
                    aluno.setDiciplina(novaDiciplina);
                    System.out.println("Diciplina matriculada alterada para " + aluno.getDiciplina() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 7:
                System.out.println("Digite a nova matricula: ");
                String novaMatricula = ScannerDeRespostas.scannearResposta.nextLine();
                if(Verificador.ehString(novaMatricula) && Verificador.estaVazio(novaMatricula))
                {
                    aluno.setMatricula(novaMatricula);
                    System.out.println("Matricula alterada para " + aluno.getMatricula() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 8:
                System.out.println("saindo...");
                continuar = false;
                break;

            default:
                System.out.println("Opção invalida.");
                break;

        }
        return continuar;


    }

    public  static  boolean editarProfessor(Professores professor)
    {
        boolean continuar = true;

        System.out.println("Digite \"1\" para editar o nome.");
        System.out.println("Digite \"2\" para editar a idade.");
        System.out.println("Digite \"3\" para editar o cpf.");
        System.out.println("Digite \"4\" para editar a função.");
        System.out.println("Digite \"5\" para editar o periodo.");
        System.out.println("Digite \"6\" para editar a diciplina  que ele ensina.");
        System.out.println("Digite \"7\" para editar o salario");
        System.out.println("Digite \"8\" para sair");

        int opcao = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo nome:");
                String novoNome = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoNome) && Verificador.estaVazio(novoNome)) {
                    EditarPessoa.atualizarNome(professor, novoNome);
                    professor.setNome(novoNome);
                    System.out.println("Nome alterado para " + professor.getNome() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 2:
                System.out.println("Digite a nova idade:");
                int novaIdade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novaIdade))) {
                    EditarPessoa.atualizarIdade(professor, novaIdade);
                    professor.setIdade(novaIdade);
                    System.out.println("Idade alterada para " + professor.getIdade() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 3:
                System.out.println("Digite o novo cpf: ");
                int novoCpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novoCpf))) {
                    EditarPessoa.atualizarCpf(professor, novoCpf);
                    professor.setCpf(novoCpf);
                    System.out.println("Cpf alterado para " + professor.getCpf() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 4:
                System.out.println("Digite a nova função: ");
                String novaFuncao = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novaFuncao) && Verificador.estaVazio(novaFuncao)) {
                    EditarPessoa.atualizarFuncao(professor, novaFuncao);
                    professor.setFuncao(novaFuncao);
                    System.out.println("Função altera para " + professor.getFuncao() + " com sucesso.");
                }
                System.out.println("Entrada invalida");
                break;

            case 5:
                System.out.println("Digite o novo periodo: ");
                String novoPeriodo = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoPeriodo) && Verificador.estaVazio(novoPeriodo)) {
                    EditarPessoa.atualizarPeriodo(professor, novoPeriodo);
                    professor.setPeriodo(novoPeriodo);
                    System.out.println("Periodo alterado " + professor.getPeriodo() + " com sucesso.");
                }
                System.out.println("Entrada invalida");
                break;

            case 6:
                System.out.println("Digite a diciplina que ele ensina: ");
                String novaDiciplina = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novaDiciplina) && Verificador.estaVazio(novaDiciplina))
                {
                    professor.setDiciplina(novaDiciplina);
                    System.out.println("Diciplina matriculada alterada para " + professor.getDiciplina() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 7:
                System.out.println("Digite o novo cpf: ");
                int novoSalario = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novoSalario))) {
                    EditarPessoa.atualizarCpf(professor, novoSalario);
                    professor.setCpf(novoSalario);
                    System.out.println("Salario alterado para " + professor.getSalario() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 8:
                System.out.println("saindo...");
                continuar = false;
                break;

            default:
                System.out.println("Opção invalida.");
                break;
        }
        return continuar;

    }

    public static boolean editarFuncionario(Funcionarios funcionario)
    {
        boolean conitnuar = true;

        System.out.println("Digite \"1\" para editar o nome.");
        System.out.println("Digite \"2\" para editar a idade.");
        System.out.println("Digite \"3\" para editar o cpf.");
        System.out.println("Digite \"4\" para editar a função.");
        System.out.println("Digite \"5\" para editar o periodo.");
        System.out.println("Digite \"6\" para editar o salario");
        System.out.println("Digite \"7\" para sair");

        int opcao = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Digite o novo nome:");
                String novoNome = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoNome) && Verificador.estaVazio(novoNome)) {
                    EditarPessoa.atualizarNome(funcionario, novoNome);
                    funcionario.setNome(novoNome);
                    System.out.println("Nome alterado para " + funcionario.getNome() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 2:
                System.out.println("Digite a nova idade:");
                int novaIdade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novaIdade))) {
                    EditarPessoa.atualizarIdade(funcionario, novaIdade);
                    funcionario.setIdade(novaIdade);
                    System.out.println("Idade alterada para " + funcionario.getIdade() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 3:
                System.out.println("Digite o novo cpf: ");
                int novoCpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novoCpf))) {
                    EditarPessoa.atualizarCpf(funcionario, novoCpf);
                    funcionario.setCpf(novoCpf);
                    System.out.println("Cpf alterado para " + funcionario.getCpf() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 4:
                System.out.println("Digite a nova função: ");
                String novaFuncao = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novaFuncao) && Verificador.estaVazio(novaFuncao)) {
                    EditarPessoa.atualizarFuncao(funcionario, novaFuncao);
                    funcionario.setFuncao(novaFuncao);
                    System.out.println("Função altera para " + funcionario.getFuncao() + " com sucesso.");
                }
                System.out.println("Entrada invalida");
                break;

            case 5:
                System.out.println("Digite o novo periodo: ");
                String novoPeriodo = ScannerDeRespostas.scannearResposta.nextLine();
                if (Verificador.ehString(novoPeriodo) && Verificador.estaVazio(novoPeriodo)) {
                    EditarPessoa.atualizarPeriodo(funcionario, novoPeriodo);
                    funcionario.setPeriodo(novoPeriodo);
                    System.out.println("Periodo alterado " + funcionario.getPeriodo() + " com sucesso.");
                }
                System.out.println("Entrada invalida");
                break;

            case 6:
                System.out.println("Digite o novo cpf: ");
                int novoSalario = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                if (Verificador.estaVazio(Integer.toHexString(novoSalario))) {
                    EditarPessoa.atualizarCpf(funcionario, novoSalario);
                    funcionario.setCpf(novoSalario);
                    System.out.println("Salario alterado para " + funcionario.getSalario() + " com sucesso.");
                    break;
                }
                System.out.println("Entrada invalida");
                break;

            case 7:
                System.out.println("saindo...");
                conitnuar = false;
                break;

            default:
                System.out.println("Opção invalida.");
                break;
        }

        return conitnuar;
    }

}
