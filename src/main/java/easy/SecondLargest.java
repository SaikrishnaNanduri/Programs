package easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        findSecondLargestArray(arr);
    }




    public static  void findSecondLargestArray(int [] arr){

        int largest =Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        System.out.println("Initial largest" +largest);
        System.out.println("Initial Secondlargest" +secondLargest);
        for(int num:arr){
            if(num>largest){
                secondLargest =largest;
                largest =num;
            }else if(num >secondLargest && num <largest){
                secondLargest =num;
            }
        }
        System.out.println("Second Largest :"+secondLargest);

    }
}
