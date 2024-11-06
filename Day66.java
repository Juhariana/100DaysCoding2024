public class day66 {
    public static void main(String[] args) {
       System.out.println("pola persegi dan persegi panjang");

     System.out.println("persegi");
          int  dee= 5; 
       
      for (int i = 0; i < dee; i++) {
            for (int j = 0; j < dee; j++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }

        
        System.out.println("persegi panjang");

        int p = 7; 
        int l  = 4;   
        
        for (int a= 0; a < l;  a++) {
            for (int b = 0; b < p; b++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
}
