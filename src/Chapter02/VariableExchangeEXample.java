package Chapter02;

import java.net.SocketTimeoutException;

public class VariableExchangeEXample {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int temp = x;
        x = y;
        y = temp;

        System.out.println(y);
    }
}
