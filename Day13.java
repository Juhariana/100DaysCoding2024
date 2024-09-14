package day13 ;
public class Evaluasi_mentor {
    public static void main(String[] args) {
        
        int var1, var2; /*deklarasikan variabel satu dan dua*/
        var1 = 10;  
        var2 = 50; 

        byte var3 = 90; 
        short var4 = 2005;
        final String var5 = "juhariana"; /*menambahkan final agar nilainya tidak berubah*/
        
        /*mencetak isi variabel menggunakan  system out .println*/
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2); 
        System.out.println("var3 = " + var3);
        System.out.printf("var4 = " + var4);
    
            /*update nilai pada var1,var2,var3,var4*/
        var1 = 20;
        var2 = 60;
         var3 = 100;
          var4 = 2006;
        System.out.println("var1 = " + var1); 
        System.out.println("var2= " + var2); 
        System.out.println("var3 = " + var3); 
        System.out.println("var4= " + var4);
        
        System.out.printf("var5 = %s \n", var5); 
    }
   
}     
