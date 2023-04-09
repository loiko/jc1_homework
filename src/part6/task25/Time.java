package part6.task25;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(int seconds) {
        this.seconds = seconds % 60;
        this.minutes = (seconds / 60) % 60;
        this.hours = seconds / 3600;
    }

    public Time(int hours, int minutes, int seconds) {
        this.seconds = seconds % 60;
        this.minutes = (minutes + (seconds / 60)) % 60;
        this.hours = hours + ((minutes + (seconds / 60)) / 60);
    }

    public int getTotalSeconds() {
        return (hours * 3600) + (minutes * 60) + seconds;
    }

    public int compareTo(Time another) {
        return Integer.compare(getTotalSeconds(), another.getTotalSeconds());
    }

    public void conversions() {
        System.out.println("First interval in hours, minutes and seconds: " + hours + ":" + minutes + ":" + seconds);
    }
}

