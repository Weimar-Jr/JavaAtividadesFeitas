package org.EmpresaX;

import org.EmpresaX.Metodos.menus.Menu;
import org.EmpresaX.dados.CentralDeConexaoSql;

public class Main {
    public static void main(String[] args) {

        CentralDeConexaoSql.VerificarTabela();
        Menu.menu();
    }
}