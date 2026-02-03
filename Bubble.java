public class Bubble {
    public static void main(String[] args) {
        int p[]={43,4,5,3,1,2};
        for(int i=0;i<p.length;i++){
            for(int j=0;j<p.length-1;j++){
                if(p[j]>p[j+1]){
                    int temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                }
            }
        }
        for(int i=0;i<p.length;i++){
            System.out.print(p[i]+",");
        }
    }
}
