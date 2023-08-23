package Chapter14;

public class BBip extends Thread {


    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("훔");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
