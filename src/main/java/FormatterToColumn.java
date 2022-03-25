public class FormatterToColumn {
    public final static String SPACE = " ";
    public final static String MINUS = "_";

    public void columnViewMinus(int firstDigit, int secondDigit, int answer) {
        System.out.println("_" + firstDigit + "\n" + getSecondDigitSpace(firstDigit,secondDigit)
                + secondDigit + "\n" + this.gettingLine(firstDigit,secondDigit) + "\n "
                + answer);
    }

    public void columnViewPlus(int firstDigit, int secondDigit, int answer) {
        if (firstDigit>secondDigit) {
        System.out.println(SPACE + firstDigit + "\n+\n " + getSecondDigitSpace(firstDigit,secondDigit)
                + secondDigit + "\n" + this.gettingLine(firstDigit,secondDigit) + "\n "
                + answer);
        } else {
        System.out.println(SPACE + getFirstDigitSpace(firstDigit,secondDigit) + firstDigit + "\n+\n "
                +secondDigit + "\n" + this.gettingLine(firstDigit,secondDigit) + "\n "
                +answer);
        }
    }

    public void columnViewDiv(int firstDigit, int secondDigit, int answer) {

        int[] answerArray = this.numberToDigitArray(answer);
        int[] firstDigitArray = this.numberToDigitArray(firstDigit);

        int[] partDigitArray = new int[String.valueOf(answer).length()];
        for (int i = 0; i<String.valueOf(answer).length(); i++) {
            partDigitArray[i] = answerArray[i]*secondDigit;
        }

        threeFirstLinesOutput(firstDigit,secondDigit,partDigitArray[0]);
        int firstPartSpace = String.valueOf(partDigitArray[0]).length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstPartSpace; i++) {
            sb.append(firstDigitArray[i]);
        }

        int remainder = Integer.parseInt(String.valueOf(sb)) - partDigitArray[0];
        sb.setLength(0);

        sb.append(SPACE.repeat((String.valueOf(partDigitArray[0])).length()
                - (String.valueOf(remainder)).length()));

        int remainderOutput = 0;
        int arrayCount = String.valueOf(partDigitArray[0]).length();
        StringBuilder sbRemainder = new StringBuilder();
        for (int i = 1; i < String.valueOf(answer).length(); i++) {
            if (remainder != 0) {
                sbRemainder.append(remainder);
            } else {
                if (answerArray[i-1] != 0) {
                    sb.append(SPACE);
                }
            }
            if (firstDigitArray[arrayCount] != 0) {
                sbRemainder.append(firstDigitArray[arrayCount]);
                if (answerArray[i] != 0) {
                    System.out.println(sb + MINUS + sbRemainder);

                    if ((partDigitArray[i] < 10 && Integer.parseInt(String.valueOf(sbRemainder))>10)
                    ||(partDigitArray[i] > 10 && Integer.parseInt(String.valueOf(sbRemainder))<10)) {
                        System.out.println(SPACE + SPACE + sb + partDigitArray[i]);
                    } else {
                        System.out.println(SPACE + sb + partDigitArray[i]);
                    }
                    System.out.println(sb + this.gettingLine(Integer.parseInt(String.valueOf(sbRemainder)), partDigitArray[i]));
                    remainder = Integer.parseInt(String.valueOf(sbRemainder)) - partDigitArray[i];
                    sbRemainder.setLength(0);
                    sb.append(SPACE);
                    if (remainder < 10) {
                        sb.append(SPACE);
                    }
                }
            } else {
                if (remainder == 0) {
                    sb.append(SPACE);
                } else {
                    sbRemainder.append(firstDigitArray[arrayCount]);
                }
            }
            arrayCount++;
            remainderOutput = remainder;
        }
        System.out.println(SPACE + sb + remainderOutput);
    }

    private String gettingLine(int firstDigit, int secondDigit) {

        int lineLength;
        if (firstDigit>secondDigit) {
            lineLength = String.valueOf(firstDigit).length();
        } else {
            lineLength = String.valueOf(secondDigit).length();
        }
        return " " + "-".repeat(lineLength);
    }

    private String getSecondDigitSpace(int firstDigit, int secondDigit) {
        int spaceLength = String.valueOf(firstDigit).length() - String.valueOf(secondDigit).length();
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(" ".repeat(Math.max(0, spaceLength))));
    }

    private String getFirstDigitSpace(int firstDigit, int secondDigit) {
        int spaceLength = String.valueOf(secondDigit).length() - String.valueOf(firstDigit).length();
        StringBuilder sb = new StringBuilder();
        return String.valueOf(sb.append(" ".repeat(Math.max(0, spaceLength))));
    }

    private void threeFirstLinesOutput(int firstDigit, int secondDigit, int partDigitArray) {

        StringBuilder sb = new StringBuilder();
        Calculator calc = new Calculator();
        int answer = calc.division(firstDigit,secondDigit);
        int spaceIntThreeStings = String.valueOf(firstDigit).length()
                - String.valueOf(partDigitArray).length();

        System.out.println(MINUS + firstDigit + "|" + secondDigit);
        System.out.println(SPACE + partDigitArray
                + (sb.append(" ".repeat((spaceIntThreeStings)))
                + "|--------"));
        System.out.println(gettingLine(partDigitArray, 0) + sb
                + "|" + answer);
    }

    public int[] numberToDigitArray(int digit) {
        String s = Integer.toString(digit);
        int[] intArray = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            intArray[i] = digit % 10;
            digit /= 10;
        }
        return intArray;
    }
}
