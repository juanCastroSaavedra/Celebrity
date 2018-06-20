package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Utility Class
 * @author juan.saavedra
 */
public class Utility {

    /**
     * Retrieve a given row from a multidimensional array
     * @param array Array[x][y]
     * @param rowNumber the row number
     * @return List - a single row
     */
    public static List getRow(Object[][] array, int rowNumber){
        return Arrays.asList(array[rowNumber]);
    }

    /**
     * Retrieve a given column from a multidimensional array
     * @param array Array[x][y]
     * @param columnNumber the column number
     * @return List - a single column
     */
    public static List getColumn(Object[][] array, int columnNumber){
        List column = new ArrayList();
        for(int i=0; i< array.length; i++){
            column.add(array[i][columnNumber]);
        }
        return column;
    }
}
