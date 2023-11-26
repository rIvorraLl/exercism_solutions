package exercism;

abstract class Fighter {

    boolean isVulnerable() {
	return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
	return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter fighter) {
	if (fighter.isVulnerable()) {
	    return 10;
	}
	return 6;
    }
}

class Wizard extends Fighter {
    boolean spell = false;

    @Override
    public String toString() {
	return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
	if (!spell) {
	    return true;
	}
	return false;
    }

    @Override
    int damagePoints(Fighter fighter) {
	if (spell) {
	    return 12;
	}
	return 3;
    }

    void prepareSpell() {
	spell = true;
    }

}
