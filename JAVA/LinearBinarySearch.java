public class LinearBinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,11,13,15,17,19,21};
        int target = 19;

        //using linearSearch(Big0(n)
        int result = linearSearch(nums, target);

        if(result != -1){
            System.out.println("Element found at index : " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]  == target){
                return i;
            }
        }
        return -1;
    }
}