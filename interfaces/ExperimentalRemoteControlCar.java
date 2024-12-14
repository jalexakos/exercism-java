// from https://exercism.org/tracks/java/exercises/remote-control-competition

package interfaces;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private int distanceTravelled = 0;
    
    public void drive() {
        distanceTravelled = distanceTravelled + 20;
    }
    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}

// learning Interfaces in Java. I get how these work, I just don't see the value in them. 
// I think I need to see more examples of how they're used in the real world to understand their value.