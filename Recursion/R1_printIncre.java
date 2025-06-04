
public class R1_printIncre {
    public static void printIncr(int num, int i) {
        if (i > num) {
            return;
        }
        System.out.println(i);

        printIncr(num, i + 1);

    }

    public static void main(String[] args) {
        int num = 10;
        printIncr(num, 0);
    }

}
