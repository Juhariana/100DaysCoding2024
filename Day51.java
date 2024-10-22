import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan  jam (1,6,8) ");
        int jam = scanner.nextInt();
        
        switch (jam) {
            case 1:
                System.out.println("jam 1 malam itu tidur bukan scroll tiktok");
                break;
            case 6:
                System.out.println("saatnya mandi");
                break;
            case 8:
                System.out.println("siap siap ngampus");
                break;
            default:
                System.out.println(" jam tidak valid");
                break;
        }
        
        scanner.close();
    }
}
