import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> answer = new ArrayList<>();

        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            List<Integer> list = new ArrayList<>();
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    list.add(arr[i]);
                }
            }

            if (!list.isEmpty()) {
                Collections.sort(list);
                answer.add(list.get(0));
            } else {
                answer.add(-1);
            }
        }

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
