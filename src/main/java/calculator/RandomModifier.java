package calculator;

import java.util.Random;

@SuppressWarnings("MagicNumber")
public class RandomModifier {
    private static final Random random = new Random();

    public int next() {
        return random.nextInt() % 17;
    }
}
