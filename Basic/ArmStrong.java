public class ArmStrong {

    public static boolean isArmStrong(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        int am = 0;
        while (temp > 0) {
            int ld = temp % 10;
            double dig = Math.pow(ld, count);
            am += dig;
            temp /= 10;
        }
        return am == n;
    }

    public static void main(String[] args) {

        int n = 373;
        System.out.println(isArmStrong(n));

    }

}
