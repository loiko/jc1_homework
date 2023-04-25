package part9.task37;

public enum Season {
    SPRING, SUMMER, AUTUMN, WINTER;

    public Season next() {
        return values()[(ordinal() + 1) % values().length];
    }
}

