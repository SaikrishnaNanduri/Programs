package easy;

import java.util.Scanner;

public class MinAndMax {

    public static void minAndMax(int[] arr){
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
            for(int i:arr){
                if (i < min) {
                    min = i;
                }
                if (i > max) {
                    max = i;
                }
            }
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        minAndMax(arr);
    }
}