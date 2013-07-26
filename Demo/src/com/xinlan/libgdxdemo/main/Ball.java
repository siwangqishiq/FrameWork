package com.xinlan.libgdxdemo.main;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Ball {
	private Sprite sprite;
	private Texture texture;

	private int width = 32;
	private int height = 32;
	private float x;
	private float y;
	public Ball() {
		x = GameScreen.SCREEN_WIDTH/2;
		y = GameScreen.SCREEN_HEIGHT/2;
		texture = new Texture(Gdx.files.internal("bitmap.png"));
		sprite = new Sprite(texture);
		sprite.translate(x, y);
		sprite.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);//¿¹¾â³Ý
	}
	
	public Ball(float x,float y) {
		this.x = x;
		this.y = y;
		texture = new Texture(Gdx.files.internal("bitmap.png"));
		sprite = new Sprite(texture);
		sprite.translate(x, y);
		sprite.getTexture().setFilter(TextureFilter.Linear, TextureFilter.Linear);//¿¹¾â³Ý
	}

	public void logic(float delta) {
		sprite.rotate(5f);
	}

	public void draw(SpriteBatch batch) {
		sprite.draw(batch);
	}
	
	public void dispose(){
		texture.dispose();
	}
}// end class
