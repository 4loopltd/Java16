package uk.co._4loop.record.temperature;

import java.util.Objects;

@SuppressWarnings("ALL")
public class TemperatureClazz {

    private final int high;
    private final int low;

    public TemperatureClazz(int high, int low) {
        this.high = high;
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TemperatureClazz that = (TemperatureClazz) o;
        return high == that.high && low == that.low;
    }

    @Override
    public int hashCode() {
        return Objects.hash(high, low);
    }

    @Override
    public String toString() {
        return "TemperatureClazz[" +
                "high=" + high +
                ", low=" + low +
                ']';
    }
}
