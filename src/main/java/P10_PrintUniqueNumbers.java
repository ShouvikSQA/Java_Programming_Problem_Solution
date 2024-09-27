import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P10_PrintUniqueNumbers {
    public static void main(String[] args) {

        int[] array = new int[12];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Numbers : ");
        for (int i=0 ; i<array.length ; i++)
        {
              array[i] = sc.nextInt();
        }

        System.out.println();

        HashMap<Integer,Integer> mp = new HashMap<>();

        for (int i=0 ; i<array.length ; i++){
            int num = array[i];
            mp.put( num , mp.getOrDefault(num,0) + 1 );
        }

        ArrayList<Integer> uniqueNum = new ArrayList<>();

        for ( int i=0 ; i<array.length ; i++ ){
            int count = mp.get(array[i]);
            if(count==1)
                uniqueNum.add(array[i]);
        }

        System.out.println("Non Duplicate Numbers = "+uniqueNum);

    }
}
