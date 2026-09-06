// class Solution {
//     public int max(int arr[],int j){
//         int max1=Integer.MIN_VALUE;
//         for(int i=0;i<=j;i++){
//             if(max1<=arr[i]){
//                 max1=arr[i];
//             }
//         }
//         return max1;
//     } 
//      public int min(int arr[],int j){
//         int min1=Integer.MAX_VALUE;
//         for(int i=j;i<arr.length;i++){
//             if(min1>=arr[i]){
//                 min1=arr[i];
//             }
//         }
//         return min1;
//     } 
//     public int firstStableIndex(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             int com=max(nums,i)-min(nums,i);
//             if(com<=k){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

class Solution {

    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] prefixMax = new int[n];
        int[] suffixMin = new int[n];

        // Prefix Maximum
        prefixMax[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(nums[i], prefixMax[i - 1]);
        }

        // Suffix Minimum
        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        // Find first stable index
        for (int i = 0; i < n; i++) {

            int diff = prefixMax[i] - suffixMin[i];

            if (diff <= k) {
                return i;
            }
        }

        return -1;
    }
}
