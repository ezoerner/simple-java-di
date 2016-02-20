package util;

import java.util.function.Supplier;

import static java.util.Objects.requireNonNull;

public final class Lazy<T> {
    private volatile T value;

    public T get(final Supplier<T> supplier) {
        final T result = value; // Just one volatile read
        return result == null ? maybeCompute(supplier) : result;
    }

    private synchronized T maybeCompute(final Supplier<T> supplier) {
        if (value == null) {
            value = requireNonNull(supplier.get());
        }
        return value;
    }
}
