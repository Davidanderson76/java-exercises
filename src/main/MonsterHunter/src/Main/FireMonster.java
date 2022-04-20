package Main;

public class FireMonster extends Monster {
	private String specialAttack;
	private String monsterType;

	public FireMonster() {

	}

	public FireMonster(String name, String attack, String specialAttack, String monsterType) {
		super(name, attack);
		this.specialAttack = specialAttack;
		this.monsterType = monsterType;
	}

    public String getSpecialAttack() {
        int max = 10;
        int min = 1;
        int range = max - min + 1;
        return getName() + "Hit " + (Math.round(Math.random() * range) + min) + " Damage with " + specialAttack;
    }

	public void setSpecialAttack(String specialAttack) {
		this.specialAttack = specialAttack;
	}

	public String getMonsterType() {
		return monsterType;
	}

	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}

	@Override
    public String toString() {
        return "Monster " + getName() + ", The type is " + monsterType + ", It's special attack is " + specialAttack;
    }
	
	

}
