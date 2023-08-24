package 매개변수의다형성1;

import java.util.Scanner;

public class Buyer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        TV tv = new TV();
        Computer computer = new Computer();
        Audio audio = new Audio();
        Scanner sc = new Scanner(System.in);
        Product p;  // 임시 저장용

        while (true) {
            System.out.print("[1]TV [2]Computer [3]Audio [4]quit : ");
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    p = tv;
                    if(check(customer,p)) return;
                    customer.buy(tv);
                    customer.viewInfo();
                    break;
                case 2:
                    p = computer;
                    if(check(customer,p)) return;
                    customer.buy(computer);
                    customer.viewInfo();
                    break;
                case 3:
                    p = audio;
                    if(check(customer,p)) return;
                    customer.buy(audio);
                    customer.viewInfo();
                    break;
                case 4:
                    return;
                default:
                    System.out.print("해당 제품이 없습니다");
            }
        }
    }
   static boolean check(Customer customer, Product p){
        boolean a = false;
        if (!customer.less(p)) {
            System.out.print("돈이 부족 합니다. 돈을 더 가져 오세요.");
            a = true;
        }
        return a;
    }
}
