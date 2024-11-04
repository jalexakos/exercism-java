// from https://exercism.org/tracks/java/exercises/wizards-and-warriors

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {
    @Override
    public boolean isVulnerable() {
        return false;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) return 10;
        return 6;
    }
}

class Wizard extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    private boolean spellPrepared = false;

    public void prepareSpell() {
        this.spellPrepared = true;
    }

    @Override
    public boolean isVulnerable() {
        return !this.spellPrepared;
    }

    @Override
    public int getDamagePoints(Fighter fighter) {
        if (this.spellPrepared) return 12;
        return 3;
    }
}

// Learning inheritance in Java. There are definitely similarities to JavaScript.
// The biggest difference is the use of the @Override annotation in Java, as well 
// having to explicitly declare methods as public. In JavaScript, methods are public
// by default. I had to do that with the toString method in the Warrior and Wizard 
// classes, because the method is a built in method in Java.