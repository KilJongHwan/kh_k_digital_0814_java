package 자동차만들기실습문제;
//- 속도
//- 연비
//- 연료탱크 크기
//- 좌석수
//- 차량이름
public  abstract class Car {
    int speed;
    int fuelEfficiency;
    int fuelTankSize;
    int ableSeat;
    String name;
    static int count = 0;
    int fuelCost;
    int dis;
    int input;
    double fullDis;
    int hour;
    int minute;
    int inCount;
    int cost(){
        int fuelConsumed = dis / fuelEfficiency;
        inCount = input / ableSeat;
        if (inCount % ableSeat == 0) inCount++;
        int resume = fuelConsumed * ((inCount) * fuelCost);
        count = ((inCount * dis) / fuelEfficiency) / fuelTankSize;
        if (count % fuelEfficiency != 0 ) count++;
        fullDis = (double) (dis * count) / speed;
        int totalDis = dis * inCount; //
        int totalHours = totalDis / speed;
        hour = (totalDis/ speed);
        minute = ((totalHours - speed) * 60);
        return resume;
    }
    String getMovingTime(int dist, int movingCnt){
        double getTime = (double) dist * movingCnt / speed;
        int totalMinute = (int) (getTime * 60);
        int hour = totalMinute / 60;
        int minute = totalMinute % 60;
        return String.format("%d시간 %d분", hour,minute);
    }

    void CarInfo() {
        System.out.println("=".repeat(5) + name + "=".repeat(5));
        System.out.println("총 비용 : " + cost());
        System.out.println("총 주유 횟수 : " + count);
        System.out.println("총 시간 : " + getMovingTime(dis, inCount));
    }
    void setMode(){
        speed += (int) (speed * 0.2f);
    }
    public void setInput(int input) {
        this.input = input;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }
    int getMovingCnt(int passCnt){
        if(passCnt % ableSeat !=  0) return (passCnt / ableSeat) + 1;
        return  passCnt / ableSeat;
    }
    int getRefuelCnt(int dist, int moveCnt){
        if (((dist * moveCnt) / fuelEfficiency) % fuelEfficiency != 0) return (((dist * moveCnt) / fuelEfficiency) / fuelTankSize) + 1;
        return ((dis * moveCnt) / fuelEfficiency) / fuelTankSize;
    }
    int getTotalCost(int dist, int moveCnt){
        return  dist / fuelEfficiency * 2000 * moveCnt;
    }
}
