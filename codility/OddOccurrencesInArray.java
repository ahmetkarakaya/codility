import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {


    public static int solution(int[] A) {
        // Implement your solution here
        Map<Integer, Integer> map = new HashMap();
        for (int item : A) {
            Integer count = map.get(item);
            if (count == null) {
                map.put(item, 1);
            } else {
                map.put(item, ++count);
            }
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) % 2 != 0) return key;
        }

        return -1;

    }

    public static void main(String[] args) {
        int[] A = {9, 3, 9, 39, 7, 9};
        System.out.println(solution(A));
    }
}
