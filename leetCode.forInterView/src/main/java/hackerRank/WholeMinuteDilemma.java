package hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WholeMinuteDilemma {

    static int playlist(List<Integer> songLength){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int t : songLength) {
            if (map.containsKey(((60 - t % 60)) % 60)) {
                count += map.get((60 - t % 60) % 60);
            }
            map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
        }
        return count;
    }
}
