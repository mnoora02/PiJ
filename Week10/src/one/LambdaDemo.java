package one;

/**
 * Created by mnoora02 on 08/12/2016.
 */
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum;
        myNum = () -> 123.45;

        System.out.println("A value: " + myNum.getValue());

        myNum = () -> Math.random() * 100;
        System.out.println(myNum.getValue());

        myNum = () -> 123.03;
    }
}
