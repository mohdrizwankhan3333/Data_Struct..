public class strStr {

    static boolean search(String pattern, String text) {
        int textLen = text.length();
        int patternLen = pattern.length();

        if (patternLen == 0) return true;

        for (int i = 0; i <= textLen - patternLen; i++) {
            boolean matchFound = true;

            for (int j = 0; j < patternLen; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    matchFound = false;
                    break;
                }
            }

            if (matchFound) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String text = "helloabcworld";
        String pattern = "abc";

        System.out.println(search(pattern, text)); // true
    }
}
