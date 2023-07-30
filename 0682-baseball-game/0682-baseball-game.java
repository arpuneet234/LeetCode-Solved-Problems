class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
       Stack<Integer> stk=new Stack();
        int sum =0;
        for(int i=0;i<n;i++){
            if(operations[i].charAt(0)=='D'){
                int val=stk.peek()*2;
                stk.push(val);
                sum+=val;
            }
            else if(operations[i].charAt(0)=='C'){
                sum-=stk.pop();
                
            }
            else if(operations[i].charAt(0)=='+'){
                int s=stk.size();
                int val=stk.get(s-1)+stk.get(s-2);
                stk.push(val);
                sum+=val;
            }
            
            else{
                int a=Integer.parseInt(operations[i]);
                
                stk.push(a);
                sum+=a;
                
            } 
        }
        
        return sum ;
        
    }
}