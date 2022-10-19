import java.util.Collections;
import java.util.Stack;

public class ChallengeTwo {


    public static void main(String[] args) {

        Stack<Integer> stack = new Stack();

        add_to_stack(stack, 10);
        add_to_stack(stack, 11);
        add_to_stack(stack, 12);
        add_to_stack(stack, 13);
        remove_stack(stack);
        max_number(stack);


    }

    static void add_to_stack(Stack stack, int x){
        stack.push(x);
        System.out.println(stack);
    }

    static void remove_stack(Stack stack){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else {
            System.out.println("removed: " + stack.pop());
        }
    }
    static void max_number(Stack stack){
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }else {
            System.out.println(Collections.max(stack));
        }
    }
}
