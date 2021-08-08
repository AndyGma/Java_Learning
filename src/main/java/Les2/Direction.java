package Les2;

public enum Direction {

    UP('U'),
    DOWN('D'),
    LEFT('L'),
    RIGHT('R');

    private final char code;

    private Direction(char code) {
        this.code = code;
    }

    public char getCode() {
        return code;
    }

    public Direction opposite() {
        switch (this) {
            case UP: return DOWN;
            case DOWN: return UP;
            case LEFT: return RIGHT;
            case RIGHT:return LEFT;
            default: throw new IllegalStateException();
        }
    }
}
