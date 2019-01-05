package toSort_PiJ_Exercises.Day_15.Q7;

/**
 7 Hierarchies of classes, hierarchies of exceptions
 (Borrowed from Bruce Eckel.) Create a three-level hierarchy of exceptions (i.e. an exception extends some exceptions
 that extends some exception). Now create a base-class A with a method that throws an exception at the base of
 your hierarchy. Inherit B from A and override the method so it throws an exception at level two of your hierarchy.
 Repeat by inheriting class C from B. In the launch() method of another class, create a C and upcast it to A, then
 call the method.

 */
public class Q7App {
    public static void main(String[] args) {
        Q7App app = new Q7App();
        app.launch();
    }

    private void launch() {
        A myObject = new C();
        try {
            myObject.throwException();
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
