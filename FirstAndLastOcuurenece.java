public class FirstAndLastOcuurenece {

    public static int[] searchRange(int[] nums, int target) {
        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int[] res = searchRange(arr, target);
        System.out.println("First = " + res[0] + ", Last = " + res[1]);
    }
}
