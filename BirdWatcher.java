// from https://exercism.org/tracks/java/exercises/bird-watcher

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int count: this.birdsPerDay) {
            if (count == 0) return true;
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int shortestLength = (numberOfDays < this.birdsPerDay.length) ? numberOfDays : this.birdsPerDay.length;
        for (int i = 0; i < shortestLength; i++) {
            count += this.birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count: this.birdsPerDay) {
            if (count > 4) busyDays++;
        }

        return busyDays;
    }
}

// learning Arrays in Java. They're definitely different from JS Arrays. They're much more inflexible -
// can only have the same type of element, can't change their length, etc.