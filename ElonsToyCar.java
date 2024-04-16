public class ElonsToyCar {
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    private int distanceDriven = 0;
    private int batteryPercentage = 100;
    
    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }
    public String batteryDisplay() {
        if (batteryPercentage > 0) {
            return "Battery at " + batteryPercentage + "%";
        }
        return "Battery empty";
    }
    public void drive() {
        if (batteryPercentage > 0) {
            distanceDriven += 20;
            batteryPercentage -= 1;
        }
    }
}

// learning about Classes in Java. For all the complaints about its verbose nature, I find Java's verbosity to be 
// helpful. Roles, responsibilities, types, return types, and more are easily known by looking at the code.