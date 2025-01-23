package org.EmpresaX.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoPostegreSQL
{

    private static String nomeBanco = "MeuBanco";
    private static String url = "jdbc:postgresql://localhost:5432/";
    private static final String urlSqlCompleto =  url + nomeBanco;
    private static String nomeUsuarioSql = "postgres";
    private static String senhaSql = "";


    public static String getNomeBanco()
    {
        return nomeBanco;
    }
    public static void setNomeBanco(String NomeBanco)
    {
        nomeBanco = NomeBanco;
    }

    public static String getUrl()
    {
        return  url;
    }
    public static void setUrl(String Url)
    {
        url = Url;
    }

    public static String getUrlSqlCompleto()
    {
        return  urlSqlCompleto;
    }
    // não tem o porque fazer um setter para essa propriedade

    public static String getNomeUsuarioSql()
    {
        return  nomeUsuarioSql;
    }
    public static void setNomeUsuarioSql(String novoNome)
    {
        nomeUsuarioSql = novoNome;
    }

    public static String getSenhaSql()
    {
        return senhaSql;
    }
    public static void setSenhaSql(String novaSenha)
    {
        senhaSql = novaSenha;
    }

    //metodos

    public static  Connection Conexao() throws SQLException
    {
        return DriverManager.getConnection(urlSqlCompleto, nomeUsuarioSql, senhaSql);
    }
}
