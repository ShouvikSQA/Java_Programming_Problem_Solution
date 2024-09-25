import java.util.Scanner;

public class P8_Counting_on_String {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        string = sc.nextLine();

        String vowels = "aeiou";

        String myStr = string.toLowerCase();


        int vowel=0 , cons=0 , space=0 ;

        for(int i=0 ; i<myStr.length() ; i++)
        {
            char ch = myStr.charAt(i);

            if(vowels.indexOf(ch)!=-1)
                vowel++;

            else if (ch==' ')  space++;

            else cons++;


        }

        System.out.println("Words: "+(space+1));
        System.out.println("Characters: "+(vowel+cons));
        System.out.println("Vowel: "+vowel);
        System.out.println("Consonant: "+cons);

    }
}
