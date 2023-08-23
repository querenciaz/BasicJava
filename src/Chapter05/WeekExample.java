package Chapter05;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args) {

        Week today = null;
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.DAY_OF_WEEK);  // DAY_OF_WEEK 는 7이라는 숫자를 가지고있음
                                                        // 오늘에 대한 값을 반환시켜줌
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }
        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다. ");
        } else {
            System.out.println("열심히 자바를 공부 합시다. ");
        }
    }
}