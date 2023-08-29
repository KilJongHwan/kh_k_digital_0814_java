package Arrays검색;

import java.util.Arrays;
import java.util.Scanner;
// 검색을 위해서 사전에 정렬이 되어 있어야 한다.
public class ArraysSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 갯수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("찾을 수 입력 : ");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * num) + 1;
        }
        Arrays.sort(arr);
        for(int e : arr) {
            System.out.print(e + " ");
            int result = Arrays.binarySearch(arr, key);  // 정렬된 배열을 이분 검색
            if (result >= 0) {
                System.out.println("[" + result + "]");  // 인덱스가 넘어 옴
            } else{
                System.out.println("찾는 값이 없습니다.");
            }
        }
    }
}
