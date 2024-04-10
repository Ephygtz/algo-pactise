public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {3, 5, 9, 2, 4, 1, 10, 11};
        int size = nums.length;
        int temp =0;

        //beforesort
        System.out.println("Before sorting==========");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        //bubble sort
        //nested loops
        for(int i=0; i<size; i++){
            for(int j=0; j<size-i-1; j++){
                if(nums[j] > nums[j+1]){
                    //swap values
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }


        System.out.println(" \n =========After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
