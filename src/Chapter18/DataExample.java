package Chapter18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataExample {
    public static void main(String[] args) throws Exception {

        DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("primitive.db"));
        outputStream.writeUTF("이타치");
        outputStream.writeDouble(95.5);
        outputStream.writeInt(100);

        outputStream.writeUTF("김자바");
        outputStream.writeDouble(90.3);
        outputStream.writeInt(200);

        outputStream.flush();
        outputStream.close();
    }
}