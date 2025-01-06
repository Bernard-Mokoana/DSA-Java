import java.util.*;

public class TheQueue {
    public static void main(String[] args) {

        Queue<Person> supermarkert = new LinkedList<>();
        supermarkert.add(new Person("Bernard", 21));
        supermarkert.add(new Person("Mariam", 36));
        supermarkert.add(new Person("Solomon", 23));

       System.out.println(supermarkert.peek());
       System.out.println(supermarkert.size());
       System.out.println(supermarkert.poll());
       System.out.println(supermarkert.size());
    }
    static record Person(String name, int age){}
}
