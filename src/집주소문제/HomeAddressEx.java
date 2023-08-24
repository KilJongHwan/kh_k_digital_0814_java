package 집주소문제;

import java.lang.reflect.Array;
import java.util.Scanner;

public class HomeAddressEx {
    public static void main(String[] args) {
        String[] N = new String[4];
        Scanner sc = new Scanner(System.in);
        char[] S = new char[10];
        for (int i = 0; i < N.length; i++)
        {
            N[i] = sc.nextLine();
        }

        int A = 0;
        int B = 0;
        for (int i = 0; i < N.length; i++){
            S = N[i].toCharArray();
            B++;

            for (int j = 0; j < S.length; j++){
                switch (S[j]){
                    case '0':
                        A += 4;
                        break;
                    case '1':
                        A += 2;
                        break;
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        A+=3;
                        break;
                }
                B++;
            }
            if (N[i].equalsIgnoreCase("0")) {
                A = 0;
                B = 0;
            }
            System.out.println(A + B);
            A = 0;
            B = 0;
        }
    }
}
