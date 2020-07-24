import java.util.List;

class Solution {
    public static int[] sumLists(List<List<Integer>> lists) {
        int[] ans = new int[lists.size()];

        for (int i=0; i<lists.size(); i++) {
            ans[i] = lists.get(i).stream().mapToInt(Integer::intValue).sum();
            }
        return ans;
    }
}
