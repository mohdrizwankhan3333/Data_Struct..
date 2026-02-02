public class StringUtils {

    public static void main(String[] args) {
        String text = "abcdef";

        System.out.println(stringLength(text));        // 6
        System.out.println(subString(text, 1, 4));     // bcd
    }

    static int stringLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    static String subString(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
}
