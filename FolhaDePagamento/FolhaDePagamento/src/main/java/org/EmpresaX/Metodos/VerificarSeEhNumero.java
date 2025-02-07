package org.EmpresaX.Metodos;

import java.math.BigDecimal;

public class VerificarSeEhNumero
{
    public static boolean ehNumero(String numero)
    {
        //usando try catch pra verifcar se é numero
        try
        {
            BigDecimal numero2 = new BigDecimal(numero);
            return  true;
        }catch (Exception e)
        {
            return  false;
        }
    }
}
