class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        if(n<26)return false;
        int []freq=new int[26];
        for(int i=0;i<n;i++){
            int index=sentence.charAt(i)-'a';
            freq[index]++;
        }
        
        for(int i:freq){
            if(i==0)return false;
        }
    
        
        return true;
        
    }
}