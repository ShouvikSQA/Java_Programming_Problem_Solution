import java.util.Scanner;

public class P11_RemoveVowels {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        str = sc.nextLine();
        str = str.toLowerCase();
        String vowel = "aeiou";
        StringBuilder ans = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);

            if(vowel.indexOf(ch)!=-1) continue;

            ans.append(ch);

        }

        String finalAns = String.valueOf(ans);
        finalAns = finalAns.trim();
        finalAns = finalAns.replaceAll(" +", " ");

        System.out.println(finalAns);

    }
}
