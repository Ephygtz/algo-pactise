public class LinearBinarySearch {

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,11,13,15,17,19,21};
        int target = 9;

        //using linearSearch(Big0(n)
        int result2 = linearSearch(nums, target);

        //using binarySearch(Big0(Logn)
        int result = binarySearch(nums, target);

        //using binarySearchRecursively(Big0(Logn)
        int result1 = binarySearchRecursive(nums, target, 0, nums.length-1);

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

    public static int binarySearch(int[] nums, int target) {
        //define start and end
        int left = 0;
        int right = nums.length - 1;
        
        while(left <= right){
            //find mid point
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] nums, int target, int left, int right){
        int mid = (left + right) / 2;

        if(nums[mid] == target){
            return mid;
        } else if(nums[mid] < target){
            binarySearchRecursive(nums, target, mid + 1, right);
        } else {
            binarySearchRecursive(nums, target, left, mid - 1);
        }

        return -1;
    }
}