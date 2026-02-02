import java.util.Arrays;

public class LongestPrefix {
    // Find the longest common prefix among a list of strings
    static String lcp(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        Arrays.sort(strs); // sorts lexicographically

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length()
                && first.charAt(i) == last.charAt(i)) {
            i++;
        }
        return first.substring(0, i);
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        System.out.println(lcp(arr)); // fl
    }
}
