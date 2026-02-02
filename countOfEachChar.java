public class countOfEachChar {
    public static void main(String[] args) {

        String str = "wertewdc";
        char[] arr = str.toCharArray();
        boolean[] flag = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (flag[i]) continue; // ✅ FIX: index, not character

            int c = 1; // ✅ FIX: count current char

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    c++;
                    flag[j] = true;
                }
            }
            System.out.println(arr[i] + ":" + c);
        }
    }
}
