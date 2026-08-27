package Day18;

//Complete this code or write your own from scratch
import java.util.*;


class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> phoneBook = new HashMap<>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
            
            // Write code here
        }
        in.close();
    }
}
