public class dupli {
    //remove duplicate
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5,7,7};
        for(int i=0;i<arr.length;i++){
            boolean unique=true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    unique=false;
                    break;

                }

                }
            if(unique==false){
                System.out.println(arr[i]);
            }
        }
    }
}
