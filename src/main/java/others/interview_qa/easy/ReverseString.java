/**
 * Author: Thomas Nguyen
 * Date created: 2016/12/16
 * Interview date: 2016/12/16
 * <p>
 * NOTES:
 * - String: read only and immutable => EASY TO DEFINE. NO MANIPULATION
 * - StringBuffer: mutable, synchronized (=thread safe) => FASTER than String, OLD WAY
 * - StringBuilder:mutable                              => FASTER than StringBuffer
 */

package others.interview_qa.easy;

public class ReverseString {
    public static String reverseText1(String text) {
        // String instances are immutable. Therefore we need another string to hold the result

        String result = "";
        for (int i = 0, size = text.length(); i<size; i++) {
            // The following code works but it is slow:
            // result += text.charAt(size-i-1);

            // The following code works and is faster (see speed_concat):
            char c = text.charAt(size-i-1);
            result = result.concat( String.valueOf(c) );
        }
        return result;
    }

    public static String reverseText_buffer(String text) {
        // String instances are immutable => use StringBuffer
        StringBuffer result = new StringBuffer(text);
        return result.reverse().toString();
    }

    public static String reverseText_builder(String text) {
        // String instances are immutable => use StringBuilder or...
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String text = "Hello world";

        // Using String
        text = reverseText1(text);
        System.out.println(text);

        // Using StringBuffer
        text = reverseText_buffer(text);
        System.out.println(text);

        // Using Stringbuilder
        text = reverseText_builder(text);
        System.out.println(text);
    }
}