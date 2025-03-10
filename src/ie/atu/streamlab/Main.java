package ie.atu.streamlab;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Exercise 2
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));
        
        numbers.stream()
               .filter(number -> number % 2 == 1)
               .forEach(number -> System.out.print(number + " "));

        //Exercise 3

    }
}
