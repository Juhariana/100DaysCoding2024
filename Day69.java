import java.util.Scanner;

public class evaluasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pola segitiga terbalik: ");
        int dee = input.nextInt();
        
        for (int a = dee; a >= 1; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print(b + " ");  
            }
            System.out.println();  
        }
    }
}
