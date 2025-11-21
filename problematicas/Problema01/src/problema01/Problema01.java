package problema01;

import java.util.Locale;
import java.util.Scanner;

public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String cadena = "";
        String cadena2 = "";
        double sumaEdad = 0;
        double sumaEstaturas = 0;
        boolean bandera = true;

        int contador = 0;
        int totalJugadores = 0;

        while (bandera) {
            System.out.println("Ingresar el nombre del jugador");
            String nombre = entrada.nextLine();
            System.out.println("Ingresar la posición");
            String posicion = entrada.nextLine();
            System.out.println("Ingresar la edad");
            int edad = entrada.nextInt();
            System.out.println("Ingresar la estatura");
            double estatura = entrada.nextDouble();
            sumaEdad = sumaEdad + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            totalJugadores = totalJugadores + 1;
            contador = contador + 1;

            cadena = String.format("%s. %s -%s-, edad %s,"
                    + " estatura %.2f\n", contador, nombre, posicion, edad, estatura);

            cadena2 = String.format("%s\n", edad);

            System.out.println("Ingrese el valor 2 para salir");
            int valor = entrada.nextInt();
            if (valor == 2) {
                bandera = false;

            }

        }

        System.out.println("Listado de jugadores");
        System.out.print(cadena);
        System.out.println("Listado de edades");
        System.out.print(cadena2);
        double promedioEdades = sumaEdad / totalJugadores;
        double promedioEstaturas = sumaEstaturas / totalJugadores;

        System.out.printf("Promedio de edades:\n", promedioEdades);
        System.out.printf("Promedio de estaturas:\n", promedioEstaturas);
    }
}
