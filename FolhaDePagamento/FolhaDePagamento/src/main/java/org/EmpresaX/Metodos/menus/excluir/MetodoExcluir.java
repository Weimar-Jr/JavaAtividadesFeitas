package org.EmpresaX.Metodos.menus.excluir;

import org.EmpresaX.Classes.Funcionario;
import org.EmpresaX.Metodos.InformacoesFuncionario;
import org.EmpresaX.Metodos.ScannerDeResposta;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class MetodoExcluir {
    public  static  void  excluirFuncionario()
    {
        Funcionario funcionario = CentralDeConexaoSql.procurar();
        if(funcionario != null)
        {
            InformacoesFuncionario.informacoesCompletas(funcionario);
            System.out.println("Tem certeza de que deseja excluir o funcionario? Digite \"s\" \"n\" ");
            String resposta = ScannerDeResposta.scannearResposta.nextLine();
            if(resposta.equalsIgnoreCase("s"))
            {
                CentralDeConexaoSql.excluir(funcionario.getCpf());
            }else{
                System.out.println("Cancelado com sucesso.");
            }
        }
        else{
            System.out.println("Funcionario não encontrado");
        }
    }
}
