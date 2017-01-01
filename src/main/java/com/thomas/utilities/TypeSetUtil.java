package com.thomas.utilities;

import java.util.*;

/**
 * Created by Thomas on 12/31/2016.
 */
/*
public interface MySet<T> {
    public T display();
    public T convert();
}
public class TypeSetUtil<T> implements MySet<T> {
*/
public class TypeSetUtil {
    public static void display(Set<?> mySet) {
        System.out.println("Values of the List:");
        Iterator<?> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println("value=" + iterator.next());
        }
    }

  	/* -----------------------------------------------------
    Convertion
	----------------------------------------------------- */

    public static Set<Integer> convert(List<Integer> myList) {
        Set<Integer> result = new HashSet<>(myList);
        return result;
    }

  	/* -----------------------------------------------------
    For testing purpose
	----------------------------------------------------- */

    public static void main(String[] args) {
        // Testing displaying any primitive list
        Set<Integer> mySet = new HashSet<>();
        mySet.add(2);
        mySet.add(-5);
        mySet.add(0);
        display(mySet);

        // Testing conversion methods:
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(0);
        myList.add(-5);
        Set<Integer> aSet = convert(myList);
        display(aSet);
    }
}
