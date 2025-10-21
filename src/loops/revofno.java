package loops;

public class revofno {
    public static void main(String[] args) {
        int n = 6987;
        while (n>0) {
            int lastdigit = n%10;
            System.out.println(lastdigit + " ");
            n = n/10;
        }
    }
}
