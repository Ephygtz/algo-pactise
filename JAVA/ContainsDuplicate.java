import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2};

        boolean result = isDuplicate(arr);

        System.out.println(result);
    }

    public static boolean isDuplicate(int[] arr){
        //use a hashset
        HashSet<Integer> exists = new HashSet<>();

        //loop through array
        for(int num : arr){
            if(exists.contains(num))
                return true;
            exists.add(num);
        }
        return false;
    }

}
