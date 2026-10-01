package objektno1;

public class Enemy {

	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Enemy(int x, int y, int width, int height, int damage) {
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		this.damage=damage;
		
	}
	
	public void checkDamage() {

		System.out.println("Player radi " + this.damage + "dmg");	
	}
	
	public static void main(String[] args) {
		
		Enemy e = new Enemy (4, 1, 2, 2, 15);
		
		//e.checkDamage();
	}

}
