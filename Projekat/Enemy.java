package a;

public class Enemy {
   
	private String s;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	
	
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

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
		if (damage < 0) {
	        this.damage = 0;
	    } else if (damage > 100) {
	        this.damage = 100;
	    } else {
	        this.damage = damage;
	    }
	}


	public Enemy(String s, int x, int y, int width, int height, int damage) {
		this.s=s;
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
		setDamage(damage);
		
	}
	
	public void checkDamage() {

		System.out.println("Enemy radi " + this.damage + "dmg");	
	}
	
	@Override
	public String toString() {
		return "Enemy[" + s + "] @ (" + x + "," + y + ")"  + width + "x" + height + " DMG=" + damage;
	}
	
	public static void main(String[] args) {
		
		Enemy e = new Enemy ("Goblin", 12, 5, 16, 16, 20);
		
		e.checkDamage();
		System.out.println(e.toString());
	}

}