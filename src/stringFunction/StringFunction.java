package stringFunction;

public class StringFunction {
    public static String inverteString(String str) {
        StringBuilder stringReversa = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--)
            stringReversa.append(str.charAt(i));
        return stringReversa.toString();
    }

    public static void main(String[] args) {
        System.out.println(inverteString("Alberto"));
    }
}
