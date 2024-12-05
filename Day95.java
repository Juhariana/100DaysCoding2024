import java.util.Scanner;

public class Day95 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tinggi segitiga: ");
        int tinggi = input.nextInt();

        for (int a = 1; a <= tinggi; a++) {
            for (int e = 1; e <= a; e++) {
                System.out.print("*");
            }
            
            for (int e = 1; e <= (tinggi - a) * 2; e++) {
                System.out.print(" ");
            }
            
            for (int e = 1; e <= a; e++) {
                System.out.print("*");
            } 
          
            System.out.println();
        }

        input.close(); 
    }
}
