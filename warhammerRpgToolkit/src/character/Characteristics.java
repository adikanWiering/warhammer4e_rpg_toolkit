package character;
l

// Defines the Various characteristics of a player or creature
public class Characteristics {
	
	private int weaponSkill;
	private int ballisticSkill;
	private int strength;
	private int toughness;
	private int initiative;
	private int agility;
	private int dexterity;
	private int intelligence;
	private int willpower;
	private int fellowship;
	
	
	// default constructor - sets all stats to 20
	public Characteristics() {
		super();
		this.weaponSkill = 20;
		this.ballisticSkill = 20;
		this.strength = 20;
		this.toughness = 20;
		this.initiative = 20;
		this.agility = 20;
		this.dexterity = 20;
		this.intelligence = 20;
		this.willpower = 20;
		this.fellowship = 20;
	}
	
	public void generateCharacteristics(String characteristic) {
		
	}
	
	
	
	
}
