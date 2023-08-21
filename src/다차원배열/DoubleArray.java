package 다차원배열;
// 2차원의 배열에서 행에 대한 배열의 값을 실제 값이 존재하는 것이 아니고 열에 대한 시작 주소를 가지고 있다.
public class DoubleArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];    // 첫번째 인젝스에서 0,1,2 두번째 인덱스에 대해서도 0,1,2
        int k = 10;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = k;
                k += 10;
            }
        }
        for (int[] ints : arr){
            for (int a : ints){
                System.out.println(a);
            }
        }
    }
}
