package problema04;

public class Problema04 {

    public static void main(String[] args) {
        int numero1 = 1;
        int contador = 1;
        String fraccion = "";
        String mensaje = "";
        double result = 1;
        while (contador < 15) {
            numero1 = numero1 * -1;
            contador = contador + 2;
            result = result + ((double) numero1 / contador);
            if (numero1 == 1) {
                fraccion = String.format("+ %s/%s", numero1, contador);
            } else {
                fraccion = String.format("%s/%s", numero1, contador);
            }
            mensaje = String.format("%s %s", mensaje, fraccion);



        }
        System.out.printf("1%s\n", mensaje);
        System.out.printf("%.4f", result);
    }

}
