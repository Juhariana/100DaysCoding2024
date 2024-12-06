import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan baris setengah diamond: ");
        int baris = input.nextInt();

        for (int a = 1; a <= baris; a++) {
            for (int b = baris; b > a; b--) {
                System.out.print(" ");
            }
           
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int a = baris - 1; a >= 1; a--) {
            for (int b = baris; b > a; b--) {
                System.out.print(" ");
            }
           
            for (int c = 1; c <= (2 * a - 1); c++) {
                System.out.print("*");
            }
            System.out.println();
        }

       input.close();
    }
}
