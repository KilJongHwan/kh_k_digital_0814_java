package 커피메뉴만들기;
// HashMap 으로 커피 메뉴 리스트 만들기

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeMenuList {
    // 문자열로 만들어진 key, coffee : 여러가지 정보가 포함된 객체를 값으로 사용
    static Map<String, MenuInfo> map = new HashMap<>();
    public static void main(String[] args) throws IOException {
        makeMenu();
        selectMenu();
    }
    static void makeMenu(){
        map.put("Americano", new MenuInfo("Americano", 2500, "Coffee", "기본 커피"));
        map.put("Espresso", new MenuInfo("Espresso", 2500, "Coffee", "커피 원액"));
        map.put("Latte", new MenuInfo("Latte", 3000, "Coffee", "우유 포함 커피"));
    }
    static void selectMenu() throws IOException {
        Scanner sc = new Scanner(System.in);
        String key = "";    // key 받기 위한 문자열 변수
        while(true){
            System.out.println("=".repeat(10) + "Menu List" + "=".repeat(10));
            System.out.print("[1]메뉴 보기 [2]메뉴 조회 [3]메뉴 추가 [4]메뉴 삭제 [5]메뉴 수정 [6]종료 : ");
            int selMenu = sc.nextInt();
            switch(selMenu){
                case 1:
                    System.out.println("=".repeat(10) + "메뉴 보기" + "=".repeat(10));
                    for(String e : map.keySet()){
                        System.out.println("메뉴 : " + map.get(e).getName());
                        System.out.println("가격 : " + map.get(e).getPrice());
                        System.out.println("분류 : " + map.get(e).getCategory());
                        System.out.println("설명 : " + map.get(e).getDescription());
                        System.out.println("-".repeat(28));
                    }
                    break;
                case 2:
                    System.out.print("조회할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    // 포함 여부를 확인하는 메소드 containsKey(key) : map 내에 해당 key 있는지 확인하여 결과를 반환
                    if (map.containsKey(key)){
                        System.out.println("메뉴 : " + map.get(key).getName());
                        System.out.println("가격 : " + map.get(key).getPrice());
                        System.out.println("분류 : " + map.get(key).getCategory());
                        System.out.println("설명 : " + map.get(key).getDescription());
                    }else System.out.println("해당 메뉴가 존재하지 않습니다.");
                    break;
                case 3:
                    System.out.print("추가 할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.println("해당 메뉴가 이미 존재 합니다");
                    }else {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        map.put(key,new MenuInfo(key, price, category, description));
                    }
                    break;
                case 4:
                    System.out.print("삭제할 메뉴를 입력 하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)){
                        map.remove(key);
                        System.out.println(key + "메뉴를 삭제 하였습니다.");
                    }else {
                        System.out.println("삭제할 메누가 없습니다.");
                    }
                    break;
                case 5:
                    System.out.print("수정할 메뉴를 입력하세요 : ");
                    key = sc.next();
                    if (map.containsKey(key)) {
                        System.out.print("가격 입력 : ");
                        int price = sc.nextInt();
                        System.out.print("분류 입력 : ");
                        String category = sc.next();
                        sc.nextLine();
                        System.out.print("설명 입력 : ");
                        String description = sc.nextLine();
                        // key 값을 동일하고 값이 변경되는 경우에 replace() 사용
                        map.replace(key,new MenuInfo(key, price, category, description));
                    }else{
                        System.out.println("해당 매뉴가 없습니다.");
                    }
                    break;
                case 6:
                    System.out.println("메뉴를 종료 합니다.");
                    System.exit(0); // 강제 종료
                    FileOutputStream fos = new FileOutputStream("src/커피메뉴만들기/coffee.bin");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(map);
                    oos.flush();
                    oos.close();
                    fos.close();
                    return;
                default:
            }
        }
    }
}
