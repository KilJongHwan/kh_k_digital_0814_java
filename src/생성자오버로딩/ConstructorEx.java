package 생성자오버로딩;

public class ConstructorEx {
    public static void main(String[] args) {
        Car car = new Car("Honda", "CR-V", "White",200,50);
        car.carInfo();

        System.out.println();

        Car carA = new Car();
        carA.carInfo();

        System.out.println();

        Car santafe = new Car("Santafe");
        santafe.carInfo();

        System.out.println();

        Car avante = new Car("Avante", "Red");
        avante.carInfo();

        System.out.println();

        Car grandure = new Car("Garndure", "black", 150);
        grandure.carInfo();

        System.out.println();

        Car tucson = new Car("Tucson", "Gray", 120, 150);
        tucson.carInfo();
    }
}
