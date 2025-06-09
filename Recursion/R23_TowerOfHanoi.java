public class R23_TowerOfHanoi {
    static int count = 0;

    public static void towerOfHanoi(String source, String helper, String des, int n) {
        // base case
        if (n == 1) {
            count++;
            System.out.println("Move Plate " + n + " from " + source + " to " + des);
            return;
        }

        // hypothesis + induction
        towerOfHanoi(source, des, helper, n - 1);
        count++;
        System.out.println("Move Plate " + n + " from " + source + " to " + des);

        towerOfHanoi(helper, source, des, n - 1);
    }

    public static void main(String[] args) {

        int n = 4;
        towerOfHanoi("A", "B", "C", n);
        System.out.println(count);

    }

}
