package toSort_PiJ_Exercises.Day_15.Q7;

/**
 * Created by mnoora02 on 13/05/2017.
 */
public class B extends A {

    @Override
    public void throwException() throws MiddleException {
        throw new MiddleException("Middle Exception being thrown from class B. ");
    }
}
