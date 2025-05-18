
public class B4_updateIthBit {
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateBIT(int n, int i, int newBit) {

        // if (newBit == 0) {
        // return clearIthBit(n, i);
        // } else {
        // return setIthBit(n, i);
        // }

        // second way :
        clearIthBit(n, i);

        int bitMask = newBit << i;

        return n | bitMask;

    }

    public static void main(String[] args) {
        System.out.println("Bit updated successfully! YOUR Number : ");
        System.out.println(updateBIT(10, 2, 1));
    }

}
