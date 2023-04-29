class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>res=new ArrayList<>();
        List<Integer>ds=new ArrayList<>();
        ds.add(0);
        dfs(0,graph.length-1,res,ds,graph);
        return res;
        
    }
    
    public void dfs(int src, int dest, List<List<Integer>>res,List<Integer>ds,int[][]graph){
        if(src==dest){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        for(int i:graph[src]){
            ds.add(i);
            dfs(i,dest,res,ds,graph);
            ds.remove(ds.size()-1);
        }
    }
}