  import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array (n): ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Masukkan " + n + " elemen array:");
        for (int a = 0; a < n; a++) {
            System.out.print("Elemen ke-" + (a + 1) + ": ");
            array[a] = input.nextInt();
        }

        System.out.println("Elemen array dalam urutan terbalik:");
        for (int a = n - 1; a >= 0; a--) {
            System.out.print(array[a] + " ");
        }
    }
}
