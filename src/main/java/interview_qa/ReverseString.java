/**
 * Created by Thomas on 12/16/2016.
 * Asked on 2016/12/16
 * NOTES:
 * - String: read only and immutable => EASY TO DEFINE. NO MANIPULATION
 * - StringBuffer: mutable, synchronized (=thread safe) => FASTER than String, OLD WAY
 * - StringBuilder:mutable                              => FASTER than StringBuffer
 */

package interview_qa;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class ReverseString {
    public static String reverseText1(String text) {
        // String instances are immutable. Therefore we need result
        String result   = "";
        int size        = text.length();

        for (int i=0; i<size; i++) {
            result += text.charAt(size-i-1);
        }
        return result;
    }

    public static String reverseText2(String text) {
        // String instances are immutable => use StringBuffer
        StringBuffer result = new StringBuffer(text);
        return result.reverse().toString();
    }

    public static String reverseText3(String text) {
        // String instances are immutable => use StringBuilder or...
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString();
    }

    public static void main(String [] args) {
        String text = "Hello world";

        // Using String
        text = reverseText1(text);
        System.out.println(text);

        // Using StringBuffer
        text = reverseText2(text);
        System.out.println(text);

        // Using Stringbuilder
        text = reverseText3(text);
        System.out.println(text);
    }
}