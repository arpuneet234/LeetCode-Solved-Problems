class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        int[]freq=new int [26];
        for(int i=0;i<magazine.length();i++){
            int x=magazine.charAt(i)-'a';
            freq[x]++;
        }
        
        for(int i=0;i<ransomNote.length();i++){
            int c=ransomNote.charAt(i)-'a';
            if(freq[c]>0){
                freq[c]--;
                
            }
            else{
                return false;
            }
        }
        
        return true;
        
    }
}