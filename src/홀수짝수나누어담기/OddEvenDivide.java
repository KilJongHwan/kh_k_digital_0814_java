package 홀수짝수나누어담기;
// 7개의 정수를 입력 받음
// 홀수와 짝수 배열로 나누어 담는 함수 만들기
// 홀수와 짝수를 출력 하는 함수 만들기
// 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6

import java.util.*;

public class OddEvenDivide {
    static List<Integer> list = new ArrayList<>();
    static List<Integer> evenList = new ArrayList<>();
    static List<Integer> oddList = new ArrayList<>();
    static int count = 0;   // 메소드에서 사용하기 위해 static 이용
    public static void main(String[] args) {
        // 나만의 식으로 만든 문법
        int[] a = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< a.length; i++){
            a[i] = sc.nextInt();
        }
        int[] even = makeEven(a);
//        for (int p : even) if(p != 0) System.out.print(p);
        Arrays.sort(even);
        System.out.print("Even : ");
        for (int i = even.length - count; i < even.length;i++ ){
            System.out.print( even[i] + " ");
        }
        count = 0;
        int[] odd =  makeOdd(a);
//        for (int q : odd) if(q != 0) System.out.print(q);
        Arrays.sort(odd);
        System.out.println();
        System.out.print("Odd : ");
        for (int i = odd.length - count; i < odd.length;i++ ){
            System.out.print(odd[i] + " ");
        }
        
        // 리스트 문법
        System.out.println();
        for (int i = 0 ; i < 7; i++){
            list.add(sc.nextInt());
        }
        oddEvenCalc();
        System.out.print(oddList);
        System.out.print(evenList);
        System.out.println();
        
        // 매우 쉬운 람다식 문법
        System.out.print("Insert : ");
        List<Integer> ll = new ArrayList<>();
        for (int i = 0; i < 7; i++) ll.add(sc.nextInt());
        System.out.print("Odd : ");
        ll.stream().filter(n->n%2 != 0).forEach(e->System.out.print(e + " "));
        System.out.println();
        System.out.print("Even : ");
        ll.stream().filter(n->n%2 == 0).forEach(e->System.out.print(e + " "));
    }
    static void oddEvenCalc(){
        for(Integer e : list){
            if (e % 2 == 0){
                evenList.add(e);
            }
            else{
                oddList.add(e);
            }
        }
    }
   static int[] makeEven(int[] oe){
       int[] even = new int[7];
       int q = 0;
        for (int i = 0; i < oe.length; i++){
            if (oe[i] % 2 == 0){
                even[i] = oe[i];
                count++;
            }
        }
//        for (int e : oe){
//            if (e % 2 == 0){
//                even[q] = e;
//                q++;
//            }
//        }
        return  even;
    }
    static int[] makeOdd(int[] oe){
        int[] odd = new int[7];
        int q = 0;
        for (int i = 0; i < oe.length; i++){
            if (oe[i] % 2 != 0){
                odd[i] = oe[i];
                count++;
            }
        }
//        for (int e : oe){
//            if (e % 2 != 0){
//                odd[q] = e;
//                q++;
//            }
//        }
        return odd;
    }
}
