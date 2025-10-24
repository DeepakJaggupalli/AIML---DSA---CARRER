public class one {
        public static void main(String[] args) {
            String s = "madam";
            System.out.println(s.equals(new StringBuilder(s).reverse().toString()) ? "Palindrome" : "Not Palindrome");
        }
    }
}
