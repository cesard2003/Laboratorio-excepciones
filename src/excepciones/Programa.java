package excepciones;

import java.util.Scanner;

public class Programa {

    public static int numero;
    public static int division;
    public static int resultado;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Digite el divisor");
            numero = sc.nextInt();
            System.out.println("Digite el dividendo: ");
            division = sc.nextInt();

            if (division > 10) {
                resultado = numero / division;
                System.out.println("La division de " + numero + " Entre " + division + " es: " + resultado);
            }else{
                throw new Excepcion("El dividendo debe ser mayor a 10");
            }

        } catch (ArithmeticException ae) {

            System.out.println("No se puede dividir entre cero.");
        } catch (Exception e) {

            System.out.println("tiene que digitar un numero");
        } 
    }
}
