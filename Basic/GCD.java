public class GCD {

    public static int optimal(int n1, int n2) {
        // optimal approach

        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0)
            return n2;
        return n1;
    }

    public static void main(String[] args) {
        int n1 = 3;
        int n2 = 12;

        int gcd = 1;

        for (int i = Math.min(n1, n2); i > 0; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
                break;
            }
        }

        System.out.println("Greatest common divisor is : ");
        System.out.println(optimal(n1, n2));
        System.out.println(gcd);

    }

}
