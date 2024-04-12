class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        
        for(String word:strs){
            char[]chars=word.toCharArray();
            Arrays.sort(chars);
            String sortedWord=new String(chars);
            
            if(map.containsKey(sortedWord)){
                map.get(sortedWord).add(word);
            }
            
            else{
                List<String>list=new ArrayList<>();
                list.add(word);
                map.put(sortedWord,list);
                
            }
            
            
            
        }
        
        return new ArrayList<>(map.values());
        
    }
}