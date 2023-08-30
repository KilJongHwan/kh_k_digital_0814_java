package List예제;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        // List 인터페이스의 정보면수로 ArrayList 객체를 참조
        List<MenuInfo> menuInfoList = new ArrayList<>();
        // add -> 객체를 추기, 추가 할 때마다 크기 변경
        menuInfoList.add(new MenuInfo("Americano", 2500,"coffee",true));
        menuInfoList.add(new MenuInfo("Latte", 3500,"coffee",true));
        menuInfoList.add(new MenuInfo("BlackTea", 4000,"tea",true));
        // 향상된 for 문 : 배열이나 Collection 클래스 자식들
        for (MenuInfo menu : menuInfoList){
            System.out.println(menu.getMenuInfo());
        }
    }
}
class MenuInfo {
    String name;
    int price;
    String category;
    String description;
    boolean isTax;

    public MenuInfo(String name, int price, String category, boolean isTax) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.isTax = isTax;
    }
    public String getMenuInfo(){
        return "{"+"\"name\":"+name+","+"\"price\":"+price+","+"\"isTax\":"+isTax+"}";
    }
}
