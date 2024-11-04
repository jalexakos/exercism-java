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