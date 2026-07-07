class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;   
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     boolean check=true;
        //     for(int j=0;j<n;j++){
        //         if(i!=j && s.charAt(i)==s.charAt(j)){
        //             check=false;
        //           break;
        //     }
        //     }
        //     if(check==true)return i;
        // }
        // return -1;
    }
    }
