package step_definitions;

import org.apache.commons.lang3.text.WordUtils;

import java.lang.reflect.Method;

/**
 * Created by Thomas on 12/24/2016.
 */
public class FAIL_TransformMethod {
    /* IMPORTANT: Unlike eval() in Javascript, this doesn't work:
    To make it work, you have to redefine all needed webelements in each method:
    - because reflection is done at compile time
    - because @Find will get filled up at run time
    */

    private static String convertCap(String text) {
        text = WordUtils.capitalize(text);
        text = text.replaceAll(" ", "");
        return text;
    }
    private static String getPage(String page) {
        page = convertCap(page);
        page = "page_objects.".concat(page).concat("Page");
        return page;
    }
    private static String getMethod(String method) {
        method = convertCap(method);
        method = "set".concat(method);
        return method;
    }

    public static void runMethod(String page, String method, String value) {
        page    = getPage(page);
        method  = getMethod(method);

        try{
            // Calling method2 from a string
            Class[] param = new Class[1];
            param[0] = String.class;

            Class aclass = Class.forName(page);
            Method methodObj = aclass.getDeclaredMethod(method, param);
            Object pageObj   = aclass.newInstance();
            methodObj.invoke(pageObj, new String(value));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static void main(String[] arg) {
        runMethod("", "", "");
    }
}
