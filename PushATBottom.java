import java.util.Stack;

public class PushATBottom {

    public static void bottom(Stack<Integer> s, int data) {
        // Base case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // Remove top
        int top = s.pop();

        // Recursive call
        bottom(s, data);

        // Push top back
        s.push(top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        bottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}