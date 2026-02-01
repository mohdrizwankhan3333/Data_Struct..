public class remSpace {
    public static void main(String[] args) {

        String str = "erty iu ";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {  // ✅ compare with char
                continue;
            }
            System.out.print(arr[i]);  // print in same line
        }

        // Optional: newline
        System.out.println();
    }
}
