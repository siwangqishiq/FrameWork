package com.xinlan.libgdxdemo.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.FPSLogger;

public class MyGame extends Game {
	private FPSLogger fps;
	@Override
	public void create() {
		setScreen(new GameScreen(this));
		fps = new FPSLogger();
	}
	
	@Override
	public void render() {
		super.render();
		fps.log();
	}

	@Override
	public void dispose () {
		super.dispose();
		getScreen().dispose();
	}
}//end class
