package main;

public class Circle implements BasicObj{
	
	//
	private Point startPoint;
	private int r;
	
	//Create circle with radius r around the point
	public Circle(Point point, int r){
		this.startPoint = point; 
		this.r = this.setR(r);
	}
	
	@Override
	public double square() {
		return (Math.PI*Math.pow(this.r, 2))/4;
	}
	
	@Override
	public double perimetr() {
		return (Math.PI)*(double)this.r;
	}
	
	@Override
	public boolean isInside(int px, int py) {
		return r > Math.sqrt(Math.pow(px - this.startPoint.getX(), 2)+Math.pow(py - this.startPoint.getY(), 2));
	}
	
	public Rectangle boundingBox(){
		return new Rectangle(new Point (this.startPoint.getX()-this.r, this.startPoint.getY() - r),
				new Point (this.startPoint.getX()+this.r, this.startPoint.getY()+this.r));
	}
	
	private int setR(int r){
		if (r <= 0){
			if (r == 0) {
				System.out.println("Radius can't be 0. Will be changed to default 100.");
				return 100;
			} else {
				System.out.println("Radius can't be negative. Will be taken by abs.");
				return Math.abs(r);
			} 
		} else return r;
	}

	@Override
	public void move(int x, int y) {
		this.startPoint.setX(this.startPoint.getX() + x);
		this.startPoint.setY(this.startPoint.getY() + y);
	}
	
	public Point getStartPoint(){
		return this.startPoint;
	}
	
	public Point getEndPoint(){
		return this.getEndPoint();
	}

}
