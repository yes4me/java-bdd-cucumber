package others.performance_string;

public final class PerformanceString {
    private StringBuffer stringBuffer = new StringBuffer();
    private StringBuilder stringBuilder = new StringBuilder();

    // Testing APPEND = at the end
    public long stringBufferTestAppend(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuffer.append("a");
        }
        return System.nanoTime() - start;
    }

    public long stringBuilderTestAppend(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuilder.append("Hello");
        }
        return System.nanoTime() - start;
    }

    // Testing INSERT = add anywhere (For this test, we are adding at the begining)
    public long stringBufferTestInsert(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuffer.insert(0, "a");
        }
        return System.nanoTime() - start;
    }

    public long stringBuilderTestInsert(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuilder.insert(0, "Hello");
        }
        return System.nanoTime() - start;
    }

    // Testing REVERSE
    public long stringBufferTestReverse(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuffer.reverse();
        }
        return System.nanoTime() - start;
    }

    public long stringBuilderTestReverse(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuilder.reverse();
        }
        return System.nanoTime() - start;
    }

    // Testing GETTING SIZE
    public long stringBufferTestLength(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuffer.length();
        }
        return System.nanoTime() - start;
    }

    public long stringBuilderTestLength(int limit) {
        final long start = System.nanoTime();
        for (int i = 0, size = limit; i < size; i++) {
            stringBuilder.length();
        }
        return System.nanoTime() - start;
    }
}
