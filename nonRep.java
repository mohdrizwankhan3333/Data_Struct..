public class nonRep {
    public static void main(String[] args) {
        String str = "erty iu ";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            boolean unique = true;

            // check entire string
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique = false;  // repeated
                    break;
                }
            }

            if (unique) {
                System.out.println(arr[i] + ": is first non-repeating character");
                return;  // stop after first
            }
        }

        System.out.println("No unique character available");
    }
}
