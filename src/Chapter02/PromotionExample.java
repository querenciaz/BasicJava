package Chapter02;

import com.sun.jdi.DoubleValue;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;
        // 브레이크 코드 빨간색 디버그로 한문장씩확
        char charValue = '가';
        intValue = charValue;
        intValue = 50;
        long longValue = intValue;
        longValue = 100;
        float floatValue = longValue;
    }
}