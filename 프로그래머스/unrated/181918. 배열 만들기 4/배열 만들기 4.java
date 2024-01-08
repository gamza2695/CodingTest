import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] stk = {};
        List<Integer> tempStk = new ArrayList<>();

        for(int i = 0; i<arr.length; i++) {
            if(!tempStk.isEmpty()) {
                if(tempStk.get(tempStk.size()-1) <arr[i]) {
                    tempStk.add(arr[i]);
                }
                else {
                    tempStk.remove(tempStk.size()-1);
                    i--;
                }
            }
            else {
                tempStk.add(arr[i]);
            }
        }        
        System.out.println(tempStk);

        stk=tempStk.stream().mapToInt(i->i).toArray();
        return stk;
    }
}