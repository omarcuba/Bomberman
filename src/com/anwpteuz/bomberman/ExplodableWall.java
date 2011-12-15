package com.anwpteuz.bomberman;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Random;

/**
 * 
 * @author antonniklasson
 *
 */
public class ExplodableWall extends Wall {
	
	private Image image;
	
	public ExplodableWall(Game g) {
		super(g);
		
		Random random = new Random();
		int n = random.nextInt(2) + 1;
		image = AssetsManager.getInstance().loadImage("explodable_wall_" + n);
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		/*
		g.setColor(Color.GRAY);
		
		int padding = 2;
		
		g.fillRect(
				getTile().getX()*Grid.CELL_SIZE + padding,
				getTile().getY()*Grid.CELL_SIZE + padding,
				Grid.CELL_SIZE - (2 * padding),
				Grid.CELL_SIZE - (2 * padding)
		);
		*/
		g.drawImage(image, getTile().getX()*Grid.CELL_SIZE, getTile().getY()*Grid.CELL_SIZE, Grid.CELL_SIZE, Grid.CELL_SIZE, null);
	}
	
	@Override
	public void remove() {
		if(new Random().nextInt(5) == 0) {
			PowerupBombRange pubr = new PowerupBombRange(getGame());
			this.getTile().add(pubr);
			pubr.setTile(this.getTile());
		}
		
		super.remove();
	}
}
