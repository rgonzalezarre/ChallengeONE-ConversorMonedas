
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Tomando la decision del usuario y convieritiendola en una URL API
        Scanner teclado=new Scanner(System.in);
        boolean continuar=true;
        while (continuar){
            System.out.println("*************************************************************");
            System.out.println("Bienvenido sistema Insannity para hacer conversion de monedas");
            System.out.println("¿En qué te puedo ayudar el dia de hoy?");
            String menu = """
                    1) Dolar => Peso argentino
                    2) Peso argentino => Dolar
                    3) Dolar =>Real brasileño
                    4) Real brasileño => Dolar
                    5) Dolar => Peso colombiano
                    6) Peso colombiano => Dolar
                    7) Salir
                    Elige una opcion:
                    """;
            System.out.println(menu);
            try {
                var opcion=teclado.nextInt();
                ConversorMonedas conversor=new ConversorMonedas();
                switch (opcion){
                    case 1: conversor.convertir("USD","ARS");
                        break;
                    case 2: conversor.convertir("ARS","USD");
                        break;
                    case 3: conversor.convertir("USD","BRL");
                        break;
                    case 4: conversor.convertir("BRL","USD");
                        break;
                    case 5: conversor.convertir("USD","COP");
                        break;
                    case 6:conversor.convertir("COP","USD");
                        break;
                    case 7: System.out.println("Gracias por utilizar el sistema");
                        continuar=false;
                        System.out.println("*************************************************************");
                        break;
                    default:
                        System.out.println("Opcion no valida, favor de utilizar otra.");
                }
            }catch (InputMismatchException e){
                System.out.println("Utilice un formato de numero entero por favor.");
                teclado.nextLine();
            }
            }
        }
    }

