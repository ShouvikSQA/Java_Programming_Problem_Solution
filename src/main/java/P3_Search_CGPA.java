import java.util.Scanner;

public class P3_Search_CGPA {

    public static  void sortArray(double[] array){

        int i,j;
        int n= array.length;
        for(i=0 ; i<n-1 ; i++)
            for ( j=0; j< n-i-1 ; j++ ){
                if( array[j] > array[j+1]  )
                {
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

    }

    public static int binarySearch(double[] array , double target){

        int left =0 , right = array.length-1 ;
        while (left<=right){
            int mid = left + (right - left) / 2;

            if( array[mid] == target ) return mid;
            else if(array[mid] < target) left=mid+1;
            else    right = mid-1;

        }


        return -1;
    }

    public static void main(String[] args) {

        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your cgpa : ");
        double userCgpa = sc.nextDouble();
        sortArray(cgpa);
        int indx = binarySearch(cgpa , userCgpa);

        if(indx == -1)
            System.out.println("Cgpa is not present in the array");
        else
            System.out.println("Cgpa is  present in the array");

    }
}
