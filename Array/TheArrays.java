import java.util.Arrays;

public class TheArrays {
   public static void main(String[] args) {
    String[] colors = new String[5];
    colors[0] = "purple" ;
    colors[1] = "blue";
    colors[2] = "Orange";
    colors[3] = "White";
    colors[4] = "Yellow";

    System.out.println(Arrays.toString(colors));

    System.out.println(colors[0]); 
    System.out.println(colors[1]);
    System.out.println(colors[2]);
    System.out.println(colors[3]);
    System.out.println(colors[4]);

    colors[0] = "Green";

    System.out.println(Arrays.toString(colors));

    int[] nums = new int[5];

    nums[0] = 3;
    nums[1] = 4;
    nums[2] = 9;
    nums[3] = 15;
    nums[4] = 1;
    nums[2] = 110;

    System.out.println(nums[0]);
   }
}
