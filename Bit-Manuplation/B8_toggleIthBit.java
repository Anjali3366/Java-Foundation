public class B8_toggleIthBit {
    // use XOR operator
    public static int toggle(int i, int n) {
        int bitMask = (1 << i);
        return n ^ bitMask;
    }

    public static void main(String[] args) {
        System.out.println(toggle(2, 13));

    }

}
