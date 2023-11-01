package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle (double len, double wid){
		this.length = len;
		this.width = wid;
	}
	
    public void print() {
    	StdDraw.setScale(0,100);
    	System.out.println("Area: " + (length * width));
    	System.out.println("Perimeter: " + (2*(length + width)));
    	StdDraw.rectangle(50, 50, width/2, length/2);
    	StdDraw.setPenColor(StdDraw.BLUE);
    }
    
    public static void main(String[] args) {
    	Rectangle rect = new Rectangle(30, 20);
    	rect.print();
    }

	
}
