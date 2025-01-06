/**
 * TestProgram
 */
public class TestProgram {

    public static void main(String[] args) {
        
        MyArrayList<Integer> list = new MyArrayList<>();
        MyArrayList<Integer> list2 = new MyArrayList<>();

        System.out.println("Test empty list: " + list);

        list.add(0, new Integer(3));
        list.add(1, new Integer(38));
        list.add(2, new Integer(7));

        list2.add(0, new Integer(3));
        list2.add(1, new Integer(10));
        list2.add(2, new Integer(17));



        System.out.println("Test to add one method: " + list);

        // list.remove(1);

        // System.out.println("Remove the middle element: " + list);

        System.out.println("Test the contains method");

        System.out.println("Test available element: " + list.contains(7));
        System.out.println("Test inavailble element: " + list.contains(1));

        System.out.println("Test how to get element on a list");

        System.out.println("Get the first Element: " + list.get(0));
        System.out.println("Get the middle element: " + list.get(1));

        System.out.println("Replace the curerent element: " + list.set(0, 5));

        System.out.println("Print out the new list: " + list);

        list.sortList();

        System.out.println("Print out the sorted list: " + list);
        System.out.println("The list sorted? " + list.sortList());

        

        System.out.println("Test the compare to method: " + list.compareTo(list2));
    }
}