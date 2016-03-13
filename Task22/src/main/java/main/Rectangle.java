package main;

import main.Start;

public class Rectangle implements BasicObj{
	
	//vars
	private int x;
	private int y;
	private int w;
	private int h;
	
	//Cons
	public Rectangle(int x, int y, int w, int h){
		this.x = x; this.y = y; this.h = h; this.w = w;
	}
	
	//Methods
	public double square(){
		return (double)(this.w*this.h);
	}
	
	public double perimetr(){
		return (double)(2*(this.w+this.h));
	}
	
	public boolean isInside(int px, int py){
		boolean isIn =false;
		if ((px>=this.x&&px<=this.x+this.w)&&(py>=this.y&&py<=this.h+this.y)){
			isIn = true;
		}
		return isIn;
	}
	
	public int getW(){
		return this.w;
	}
	
	public int getH(){
		return this.h;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void move(int x, int y) {
		if (x>0 && x < Start.scrX - this.w && y>0 && y < Start.scrY - this.h){
			this.x = x;
			this.y = y;
		}
	}
	
}
