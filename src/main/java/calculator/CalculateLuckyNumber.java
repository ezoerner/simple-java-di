package calculator;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public class CalculateLuckyNumber {
    private final RandomModifier randomModifier;
    private final InterpretFavoriteColor interpretFavoriteColor;

    public CalculateLuckyNumber(final RandomModifier randomModifier,
                                final InterpretFavoriteColor interpretFavoriteColor) {
        this.randomModifier = randomModifier;
        this.interpretFavoriteColor = interpretFavoriteColor;
    }

    public int calculate(final int age, final String favoriteColor) {
        final int ageComponent = age % 23;
        final int colorComponent = interpretFavoriteColor.forColor(favoriteColor);
        final int randomComponent = randomModifier.next();

        System.out.println(ageComponent);
        System.out.println(colorComponent);
        System.out.println(randomComponent);

        return ageComponent + colorComponent + randomComponent;
    }
}
