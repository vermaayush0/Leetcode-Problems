// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n/2];
//     }
// }
class Solution{
    public int majorityElement(int[] arr){
        int n=arr.length;
        int count =0;
        int value=0;
        for(int i=0;i<n;i++){
            if(count==0){
                value=arr[i];
            }
            if(arr[i]==value){
                count++;
           } else{
                count--;
           }
       }
       return value;
    }
}