package 저항구하기문제;

import java.util.Scanner;

public class Resistance {
    public static void main(String[] args) {
        String[] r = {"black", "brown" ,"red", "orange", "yellow","green","blue","violet","grey","white"};
        String[] x = new String[2];
        long a = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3;i++) {
            String input = sc.nextLine();
            for (int j = 0; j < r.length; j++){
                if (r[j].equalsIgnoreCase(input)){
                    if (i < 2){
                        x[i] =  Integer.toString(j);
                    }
                    else{
                        a += (long)Math.pow(10, j);
                    }
                }
            }
        }
        long b = Integer.parseInt( x[0] + x[1]);
        long y = a * b;
        System.out.println(y);
    }
}
