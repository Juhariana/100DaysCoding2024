import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Day100 {
    public static void main(String[] args) {
        Scanner dee = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = dee.nextLine();

        LocalTime sekarang = LocalTime.now(ZoneId.of("Asia/Jakarta")); 
        System.out.println("Debug: Waktu saat ini adalah " + sekarang);

        int jam = sekarang.getHour(); 

        String salam;
        if (jam < 12) {
            salam = "Selamat pagi";
        } else if (jam < 17) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        System.out.println("=================================");
        System.out.printf("%s, %s%n", salam, nama);
        System.out.println("Program Anda Telah Selesai");
        System.out.println("=================================");

        dee.close();
    }
}
