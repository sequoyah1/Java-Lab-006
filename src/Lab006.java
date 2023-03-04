/**
 * Author
 * Sequoyah Schaefer
 * Since Version 1.0
 */
public class Lab006 {
      static public int n;
      static public int m;
    public Lab006(int n, int m){
      this.n = 6;
      this.m = 2;
    }


    public static void main(String[] args) {
        Lab006 inDivisible = new Lab006(6 , 2);
       int x = n;
        if (x % 2 == 0)
            System.out.println("True");
            else
                System.out.println("False");
    }


}
