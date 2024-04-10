public class InsertionSort {
    public static void main(String[] args) {
        //define arr
        int[] arr = {5,3,7,2,4,9,1};

        //outerloop
        for(int i=1; i<arr.length;i++){
            //initialise a key
            int key = arr[i];
            //initialise a counter
            int j = i-1;

            while (j>=0 && arr[j] > key ) {
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1]= key;
        }

        //print to check values
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
