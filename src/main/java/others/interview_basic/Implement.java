/*
Purpose: implement always an interface
interface = a very defined blueprint
    - ALL variables are FINAL STATIC
    - Only public or abstract functions allowed that MUST be implemented
Example:
    Shape is an interface of rectangle, circle, etc...
    Shape forces rectangle, circle to have methods: parameters, getsurface.
*/

package others.interview_basic;

interface C
{
    int i=5;			//This must be defined
    //Only public or abstract functions allowed
    public void method1();
    public void method2();
}
class D implements C
{
    int i=10;
    int j=10;

    //NO CHOICE:
    @Override
    public void method1() {
        System.out.println("CLASS D, method1");
    }
    @Override
    public void method2() {
        System.out.println("CLASS D, method2");
    }
}
public class Implement {
    public static void main(String[] args) {
        //C c1 = new C();	//NOT ALLOWED: Abstract cannot be ever instantiated
        //D d1 = new C();	//NOT ALLOWED: Abstract cannot be ever instantiated
        C c = new D();		//c is an object D with the capability of C (= type C)
        D d = new D();

        System.out.println("RUNNING class c METHODS:");
        c.method1();
        c.method2();

        System.out.println("RUNNING class d METHODS:");
        d.method1();
        d.method2();

        System.out.println(c.i);				//c2.j is UNDEFINED
        System.out.println(d.i +"__"+ d.j);

        //c.i=5;    // NOT ALLOWED: Interface variables are final
        d.i=5;
        d.j=5;
    }
}
