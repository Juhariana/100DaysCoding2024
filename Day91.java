import java.util.Scanner;

public class Soal4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan angka: ");
            
            if (input.hasNextInt()) {
                int angka = input.nextInt();

                if (angka % 2 == 0) {
                    System.out.println("Genap");
                } else {
                    System.out.println("You and I, end");
                    break; 
                }
            } else {
                System.out.println("Masukkan hanya angka"); 
                input.next(); 
            }
        }

        input.close(); 
    }
}
