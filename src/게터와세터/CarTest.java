package 게터와세터;

public class CarTest {
    String manufacture;
    String modelName;
    String color;
    String year;
    int maxSpeed;

    public CarTest(String manufacture, String modelName, String color, String year, int maxSpeed) {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }


    public String getManufacture() {
        return manufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
