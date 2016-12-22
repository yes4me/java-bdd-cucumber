/*
 * Author: Thomas Nguyen
 * Date created: 2016/12/18
 */

package others.interview_basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        String text = "Hello World";
        String pattern = "^(\\w*) (\\w*)$";

        // Regex to find
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        if (m.find()) {
            System.out.println("MATCH");
        }

        // Regex to replace
        text = text.replaceAll(pattern, "$1 Thomas");
        System.out.println(text);

        // Regex to split
        String[] result = text.split(" ");
        for (int i = 0, size = result.length; i < size; i++) {
            System.out.println(i + ":" + result[i]);
        }
    }
}
