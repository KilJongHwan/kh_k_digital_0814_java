package 비트연산자;
// 비트 연산자는 비트 단위의 연산을 수행
// AND : & 비교하는 두 개의 비트가 모두 1이여야 1
// OR : | 비교하는 두 개의 비트가 하나만 1이여도 1
// NOT : ~ 현재의 비트의 값를 반전
// XOR : ^ 비교하는 두 개의 비트가 서로 다른 경우 1
// LEFT SHIFT : << 비트를 왼쪽으로 이동
// RIGHT SHIFT : << 비트를 오른쪽으로 이동

public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 12;
        System.out.println(num1 & num2);
        System.out.println(num1 | num2);
        System.out.println(num1 ^ num2);
        System.out.println(num1 << 1);
        System.out.println(num1 >> 2);
        System.out.println(~num2);


    }
}
