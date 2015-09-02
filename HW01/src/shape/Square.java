package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Square extends AShape {
	private int side;
	public Square(){
		position = new Point(50, 50);
		color = Color.BLUE;
		side = 50;
	}
	public Square(Point position, int side, Color color){
		this.position = position;
		this.side = side;
		this.color = color;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(position.x, position.y, side, side);
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public String toString(){
		return "Square Position: " + position.toString() + " Color: " + color.toString() + " Side:" + side;
	}
}
