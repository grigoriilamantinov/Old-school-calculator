import java.util.Arrays;

public class DisplayColumn {
    public void columnView (int firstDigit, int secondDigit, int answer) {
        DisplayColumn display = new DisplayColumn();
        System.out.println("_" + firstDigit + "\n" + display.space(firstDigit,secondDigit)
                + secondDigit + "\n" + display.line(firstDigit,secondDigit) + "\n "
                + answer);
    }

    public String line (int firstDigit, int secondDigit){
        int lineLength;
        if (firstDigit>secondDigit) {
            lineLength = String.valueOf(firstDigit).length();
        } else {
            lineLength = String.valueOf(secondDigit).length();
        }
        return " " + "-".repeat(lineLength);
    }

    public String space (int firstDigit, int secondDigit) {
        int spaceLength;
        if (firstDigit>secondDigit) {
            spaceLength = String.valueOf(firstDigit).length() - String.valueOf(secondDigit).length();
        } else {
            spaceLength = String.valueOf(secondDigit).length() - String.valueOf(firstDigit).length();
        }
        return " " + " ".repeat(Math.max(0, spaceLength));

    }


}
