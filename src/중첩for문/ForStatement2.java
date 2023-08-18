package 중첩for문;
// 이중 반복문
public class ForStatement2 {
    public static void main(String[] args) {
        // 별 찍기
        for (int i = 0; i < 10; i++){
            System.out.printf("|i=%d|", i);
            for (int j = 0; j < 10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // 구구단
//        for(int i = 2; i <= 9; i++){
//            for(int j = 1; j <= 9; j++){
//                System.out.printf("%d * %d = %d\n",i , j , i * j);
//            }
//            if(i < 9)
//                System.out.println("==== 단이 올라감 ====");
//        }
    }
}