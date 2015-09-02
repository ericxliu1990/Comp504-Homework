package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class AShape {
	protected Point position;
	protected Color color;
	
	public abstract void paint(Graphics g);

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	public String toString(){
		return "Abstract shape";
	}
}
