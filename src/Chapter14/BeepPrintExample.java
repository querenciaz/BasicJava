package Chapter14;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) throws Exception {

//        // 1. Thread 객체 사용
//        Thread thread = new Thread() {
//            public void run() {
//                for (int i = 0; i < 20; i++) {
//                    System.out.println("은식");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (Exception e) {
//                    }
//                }
//            }
//        };
//        thread.start();
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println("짱");
//            Thread.sleep(1000);
//        }



        // 2. Runnable Interface 방식
        Runnable runnable = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("훔");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();



        for (int i = 0; i < 20; i++) {
            System.out.println("바");
            Thread.sleep(1000);
        }
    }
}