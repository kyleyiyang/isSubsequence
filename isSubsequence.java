class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int j=0; j<s.length();j++) {
            if (t.indexOf(s.charAt(j))==-1) return false;
            for (int i=0; i<t.length();i++) {
                if (t.charAt(i)==s.charAt(j)) {
                    t=t.substring(i+1);
                    break;
                }
            }
        }
        return true;
    }
}
