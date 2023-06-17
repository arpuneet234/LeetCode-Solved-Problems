class MyHashMap {

    Integer[] map;
    public MyHashMap() {
        map = new Integer[1000001];
    }
    
    public void put(int key, int value) {
        map[key]=value;
    }
    
    public int get(int key) {
        if(map[key]!=null)
        return map[key];
        return -1;
    }
    
    public void remove(int key) {
        if(map[key]!=null){
            map[key]=null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */