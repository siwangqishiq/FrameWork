package com.xinlan.libgdxdemo.main;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.List;

public class TouchBall {
	private Sprite sprite;
	private GameScreen context;
	private LinkedList<Ball> ballList= new LinkedList<Ball>();
	
	public TouchBall(GameScreen context) {
		this.context = context;
	}

	public void logic(float delta) {
		for(Ball ball:ballList){
			ball.logic(delta);
		}//end for
		
		 if(Gdx.input.isTouched()) {
			 Vector3 touchPos = new Vector3();
	         touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
	         context.guiCamera.unproject(touchPos);//
			 Ball ball = new Ball(touchPos.x-16,touchPos.y-16);
			 ballList.add(ball);
	      }
	}

	public void draw(SpriteBatch batch) {
		for(Ball ball:ballList){
			ball.draw(batch);
		}//end for
	}
	
	public void dispose(){
		for(Ball ball:ballList){
			ball.dispose();
		}//end for
	}
}//end class
