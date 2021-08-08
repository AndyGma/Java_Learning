package Les2;

/**
 * My integer
 *
 * @author Andrew Klokov
 * @version 1.0
 */

public class MyInteger {

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
}
