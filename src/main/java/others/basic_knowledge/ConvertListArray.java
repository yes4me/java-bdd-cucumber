package others.basic_knowledge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Thomas on 12/22/2016.
 */
public class ConvertListArray {
    public static void main(String[] args) {
        // Setup a list
        //List<Integer> myList = new ArrayList<Integer>();
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(-5);
        myList.add(0);


        System.out.println("Get the value of the list (version1):");
        for (int i=0, size=myList.size(); i<size; i++) {
            System.out.println("value=" + myList.get(i));
        }

        System.out.println("Get the value of the list (version2):");
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
