/*
Purpose: Build a Java Class that returns and prints the Largest and Second Largest Number from a static List of Integers
Author: Thomas Nguyen
Date started: 2016/12/15
Last update: 2016/12/15
*/

package others.interview.easy.unit_test;

public final class MyList {
    private int[] list;

    public MyList(int[] list) {
        this.list = list;
    }

    // Getters
    public int[] getList() {
        return list;
    }

    // Setters
    public void setList(int[] list) {
        this.list = list;
    }

    // Return the second highest and highest values in an array
    public int[] getHighestValues() {
        return getHighestValues(this.list);
    }

    public int[] getHighestValues(int[] myArray) {
        if (myArray.length <= 1) {
            System.out.println("List needs to have at least 2 values");
            return null;
        }

        int[] result;
        if (myArray[0] < myArray[1]) {
            result = new int[]{myArray[0], myArray[1]};
        } else {
            result = new int[]{myArray[1], myArray[0]};
        }
        for (int i = 2, size = myArray.length; i < size; i++) {
            if (result[1] < myArray[i]) {
                // highest and second highest values need to be updated
                result[0] = result[1];
                result[1] = myArray[i];
            } else if (result[0] < myArray[i]) {
                // only second highest value needs to be updated
                result[0] = myArray[i];
            }
        }
        return result;
    }

    // Print array
    public void printArray(int[] myArray) {
        System.out.println("Printing the array:");
        for (int i = 0, size = myArray.length; i < size; i++) {
            System.out.println("index:" + i + "\t-> value=" + myArray[i]);
        }
    }
}
