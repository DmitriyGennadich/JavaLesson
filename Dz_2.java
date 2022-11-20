public class Dz_2 {
    public static void main(String[] args) {
        System.out.println(Palindrome("Madam, I'm Adam!"));
    }
    public static boolean Palindrome(String text) {
        String replaced = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);
    }

}
