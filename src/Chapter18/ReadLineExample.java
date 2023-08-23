package Chapter18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new FileReader("ham.html"));
        String line = "";
        StringBuffer buffer = new StringBuffer();

        // readLine 은 텍스트 한줄 한줄을 다읽어줌
        while ((line = reader.readLine()) != null) {
            buffer.append(line);
        }
        reader.close();
        System.out.println(buffer);
    }
}