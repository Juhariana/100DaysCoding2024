import java.util.Scanner;

public class Day92 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi : ");
        int tinggi = input.nextInt();

        for (int a = 0; a < tinggi; a++) {
            for (int b = 0; b < 2 * tinggi - 1; b++) {
                
                if (b == a || b == 2 * tinggi - 2 - a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        input.close(); 
    }
