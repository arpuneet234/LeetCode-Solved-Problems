class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[]freq=new int[26];
        
        for(int i=0;i<t.length();i++){
            int x=t.charAt(i)-'a';
            freq[x]++;
        }
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            if(freq[c]>0){
                freq[c]--;
            }
            
            else {
                return false;
            }
        }
        
        for(int i=0;i<26;i++){
            if(freq[i]!=0)return false;
        }
        
        return true;
        
    }
}