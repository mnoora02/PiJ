package Day_07;

/**
 * 5.2 Simple map
 * Create a class that implements the following interface of a simple map from integers to strings.
 */

public interface Q5_SimpleMap {

    // Puts a new String in the map. If the key is already in the map, nothing is done.
    // when putting something into a map, we specify a key and a string
    void put(int key, String name);

    // Returns the name associated with that key, or null if there is none.
    // we are getting a String that corresponds to the int key that is inputted in
    String get(int key);

    // Removes a name from the map. Future calls to get(key) will return null for this key unless another
    // name is added with the same key.
    void remove(int key);

    //Returns true if there are no workers in the map, false otherwise
    boolean isEmpty();

} // END of class