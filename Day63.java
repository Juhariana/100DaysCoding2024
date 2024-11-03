public class day63{
    public static void main(String[] args) {
      System.out.println("keyword continue");
         int dee = 0;
        while (dee < 15) {
            dee++;
            if (dee == 5) {
                continue; 
            }
            System.out.println(dee);
        }
    }
}
