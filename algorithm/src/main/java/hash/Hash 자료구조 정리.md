# Hash 자료구조

# HashMap vs HashSet

## HashMap

- HashMap은 key, value 형태로 저장됨
- 순서가 없고, 중복 허용하지 않음
    - but, value 값은 중복을 허용

## HashSet

- 객체 그 자체로써 저장
- 순서 없음, key값 중복 허용 안함

## LinkedHashSet

- 순서가 있음, 중복 허용 안함
- iterator를 통해 값 호출 가능

### 관련 메소드

- entry
    - key, value 값 모두 가져옴
    - return type : Entry

- keySet
    - key 값만 가져옴
    - value 값을 map.get(key)를 통해 구할 수 있음

- containKey
    - 해당 키값이 있는지 확인

- containValue
    - 해당 값이 있는지 확인

# 문제 풀이

## Programmers - 완주하지 못한 선수

### 1차 시도

- 시간 초과
- 제출 코드

```java

import java.util.ArrayList;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        for (String name : participant
        ) {
            list.add(name);
        }
        for (String name : completion
        ) {
            list.remove(name);
        }
        answer = list.get(0);
        return answer;
    }
}
```

### 원인 분석

- ArrayList를 사용할 경우, 모든 참여자의 명단에서 완주자의 이름을 찾기 위해서 최대 O(N) 만큼의 시간이 소요 됨.
- 하지만, 해당 방법으로는 시간 초과가 났기 때문에 더 빠른 속도로 탐색을 할 수 있는 방법을 찾아야 함.
    - `해시`를 사용하여 해결하기
        - 검색과 삽입에 시간복잡도가 **O(1)**이라는 장점을 갖고 있음!

### 해결

```java
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String name: participant) {
            if(!map.containsKey(name)) {
                map.put(name, 1);
            }
            else map.put(name, map.get(name) + 1);
        }

        for(String name: completion) {
            Integer cnt = map.get(name);
            map.put(name, cnt - 1);
            if(map.get(name) == 0) map.remove(name);
        }
        for(String name: map.keySet()) {
            answer = name;
        }
        return answer;
    }
}

```