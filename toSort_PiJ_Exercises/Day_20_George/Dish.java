package toSort_PiJ_Exercises.Day_20_George; /**
 * Created by mnoora02 on 22/12/2016.
 */

import java.util.*; // for conciseness

// 1. How would you use streams to filter the first two meat dishes?  use .skip() method



public class Dish {
        private final String name;
        private final boolean vegetarian;
        private final int calories;
        private final Type type;

        public Dish(String name, boolean vegetarian, int calories, Type type) {
            this.name = name;
            this.vegetarian = vegetarian;
            this.calories = calories;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public boolean isVegetarian() {
            return vegetarian;
        }

        public int getCalories() {
            return calories;
        }
        public Type getType() {
            return type;
        }

        public enum Type { MEAT, FISH, OTHER }

        @Override
        public String toString() {
            return name;
        }
        public static final List<Dish> menu =
                Arrays.asList( new Dish("pork", false, 800, Dish.Type.MEAT),
                        new Dish("beef", false, 700, Dish.Type.MEAT),
                        new Dish("chicken", false, 400, Dish.Type.MEAT),
                        new Dish("french fries", true, 530, Dish.Type.OTHER),
                        new Dish("rice", true, 350, Dish.Type.OTHER),
                        new Dish("season fruit", true, 120, Dish.Type.OTHER),
                        new Dish("pizza", true, 550, Dish.Type.OTHER),
                        new Dish("prawns", false, 400, Dish.Type.FISH),
                        new Dish("salmon", false, 450, Dish.Type.FISH));

        // 2. How would you count the number of dishes in a stream using the map and reduce methods?
        // map dishes to an int stream (val of 1)
        // reduce by adding all the 1's which will give you a total sum
        int sum = menu.stream().map(d -> 1).reduce(0, (x, y) -> x + y);


} // END of Class

