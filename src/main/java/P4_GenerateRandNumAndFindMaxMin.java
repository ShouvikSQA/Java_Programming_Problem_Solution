public class P4_GenerateRandNumAndFindMaxMin {

    public static int generateRandNum(int min , int max){
        return (int) (Math.random()*(max-min)+min);
    }


    public static void main(String[] args) {

        int[] array = new int[10];

        for(int i=0 ; i<10 ; i++)
            array[i] = generateRandNum(1,1000);

        int min = array[0];
        int max = array[0];

        for(int i=1 ; i<10 ; i++){
            max = Math.max(max,array[i]);
            min = Math.min(min,array[i]);
        }

        System.out.print("All the numbers of array : ");

        for(int i=0 ; i<10 ; i++)
            System.out.print(array[i]+"  ");

        System.out.println();

        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);


    }

}
