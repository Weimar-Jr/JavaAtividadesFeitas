package org.EmpresaX.Metodos;

public class VerificarSeEhNumero
{
    public static boolean ehNumero(String numero)
    {
        //usando try catch pra verifcar se é numero
        try
        {
            int teste = Integer.parseInt(numero);
            return  true;
        }catch (Exception e)
        {
            return  false;
        }
    }
}
