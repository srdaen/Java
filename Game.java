package objektno1;

public class Game {
	
	public void decreaseHealth(Player p, Enemy e) {
		
		int health = p.getHealth() - e.getDamage();
		
		p.setHealth(health);
		
		System.out.println("Ostalo je: " + health + "hp");
	}
	
	public void checkCollision(Player p, Enemy e) {
		
		int x1 = p.getX();
		int y1 = p.getY();
		int h1 = p.getHeight();
		int w1 = p.getWidth();
		
		int x2 = e.getX();
		int y2 = e.getY();
		int h2 = e.getHeight();
		int w2 = e.getWidth();
		

		if(y1 < y2 + h2 && x1 + w1 > x2 && x2 + w2 > x1 && y1 + h1 > y2) {
			decreaseHealth(p, e); 
			} else { 
				System.out.println("Ne postoji collision");
			p.checkHealth();
			}
	}

	public static void main(String[] args) {
		
		Game game = new Game();
		
		Player jovan = new Player(2,3,1,1,20);
		Enemy aleksa = new Enemy(2,3,2,2,15);
		
		game.checkCollision(jovan, aleksa);
	
		
	}

}
