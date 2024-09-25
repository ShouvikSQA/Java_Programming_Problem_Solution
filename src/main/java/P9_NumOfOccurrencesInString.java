import java.util.HashMap;
import java.util.Scanner;

public class P9_NumOfOccurrencesInString {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        string = sc.nextLine();
        string = string.toLowerCase();

        HashMap<Character,Integer> hmp = new HashMap<>();


        for( int i=0 ; i<string.length() ; i++ ){

            char ch = string.charAt(i);
            if(ch != ' ') {
                int count = hmp.getOrDefault(ch , 0);
                hmp.put(ch, count+1);
            }
        }

        for( int i=0 ; i<string.length() ; i++ ){
            char ch = string.charAt(i);
            if(ch != ' ' &&  hmp.get(ch)!= null  ) {
                 int count = hmp.get(ch);
                System.out.println( ch +" "+ count );
                 hmp.remove(ch);
            }


        }

    }
}
