/* Example of Overloading
Method OVERLOADING = writing 2+ methods in the same class by using same method name, but passing the parameters is different
Method overriding = method names in the different classes,that means parent class method is used in the child class.
    ex: super, whenever you overwrite a class after "extends"
*/

package others.interview_basic;

/**
 * Created by Thomas on 12/16/2016.
 */
public class OverLoading {
    public OverLoading() {
        this("N/A");
    }

    public OverLoading(String text) {
        System.out.println("Constructor: " + text);
    }
}
