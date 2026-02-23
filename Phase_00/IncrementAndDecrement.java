package Phase_00;

public class IncrementAndDecrement {
    public static void main(String[] args){
        int x = 5; 
        int y = 10;

        // x++ or x-- "Use x and then increment"
        System.out.println(x);
        x--;
        System.out.println(x);
        x++;
        System.out.println(x);

        // ++y or --y "increment x and then  use"

        System.out.println(++y);
        System.out.println(y);
        System.out.println(--y);
        System.out.println(y);

    }
}
