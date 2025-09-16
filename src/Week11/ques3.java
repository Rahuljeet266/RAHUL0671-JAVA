package Week11;
import java.util.*;

public class ques3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
//                  inserting element

        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println("Enter the position for value to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter the value to be inserted");
        int val = sc.nextInt();
        for(int i = n;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = val;
        n++;


        for(int i = 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }


    }

