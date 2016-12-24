package others.basic_knowledge;

import java.util.*;

/**
 * Created by Thomas on 12/22/2016.
 */
public class ConvertSetArray {
    public static void main(String[] args) {
        // Setup a list
        //List<Integer> myList = new ArrayList<Integer>();
        Set myList = new <Integer>HashSet();
        myList.add(2);
        myList.add(-5);
        myList.add(0);


        System.out.println("Get the value of the set:");
        Iterator<Integer> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println("value=" + iterator.next());
        }


        // Convert to array
        System.out.println("Get the value of the array:");
        // Only if myList is defined as List<Integer>
        // Integer[] result = myList.toArray( new Integer[myList.size()] );
        // Only if myList is defined as List
        Integer[] result = (Integer[]) myList.toArray( new Integer[myList.size()] );
        for (int i=0, size=result.length; i<size; i++) {
            System.out.println("value=" + result[i]);
        }
    }
}
