import java.util.Stack;

public class ReverseWithStack{
    public static void main(String[] args) {
        ReverseWithStack rve = new ReverseWithStack();

        System.out.println("Reversed String : " + rve.stackReverse("hello") );
        
    }

    public String stackReverse(String str){
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            st.push(ch);
        }
        String reversed = "";
        while (!st.isEmpty()) {
            reversed += st.pop();
        }

        return reversed;
    }
}