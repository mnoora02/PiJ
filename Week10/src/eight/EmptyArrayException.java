package eight;

/**
 * Created by mnoora02 on 08/12/2016.
 */
public class EmptyArrayException extends Exception {
    private static final long serialVersionUID = 1L;
    EmptyArrayException() {
        super("Array Empty");
    }
}
