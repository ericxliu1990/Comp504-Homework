package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Circle extends AShape {
	private int radius;
	public Circle(){
		position = new Point(50, 50);
		color = Color.RED;
		radius = 50;
	}
	public Circle(Point position, int radius, Color color){
		this.position = position;
		this.radius = radius;
		this.color = color;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);//Potential bugs? need restore previous color 
		g.fillOval(position.x, position.y, radius, radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString(){
		return "Circle " + "Position: "+  position.toString() + "Color: " + color.toString() + "Radius: " + radius;
	}
}
