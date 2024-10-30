// from https://exercism.org/tracks/java/exercises/need-for-speed

class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceGone = 0;
    private int battery = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceGone;
    }

    public void drive() {
        if (this.battery >= this.batteryDrain) {
            this.distanceGone += this.speed;  
            this.battery -= this.batteryDrain;
        }    
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained() && (car.distanceDriven() < this.distance)) {
            car.drive();
        }

        return car.distanceDriven() >= this.distance;
    }
}

// Learning constructors in Java. I have never encountered a static class in a class using
// that classes' constructor. I wonder if this is a common pattern in Java.