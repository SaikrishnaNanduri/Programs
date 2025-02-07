package easy;

public interface TestInterface {

    default void add(){
        System.out.println("Default Interface Method ");
    }


    static String   staticMethodOne(){
        System.out.println(" Static Method One in Interface..");
        return "Interface One:: Static Method  One";
    }
    static void staticMethodTwo(){
        System.out.println(" Static Method two in Interface..");

    }
}
