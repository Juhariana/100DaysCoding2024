import java.util.Scanner;

public class day52 {
    public static void main(String[] args) {
      System.out.println("Ternary");
        Scanner dede = new Scanner(System.in);

        System.out.print("Masukkan jam (0-23): ");
        int jam = dede.nextInt();

        String waktu = (jam >= 0 && jam < 12) ? "Pagi" : 
                       (jam >= 12 && jam < 18) ? "Siang" : 
                       (jam >= 18 && jam <= 23) ? "Malam" : "Jam tidak valid";

        System.out.println("Sekarang: " + waktu);

        dede.close(); 
    }
}
