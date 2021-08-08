package Les2;

import java.util.Objects;

/**
 * My integer
 *
 * @author Andrew Klokov
 * @version 1.0
 */

public class MyInteger {

    public static final int MAX_VALUE = 0x7F_FF_FF_FF;

    private final int value;
    /**
     *
     * @param value wrapped primitive value
     */

    public MyInteger(int value) {
        this.value = value;
    }

    /**
     *
     * @return wrapped value
     */

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyInteger integer = (MyInteger) o;
        return value == integer.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    public static MyInteger valueOf(int value) {
        return new MyInteger(value);
    }

    public class One {

    }
}