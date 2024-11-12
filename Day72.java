public class Day72 {
    public static int dee(String str) {
        if (str.isEmpty()) { 
            return 0;
        } else {
            return 1 + dee(str.substring(1)); 
        }
    }
    public static void main(String[] args) {
        String text = "contoh";
        System.out.println("Jumlah karakter dalam '" + text + "' adalah " + dee(text));
    }
}
