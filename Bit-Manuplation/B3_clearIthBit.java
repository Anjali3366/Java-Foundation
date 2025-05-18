
public class B3_clearIthBit {
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Your number after clearing bit : ");
        System.out.println(clearIthBit(10, 1));
    }

}
