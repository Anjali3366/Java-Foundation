public class B9_RemoveLastBit {

    // remove the last set bit of number(rightmost);
    public static int removeBit(int n) {
        return n & (n - 1);

    }

    public static void main(String[] args) {
        System.out.println(removeBit(10));

    }

}
