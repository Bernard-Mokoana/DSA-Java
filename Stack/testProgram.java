public class testProgram {

    public static void main(String[] args) {
        Integer top = null;

        stackAsMyLinkedList<Integer> myStack = new stackAsMyLinkedList<Integer>();

        System.out.println("\nInitial stack: ");
        System.out.println(myStack + "\n");

        System.out.println("\nAdd one item: ");
        myStack.push(new Integer(3));
        System.out.println(myStack + "\n");

        System.out.println("\nAdd a few more:");
        myStack.push(new Integer(2));
        myStack.push(new Integer(7));
        myStack.push(new Integer(12));
        System.out.println(myStack + "\n");

        System.out.println();

        System.out.println("\nPop out");
        top = (Integer) myStack.pop();
             if(top != null){
        System.out.println("Top is: " + top.intValue() + "\n");
             } else{
         System.out.println("Empty Stack");
             }
        System.out.println(myStack);

        System.out.println("\nPop another one");
        top = (Integer) myStack.pop();
            if(top != null) {
                System.out.println("Top is: " + "\n");
            } else {
                System.out.println("Empty stack");
            }
        System.out.println(myStack + "\n");

        System.out.println("\nPop another one");
        top = (Integer) myStack.pop();
            if(top != null) {
                System.out.println("Top is: " + "\n");
            } else {
                System.out.println("Empty stack");
            }
        System.out.println(myStack + "\n");
    }
}
