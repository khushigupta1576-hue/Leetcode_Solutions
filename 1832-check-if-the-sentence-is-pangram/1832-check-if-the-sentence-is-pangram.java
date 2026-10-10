class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean letter[]=new boolean[26];
        int count=0;
        sentence=sentence.toLowerCase();
        for(int i=0; i<sentence.length(); i++){
            char ch=sentence.charAt(i);
            if(ch>='a'&&ch<='z')
            {
                int index=ch-'a';
                if(!letter[index]){
                    letter[index]=true;
                    count++;
                }
            }
        }
        if(count==26)
        {
            return true;
        }
        else{
            return false;
        }
    }
}