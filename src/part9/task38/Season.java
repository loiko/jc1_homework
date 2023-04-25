package part9.task38;

public enum Season {
    SPRING(92), SUMMER(93), AUTUMN(91), WINTER(89);
    private final int countOfDays;

    Season(int countOfDays) {
        this.countOfDays = countOfDays;
    }

    public int getDaysInSeason() {
        return countOfDays;
    }
}