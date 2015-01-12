package P12012015;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrowWithUndo {

	public static void main(String[] args) {

		JFrame window = new JFrame("Window");//in this step we make a window with name "Window"
		MouseHandler listener = new MouseHandler();
		JPanel panel = new JPanel();

		panel.addMouseListener(listener);

		/*
		 * In this step we set the panel in window, and now all what we will
		 * write and draw will show it in panel, not in window
		 */
		window.setContentPane(panel);
		
		window.setLocation(0, 0);//this is where we will set the window on the monitor
		window.setSize(600, 600);//this is size of our window
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//when we clicked on the x in window program must turn off
		window.setVisible(true);//when we here set true we must see window, if we here set false we will not see window

	}

	public static class MouseHandler implements MouseListener {

		/**
		 * When we click on a panel, method should to write a square , his color
		 * is blue, and we set his coordinates and his size
		 */
		@Override
		public void mouseClicked(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(Color.BLUE);
			g.fillRect(e.getX() - 25, e.getY() - 25, 50, 50);
			

		}

		/**
		 * When we move and click in same time, on a panel method should to write
		 * a square , his color is blue, and we set his coordinates and his size
		 */
		@Override
		public void mousePressed(MouseEvent e) {
			Component source = (Component) (e.getSource());
			Graphics g = source.getGraphics();
			g.setColor(Color.BLUE);
			g.fillRect(e.getX() - 25, e.getY() - 25, 50, 50);

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
