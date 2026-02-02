public class revWords {

        static String reverseWords(String s) {
            String[] words = s.split(" ");
            String result = "";

            for (int i = words.length - 1; i >= 0; i--) {
                if (words[i].length() > 0) {   // word exists
                    result += words[i] + " ";
                }
            }

            return result.trim(); // remove last extra space
        }

        public static void main(String[] args) {
            System.out.println(reverseWords("the sky is blue"));
        }
    }
