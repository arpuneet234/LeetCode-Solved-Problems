class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int num=i;
            while(num!=0){
                sum+=num%10;
                num=num/10; 
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
       
        int max=0;
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()) {
        
            int value = (mapElement.getValue());
            max=Math.max(value,max);

        }
        
        return max;
    }
}