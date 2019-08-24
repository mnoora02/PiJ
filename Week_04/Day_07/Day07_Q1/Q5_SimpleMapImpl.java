package Day_07;

public class Q5_SimpleMapImpl implements Q5_SimpleMap {
    private String[] map = new String[1000];

    public void put(int key, String name) {
        if (map[key] == null) {
            map[key] = name;
        }
    }

    public String get(int key) {
        return map[key];
    }

    public void remove(int key) {
        map[key] = null;
    }

    public boolean isEmpty() {
        for (int i = 0; i < map.length; i++) {
            if (map[i] != null) {
                return false;
            }
        }
        return true;
    }

} // END of class
