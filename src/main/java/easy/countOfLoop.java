package easy;

public class countOfLoop {

    public static void main(String[] args) {
        int x=5;
        for (int i=1;i<=10;i++){
            if(x%2==0){
                x+=i;
            } else{
                x-=i;
            }
        }
        System.out.println(x);
    }
}
