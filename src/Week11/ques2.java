package Week11;
import java.util.*;

public class ques2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int sm = 0;
        for(int i = 0;i<arr.length;i++){
            sm+=arr[i];

        }
        System.out.println(sm);
    }
}
