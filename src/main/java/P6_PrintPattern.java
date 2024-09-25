import java.util.Scanner;

public class P6_PrintPattern {

    public static void printPattern(int num){
        int i,j;
        for(i=1; i<=num ; i++){
            for(j=1; j<=num-i+1 ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(i=2; i<=num ; i++){
            for(j=1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        printPattern(num);

    }
}
