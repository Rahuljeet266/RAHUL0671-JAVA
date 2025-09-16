package Day42;
import java.util.*;



public class ques {
    public static void main(String[] args){

        //                largest element of each row
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,2},{22,33,66,77,88}};
        for(int i = 0;i<3;i++){
            int m = Integer.MIN_VALUE;
            for(int j = 0;j<5;j++){
                if(arr[i][j]>m){
                    m = arr[i][j];

                }
            }
            System.out.println("Largest element in "+i+"th row is "+m);

        }

        System.out.println();

        //          3x3 matrix

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int m= sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int[][] arra = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                arra[i][j] = sc.nextInt();
            }
        }
//        for(int i = 0;i<m;i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arra[i][j] + " ");
//            }
//            System.out.println();
//        }


        //    first and last row

        for(int i = 0;i<m;i++){

                if(i == 0 || i == m-1){
                    for(int j = 0;j<n;j++){
                    System.out.print(arra[i][j]+ " ");
                }
                    System.out.println();
            }


        }
        System.out.println();

        // sum of each column

        for (int i = 0;i<m;i++){
            int sm = 0;
            for(int j = 0;j<n;j++){
                sm+=arra[j][i];
            }
            System.out.println("Sum of column "+i+" is "+sm);
        }






    }
}
