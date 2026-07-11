import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}


// TLE
// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length-1;i++){
//             for(int j=0;j<nums.length;j++){
//                 if(nums[i]==nums[j] && Math.abs(i-j)<=k){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }