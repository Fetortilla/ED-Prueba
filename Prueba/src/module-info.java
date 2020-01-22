	import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int n;
        int numI, numJ;
        System.out.println("Introduce un número entero positivo");
        n = Integer.parseInt(keyboard.nextLine());
        char[][] array = new char[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (n % 2 == 0) {
                    if (i == n / 2 && j == n / 2) {
                        array[i][j] = 'A';
                        System.out.print(array[i][j]);
                    } else if (i == (n / 2) - 1 && j == (n / 2) - 1) {
                        array[i][j] = 'A';
                        System.out.print(array[i][j]);
                    } else if (i == (n / 2) - 1 && j == n / 2) {
                        array[i][j] = 'A';
                        System.out.print(array[i][j]);
                    } else if (i == n / 2 && j == (n / 2) - 1) {
                        array[i][j] = 'A';
                        System.out.print(array[i][j]);
                    } else {
                        array[i][j] = '*';
                        System.out.print(array[i][j]);
                    }
                } else {
                    if (i == n / 2 && j == n / 2) {
                        array[i][j] = 'A';
                        System.out.print(array[i][j]);
                    } else {
                        array[i][j] = '*';
                        System.out.print(array[i][j]);
                    }
                }
            }
            System.out.println(" ");
        }
    }
}