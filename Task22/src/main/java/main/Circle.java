package main;

import main.Start;

public class Circle implements BasicObj{
	
	//vars
	int x;
	int y;
	int r;
	
	//methods
	public Circle(int x, int y, int r){
		this.x= x; this.y=y; this.r = r;
	}
	
	public double square() {
		return (Math.PI*Math.pow(this.r, 2))/4;
	}

	public double perimetr() {
		return (Math.PI)*(double)this.r;
	}

	public boolean isInside(int px, int py) {
		return r/2>Math.sqrt(Math.pow(px-(this.x+r/2), 2)+(Math.pow(py-(this.y+r/2), 2)));
	}
	
	public Rectangle boundingBox(){
		int cxr = (int)(this.getRadius()/2*(1-Math.sin(Math.toRadians(45))));
		int cyr = (int)(this.getRadius()/2*(1-Math.cos(Math.toRadians(45))));
		//create new rect
		Rectangle rect = new Rectangle (this.getX()+cxr, this.getY()+cyr, this.getRadius()-2*cxr-2, this.getRadius()-2*cyr-2);
		return rect;
	}
	
	public int getRadius(){
		return this.r;
	}

	public void setRadius(int r) {
		 if (this.r>1 && this.x<Start.scrX-r&&this.y<Start.scrY-r&&this.x>0&&this.y>0) {
		        this.r = r;
		    }
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void move(int x, int y) {
		if (x>0 && x + this.r < Start.scrX && y>0 && y + this.r < Start.scrY){
			this.x = x;
			this.y = y;
		}
	}

}
