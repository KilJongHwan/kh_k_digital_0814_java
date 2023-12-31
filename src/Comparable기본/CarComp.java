package Comparable기본;

public class CarComp implements Comparable<CarComp>{
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }
    @Override
    // 반환 값이 1이면 정렬해야할 조건
    // 반환 값이 -1 정렬 조건이 아님
    // 반환 값이 0 정렬 조건은 아니지만 set을 사용하는 경우 중복 제거 조건
    public int compareTo(CarComp o) {
        if (this.modelYear > o.modelYear) return 1;
        else {
            if (this.modelYear == o.modelYear){
                return this.modelName.compareTo(o.modelName);  // 사전 순 정렬
            }
        }
        return  -1;
    }
}
