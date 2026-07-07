class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0;
        int ed = arr.length - 1;

        while (st < ed) {
            char chst = arr[st];
            char ched = arr[ed];
            if (!isVowel(chst)) {
                st++;
            }else if(!isVowel(ched)){
                ed--;
            }
            else{
                char temp = arr[st];
                arr[st] = arr[ed];
                arr[ed] = temp;
                st++;
                ed--;
            }
        }
        return new String(arr);
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}