class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}


// IN this case TLE occure
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n=nums.length;
//         for(int t=0;t<k;t++){
//             int temp=nums[n-1];
//         for(int i=n-2;i>=0;i--){
//             nums[i+1]=nums[i];
//         }
//         nums[0]=temp;
//         }
//         for (int i = 0; i < n; i++) {
//             System.out.print(nums[i] + " ");
//         }
//     }
// }
