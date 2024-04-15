public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double successRate = 1.0;
        if (speed > 9) {
            successRate *= 0.77;
        } else if (speed > 8) {
            successRate *= 0.8;
        } else if (speed > 4) {
            successRate *= 0.9;
        }
        
        return speed * 221 * successRate;
    }
    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}

// learning about if/else statements and numbers in Java. The different numerical types in Java (byte, short, int, long
// float, double) are fascinating. I will study these more.