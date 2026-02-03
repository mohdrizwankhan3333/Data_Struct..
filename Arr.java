public class Arr {
    public static void main(String[] args) {
        String str = "zxcvzxcv";
        char[] arr = str.toCharArray();

        char[] unique = new char[arr.length];
        int k = 0;

        // 1️⃣ Find unique characters
        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;

            for (int j = 0; j < k; j++) {
                if (unique[j] == arr[i]) {
                    seen = true;
                    break;
                }
            }

            if (!seen) {
                unique[k++] = arr[i];
            }
        }

        // 2️⃣ Compare unique with original & count
        for (int i = 0; i < k; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (unique[i] == arr[j]) {
                    count++;
                }
            }

            System.out.print(unique[i] + "" + count);
        }
    }
}

