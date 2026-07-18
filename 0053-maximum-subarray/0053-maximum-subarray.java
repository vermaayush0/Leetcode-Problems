
class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
// TLE
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max = nums[0];
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 int sum = 0;
//                 for (int k = i; k <= j; k++) {
//                     sum += nums[k];
//                 }
//                 max = Math.max(max, sum);
//             }
//         }

//         return max;
//     }
// }