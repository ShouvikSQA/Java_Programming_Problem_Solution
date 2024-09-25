import java.util.Scanner;

public class P7_TwoLowestHeight {
    public static void main(String[] args) {
        int[] height = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 babies height in cm :");

        for(int i=0 ; i<10 ; i++)
            height[i] = sc.nextInt();

        int min1 = height[0];
        int min2 = height[0];

        for(int i=1 ; i< height.length ; i++ ){

            if( height[i] < min1 )
            {
                min2 = min1;
                min1 = height[i];
            }

            else if( height[i] < min2 && height[i] > min1 )
                min2 = height[i];
        }

        System.out.println("Two lowest Height of Babies : Lowest Height = "+min1+" cm , Second Lowest Height = "+min2+" cm");

    }
}
