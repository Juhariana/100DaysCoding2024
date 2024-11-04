public class day64 {
    public static void main(String[] args) {
        System.out.println("break label");
        deeLoop: 
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                System.out.println("a = " + a + ", b = " + b);
                
                if (a == 2 && b == 2) {
                    break deeLoop;
                }
            }
        }
    }
}
