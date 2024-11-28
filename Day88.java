import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        final double PHI = 3.14 ;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jari-jari alas tabung (meter): ");
        double r = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (meter): ");
        double t = scanner.nextDouble();

        double volume = PHI * r * r * t ;

        System.out.printf("Volume tabung adalah %.2f m kubik%n", volume);


	}
