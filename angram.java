import java.util.Arrays;

public class angram {
    //21. Check if two strings are anagrams.

    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        char [] Arr1=a.toCharArray();
        char [] Arr2=b.toCharArray();
        if(Arr1.length!=Arr2.length){
            System.out.println("not anagram");
            return;
        }
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        if(Arr1.length!=Arr2.length){
            System.out.println("not anagram");
            return ;
        }
        System.out.println("Anagram");
    }
}
