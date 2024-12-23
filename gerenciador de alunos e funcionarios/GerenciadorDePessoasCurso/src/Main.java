import Metodos.menus.menuPrincipal;

public class Main {
    public static void main(String[] args)
    {
        boolean funcionando = true;

        do
        {
            try
            {
                funcionando = menuPrincipal.Menu();
            }
            catch (NumberFormatException e)
            {
                System.out.println("Por favor, não insira letras em perguntas que obviamente são respondidads com numeros ou vice e versa.");
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }while(funcionando);

        System.out.println("Sistema encerrado");

    }
}