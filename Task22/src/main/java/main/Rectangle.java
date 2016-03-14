package main;

public class Rectangle implements BasicObj{
	
	//vars
	private Point startPoint;
	private Point endPoint;
	private double upRib;
	private double sideRib;
	
	//Cons
	public Rectangle(Point start, Point end){
		this.startPoint = start; this.endPoint = end;
		this.upRib = this.getUpperSide();
		this.sideRib = this.getSideSide();
	}
	
	//Methods
	@Override
	public double square(){
		return this.upRib*this.sideRib;
	}
	
	@Override
	public double perimetr(){
		return 2*(this.upRib+this.sideRib);
	}
	
	@Override
	public boolean isInside(int px, int py){
		return IsBetween.check(this.startPoint.getX(), this.endPoint.getX(), px) &&
				IsBetween.check(this.startPoint.getY(), this.endPoint.getY() , py);
	}
	
	@Override
	public void move(int x, int y) {
		
		this.startPoint.setX(this.startPoint.getX() + x);
		this.endPoint.setX(this.endPoint.getX() + x);
		
		this.startPoint.setY(this.startPoint.getY() + y);
		this.endPoint.setY(this.endPoint.getY()+y);
	}
	
	private double getUpperSide(){
		return Math.abs(this.startPoint.getX()) + Math.abs(this.endPoint.getX());
	}
	
	private double getSideSide(){
		return Math.abs(this.startPoint.getY()) + Math.abs(this.endPoint.getY());
	}
	
}
