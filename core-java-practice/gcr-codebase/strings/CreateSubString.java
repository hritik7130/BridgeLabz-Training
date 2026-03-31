import java.util.*;

public class CreateSubString {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
         String string =sc.nextLine();
         System.out.println("Enter the starting element of Substring");
        int start=sc.nextInt();
        System.out.println("Ente the end index");
        int end =sc.nextInt();
        String manual=Substring(start,end,string);
        String byFunction=string.substring(start,end);

        boolean isSame=compare(manual, byFunction);
        System.out.println(isSame);

         

    }
    public static String Substring(int start, int end,String str){
        String result="";
        for(int i=start;i<=end;i++){
            result+=str.charAt(i);
        }
        return result;


    }
    // create the function to compare the two strings
    public static boolean compare(String manual,String byFunction){
        if(manual.length()!=byFunction.length()){
            return false;
        }
        for(int i=0;i<manual.length();i++){
            if (manual.charAt(i) != byFunction.charAt(i)) {
                return false;
        }

       

    }return true;
}
}