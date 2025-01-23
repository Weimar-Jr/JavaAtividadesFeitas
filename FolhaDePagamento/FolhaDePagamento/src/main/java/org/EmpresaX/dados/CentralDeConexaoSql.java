package org.EmpresaX.dados;


import org.EmpresaX.Classes.Funcionario;

//deixar os outros metodos como protect e deixar esse publico e usar esse metodo como central para usar os outros
public class CentralDeConexaoSql
{
    //crud basico
    public static void adicionar(Funcionario funcionario)
    {
        AdiconarFuncionarioAoBanco.adicionarAoBanco(funcionario);
    }
    public static Funcionario procurar (String nomeOuCpf)
    {

        return  ProcurarFuncionario.procurarFuncionario(nomeOuCpf);
    }
    public static void editar(String identificadorFuncionario, String sql, String identificadorTipodeDado, String novoDado)
    {
        EditarInformacaoFuncionario.Editar(identificadorFuncionario, sql, identificadorTipodeDado, novoDado);
    }
    public  static void excluir(String identificadorFuncionario)
    {
        ExcluirFuncionario.excluirFuncionario(identificadorFuncionario);
    }

    //listar funcionarios
    public static void listarTodosFuncionarios()
    {
        ListarFuncionarios.listarTodosOsFuncionario();
    }
    public static void listarFuncionariosAdministracao()
    {
        ListarFuncionarios.listarFuncionariosAdministracao();
    }
    public static void listarFuncionariosContabilidade()
    {
        ListarFuncionarios.listarFuncionariosContabilidade();
    }
    public static void listarFuncionariosTI()
    {
        ListarFuncionarios.listarFuncionariosTI();
    }

    //configurações do sql

    public static String getNomeBanco()
    {
        return ConexaoPostegreSQL.getNomeBanco();
    }
    public static void setNomeBanco(String NomeBanco)
    {
        ConexaoPostegreSQL.setNomeBanco(NomeBanco);
    }

    public static String getUrl()
    {
        return ConexaoPostegreSQL.getUrl();
    }
    public static void setUrl(String Url)
    {
        ConexaoPostegreSQL.setUrl(Url);
    }

    public static String getUrlSqlCompleto()
    {
        return ConexaoPostegreSQL.getUrlSqlCompleto();
    }

    public static String getNomeUsuarioSql()
    {
        return ConexaoPostegreSQL.getNomeUsuarioSql();
    }
    public static void setNomeUsuarioSql(String novoNome)
    {
        ConexaoPostegreSQL.setNomeUsuarioSql(novoNome);
    }

    public static String getSenhaSql()
    {
        return getSenhaSql();
    }
    public static void setSenhaSql(String novaSenha)
    {
        ConexaoPostegreSQL.setSenhaSql(novaSenha);
    }
}
