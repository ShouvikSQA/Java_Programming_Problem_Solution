import java.util.ArrayList;
import java.util.HashMap;

public class P10_PrintUniqueNumbers {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 1, 2, 4, 5, 6, 5, 4, 7};

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
