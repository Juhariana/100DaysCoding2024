import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi pola: ");
        int tinggi = input.nextInt();

        for (int a = 0; a < tinggi; a++) { 
            for (int b = 0; b < 2 * tinggi - 1; b++) { 
                
                if (b == tinggi - 1 - a || b == tinggi - 1 + a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        input.close(); 
    }
}
