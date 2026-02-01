public class Dup {
    //Find the duplicate number in an array (where elements are 1 to N).
    public static void main(String[] args) {
        String str="Abc";
        System.out.println("Original:"+ str);
        for (char c:str.toCharArray()){
            if(c>='A' && c<='Z'){
                System.out.print( (char)(c+32));
            }
            else if(c>='a' && c<='z'){
                System.out.print( (char)(c-32));
            }
        }
        System.out.println();
        System.out.println((char)(65));
        System.out.println((char)(65+32));

    }

}
