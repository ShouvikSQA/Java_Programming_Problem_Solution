public class P2_Sort_CGPA {

    public static  void sortArray(double[] array){

        int i,j;
        int n= array.length;
        for(i=0 ; i<n-1 ; i++)
            for ( j=0; j< n-i-1 ; j++ ){
                if( array[j] < array[j+1]  )
                {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }


    }

    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        sortArray(cgpa);
        for (int i=0 ; i<cgpa.length ; i++)
          System.out.print(cgpa[i] + "  ");

    }

}
