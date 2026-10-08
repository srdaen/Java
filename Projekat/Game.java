package a;

import java.util.ArrayList;

public class Game {

private ArrayList<Enemy> enemies = new ArrayList<>();
private ArrayList<String> eventLog = new ArrayList<>();

public void addEnemy(Enemy e) {
    enemies.add(e);
    eventLog.add("ADD: " + e);
}

public void decreaseHealth(Player p, Enemy e) {
		
		int health = p.getHealth() - e.getDamage();
		
		p.setHealth(health);
		
		System.out.println("Ostalo je: " + health + "hp");
	}
	
	public boolean checkCollision(Player p, Enemy e) {

		int x1 = p.getX();
		int y1 = p.getY();
		int w1 = p.getWidth();
		int h1 = p.getHeight();

		int x2 = e.getX();
		int y2 = e.getY();
		int w2 = e.getWidth();
		int h2 = e.getHeight();

    	if (y1 < y2 + h2 &&
    		x1 + w1 > x2 &&
        	x2 + w2 > x1 &&
        	y1 + h1 > y2) {

        	return true;
    	}

    	return false;
	}
	
	public void collidingWithPlayer(Player p) {

        for (Enemy e : enemies) {

            if (checkCollision(p, e)) {
                System.out.println("Sudara se: " + e);
            }
        }
    }
	
	public void resolveCollisions(Player p) {

		for (Enemy e : enemies) {

			if (checkCollision(p, e)) {
				decreaseHealth(p, e);
			}
		}
	}
	
	public void findByType(String query) {

        query = query.trim().toLowerCase();

        for (Enemy e : enemies) {

            if (e.getS().trim().toLowerCase().contains(query)) {
                System.out.println(e);
            }
        }
    }
	
	public void printEventLog() {

        for (String event : eventLog) {
            System.out.println(event);
        }
    }
	
	public static void main(String[] args) {
		
		Game game = new Game();
		
		Player omar = new Player("Player1", 2, 3, 1, 1, 50);
		Enemy srdan = new Enemy("Goblin", 2, 3, 2, 2, 15);
		Enemy harun = new Enemy("Slenderman", 2, 2, 2, 2, 2);
		Enemy arijan = new Enemy("Murder", 2, 2, 2, 2, 2);
		
		
		game.addEnemy(srdan);
		game.addEnemy(harun);
		game.addEnemy(arijan);
		
		System.out.println("Svi neprijatelji:");
        for (Enemy e : game.enemies) {
            System.out.println(e);
        }
        
        System.out.println("\nKolizije:");
        game.collidingWithPlayer(omar);

        System.out.println("\nPlayer prije:");
        System.out.println(omar);

        game.resolveCollisions(omar);

        System.out.println("\nPlayer poslije:");
        System.out.println(omar);
        
        System.out.println("\nEvent log:");
        game.printEventLog();
    }
}

