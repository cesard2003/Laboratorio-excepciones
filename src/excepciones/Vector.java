package excepciones;

public class Vector {

    public static void main(String[] args) {
        desborde();
    }

    public static void desborde() {
        int v[] = new int[3];
        try {
            for (int i = 0; i < 6; i++) {
                v[i] = i;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Es un vector de 3"+"\n"+e.getMessage());
        }
    }
}