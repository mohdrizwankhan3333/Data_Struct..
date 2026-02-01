import java.util.HashMap;
import java.util.Map;

public class longUniqSubstr {
    public static void main(String[] args) {
        String str = "abcabcfcghhbb";
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> lastSeenIndex = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // ❌ Corrected syntax and logic
            if (lastSeenIndex.containsKey(currentChar)) {
                int lastIndex = lastSeenIndex.get(currentChar);
                start = Math.max(start, lastIndex + 1); // move start past previous occurrence
            }

            lastSeenIndex.put(currentChar, i);
            maxLen = Math.max(maxLen, i - start + 1);
        }

        System.out.println("Length of longest substring without repeating characters: " + maxLen);
    }
}
