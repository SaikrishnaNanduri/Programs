package easy;


public class Test implements TestInterface, TestInterfaceTwo {

    public static void main(String[] args) {
        Test t = new Test();
      int result=  t.removeElement(new int[]{1,1,3,3,5,5},3);
        System.out.println(result);
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length ==0) return 0;
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j] !=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    @Override
    public void add() {
        TestInterface.super.add();
        TestInterfaceTwo.super.add();
        TestInterface.staticMethodOne();
        TestInterfaceTwo.staticMethodOne();
    }

    public int removeElement(int[] nums, int val) {
        int index =0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] !=val){
                nums[index] = nums[i];
                index++;
            }

        }
        return index;

    }
}
