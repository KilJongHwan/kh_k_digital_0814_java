package Stack자료구조;

import java.util.Stack;

// Stack : LIFO (LAST IN FIRST OUT)
public class StackDataStructure {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.peek());
        stack.pop();                            // 스택 요소 하나 내보내기
        System.out.println(stack.peek());       // 스택의 맨 위의 값
        System.out.println(stack.size());       // 스택의 총크기
        System.out.println(stack.contains(6));  // 해당 값을 포함 하는가
        System.out.println();
        while (!stack.empty()) System.out.println(stack.pop());
    }
}
