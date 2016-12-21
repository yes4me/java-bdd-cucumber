/*
Purpose: extends
abstract = a vague blueprint that contains only:
- variables
- Only public or abstract functions allowed
*/

package others.interview_basic;

abstract class A
{
    int i; //This does NOT need to be defined. ZERO by default
    public void method1()
    {
        System.out.println("CLASS A, method1");
    }
    public abstract void method2();
}
class B extends A
{
    int i=10;
    int j=10;

    //function A can be overwritten here

    //NO CHOICE: functionB() had to be defined
    public void method2()
    {
        System.out.println("CLASS B, method2");
    }
}

public class Abstract {
    public static void main(String[] args) {
        //A a1 = new A();	//NOT ALLOWED: Abstract cannot be ever instantiated
        //B b1 = new A();	//NOT ALLOWED: Abstract cannot be ever instantiated
        A a = new B();		//a is an object B with the capability of A (= type A)
        B b = new B();

        System.out.println("RUNNING class a METHODS:");
        a.method1();
        a.method2();

        System.out.println("RUNNING class b METHODS:");
        b.method1();
        b.method2();

        System.out.println(a.i);				//a2.j is UNDEFINED
        System.out.println(b.i +"__"+ b.j);

        a.i=5;
        b.i=5;
        b.j=5;
    }
}