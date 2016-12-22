/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/22
 *
 * Goal: Using recursion and not!
 * assume you have a list of objects, some of which may be lists of arbitrary depths. Write a function to return the list “flattened,” so sublists are all in the “main” list
 * Example:
 * [1,3,5,[6,7],8,9,10,[11,13,15,[16,17,[18,19]]],20]
 * Becomes:
 * [1,3,5,6,7,8,9,10,11,13,15,16,17,18,19,20]
 */

package others.interview.veryhard_WIP;

import java.lang.reflect.Array;

public class ListFlatten {
    private static void flatten(Object object) {
        if (object.getClass().isArray()) {
            for (int i = 0; i < Array.getLength(object); i++) {
                flatten(Array.get(object, i));
            }
        } else {
            System.out.print(object + ",");
        }
    }

    public static void main(String[] args) {
        int[][][] array = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}, {28}}};
        flatten(array);
    }
}
