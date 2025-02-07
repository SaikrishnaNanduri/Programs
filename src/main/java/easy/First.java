package easy;

public class First {
    public First test(First fir){
        fir =null;
        return fir;

    }

    public static void main(String[] args) {
        First f1 =new First();
        System.out.println("Object1 "+f1);
        First f2 =new First();
        System.out.println("Object2 "+f2);
        First f3 =f1.test(f2);
        System.out.println("Object3 "+f3);

        f1 =null;

        System.out.println("Object1 "+f1);
        System.out.println("Object2 "+f2);
        System.out.println("Object3 "+f3);
    }
}
