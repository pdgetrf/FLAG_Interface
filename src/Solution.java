class Solution {
    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }

        int[] buffer = new int[m];
        buffer[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                buffer[j] += buffer[j - 1];
            }
        }
        return buffer[m - 1];
    }
}
