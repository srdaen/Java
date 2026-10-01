package objektno1;

import java.util.Scanner;

public class Player {

	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Player(int x, int y, int width, int height, int health) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		this.health=health;
		
	}
	
	public void checkHealth() {
		if(this.health > 0 ) {
			System.out.println("Player ima " + this.health + "hp");
		} else {
			System.out.println("Player je umro");
		}
	}
	
	public static void main(String[] args) {
		
		Player p = new Player(1, 3, 2, 2, 20);
		
		//p.checkHealth();
		
	}

}
