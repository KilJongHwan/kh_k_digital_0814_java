package 접근제한자;

public class RestrictedAccess {
    public void seoul(){
        System.out.println("서울 메소드");
    }
    protected void busan(){
        System.out.println("부산 메소드");
    }
    void deagu(){
        System.out.println("대구 메소드");
    }
    private void incheon(){
        System.out.println("인천 메소드");
    }

}
