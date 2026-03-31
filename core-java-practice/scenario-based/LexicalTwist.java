import java.util.LinkedHashSet;
import java.util.Scanner;

public class LexicalTwist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String input1 = scanner.nextLine();

        for(int i = 0; i < input1.length(); i++) {
            if(input1.charAt(i) == ' '){
                System.out.println(input1 + " is an Invalid Input");
                return;
            }
        }

        System.out.print("Enter second string: ");
        String input2 = scanner.nextLine();


        for(int i = 0; i < input2.length(); i++) {
            if(input2.charAt(i) == ' '){
                System.out.println(input2 + " is an Invalid Input");
                return;
            }
        }

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();
        StringBuilder sb = new StringBuilder(input2);


        if (input1.equals(sb.reverse().toString())) {
           
            StringBuilder rev = new StringBuilder(input1);

            rev.reverse().toString().toLowerCase();

            StringBuilder finalResult = new StringBuilder();

            for(int i =0; i<rev.length(); i++) {
                if(rev.charAt(i)=='a' || rev.charAt(i)=='e' || rev.charAt(i)=='i' || rev.charAt(i)=='o' || rev.charAt(i)=='u') {
                    finalResult.append("@");
                }else {
                    finalResult.append(rev.charAt(i));
                }
            }

            System.out.println(finalResult.toString());

        } else {
            String combinedString = input1 + input2;
            combinedString = combinedString.toUpperCase();
            int countVowels =0;
            int countConsonants =0;

            for(int i =0; i<combinedString.length(); i++) {
                if(combinedString.charAt(i)=='A' || combinedString.charAt(i)=='E' || combinedString.charAt(i)=='I' || combinedString.charAt(i)=='O' || combinedString.charAt(i)=='U') {
                    countVowels++;
                }else {
                    countConsonants++;
                }
            }

            if(countVowels>countConsonants) {
                
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for(int i =0; i<combinedString.length(); i++) {
                    set.add(combinedString.charAt(i));
                }

                int count = 0;
                
                for(Character ch : set) {
                    if(count < 2){
                    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                        System.out.print(ch + " ");
                        count++;
                    }   
                    }
                }
        }else if(countConsonants>countVowels) {
                LinkedHashSet<Character> set = new LinkedHashSet<>();
                for(int i =0; i<combinedString.length(); i++) {
                    set.add(combinedString.charAt(i));
                }
                int count = 0;
                
                for(Character ch : set) {
                    if(count < 2){
                    if(!(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')) {
                        System.out.print(ch + " ");
                        count++;
                    } 
                    }
                }
            }else{
                System.out.println("Vowels and Consonants are equal");
            }
        }

    }
}