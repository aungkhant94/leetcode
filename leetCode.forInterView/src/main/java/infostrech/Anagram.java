package infostrech;

import java.util.*;

public class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!groups.containsKey(key))
                groups.put(key, new ArrayList<>());

            groups.get(key).add(str);

        }

        var ret = new ArrayList<List<String>>();
        ret.addAll(groups.values());
        return ret;
    }
}
