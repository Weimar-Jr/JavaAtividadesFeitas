package Metodos;

public class Verificador
{
    static public boolean estaVazio(String resposta)
    {
        if(!resposta.isEmpty() && !resposta.equals(null))
        {
            return true;
        }
            return false;
    }

    static public  boolean ehString( String resposta)
    {

        if( !resposta.chars().allMatch(Character::isDigit))
        {
            return true;
        }
            return false;
    }


}
