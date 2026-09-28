class Solution {
    public int maxDepth(String s) {
        int count=0;
        int maxDepth=0;
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            count+=(ch=='(') ? 1: (ch==')') ? -1:0;
            maxDepth=Math.max(maxDepth, count);
        }
        return maxDepth;
    }
}