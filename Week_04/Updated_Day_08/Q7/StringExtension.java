package Day_08.Q7;

/**
 * Q7.1 Final means no change
 * Create a class that extends String and adds a method printEven() that prints on screen
 * the even-numbered characters of the string.
 *
 * Try to compile it and see what happens.
 *
 * Ans: you cannot extend class String because in the java docs we see that class String is declared as:
 *          public final class String()
 *
 * meaning that you cannot extend class String
 *
 * if make a class final, then you cannot extend it
 * if you make a method final, you cannot override it
 * if you make a field final, you cannot change it
 *
 * however, using reflection we can override a class, its accessors, mutability etc.
 * - really powerful & potentially dangerous
 *
 */

// commented out - alternative is exclude entire folder
//public class StringExtension extends String {
//}