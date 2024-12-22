package Metodos;

import construtores.Alunos;
import construtores.Funcionarios;
import construtores.Professores;
import dados.Listas;

public class Adicionar
{
    public static   boolean  AdicionarAluno()
    {
            System.out.println("Digite o nome da pessoa: ");
            String nome = ScannerDeRespostas.scannearResposta.nextLine();
            if(Verificador.ehString(nome) && Verificador.estaVazio(nome))
            {
                System.out.println("Digite a idade da pessoa: ");
                int idade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                String idadeString = Integer.toString(idade);
                if( Verificador.estaVazio(idadeString))
                {
                    System.out.println("Digite o cpf da pessoa: ");
                    int cpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                    String cpfString = Integer.toString(cpf);
                    if( Verificador.estaVazio(cpfString))
                    {
                        String funcao = "Aluno";

                        System.out.println("Digite o periodo da pessoa: ");
                        String periodo = ScannerDeRespostas.scannearResposta.nextLine();
                        if (Verificador.ehString(periodo) && Verificador.estaVazio(periodo))
                        {

                            System.out.println("Digite a matricula do aluno: ");
                            String resposta = ScannerDeRespostas.scannearResposta.nextLine();
                            if(Verificador.estaVazio(resposta))
                            {
                                System.out.println("Digite a diciplina que o aluno esta matriculado");
                                String resposta2 = ScannerDeRespostas.scannearResposta.nextLine();
                                if(Verificador.estaVazio(resposta2))
                                {
                                    Alunos aluno = new Alunos(nome, idade, cpf, funcao, periodo, resposta, resposta2  );
                                    aluno.mostrarInformacoes();
                                    System.out.println("Esta correto? [s/n]");
                                    String respostaFinal1 = ScannerDeRespostas.scannearResposta.nextLine();
                                    if(respostaFinal1.equalsIgnoreCase("s"))
                                    {
                                        System.out.println("Aluno adicionado com sucesso.");
                                        Listas.alunos.add(aluno);
                                        Listas.todos.add(aluno);
                                        return false;

                                    }
                                }
                                else
                                {
                                    return true;
                                }
                            }

                        }
                        else
                        {
                            System.out.println("Digite apenas letras.");
                            return true;
                        }

                    }
                    else
                    {
                        System.out.println("Digite apenas numeros");
                        return true;
                    }
                }
                else
                {
                    System.out.println("Digite apenas numeros");
                    return true;
                }
            }
            else
            {
                System.out.println("Digite apenas letras.");
                return true;
            }

        return true;
    }
    // add professor
    public  static boolean AdicionarProfessor()
    {
        System.out.println("Digite o nome da pessoa: ");
        String nome = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.ehString(nome) && Verificador.estaVazio(nome)) {
            System.out.println("Digite a idade da pessoa: ");
            int idade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
            String idadeString = Integer.toString(idade);
            if (Verificador.estaVazio(idadeString)) {
                System.out.println("Digite o cpf da pessoa: ");
                int cpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                String cpfString = Integer.toString(cpf);

                if (Verificador.estaVazio(cpfString)) {
                    String funcao = "Professor.";
                    System.out.println("Digite o periodo da pessoa: ");
                    String periodo = ScannerDeRespostas.scannearResposta.nextLine();
                    if (Verificador.ehString(periodo) && Verificador.estaVazio(periodo))
                    {
                        System.out.println("Digite a diciplina que o professor ensina: ");
                        String materia = ScannerDeRespostas.scannearResposta.nextLine();
                        if(Verificador.estaVazio(materia) && Verificador.ehString(materia))
                        {
                            System.out.println("Digite o salario: ");
                            float salario = Float.parseFloat(ScannerDeRespostas.scannearResposta.nextLine());
                            String salarioString = Float.toString(salario);
                            if(Verificador.estaVazio(salarioString))
                            {
                                Professores professor = new Professores(nome, idade, cpf, funcao, periodo, materia, salarioString );
                                professor.mostrarInformacoes();
                                System.out.println("Esta correto? [s/n]");
                                String respostaFinal1 = ScannerDeRespostas.scannearResposta.nextLine();
                                if(respostaFinal1.equalsIgnoreCase("s"))
                                {
                                    Listas.professores.add(professor);
                                    Listas.todos.add(professor);
                                    System.out.println("Professor adicionado com sucesso");
                                    return false;
                                }
                                return true;

                            }
                            else
                            {
                                System.out.println("Digite apenas sumeros e virgula.");
                                return true;
                            }

                        }
                        else
                        {
                            System.out.println("Digite apenas letras.");
                            return true;
                        }

                    }
                    else
                    {
                        System.out.println("Digite apenas letras.");
                        return true;
                    }


                }
                else
                {
                    System.out.println("Digite apenas numeros.");
                    return true;
                }
            }
            else
            {
                System.out.println("Digite apenas numeros.");
                return true;
            }
        }
        else
        {
            System.out.println("Digite apenas letras.");
            return true;
        }

    }
    //add funcionario
    public static boolean AdiconarFuncionario()
    {
        System.out.println("Digite o nome da pessoa: ");
        String nome = ScannerDeRespostas.scannearResposta.nextLine();
        if(Verificador.ehString(nome) && Verificador.estaVazio(nome)) {
            System.out.println("Digite a idade da pessoa: ");
            int idade = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
            String idadeString = Integer.toString(idade);
            if (Verificador.estaVazio(idadeString)) {
                System.out.println("Digite o cpf da pessoa: ");
                int cpf = Integer.parseInt(ScannerDeRespostas.scannearResposta.nextLine());
                String cpfString = Integer.toString(cpf);
                if (Verificador.estaVazio(cpfString)) {
                    System.out.println("Digite a função da pessea: ");
                    String funcao = ScannerDeRespostas.scannearResposta.nextLine();
                    if(Verificador.estaVazio(funcao) && Verificador.ehString(funcao))
                    {

                        System.out.println("Digite o periodo da pessoa: ");
                        String periodo = ScannerDeRespostas.scannearResposta.nextLine();
                        if (Verificador.ehString(periodo) && Verificador.estaVazio(periodo))
                        {
                            System.out.println("Digite o salario: ");
                            float salario = Float.parseFloat(ScannerDeRespostas.scannearResposta.nextLine());
                            String salarioString = Float.toString(salario);
                            if(Verificador.estaVazio(salarioString))
                            {
                                Funcionarios funciorio = new Funcionarios(nome, idade, cpf, funcao, periodo, salarioString);
                                funciorio.mostrarInformacoes();
                                System.out.println("Esta correto? [s/n]");
                                String respostaFinal1 = ScannerDeRespostas.scannearResposta.nextLine();
                                if(respostaFinal1.equalsIgnoreCase("s"))
                                {
                                    Listas.funcionarios.add(funciorio);
                                    Listas.todos.add(funciorio);
                                    System.out.println("Funcionario adicionado com sucesso");
                                    return false;
                                }

                            }
                            else
                            {
                                System.out.println("Digite apenas sumeros e virgula.");
                                return true;
                            }

                        }
                        else
                        {
                            System.out.println("Digite apenas letras.");
                            return true;
                        }


                    }
                    else
                    {
                        System.out.println("Digite apenas letras.");
                        return true;
                    }
                }
                else
                {
                    System.out.println("Digite apenas numeros.");
                    return true;
                }

            }
            else
            {
                System.out.println("Digite apenas numeros.");
                return true;
            }
        }
        else
        {
            System.out.println("Digite apenas letras.");
            return true;
        }
       return true;
    }
}

