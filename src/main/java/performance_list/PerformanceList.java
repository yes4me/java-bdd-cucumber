package performance_list;

import java.util.Collections;
import java.util.List;

public final class PerformanceList {
    // Testing inserting data to list
    public long addListTest(List<String> list, int limit) {
        final long start = System.nanoTime();
        for (int i=0; i<limit; i++) {
            list.add(String.format("Element %d", i));
        }
        return System.nanoTime() - start;
    }

    // Testing reading data from list
    public long getListTest(List<String> list, int limit) {
        for (int i = 0; i < limit; i++) {
            list.add(String.format("Element %d", i));
        }

        final long start = System.nanoTime();
        for (int i = 0, size = list.size(); i < limit; i++) {
            list.get(i % size);
        }
        return System.nanoTime() - start;
    }

    // Testing reading data from list
    public long sortListTest(List<String> list, int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = list.size(); i < limit; i++) {
            Collections.sort(list);
        }
        return System.nanoTime() - start;
    }

    // Testing getting the size data from list
    public long sizeListTest(List<String> list, int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = list.size(); i < limit; i++) {
            list.size();
        }
        return System.nanoTime() - start;
    }
}
