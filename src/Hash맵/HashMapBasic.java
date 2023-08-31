package Hash맵;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapBasic {
    public static void main(String[] args) {
        // Key, value
        Map<String,Integer> map = new HashMap<>();
        // 객체 저장 : key, value
        map.put("KANE", 99);
        map.put("JESSY", 55);
        map.put("PHILIP", 95);
        map.put("BRAD", 78);
        map.put("KANE",70); // key 가 같으면 나중에 저장한 값으로 대체
        System.out.println("총 Entry 수 : " + map.size());
        // 객체 찾기 : get(key), 지정된 key 대한 값을 반환
        System.out.println(map.get("BRAD"));
        // 향상된 for 문으로 map 순회
        for(String key : map.keySet()){ // keySet() : key 포함된 Set 컬렉션 반환
            System.out.println(key + "\t"  +map.get(key));
        }
        System.out.println();
        // 객체 삭제 : key 값으로 해당 Entry 삭제
        map.remove("KANE");
        for(String key : map.keySet()){ // keySet() : key 포함된 Set 컬렉션 반환
            System.out.println(key + "\t"  +map.get(key));
        }

        // iterator(반복자)를 사용한 방법
//        Set<String> keySet = map.keySet();
//        Iterator<String> iterator = keySet.iterator();
//        while(iterator.hasNext()){
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + "\t" + value);
//        }
    }
}
