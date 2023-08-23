package Chapter12;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class PrintDateExample {
    public static void main(String[] args) {

        // Date
        Date date = new Date();
        // code 가 실행되는 시점의 시각 = 현재의 시각을 알수있음
        // yyyyMMddhhssSSS.jpg > 이미지 파일 업로드 할떄 사용
        System.out.println(date);
        System.out.println();

        SimpleDateFormat dataFormat = new SimpleDateFormat("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초");
        // 날짜와 시간을 원하는 형식으로 출력하거나 파싱할 수 있는 클래스
        String myDate = dataFormat.format(date);
        System.out.println(myDate);
        System.out.println();


        // 2. Calendar
        Calendar calendar = Calendar.getInstance();
        // Calendar 클래스의 정적 메소드로, 현재 시간과 날짜를 나타내는 Calendar 객체를 얻는 데 사용됩니다.
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // 0~11 월
        int data = calendar.get(Calendar.DAY_OF_MONTH);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        System.out.printf("%d년 %d월 %d일 (%d) %d시 %d분 %d초", year, month + 1, data, day, hour, minute, second);
        System.out.println();


        // 3. LocalDateTime (jdk 8 이상)
        // 2023-08-07
        LocalDateTime now = LocalDateTime.now();
        // java.time 패키지에 속하는 클래스인 LocalDateTime 의 정적 메소드입니다. 이 메소드는 현재의 날짜와 시간 정보를 가져옵니다.
        System.out.println(now);
        // Method chaining 방식
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 (E) a hh시 mm분 ss초"));
        System.out.println(myDate);
        System.out.println();

        LocalDateTime lastDate = LocalDateTime.of(2023, 1, 1, 0, 0, 0);
        System.out.println(lastDate);
    }
}
