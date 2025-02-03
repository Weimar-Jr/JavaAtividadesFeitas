package org.EmpresaX.dados;

class SqlEditarDado {
    public static String  editarSql(String nomeInformacao)
    {
        String sql = "update funcionarios set " + nomeInformacao + " = ? where cpf  = ?; ";
        return sql;
    }
}
