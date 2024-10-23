import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
      System.out.println("ternary");
      Scanner dede = new Scanner(System.in);

        System.out.print("Masukkan jam (0-23): ");
        int jam = scanner.nextInt();
        String waktu = (jam >= 0 && jam < 12) ? "Pagi" : 
                       (jam >= 12 && jam < 18) ? "Siang" : 
                       (jam >= 18 && jam <= 23) ? "Malam" : "Jam tidak valid";

        System.out.println("Sekarang: " + waktu);

        scanner.close(); 
    }
}
