package 배수구하기문제;

public class MultipleEx {
    public static void main(String[] args) {
//        for(int i = 1; i <= 1000; i++){
//            if(i % 7 == 0){
//                System.out.printf("%5d",i);
//                if(i % 10 == 0)
//                    System.out.println();
//            }
//        }

        int count = 0;
        for(int i = 7; i <= 1000; i+=7){
            count++;
            System.out.printf("%5d", i);
            if(count == 10){
                System.out.println();
                count = 0;
            }
        }
    }
}
