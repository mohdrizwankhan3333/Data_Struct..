public class UniqueInSorted {
    //Find the element that appears only once in a sorted array
    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,5};
       int x=0;
        for(int i=0;i<arr.length;i++){
            x^=arr[i];
        }
        System.out.println(x);
    }
}
