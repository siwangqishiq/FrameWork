package com.xinlan.libgdxdemo.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
	public int state;
	// ∆¡ƒª∏ﬂøÌ
	public static final int SCREEN_WIDTH = 480;
	public static final int SCREEN_HEIGHT = 800;

	private Game game;
	private TouchBall touchBall;
	
	// …„œÒª˙
	public OrthographicCamera guiCamera;
	private SpriteBatch batch;
	
	private Ball ball;
	
	public GameScreen(Game game) {
		this.game = game;
		state = 0;
		guiCamera = new OrthographicCamera(SCREEN_WIDTH, SCREEN_HEIGHT);
		guiCamera.position.set(SCREEN_WIDTH/2, SCREEN_HEIGHT/2, 0);	
		batch = new SpriteBatch();
		
		init();
	}
	
	private void init(){
		ball = new Ball();
		touchBall = new TouchBall(this);
	}

	@Override
	public void render(float delta) {
		logic(delta);
		draw(batch);
	}
	
	public void logic(float delta){
		ball.logic(delta);
		touchBall.logic(delta);
	}
	
	public void draw(SpriteBatch batch){
		Gdx.gl.glClearColor(1f, 1f, 1f, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);//«Â∆¡
		//…Ë÷√…„œÒª˙
		guiCamera.update();
		batch.setProjectionMatrix(guiCamera.combined);
		batch.begin();
		//TODO
		ball.draw(batch);
		touchBall.draw(batch);
		batch.end();
	}
	
	@Override
	public void dispose() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resize(int arg0, int arg1) {
	}

	@Override
	public void resume() {
	}

	@Override
	public void show() {
	}
}// end class
