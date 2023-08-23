package Chapter15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMapExample {
    public static void main(String[] args) {

        // Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();

        // 객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        // 키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        // 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        // 1. **Key Set 반복**: 먼저 `map.keySet()`를 사용하여 맵의 키(key)들을 포함하는 `Set` 컬렉션을 얻습니다.
        // 그 후에 `keySet`의 `Iterator`를 사용하여 키를 하나씩 가져오고, 각 키에 해당하는 값을 `map.get()` 메소드를 사용하여 얻어옵니다. 이렇게 얻어온 키와 값을 출력합니다.
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            Integer v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        //  2. **Entry Set 반복**: `map.entrySet()`를 사용하여 맵의 엔트리(키-값 쌍)들을 포함하는 `Set` 컬렉션을 얻습니다.
        //  엔트리는 `Map.Entry` 인터페이스로 표현되며, 키와 값 모두를 가지고 있습니다. `entrySet`의 `Iterator`를 사용하여 엔트리를 하나씩 가져오고,
        //  각 엔트리에서 키와 값을 `getKey()`와 `getValue()` 메소드를 사용하여 얻어옵니다. 이렇게 얻어온 키와 값을 출력합니다.
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());
        System.out.println();
    }
}