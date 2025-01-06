public class testProgram {

    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<Integer>();

        System.out.println("Test an empty lis: " + list);

        list.append(new Integer(5));
        list.append(new Integer(18));
        list.append(new Integer(20));
        list.append(new Integer(4));

        System.out.println("Append the elements: " + list);

        list.prepend(new Integer(5));
        list.prepend(new Integer(18));
        list.prepend(new Integer(20));
        list.prepend(new Integer(4));


        System.out.println("Test prepend method: " + list);
    }
}