public class SelectionSort {
    public static void main(String[] args) {
        //selection sort
        int[] nums = {3, 5, 9, 2, 4, 1, 10, 11};
        int size = nums.length;
        int temp = 0;
        int minIndex = -1;

        //before sort
        System.out.println("\n Before sort");
        for(int num : nums){
            System.out.print(num + " ");
        }

        //swap on the outer loop
        for(int i=0; i<size-1; i++){
            minIndex=i;
            for(int j=i+1; j<size;j++){
                if(nums[minIndex] > nums[j]){
                    minIndex=j;
                }
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;


        }


        //After sort
        System.out.println("\n After sort");
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
