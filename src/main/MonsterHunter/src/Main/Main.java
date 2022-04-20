package Main;

public class Main {

	public static void main(String[] args) {

		FireMonster Rage = new FireMonster("Apollo-112", "Fire Wiind", "Flame Blade", "dragon");
		System.out.println(Rage.getSpecialAttack());
		
		System.out.println("--------------------------");
		
		WaterMonster Flows = new WaterMonster("Apollo7", "Water Blast", "Water Blade", "fish");
		System.out.println(Flows.getSpecialAttack());
		
		System.out.println("--------------------------");
		
		StoneMonster Rocky = new StoneMonster("Apollo-112", "Stone Wind", "Stone Blade", "rock");
		
		System.out.println(Rocky.getSpecialAttack());
		
		System.out.println("--------------------------");
	}

}
