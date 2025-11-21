package problema02;

public class Problema02 {

    public static void main(String[] args) {
        int contador = 1;
        int limite = 10;
        int numero = 2;
        int incremento = 4;
        String cadena = "";

        while (contador <= limite) {

            numero = numero + incremento;
            incremento = incremento + 2;
            contador = contador + 1;
            cadena = String.format("%s\n", numero);
            System.out.printf("%s", cadena);

        }
        
    }

}
