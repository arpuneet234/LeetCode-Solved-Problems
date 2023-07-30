class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
        
    }
}