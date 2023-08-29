package 날짜와시간;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// Date() : 운영체제로 부터 날짜와 시간 정보를 가져와 원하는 포멧 형태로 출력, 객체를 생성 해야 함
// 자바의 java.util 패키지에 포함되어 있어 import 해야 함
public class DateAndCal {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 년도를 4자리로 표시
        // yy : 년도를 2자리로 표시
        // MM : 월을 표시 (대문자 주의, 월이 2자리로 표시 됨)
        // HH : 24시간제
        // hh : 12시간제
        // mm : 분을 출력
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd");
        f2 = new SimpleDateFormat("yy/MM/dd");
        f3 = new SimpleDateFormat("yyyy년MM월dd일");
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날 입니다.");
        f6 = new SimpleDateFormat("오늘은 yyyy년의 w주차 입니다.");
        f7 = new SimpleDateFormat("h시 m분 s초");
//        System.out.println(f1.format(now));
//        System.out.println(f2.format(now));
//        System.out.println(f3.format(now));
//        System.out.println(f4.format(now));
//        System.out.println(f5.format(now));
//        System.out.println(f6.format(now));
//        System.out.println(f7.format(now));
        Calendar cal = Calendar.getInstance();  // 운영체제로 부터 시간을 가져옴
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);    // 인덱스임을 유의
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));  // 주에서 몇번쨰 날인지
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));  // 월에서 몇번쨰 날인지
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        // Calendar 클래스로 yyyy년MM월dd일 HH시mm분ss초 포멧과 동일하게 출력 하기
        String amOrPm = "";
        if (cal.get(Calendar.HOUR_OF_DAY) > 12) amOrPm = "오후";
        else amOrPm = "오전";
        int y = cal.get(Calendar.YEAR);
        int M = (cal.get(Calendar.MONTH) + 1);
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int h = cal.get(Calendar.HOUR);
        int m = cal.get(Calendar.MINUTE);
        int s = cal.get(Calendar.SECOND);
//        System.out.println(cal.get(Calendar.YEAR) + "년" + (cal.get(Calendar.MONTH) + 1) + "월"
//                + cal.get(Calendar.DAY_OF_MONTH) + "일" + " " + amOrPm + cal.get(Calendar.HOUR) + "시"+ cal.get(Calendar.MINUTE)
//                + "분" + cal.get(Calendar.SECOND) + "초");
        System.out.printf("%d년 %02d월 %d일 %s %02d시%d분%02d초",y,M,d,amOrPm,h,m,s);

    }
}
