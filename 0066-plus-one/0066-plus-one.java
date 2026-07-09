class Solution {
    public int[] plusOne(int[] digits) {
        int ed=digits.length-1;
        for(int i=ed;i>=0;i--){
            if(digits[i]!=9){
            digits[i]=digits[i]+1;
            return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int []ans=new int [digits.length+1];
        ans[0]=1;
        return ans;
    }
}