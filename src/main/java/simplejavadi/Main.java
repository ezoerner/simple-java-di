package simplejavadi;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public final class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private Main() { }

    public static void main(final String[] args) throws IOException {
        final CalculatorModule productionModule = new CalculatorModule();

        System.out.println("Age:");
        final int age = Integer.parseInt(readString());

        System.out.println("Favorite Color:");
        final String color = readString();

        System.out.println("The lucky number is " + productionModule.getCalculateLuckyNumber().calculate(age, color));
    }

    private static String readString() throws IOException {
        return bufferedReader.readLine();
    }
}
