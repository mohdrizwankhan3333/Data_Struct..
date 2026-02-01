public class consec {
    public static void main(String[] args) {

        String str = "abcdezxcvbutytf";
        char[] arr = str.toCharArray();

        int maxLen = 1;

        for (int i = 0; i < arr.length; i++) {
            int len = 1; // start new sequence from arr[i]

            for (int j = i + 1; j < arr.length; j++) {
                // ✅ check if current char is consecutive after previous char
                if (arr[j] == arr[j - 1] + 1) {
                    len++;
                } else {
                    break; // sequence broken
                }
            }

            maxLen = Math.max(maxLen, len);
        }

        System.out.println("Longest consecutive sequence length: " + maxLen);
    }
}
