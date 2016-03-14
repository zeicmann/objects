package main;

public interface BasicObj {

	abstract public double square();
	abstract public double perimetr();
	abstract public boolean isInside(int px, int py);
	abstract public void move(int nx, int ny); //moves object to this offset. it's needed to use negative to move left
}
