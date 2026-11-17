public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int c = 0;
        for (int i = 0; i < n; i++) {
            result[c++] = nums[i];
            result[c++] = nums[i + n];
        }
        return result;
    }
}
