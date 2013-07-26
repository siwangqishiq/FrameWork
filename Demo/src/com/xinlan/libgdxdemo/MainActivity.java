package com.xinlan.libgdxdemo;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.xinlan.libgdxdemo.main.MyGame;

import android.os.Bundle;
import android.app.Activity;

public class MainActivity extends AndroidApplication {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize(new MyGame(), false);
    }
}//end class
