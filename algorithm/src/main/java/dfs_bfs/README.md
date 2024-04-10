
# BFS / DFS

# BFS

## boj_9205 맥주마시면서 걸어가기

### 문제

- 맥주를 마시며 집에서부터 락페스티벌까지 도착할 수 있는지 여부 찾기
- 중간에 편의점에 들릴 때마다 1000m 씩 앞으로 전진 가능
- 즉, 한번 갈때 1000m씩만 갈 수 있고, 그보다 락 페스티벌이 더 멀리 있을 경우 편의점을 들렸다 가거나 편의점이 없을 경우 도착할 수 없음.
- 단, 해맨튼 방식으로 거리를 측정한다.
    - (x1,y1)과 (x2,y2)의 거리일 경우, d = |x1-x2| + |y1-y2|

### 풀이 과정

- 처음에는 dfs로 풀었지만 시간초과..
- 아마도 원인은 전체 경우의 수를 전부 탐색하기 때문에 시간초과가 났을 것임..
    - 집에서 편의점1로 갔다면 그에 해당하는 모든 깊이 탐색 후(현재 위치를 기준으로 거리가 1000m 이내인 모든 편의점 탐색), 없다면 또다시 편의점 2를 시작으로 모든 깊이 탐색 진행.. 이러다보면 무한 탐색이 될 것..
    - **그래서 결국 BFS로 넘어왔다.**
    - 왜? 주변의 가장 근접한 최소거리를 기준으로 먼저 탐색하기 때문에 전체를 탐색할 필요가 없음.
        - 즉, 주변에 1000m 이내로 근접한 편의점이나 락페스티벌이 있다면 우선 탐색 후, 나머지도 계속해서 주변에 근접한 위치를 탐색하기 때문에 전체를 탐색하지 않아도 됨. 최소 거리를 찾을 수도 있음.
- 이렇게 적용해도 난 계속 틀렸다.. 왜?
    - 문제에 대한 이해가 잘못됨.. 해맨튼 방식이 단순 수직 수평 방향으로만 움직이는 걸로 착각하기도 했고, 공식을 파타고라스로 풀었다..
    - 하지만 해맨튼 방식의 공식이 따로 있었음..

### 배운 점

- 자바 Math 메소드를 사용하는 법을 익힐 수 있었다.
    - `Math.abs` : 절댓값
    - `Math.pow(a,b)`: 제곱(a의 b제곱) - double형으로 형변환 필수!
    - `Math.sqrt(a)` : 루트 a - double 형으로 형변환 필수!
- 최소 거리 탐색 시 dfs보다는 bfs가 훨씬 편하고 빠른 것 같다!
    - 일단 dfs로 접근하게 되면 최소거리를 찾을 때, 모든 경우의 수를 계산하거나 조건부를 걸어야하는데 매우 번거로움
    - 하지만 bfs로 푼다면 근접한 영역을 먼저 탐색하기 때문에 훨씬 수월함.