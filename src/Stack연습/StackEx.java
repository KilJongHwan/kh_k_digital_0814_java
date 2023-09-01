package Stack연습;

import java.util.Scanner;
import java.util.Stack;

// Stack 을 이용해서 열림, 닫힘 괄호 체크하기
public class StackEx {
    public static void main(String[] args) {
        Stack<Character> cStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("수식 입력 : ");
        String exp = sc.next();
        // 입력 받은 문자열 길이 만큼 반복 순회
        for (int i =0; i < exp.length(); i++){
            char ch = exp.charAt(i);
            if (ch == '('){
                cStack.push(ch);
            } else if(ch == ')'){
                if(!cStack.empty()) cStack.pop();   // 닫힘 괄호 일때 pop
                else{
                    System.out.println("괄호가 일치 하지 않습니다.");
                    return;
                }
            }
        }
        if (cStack.isEmpty()){
            System.out.println("괄호가 일치 합니다.");
        } else {
            System.out.println("괄호가 일치 하지 않습니다.");
        }
    }
}
