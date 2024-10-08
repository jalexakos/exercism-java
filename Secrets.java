// from https://exercism.org/tracks/java/exercises/secrets

public class Secrets {
    public static int shiftBack(int value, int amount) {
        return value >>> amount;
    }

    public static int setBits(int value, int mask) {
        return value | mask;
    }

    public static int flipBits(int value, int mask) {
        return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return value & ~mask;
    }
}

// learning about bitwise operators & manipulation in Java.
// I first struggled with this concept when learning about it in JavaScript, 
// but I think I have a better understanding now. I typically have to write out 
// the different bit values to understand how the shifts work and the new value it creates.