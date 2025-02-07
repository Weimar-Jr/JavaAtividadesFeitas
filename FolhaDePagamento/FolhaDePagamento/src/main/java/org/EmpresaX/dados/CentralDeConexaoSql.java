package org.EmpresaX.dados;


import org.EmpresaX.Classes.Funcionario;

//deixar os outros metodos como protect e deixar esse publico e usar esse metodo como central para usar os outros
public class CentralDeConexaoSql
{
    //verificar a tabela no banco de dados
    public  static  void VerificarTabela()
    {
        VerificarSeTemTabela.criarTabelaSeNaoExistir();
    }


    //crud basico
    public static void adicionar(Funcionario funcionario)
    {
        AdicionarFuncionarioAoBanco.adicionarAoBanco(funcionario);
    }
    public static Funcionario procurar ()
    {

        return  ProcurarFuncionario.procurarFuncionario();
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
    public static void listarFuncionarios(String setor)
    {
        ListarFuncionarios.listarFuncionarios(setor);
    }

    //configurações do sql
    public  static  String editarSqlDoEditar(String sql)
    {
        String sql0 = SqlEditarDado.editarSql(sql);
        return sql0;
    }


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
