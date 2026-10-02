import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner src = new Scanner(System.in);
        Random random = new Random();

        // El precio de la crypto es 8400 €
        int cryptoPrecio = 8400;

        // Pide al usuario qué cantidad desea invertir
        System.out.println("¿Cuánto desea invertir en cryptomonedas?");
        // Declarar y asignar la cantidad invertida
        int montoInvertido = src.nextInt();

        float cantidadBitcoin = (float) montoInvertido / cryptoPrecio;

        // Declarar y asignar a variable mercadoAlza que determina si el
        // mercado está al alza o baja
        boolean mercadoAlza = random.nextBoolean();

        //Declarar la variable desviacion que depende de la variable mercadoAlza
        float desviacion;

        // Si el mercado se encuentra al alza o a la baja y en función de ello ganarás 2%
        // o lo perderás
        if (mercadoAlza == true) {
            desviacion = 0.02f;
        } else {
            desviacion = -0.02f;
        }

        float beneficio = desviacion * cantidadBitcoin;
        float gananciaTotal = cantidadBitcoin + beneficio;

        System.out.println("La ganancia/perdida por invertir en cryptomonedas es: " + beneficio + " " +
                "BTC y su importe total es: " + gananciaTotal + " BTC");
    }
}