
public class B2_setIthBIT {
    public static int setIthBit(int n, int bitNo) {
        int bitMask = 1 << bitNo;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println("Your Number after setting bit : ");
        System.out.println(setIthBit(10, 2));
    }

}
