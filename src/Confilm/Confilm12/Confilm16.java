package Confilm.Confilm12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Confilm16 {
    public static void main(String[] args) {


        Date date = new Date();
        SimpleDateFormat simpleDateFormat =  new  SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
        String myDate = simpleDateFormat.format(date);
        System.out.println(myDate);

    }
}
