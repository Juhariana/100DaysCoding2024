import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
       System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        for (int a = 2; a <= n; a++) {
            boolean dee = true;
            for (int b = 2; b <= Math.sqrt(a); b++) {
                if (a % b == 0) {
                    dee = false;
                    break;
                }
            }
            if (dee) System.out.print(a + " ");
        }
    }
}
