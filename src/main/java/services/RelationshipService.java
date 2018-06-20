package services;

import util.Utility;

/**
 * Service to obtain a celebrity given an array
 * of the relationships.
 * Given an array (x * y) x=y
 * If array[x][] knows array[][y] the value is true, otherwise false
 * A person can't be known by itself then that value is null.
 * @author juan.saavedra
 */
public class RelationshipService {

    /**
     * Retrieve the index of the celebrity in the given array
     * @param relations Array[x][y]
     * @return index of the celebrity within the array or -1 if there is no celebrity
     * @throws Exception No data given to process
     */
    public static int findTheCelebrity(Boolean[][] relations) throws Exception {
        if(relations.length > 0) {
            for(int i = 0; i < relations.length; i++) {
                if (!Utility.getRow(relations, i).contains(true)) {
                    if (!Utility.getColumn(relations, i).contains(false)) {
                        return i;
                    }
                }
            }
        } else {
            throw new Exception("There is no data to process");
        }
        return -1;
    }

}
