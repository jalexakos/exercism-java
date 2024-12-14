package interfaces;

import java.lang.Comparable;

class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int distanceTravelled = 0;
    private int numberOfVictories;
    
    public void drive() {
        this.distanceTravelled = distanceTravelled + 10;
    }
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
    public int getNumberOfVictories() {
        return numberOfVictories;
    }
    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }
    public int compareTo(ProductionRemoteControlCar car) {
        return Integer.compare(this.numberOfVictories, car.getNumberOfVictories());
    }
}