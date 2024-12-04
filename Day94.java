import java.util.Scanner;

public class Day94 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        for (int a = 1; a <= baris; a++) {
            for (int b = a; b < baris; b++) {
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
