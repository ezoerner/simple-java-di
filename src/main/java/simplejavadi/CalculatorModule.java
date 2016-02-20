package simplejavadi;


import calculator.CalculateLuckyNumber;
import calculator.InterpretFavoriteColor;
import calculator.RandomModifier;
import util.Lazy;

public class CalculatorModule {
    protected final Lazy<RandomModifier> randomModifier = new Lazy<>();
    protected final Lazy<InterpretFavoriteColor> interpretFavoriteColor = new Lazy<>();
    protected final Lazy<CalculateLuckyNumber> calculateLuckyNumber = new Lazy<>();

    public RandomModifier getRandomModifier() {
        return randomModifier.get(RandomModifier::new);
    }

    public InterpretFavoriteColor getInterpretFavoriteColor() {
        return interpretFavoriteColor.get(InterpretFavoriteColor::new);
    }

    public CalculateLuckyNumber getCalculateLuckyNumber() {
        return calculateLuckyNumber.get(() -> new CalculateLuckyNumber(getRandomModifier(), getInterpretFavoriteColor()));
    }
}
