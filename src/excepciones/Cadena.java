package excepciones;

public class Cadena {
   
    public static void main(String[] args) {
        Cadena();
    }
   
    public static void Cadena() {

        int n = 2;
        String cadena = "me gustan las motos";

        try {
            n = Integer.parseInt(cadena);
        } catch (NumberFormatException ex) {

            System.out.println("tiene que digitar un numero" +"\n"+ ex.getMessage());
        }
    }
}
