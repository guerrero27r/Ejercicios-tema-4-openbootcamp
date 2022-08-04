package ejerciciotema4;

public class Ejerciciotema4 {


    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("Condicion if :");
        int numero = 0;

        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero == 0) {
            System.out.println("El numero es 0");
        } else {
            System.out.println("El numero es negativo");
        }

        System.out.println("-----------------------------");
        System.out.println("Bucle While :");

        while (numero < 3) {
            System.out.println(numero);
            numero++;
        }
        System.out.println("-----------------------------");
        System.out.println("Do While :");
        do {
            System.out.println(numero);
            numero++;
        } while (numero < 3);

        System.out.println("-----------------------------");
        System.out.println("For:");

        for (numero = 0; numero <= 3; numero++) {
            System.out.println(numero);
        }
        System.out.println("-----------------------------");
        System.out.println("switch:");
        var estacion = "Primavera";
        switch (estacion) {
            case "Primavera":
                System.out.println("La estacion es Primavera");
                break;
            case "Verano":
                System.out.println("La estacion es Verano");
                break;
            case "Otoño":
                System.out.println("La estacion es Otoño");
                break;
            case "Invierno":
                System.out.println("La estacion es Invierno");
                break;
            default:
                System.out.println("No es una estacion");

        }
    }
}
