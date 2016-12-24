package others.basic_knowledge;

import java.lang.reflect.Method;

/**
 * Created by Thomas on 12/24/2016.
 */
public class Reflection {
    public static void method1() {
        System.out.println("method1: NO PARAM");
    }
    public static void method2(String text) {
        System.out.println("method2: " + text);
    }
    public static void main(String[] args) {
        try{
            Class aclass;
            Method method;
            Object obj;

            // Calling method1 from a string
            aclass = Class.forName("others.basic_knowledge.Reflection");
            method = aclass.getDeclaredMethod("method1");
            obj = aclass.newInstance();
            method.invoke(obj, null);

            // Calling method2 from a string
            Class[] param = new Class[1];
            param[0] = String.class;
            aclass = Class.forName("others.basic_knowledge.Reflection");
            method = aclass.getDeclaredMethod("method2", param);
            obj = aclass.newInstance();
            method.invoke(obj, new String("Hello"));
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
