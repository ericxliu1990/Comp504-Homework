package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

public class Polygon extends AShape {
	private ArrayList<Point> point = new ArrayList<Point>();
	private int[] xPoint;
	private int[] yPoint;

	public Polygon(){
		point.add(new Point(50, 50));
		point.add(new Point(50, 100));
		point.add(new Point(100, 50));
		updatePoint();
		color = Color.GREEN;
	}
	public Polygon(Point[] points, Color color){
		for(int i = 0; i< points.length; i++){
			point.add(points[i]);
		}
		updatePoint();
		this.color = color;
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillPolygon(xPoint, yPoint, xPoint.length);
	}
	private void updatePoint(){
		position = point.get(0);
		xPoint = new int[point.size()];
		yPoint = new int[point.size()];
		for(int i = 0; i < point.size(); i++){
			xPoint[i] = point.get(i).x;
			yPoint[i] = point.get(i).y;
		}
	}

}
