public class LongestDecreasingSubsequence {

    public static int findLDS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) dp[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[i] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLength = 0;
        for (int len : dp) {
            if (len > maxLength) maxLength = len;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] input = {9, 4, 3, 2, 5, 4, 3, 2};
        int ldsLength = findLDS(input);
        System.out.println(ldsLength);
    }
}
