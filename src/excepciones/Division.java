package excepciones;

public class Division {

    public static void main(String[] args) {
        aritmetico();
    }
    
    public static void aritmetico() {
        
        int n = 5, resultado;

        try {
            resultado = n / 0;
        } catch (ArithmeticException e) {

            System.out.println("No se puede dividir entre 0 "+"\n"+e.getMessage());
        }
    }
}
