package com.anwpteuz.bomberman;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class GameWindow extends JFrame {
	
	/**
	 * Generated UID
	 */
	private static final long serialVersionUID = -2237037338716988955L;
	
	private static final int barHeight = 28;
	
	protected JFrame frame;
	protected Grid grid;
	
	public GameWindow() {
		// Initialize frame
		frame = new JFrame("Bomberman");
		
		// Stop program when closing
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Show the frame
		frame.setVisible(true);
		
		// No resizing
		frame.setResizable(false);
		
		frame.setLayout(new BorderLayout());
		
		// Init and add grid
		grid = new Grid();
		grid.setVisible(true);
		
		frame.add(grid);
		
		// Setting grid size
		Dimension dim = new Dimension();
		dim.setSize(Grid.COLUMNS*Grid.CELL_SIZE, Grid.ROWS*Grid.CELL_SIZE + barHeight);
		grid.setSize(dim);
		grid.setPreferredSize(dim);
		frame.setSize(dim);
		
		
		
		
		frame.pack();
		
		// Centering the frame
		frame.setLocationRelativeTo(null);
	}

	public Grid getGrid() {
		return grid;
	}
}
