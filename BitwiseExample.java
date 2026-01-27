public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        int andResult = a & b;
        int orResult = a | b;
        int xorResult = a ^ b;
        int notResult = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int unsignedRightShift = a >>> 1;

        System.out.println(andResult);
        System.out.println(orResult);
        System.out.println(xorResult);
        System.out.println(notResult);
        System.out.println(leftShift);
        System.out.println(rightShift);
        System.out.println(unsignedRightShift);
    }
}
