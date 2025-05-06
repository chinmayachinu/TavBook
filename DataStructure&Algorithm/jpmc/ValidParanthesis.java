package jpmc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ValidParanthesis {
//    public boolean isValid(String s) {
//        Queue<Character> queue = new LinkedList<>();
//
//        char[] chars = s.toCharArray();
//
//        // check if starts with closing
//        if (chars[0] == ')' || chars[0] == ']' || chars[0] == '}') {
//            return false;
//        }
//
//        for (char c : chars) {
//            // for opening brackets, add to the queue
//            if (c == '(' || c == '{' || c == '[') {
//                queue.add(c);
//            } else {
//                //check if queue peek opening has a character closing
//                if ((queue.peek() == '(' && c == ')') ||
//                        (queue.peek() == '[' && c == ']') ||
//                        (queue.peek() == '{' && c == '}')) {
//                    queue.remove();
//                } else {
//                    return false;
//                }
//            }
//        }
//
//        // if queue empty then true or else false
//        if (queue.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] chars = s.toCharArray();

        // check if starts with closing
        if (chars[0] == ')' || chars[0] == ']' || chars[0] == '}') {
            return false;
        }

        for (char c : chars) {
            // for opening brackets, push to the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                // check if stack top opening has a character closing
                if (!stack.isEmpty() && ((stack.peek() == '(' && c == ')') ||
                        (stack.peek() == '[' && c == ']') ||
                        (stack.peek() == '{' && c == '}'))){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        // if stack empty then true or else false
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ValidParanthesis v = new ValidParanthesis();
        System.out.println(v.isValid("[])"));
    }
}