package amazon;

public class AirlinesHub {

    public static void main(String[] args) {
        //int[][] array = {{1,0,0,0},{0,1,0,1},{0,1,0,1}};
        int[][] array = {{1,0,0},{0,0,0},{0,1,0}};

        int network = 0;
        for(int x=0; x<array.length;x++){
            for(int y=0;y<array[x].length;y++){

                int current = array[x][y];
                if(current==1 || current==2){
                    array[x][y] = 2;


                    //right
                    if(y<array[x].length-1 && array[x][y+1]==1)
                        array[x][y+1] = 2;

                    //left lower
                    if(x<array.length-1  && y>0 && array[x+1][y-1]==1)
                        array[x+1][y-1]=2;

                    // lower
                    if(x<array.length-1  && array[x+1][y]==1)
                        array[x+1][y]=2;

                    // right lower
                    if(x<array.length-1 && y<array[x].length-1 && array[x+1][y+1]==1)
                        array[x+1][y+1]=2;

                    if(current==1)
                        network++;

                }
                System.out.print(array[x][y]);
            }
            System.out.println("");
        }


        System.out.println(network+">>>>>");

    }
}
