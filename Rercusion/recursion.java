import java.sql.Time;

public class recursion {
    

    public static int TimesFive(int n){
        if(n == 0)
        return 1;
        else 
         return 5 * TimesFive(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(TimesFive(0));
        System.out.println(TimesFive(1));
        System.out.println(TimesFive(2));
        System.out.println(TimesFive(3));
        System.out.println(TimesFive(4));
        System.out.println(TimesFive(5));
    }
}
