public class Solution {
    public long distinctNames(String[] ideas) {
        HashMap<Character, Integer> countMap = new HashMap<>();
        HashMap<Character, HashSet<String>> valueMap = new HashMap<>();

        for(String str : ideas) {
            if (!str.isEmpty()) {
                char key = str.charAt(0);
                String value = str.substring(1);

                countMap.put(key, countMap.getOrDefault(key, 0) + 1);

                if (!valueMap.containsKey(key)) {
                    valueMap.put(key, new HashSet<>());
                }

                valueMap.get(key).add(value);
            }
        }

        long res = 0;

        for (char key1 : valueMap.keySet()) {
            for (char key2 : valueMap.keySet()) {
                if (key1 == key2) continue;

                HashSet<String> set1 = valueMap.get(key1);
                HashSet<String> set2 = valueMap.get(key2);

                int commonCount = 0;
                for (String str : set1) {
                    if (set2.contains(str)) {
                        commonCount++;
                    }
                }

                int dis1 = set1.size() - commonCount;
                int dis2 = set2.size() - commonCount;

                res += dis1 * dis2;
            }
        }

        return res;
    }
}
