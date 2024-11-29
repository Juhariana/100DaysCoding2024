import java.util.Scanner;

public class soal2{
    public static void main(String[] args) {
        Scanner Dee = new Scanner(System.in); 

        System.out.print("Masukkan string: ");
        String kataAwal = Dee.nextLine();

        String kebalikan= new StringBuilder(kataAwal).reverse().toString();

        if (kataAwal.equals(kebalikan)) { 
            System.out.println("Yes"); 
        } else {
            System.out.println("No");  
        }

        Dee.close();
    }
}
