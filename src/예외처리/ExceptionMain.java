package 예외처리;

public class ExceptionMain {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            for (int i = 0; i <= 5; i++){
                arr[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("배열 인덱스 초과 : 값을 확인해 주세요.");
        }
        System.out.println("프로그램 끝");
    }
}
