package part9.task36;

public enum Season {
    SPRING("Spring is the beginning of the cycle", 92),
    SUMMER("Summer is the hot weather season", 93),
    AUTUMN("Autumn marks the beginning of cool weather", 91),
    WINTER("Winter is the coldest period of the year", 89);

    private final String description;
    private final int countOfDays;

    Season(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    @Override
    public String toString() {
        return description +
                ", " + countOfDays + " days";
    }
}
