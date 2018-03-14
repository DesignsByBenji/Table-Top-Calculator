package application;

public class Player {
	private int maxHealth;
	private int currHealth;
	private String name;
	private boolean bloodied;




	public Player(String name, int health){
		this.name=name;
		this.maxHealth=health;
		currHealth=this.maxHealth;
		bloodied=false;
	}

	public int takeDmg(int dmg){
		currHealth-=dmg;
		if(currHealth<=maxHealth/2)bloodied=true;
		return currHealth;
	}

	public int heal(int healAmount){
		currHealth+=healAmount;
		if(currHealth>maxHealth/2)bloodied=false;
		return currHealth;
	}

	public int getHealth(){
		return currHealth;
	}

	public String getName(){
		return name;
	}








}
