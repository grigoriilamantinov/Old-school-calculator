public class DigitToIntArray {

    public int[] digitToIntArray(int digit) {
        String s = Integer.toString(digit);
        int[] intArray = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            intArray[i] = digit % 10;
            digit /= 10;
        }
        return intArray;
    }
}
