package com.cnia.angelworks.example;

import it.randomtower.engine.World;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * 
 * @author CNIAngel
 * This is a World skeleton class. A simple class that has the init, update, 
 * and render methods set up along with the class constructor. We're gonna add a single
 * entity and that'll be it.
 */
public class Level extends World {

	private Player player; //An instance of the Player entity
	
	public Level(int id, GameContainer gc) {
		super(id, gc);
		// TODO Auto-generated constructor stub
		
		player = new Player(100, 100); 	// Set the parameters for the entity
		add(player); 					// Then add it to the scene
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		super.init(gc, sbg);
		
	}
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		super.update(gc, sbg, delta);
		
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		super.render(gc, sbg, g);
		
	}

}
