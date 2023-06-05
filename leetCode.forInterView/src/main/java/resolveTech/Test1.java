package resolveTech;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    // PAYPALISH
    // P A Y P
    //     A
    //   L
    //I S H I
    //
    public static void main(String[] args) {
        int numOfRow = 4;
        String str = "PAYPALISHIRING";
        char[] chArr = str.toCharArray();


        List<Character[]> charList = new ArrayList<>();

        char[] line = new char[numOfRow];
        boolean fullLine = true;
        int lineIndex = 0;
        int columnIndex = numOfRow;
        for(char c : chArr){
            if(fullLine){
                line[lineIndex] = c;
            }else{
                if(){

                }
            }



            //add Line logic
        }


    }

}
