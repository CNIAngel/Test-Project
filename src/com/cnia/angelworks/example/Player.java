/**
 * 
 */
package com.cnia.angelworks.example;

import it.randomtower.engine.ResourceManager;
import it.randomtower.engine.entity.Entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

/**
 * @author CNIAngel
 * This is a simple example for a player entity class. It will show
 * movement, calling on the sprite, setting the hitbox, and collision
 */
public class Player extends Entity {

	private Image img; // an Image instance for the sprite
	
	/**
	 * @param x
	 * @param y
	 */
	public Player(float x, float y) {
		super(x, y);
		// TODO Auto-generated constructor stub
		
		img = ResourceManager.getImage("player"); 	// Set the image to the desired sprite
		setGraphic(img);							// Then set the sprite for the Player entity
		
		// Define preset controls for the Player entity
		define("UP", Input.KEY_UP);
		define("DOWN", Input.KEY_DOWN);
		define("LEFT", Input.KEY_LEFT);
		define("RIGHT", Input.KEY_RIGHT);
		
		/*
		 * Set the hitbox for the Player entity using the entity's x variable,
		 * y variable, the width of the entity's sprite, and the height of the entity's sprite
		 */
		setHitBox(x, y, img.getWidth(), img.getHeight());
		
		// Set the collsion type for the entity
		addType(PLAYER);
	}
	
	/*
	 * (non-Javadoc)
	 * @see it.randomtower.engine.entity.Entity#update(org.newdawn.slick.GameContainer, int)
	 */
	public void update(GameContainer gc, int delta) throws SlickException {
		
		/*
		 * This set of if/if-else loops check to see if the user has pressed the up, down, left, or right button,
		 * then moves the entity in the corresponding direction.
		 */
		if(check("UP")){
			y = y - 5;
		} else if(check("DOWN")) {
			y = y + 5;
		} else if(check("RIGHT")) {
			x = x + 5;
		} else if(check("LEFT")) {
			x = x - 5;
		} else {
			
		}
		
	}
	
	


}
