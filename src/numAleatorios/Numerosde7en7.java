package numAleatorios;
import java.util.Scanner;
public class Numerosde7en7 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Introduce el primer número: ");
    int num1 = scanner.nextInt();

    System.out.println("Introduce el segundo número: ");
    int num2 = scanner.nextInt();

    // Validar que los números son distintos
    if (num1 == num2) {
        System.out.println("Los números deben ser distintos.");
        return;
    }

    // Comenzar por el menor de los enteros
    int start = Math.min(num1, num2);
    int end = Math.max(num1, num2);

    // Incrementar de 7 en 7
    for (int i = start; i <= end; i += 7) {
        System.out.println(i);
    }

  }

}
