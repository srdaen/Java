package a;

public class Player {
    
	private String s;
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	
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

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Player(String s, int x, int y, int width, int height, int health) {

		s = s.trim().replaceAll("\\s+", " ");

		String[] rijeci = s.split(" ");

		for (int i = 0; i < rijeci.length; i++) {
		    rijeci[i] = rijeci[i].substring(0, 1).toUpperCase()
		            + rijeci[i].substring(1).toLowerCase();
		}

		this.s = String.join(" ", rijeci);
		
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
	
	@Override
	public String toString() {
		return "Player[" + s + "] @ (" + x + "," + y + ") " + width + "x" + height + " HP=" + health; }

	
	public static void main(String[] args) {
		
		Player p = new Player("Player1", 10, 2, 32, 32, 85);
		
		p.checkHealth();
		p.setS("1");
		System.out.println(p.toString());
		
		
	}

	public String getName() {
		return s;
	}

}