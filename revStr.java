public class revStr {
    public static void main(String[] args) {
        String str = "qwerty";

        // convert to char array
        char[] arr = str.toCharArray();
        int si = 0, ei = arr.length - 1;

        while (si < ei) {
            char ch = arr[si];
            arr[si] = arr[ei];
            arr[ei] = ch;
            si++;
            ei--;
        }

        // convert back to string
        String revStr = new String(arr);
        System.out.println(revStr); // ytrewq
    }
}
