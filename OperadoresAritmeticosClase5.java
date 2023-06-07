import java.util.Scanner;

public class OperadoresAritmeticosClase5 {
    public static void main(String[] args) {
        /*
         ** 1) Calculadora de edad de perros:
         **    Pídele al usuario que ingrese la edad de su perro.
         **   Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro). */

        System.out.println("Calculadora de edad de perros \uD83D\uDC36");
        Scanner data = new Scanner(System.in);
        System.out.println("Ingrese la edad de du perro \uD83D\uDC15");
        int edad = data.nextInt();
        int edadPerro = edad * 7;
        System.out.println("la edad en años perro es de: " + edadPerro + " gua gua \uD83D\uDC36");

        System.out.println("*****************************************************************************************");

        /*
         *Conversor de millas a kilómetros:
         *Pídele al usuario que ingrese una distancia en millas.
         *Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
         *Muestra la distancia en kilómetros al usuario.
         */
        System.out.println("Conversor de millas a kilómetros \uD83C\uDFC1");
        System.out.println("Ingrese un distancia en millas");
        double millas = data.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println("La conversión de millas a kilómetros es de: " + kilometros + " \uD83C\uDFC1");

        System.out.println("*****************************************************************************************");

        /*
        *Calculadora de descuento:
        *Pídele al usuario que ingrese el precio original de un producto.
        *Pídele al usuario que ingrese el porcentaje de descuento.
        *Calcula el precio final después de aplicar el descuento utilizando
        * la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
        *Muestra el precio final al usuario.

        * */
        System.out.println("Calculadora de descuento \uD83E\uDD11 ");
        System.out.println("Ingrese el precio del producto");
        double originalPrecio= data.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento");
        double descuento = data.nextDouble();
        double precioFinal = originalPrecio - ( originalPrecio * descuento / 100 );
        System.out.println("El precio final de " + originalPrecio + " con un descuento de " + descuento + " es de " + precioFinal);

        System.out.println("*****************************************************************************************");
        /*
        *Calculadora de propinas:
        *Pídele al usuario que ingrese el total de la cuenta en un restaurante.
        *Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
        *Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

        * */

        System.out.println("Calculadora de propinas \uD83D\uDCB0");
        System.out.println("Ingrese el total de la cuenta");
        double totalCuenta = data.nextDouble();
        System.out.println("Ingrese la propina %");
        double propinaPorcentage = data.nextDouble();
        double propina = totalCuenta * (propinaPorcentage / 100);

        System.out.println(" la propina es de " + propina + "\uD83E\uDD11" );

        System.out.println("*****************************************************************************************");
        /*
        * Juego de adivinar el número
        * Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
        * */

        System.out.println("Juego de adivinar el número \uD83D\uDE44");
        int numeroAleatorio = (int) (Math.random() * 10);
        System.out.println("Ingresa el número que crees que sea");
        int numeroIngresado = data.nextInt();

        if (numeroIngresado == numeroAleatorio){
            System.out.println("Wow eres adivino acertastes \uD83E\uDD29\uD83D\uDC4F");
        }else{
            System.out.println("Lo siento no acertastes \uD83D\uDE2D sigue intentado ");
        }





    }
}

