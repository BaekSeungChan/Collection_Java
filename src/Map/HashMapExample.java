package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        //Map 컬렉션 생성
        Map<String, Integer> map = new HashMap< >();
        System.out.println("Map이 비엇는지 : " + map.isEmpty());

        //객체 저장
        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);
        System.out.println("Map이 비엇는지 : " + map.isEmpty());
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();

        //키로 값 얻기
        String key = "홍길동";
        int value = map.get(key);
        System.out.println(key + ": " + value);
        System.out.println();

        Integer value1 = map.get("홍길동1");
        if (value1 != null) {
            System.out.println(key + ": " + value1);
            System.out.println();
        }

        if (map.containsKey("홍길동1")) {
            value = map.get("홍길동1");
            System.out.println(key + ": " + value);
            System.out.println();
        } else {
            System.out.println("홍길동1이 존재하지 않습니다");
        }

        //키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<String> keySet = map.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()) {
            String k = keyIterator.next();
            int v = map.get(k);
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
        Set<Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()) {
            Entry<String, Integer> entry = entryIterator.next();
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        //많이 사용하는 코드
        for (Entry<String, Integer> entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();

        // 더 많이 사용하는 코드 (순회 시점에는 삽입, 삭제 불가)
        for (var entry : map.entrySet()) {
            String k = entry.getKey();
            Integer v = entry.getValue();
            System.out.println(k + " : " + v);
        }
        System.out.println();


        //키로 엔트리 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());
        System.out.println();
    }
}