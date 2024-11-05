public class day65{
    public static void main(String[] args) {
   System.out.println("nested loop");
             int tabel = 4 ; 
        
        for (int a = 1; a <= tabel; a++) {
            for (int b = 1; b <= tabel; b++) {
                System.out.print(a * b +"\t"); 
            }
            System.out.println(); 
        }
    }
}
