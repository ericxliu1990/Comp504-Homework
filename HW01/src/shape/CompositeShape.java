package shape;

import java.awt.Graphics;
import java.util.ArrayList;

public class CompositeShape extends AShape {
	public ArrayList<AShape> children = new ArrayList<AShape>();
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		for(AShape shape : children){
			shape.paint(g);
		}
	}
	public void addChild(AShape child){
		children.add(child);
	}
	public boolean removeChild(AShape child){
		return children.remove(child);
	}
}
