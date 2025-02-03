package org.EmpresaX.Metodos;

public class VerificarCpf {

    public static  boolean verificarCpf(String cpf)
    {
        if(cpf.length() == 11 && VerificarSeEhNumero.ehNumero(cpf))
        {
            return  true;
        }else {

            System.out.println("Por favor, apenas digite os 11 numeros do cpf.");
            return false;
        }
    }
}
