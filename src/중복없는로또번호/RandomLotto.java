package 중복없는로또번호;
// 1 ~ 45 사이의 임의의 수 6개를 생성해야 함. (입력은 받지 않음, Math.random() => 0.1 ~ 0.999)
// int val = (int) ((Math.random() * 45) + 1
// 단 중복 제거
// 생성된 val값을 배열에 담을 때 배열내에 해당하는 값이 있는 지 확인 필요.
// 배열 6개
// 반복횟수는 정할 수 없음 (while(true) ==> 탈출 조건이 있어야 함 중복 되지 않은 번호 6개가 저장되면 true

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RandomLotto {
    public static void main(String[] args) {
        // 내가 푼 방법
        int[] random = new int[6];
        int F = 0;
        int E = 0;
        while (true){
            int out = (int)((Math.random() * 45) + 1);
            random[F] = out;
            F++;
            if(F == random.length){
                for (int i = 0; i < random.length; i++){
                    for (int j = i; j < random.length; j++){
                        if(random[i] != random[j]) E++;
                    }
                }
            }
            if(E > random.length) break;
        }
        for (int a : random){
            System.out.println(a);
        }

        // ====== List를 이용한 방법 =======

//        List<Integer> list = new ArrayList<>();
//        int temp;
//        while(true){
//            temp = (int) ((Math.random() * 45) + 1);
//            if(!list.contains(temp)){
//                list.add(temp);
//            }
//            if (list.size() == 6) break;
//        }
//        System.out.println(list);

        // ======= Set : 자바에서 사용 집합 개녕 ======

//        HashSet<Integer> set = new HashSet<>();
//        while (true){
//           int temp = (int) ((Math.random() * 45) + 1);
//           set.add(temp);
//           if(set.size() == 6) break;
//        }
//        System.out.println(set);
    }
}
