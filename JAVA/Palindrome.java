public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Hello Palindrome");
        System.out.println(isPalindrome("madame"));
        System.out.println(isPalindromeInt(122221));
    }

    public static boolean isPalindrome(String word){
        StringBuilder str = new StringBuilder(word);
        String reversed = str.reverse().toString();
        System.out.println(reversed + " " + word);
        if (word.equalsIgnoreCase(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeInt(int num){
        String numString = String.valueOf(num);
        int size = numString.length();

        for(int i=0; i < size/2; i++){
            if(numString.charAt(i) != numString.charAt(size-i-1)) return false;
        }
        return true;
    }
}
