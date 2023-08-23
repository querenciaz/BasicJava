package Chapter18;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample {
    public static void main(String[] args) throws Exception {

        // URI(uniform resource identifier) 인터넷상의 리소스 “자원 자체”를 식별하는 고유한 문자열 시퀀스입니다.
        // URL(uniform resource locator) 네트워크상에서 통합 자원(리소스)의 “위치”를 나타내기 위한 규약

        File dir = new File("/home/pc11/mydirectory");
        if (!dir.exists()) {
            dir.mkdirs();
        }

        File file1 = new File(dir, "file1.txt");
        File file2 = new File(dir, "file2.txt");
        File file3 = new File(dir, "file3.txt");

        if (!file1.exists()) {
            file1.createNewFile();
        }

        if (!file2.exists()) {
            file2.createNewFile();
        }

        if (!file3.exists()) {
            file3.createNewFile();
        }
        Files.writeString(Paths.get("mydata.txt"),
                "안녕하세요. 너무졸려요" +
                        "오늘은 밥을 먹어요");

//        삭제하는 명령어
//        if (dir.exists()) {
//            dir.delete();
//        }
    }
}