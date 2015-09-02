package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import shape.AShape;
import shape.Circle;
import shape.CompositeShape;
import shape.Polygon;
import shape.Square;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class simpleGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4809686792745028673L;
	private JPanel contentPane;
	private AShape aShape;
	private final JPanel center = new JPanel(){
		/**
		 * 
		 */
		private static final long serialVersionUID = 6097049243554898467L;


		public void paintComponent(Graphics g){
			super.paintComponent(g);
			if(aShape != null){
				aShape.paint(g);
			}
			g.setColor(Color.RED);
			g.fillOval(75, 100, 20, 40);
		}
	};
	private final JPanel north = new JPanel();
	private final JLabel lblOutput = new JLabel("Hello World!");
	private final JButton btnRun = new JButton("Run");
	private final JTextField textInput = new JTextField();
	private final JPanel panel = new JPanel();
	private final JButton btnCircle = new JButton("Circle");
	private final JButton btnTriangle = new JButton("Triangle");
	private final JButton btnSquare = new JButton("Square");
	private final JButton btnHouse = new JButton("House");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simpleGUI frame = new simpleGUI();
					frame.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public simpleGUI() {
		textInput.setColumns(10);
		initGUI();
	}
	private void initGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		center.setBackground(Color.LIGHT_GRAY);
		
		contentPane.add(center, BorderLayout.CENTER);
		north.setBackground(Color.DARK_GRAY);
		
		contentPane.add(north, BorderLayout.NORTH);
		
		north.add(textInput);
		lblOutput.setForeground(Color.WHITE);
		
		north.add(lblOutput);
		btnRun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblOutput.setText(textInput.getText());
			}
		});
		
		north.add(btnRun);
		panel.setBackground(Color.BLACK);
		
		contentPane.add(panel, BorderLayout.SOUTH);
		btnCircle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aShape = new Circle();
				center.repaint();
			}
		});
		
		panel.add(btnCircle);
		btnTriangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aShape = new Polygon();
				center.repaint();
			}
		});
		
		panel.add(btnTriangle);
		btnSquare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aShape = new Square();
				center.repaint();
			}
		});
		
		panel.add(btnSquare);
		btnHouse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aShape = new CompositeShape();
				Square aSquare = new Square(new Point(100, 50), 50, Color.BLUE); 
				((CompositeShape) aShape).addChild(aSquare);
				Polygon aPolygon = new Polygon();
				Point[] points = {new Point(80, 50), new Point(170, 50), new Point(125, 10)};
				aPolygon = new Polygon(points, Color.GREEN);
				((CompositeShape) aShape).addChild(aPolygon);
				center.repaint();
				
			}
		});
		
		panel.add(btnHouse);
	}
	public void start(){
		setVisible(true);
	}
}
