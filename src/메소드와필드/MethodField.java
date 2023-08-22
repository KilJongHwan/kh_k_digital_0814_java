package 메소드와필드;
// 메소드 : 클래스 내에서 동작에 대한 기능을 구현 하는 것 (함수가 클래스 내부에 있으면 메소드)
// 필드 : 클래스 내에 존재하면 값을 저장하는 변수를 의미 (상태를 저장)

public class MethodField {
    public static void main(String[] args) {
//        int result = sum(333, 555, 444, 666);
//        System.out.println(result);
        int rec = recFunc(10);
        System.out.println(rec);
    }
    // 메소드 앞에 static 을 선언 하는 경우 객체 소속이 아니고 클래스 소속
    static int sum(int a, int b){
        return  a + b;
    }
    // sum 메소드의 매개변수 개수를 다르게 해서 만들었으므로 오버로딩 관계가 성립
    static int sum(int a, int b, int c){
        return  a + b + c;
    }
    // 매개변수의 개수를 알 수 없는 경우 사용
    static int sum(int ... val){
        int sum = 0;
        for (int v : val){
            sum += v;
        }
        return sum;
    }
    // 재귀 호출 : 메소드 자신이 자신을 호출 하는 것
    static int recFunc(int n){
        if(n == 1) return 1;
        return n + recFunc(n-1);
    }
    static int whileSum(int n){
        int sum =0;
        while (n > 0){
            sum += n;
            n--;
        }
        return  sum;
    }
}