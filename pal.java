public class pal {
    public static void main(String[] args) {
        String str = "mom";

        char[] arr = str.toCharArray();
        int si = 0, ei = arr.length - 1;

        while (si < ei) {
            if (arr[si] != arr[ei]) {
                System.out.println("Not a palindrome");
                return; // stop immediately
            }
            si++;
            ei--;
        }

        // If loop completes, it is a palindrome
        System.out.println("Palindrome");
    }
}
