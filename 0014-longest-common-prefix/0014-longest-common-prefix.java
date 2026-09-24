class Solution {
    public String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String S1=strs[0];
       String S2=strs[strs.length-1];
       int idx=0;
       while(idx<S1.length()&&idx<S2.length()){
        if(S1.charAt(idx)==S2.charAt(idx))
        {
            idx++;
        }
        else{
            break;
        }
       }
       return S1.substring(0,idx); 
    }
}