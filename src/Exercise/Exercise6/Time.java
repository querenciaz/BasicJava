package Exercise.Exercise6;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time() {
    }

    public Time(int hour, int minute, int second) {
        if (hour > 0 && 24 > hour) {
            this.hour = hour;
        }
        if (minute > 0 && 60 > minute) {
            this.minute = minute;
        }
        if (second > 0 && 60 > second) {
            this.second = second;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        // 12:4:27 자리수를 맞추기 위해서 씀 > 12:04:27
    }
}
