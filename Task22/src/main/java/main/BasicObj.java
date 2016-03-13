package main;

public interface BasicObj {

	abstract public int getX();
	abstract public int getY();

	abstract public double square();
	abstract public double perimetr();
	abstract public boolean isInside(int px, int py);
	
	abstract public void move(int x, int y);
}
