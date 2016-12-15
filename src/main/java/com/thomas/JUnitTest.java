/*
Purpose: Unit test to validate the implementation of MyList.java
Author: Thomas Nguyen
Date started: 2016/12/15
Last update: 2016/12/15
 */

package com.thomas;

import static org.junit.Assert.*;
import org.junit.Test;

public class JUnitTest {

    @Test
    public void test() throws Exception {
        int[] array1 = {5,100,10,125,15,150,20,175,25,0};
        int[] array2 = {25,93,97,18,71,114,52,48};
        int[] expected1 = new int[]{150, 175};
        int[] expected2 = new int[]{97, 114};

        MyList myList = new MyList(array1);
        int[] result = myList.getHighestValues();
        myList.printArray( result );
        System.out.println("array1 - Highest: " + result[1]);
        System.out.println("array1 - 2nd highest: " + result[0]);
        assertArrayEquals(result, expected1);

        myList.setList(array2);
        result = myList.getHighestValues();
        myList.printArray( result );
        System.out.println("array2 - Highest: " + result[1]);
        System.out.println("array2 - 2nd highest: " + result[0]);
        assertArrayEquals(result, expected2);
    }
}