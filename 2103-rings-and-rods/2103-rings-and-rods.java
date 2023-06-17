class Solution {
    public int countPoints(String rings) {
        boolean[][]map=new boolean[10][3];
        for(int i=rings.length()-1;i>0;i=i-2){
            int pos=Character.getNumericValue(rings.charAt(i));
            
            if(rings.charAt(i-1)=='R'){
                map[pos][0]=true;
            }
            else if(rings.charAt(i-1)=='G'){
                map[pos][1]=true;
            }
            else {
                map[pos][2]=true;
                
            }
            
            
            
        }
        int ans=0;
        
        for(int i=0;i<map.length;i++){
            if(map[i][0]&&map[i][1]&&map[i][2])ans++;
        }
        
        return ans;
        
    }
}