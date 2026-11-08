public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j){
            return 0;
        }
        int length = m.length;
        boolean[] visited = new boolean[length];
        int[] distance = new int[length];
        int[] queue = new int[length];
        int head = 0;
        int tail = 0;
        queue[tail] = i;
        tail++;
        visited[i] = true;
        while(head < tail){
            int current = queue[head];
            head++;
            for (int k = 0; k < length; k++){
                if (m[current][k] == 1 && !visited[k]){
                    visited[k] = true;
                    distance[k] = distance[current] + 1;
                    queue[tail] = k;
                    tail++;
                    if (k == j){
                        return distance[k];
                    }
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}