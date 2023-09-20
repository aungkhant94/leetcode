package noOf.island;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/making-a-large-island/
public class LargestIsland {

    static int[][] grid = {{1,1},{1,1}};
    static HashMap<Integer, Integer> area = new HashMap<>();

    public static void main(String[] args) {
            int index = 2;
            int row = grid.length;
            int max = 0;
            int col = grid[0].length;
            for (int i = 0; i<grid.length ; i++){
                for (int j = 0; j< grid[0].length ; j++){
                    if(grid[i][j]==1) {
                        //grid[i][j] = index;
                        area.put(index, 0);
                        dfs(i, j, row, col, index);
                        if(area.get(index)>max){
                            max = area.get(index);
                        }
                        index++;
                    }

                }
            }



        for (int i = 0; i<grid.length ; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0){
                    HashSet<Integer> seenIsland = new HashSet<>();
                    int current = 1;
                    for(Pair<Integer, Integer> p : connected(i,j,row,col)){
                        index = grid[p.getKey()][p.getValue()];
                        if(index>1 && !seenIsland.contains(index)){
                            seenIsland.add(index);
                            current+=area.get(index);
                        }
                    }
                    if(current>max)
                        max = current;

                }
            }
        }
        System.out.println(max);
    }

    public static List<Pair<Integer, Integer>> connected(int x, int y, int r, int col){
       // System.out.println(x +" , " +y);
        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        if(x>0)
            pairs.add(new Pair<>(x-1,y));
        if(x<r-1)
            pairs.add(new Pair<>(x+1,y));
        if(y>0)
            pairs.add(new Pair<>(x,y-1));
        if(y<col-1)
            pairs.add(new Pair<>(x,y+1));

        return pairs;
    }


    public static void dfs(int x,int y, int r, int c, int index){

        System.out.println(x + " , "+y);
        if(x<0 || x>=r || y<0 || y>=c || grid[x][y]>1) {
            return;
        }else {

            System.out.println(grid[x][y]);
            if (grid[x][y] == 1) {
                grid[x][y] = index;
                area.put(index, area.get(index) + 1);
            }
            dfs(x - 1, y, r, c, index);
            dfs(x + 1, y, r, c, index);
            dfs(x, y - 1, r, c, index);
            dfs(x, y + 1, r, c, index);
        }
    }
}
