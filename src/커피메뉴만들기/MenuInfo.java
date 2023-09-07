package 커피메뉴만들기;

import java.io.Serializable;

public class MenuInfo implements Serializable {
    String name;  // 메뉴명
    int price;      // 가격
    String category;// 분류
    String description; // 메뉴에 대한 설명

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public MenuInfo(String name, int price, String category, String description) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
    }
}
