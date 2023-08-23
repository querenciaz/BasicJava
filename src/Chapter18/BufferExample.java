package Chapter18;

import java.io.*;
import java.nio.Buffer;

public class BufferExample {
    public static void main(String[] args) throws IOException {

        // 1. buffer 를 사용 안한것
        FileInputStream fileInputStream1 = new FileInputStream("test.db");
        FileOutputStream fileOutputStream1 = new FileOutputStream("/home/pc11/바탕화면/test1.db");

        // 2. buffer 를 사용 한것
        FileInputStream fileInputStream2 = new FileInputStream("test.db");
        BufferedInputStream inputStream = new BufferedInputStream(fileInputStream2);

        FileOutputStream fileOutputStream2 = new FileOutputStream("/home/pc11/바탕화면/test2.db");
        BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream2);

        // 1. buffer 를 사용하지 않고 복사
        System.out.println("버퍼 미사용: " + copy(fileInputStream1, fileOutputStream1) + "ns");

        // 2. buffer 를 사용하고 복사
        System.out.println("버퍼 사용: " + copy(inputStream, outputStream));

        outputStream.close();
        fileInputStream2.close();
        inputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();
        fileOutputStream2.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("skyscrapers.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/home/pc11/바탕화면"));
        byte[] buffer = new byte[1024];
        int data = -1;
        while ((data = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, data);
        }
    }

    /*
    @param inputStream
    @param outputStream
    @return 얼마나 시간이 걸리는지 걸린시간 (long) 반환
    */
    private static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        long startTime = System.nanoTime();
        int data = -1;
        while ((data = inputStream.read()) != -1) {
            outputStream.write(data);
        }
        outputStream.flush();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
