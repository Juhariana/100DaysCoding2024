
import java.util.Scanner;

public class KalkulatorSingkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil = 0;
        boolean dee = true;

        switch (operator) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b != 0) {
                    hasil = a / b;
                } else {
                    dee= false;
                }
                break;
            default:
                dee = false;
        }

        if (dee) {
            System.out.println("Hasil: " + hasil);
        } else {
            System.out.println("Operator tidak valid ");
        }

        input.close();
    }
}
