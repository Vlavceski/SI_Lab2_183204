import java.util.ArrayList;
import java.util.List;
public class lab {


    public static Object sumOfPricesGreaterThan(Object o, int i) {
    }

    public List<String> function(List<String> list) {   //A
        if (list.size() <= 0) {                         //A
            throw new IllegalArgumentException("List length should be greater than 0");//B
        }
        List<String> numMines = new ArrayList<>();//C
        for (int i = 0; i < list.size(); i++) {   //C1 c2 c3
            if (!list.get(i).equals("#")) {       //D
                int num = 0;                      //D1
                if (i - 1 >= 0 && list.get(i - 1).equals("#")) {//E
                    num++;                                      //F
                }
                if (i + 1 < list.size() && list.get(i + 1).equals("#")) {//G
                    num++;                                               //H
                }
                numMines.add(String.valueOf(num));                      //I
            } else {                                                    //J
                numMines.add(list.get(i));                              //J
            }
        }
        return numMines;                            //K
    }                                       //L
}

