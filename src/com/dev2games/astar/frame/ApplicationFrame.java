package com.dev2games.astar.frame;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Handles our application frame
 * @author Nelson Sanchez
 *
 */

public class ApplicationFrame {
	
	public static JFrame frame;
	public static JPanel panel;
	
	public ApplicationFrame() {
		
		//Initializes our frame
		frame = new JFrame("A* Pathfinding");
		//Creates a panel
		panel = new JPanel();
		//Adds the panel to the JFrame
		frame.add(panel);
		//Pack and set the size
		frame.pack();
		frame.setSize(new Dimension(800, 800));
		//Sets the default operation to close whne clicking the exit button
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		//Sets the visibility of the frame to true
		frame.setVisible(true);
	}

}
