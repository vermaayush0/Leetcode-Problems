class Solution {
    public boolean isMatch(String s, String p) {
        if (p.isEmpty()) return s.isEmpty();
        boolean m = !s.isEmpty() && (s.charAt(0) == p.charAt(0) || p.charAt(0) == '.');
        return p.length() > 1 && p.charAt(1) == '*'
                ? isMatch(s, p.substring(2)) || (m && isMatch(s.substring(1), p))
                : m && isMatch(s.substring(1), p.substring(1));
    }
}