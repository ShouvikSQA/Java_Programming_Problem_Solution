public class P1_SecondHighestScore {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        double max1 = Integer.MIN_VALUE;
        double max2 = Integer.MIN_VALUE;

        for(int i=0 ; i< cgpa.length ; i++ ){

            if( cgpa[i] > max1 )
            {
                max2 = max1;
                max1 = cgpa[i];
            }

            else if( cgpa[i] > max2 && cgpa[i] < max1 )
                max2 = cgpa[i];
        }

        System.out.println("Second Highest Score : "+max2);

     }
}
