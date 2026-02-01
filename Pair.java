public class Pair {
    //Find the pair with the given sum in an array.
    public static void main(String[] args) {
        int pair=56;
        int[] arr={1,2,6,4,5,50};
        int currentSum=0;
       int si=0,ei=arr.length-1;
       while(si<ei){
           if(arr[si]+arr[ei]==pair){
               System.out.println(si+","+ei);
               return;
           }
           if(arr[si]+arr[ei]>pair){
               ei--;
           }
           else{
               si++;
           }
       }
        System.out.println("Not found");}
}
