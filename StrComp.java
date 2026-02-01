public class StrComp {
    // Implement string compression (e.g., "aabcccccaaa" →
    //"a2b1c5a3")

        public static void main(String[] args) {
            String str = "aabcccccaaa";
            char[] arr = str.toCharArray();

            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    count++;
                } else {
                    compressed.append(arr[i - 1]);
                    compressed.append(count);
                    count = 1; // reset count for new char
                }
            }

            // append the last character and its count
            compressed.append(arr[arr.length - 1]);
            compressed.append(count);

            System.out.println(compressed.toString());
        }


}
