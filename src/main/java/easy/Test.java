package easy;

public class Test {

    public static void main(String[] args) {
        int product =1;

        for (int i=1;i<=2;i++){
            for(int j=1;j<=2;j++){
                for(int k=1;k<=2;k++){
                    for(int l=1;l<=2;l++){
                        product *= i+j+k+l;
                    }
                }

            }

        }
        System.out.println(product);
    }
}
