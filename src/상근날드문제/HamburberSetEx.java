package 상근날드문제;

import java.util.Scanner;

public class HamburberSetEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] price = new int[5];
        int min = 0;
        for (int i = 0; i < price.length; i++ ){
            price[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++){
            for(int j = i; j < 3; j++){
                if (price[i] > price[j]){
                    min = price[j];
                    min += Integer.min(price[3],price[4]) - 50;
                }
            }
        }
        System.out.println(min);
    }
}
