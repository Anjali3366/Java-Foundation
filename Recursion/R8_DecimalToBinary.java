// Statement : WAP to convert Decimal to binary number using recursion ; 

public class R8_DecimalToBinary {
    public static int toBinary(int num) {
        // base case
        if (num == 0) {
            return 0;
        }
        int newVal = num / 2;

        return (num % 2 + 10 * toBinary(newVal));
    }

    // another approach for larger values
    public static String decToBinRec(int d) {
        if (d > 1) {
            return decToBinRec(d / 2) + (d % 2);
        }
        return String.valueOf(d);
    }

    public static void main(String[] args) {
        int decimal = 10;
        int binary = toBinary(decimal);
        System.out.println(binary);
    }

}
