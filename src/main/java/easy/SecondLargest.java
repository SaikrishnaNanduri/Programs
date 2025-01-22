package easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {12,14,3,10,34,54,46};

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
