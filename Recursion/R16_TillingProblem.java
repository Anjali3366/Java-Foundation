// Statement -- Given 2*n floor we have to  count the ways in which an 2*1 tiles cover the floor 

public class R16_TillingProblem {
    public static int waysOfTiling(int n) {
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // vertical choice
        int verticalWay = waysOfTiling(n - 1);
        // horizontal choice
        int horizontalWay = waysOfTiling(n - 2);

        return verticalWay + horizontalWay;

    }

    public static void main(String[] args) {
        System.out.println(waysOfTiling(4));

    }

}
