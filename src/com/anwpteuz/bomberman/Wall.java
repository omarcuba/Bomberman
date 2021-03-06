package com.anwpteuz.bomberman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 * 
 * @author antonniklasson
 *
 */
public class Wall extends StaticGridObject {

	private Image image;
	
	/**
	 * Create a new wall. Load sprite via AssetsManager
	 * @param g
	 */
	public Wall(Game g) { 
		super(g);
		image = AssetsManager.getInstance().loadImage("wall");
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.drawImage(image, getTile().getX()*Grid.CELL_SIZE, getTile().getY()*Grid.CELL_SIZE, Grid.CELL_SIZE, Grid.CELL_SIZE, null);
	}
}
