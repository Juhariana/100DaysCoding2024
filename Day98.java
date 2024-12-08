import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner dee = new Scanner(System.in);

        System.out.print("Masukkan nilai x : ");
        int x = dee.nextInt();
        System.out.print("Masukkan nilai y : ");
        int y = dee.nextInt();

        int total = 0;
        for (int a = x; a <= y; a++) {
            if (a % 2 == 0) { 
                total+= a;   
            }
        }

        System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
    }
}
