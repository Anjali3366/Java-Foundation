public class B1_GetIthbit {

    // using left shift operator
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // using right shift operator
    public static int checkIthBit(int n, int i) {

    }

    public static void main(String[] args) {
        System.out.println("YOUR BIT IS : ");
        System.out.println(getIthBit(7, 1));
        ;
    }
}