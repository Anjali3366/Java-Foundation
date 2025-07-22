public class B7_Swap {

    // swap two no. using XOR Operator
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        a = a ^ b;
        System.out.println(a);
        b = a ^ b;
        System.out.println(b);
        a = a ^ b;
        System.out.println(a);
        System.out.println(b);

    }

}
