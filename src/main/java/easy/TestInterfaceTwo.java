package easy;

public interface TestInterfaceTwo {
    default void add(){
        System.out.println("Default Interface Method Two");
    }

    static String staticMethodOne(){
        System.out.println(" Static Method One in Interface..");
        return "Interface TWo:: Static Method  One";
    }

    static void staticMethodTwo(){
        System.out.println(" Static Method two in Interface..");

    }
}
