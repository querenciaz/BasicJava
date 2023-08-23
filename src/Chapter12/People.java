package Chapter12;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

// jdk 14버전 이상만 쓸수있음.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class People {
    private String name;
    private int age;

}
