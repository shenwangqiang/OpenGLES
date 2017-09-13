package com.shen.opengles.util;

import javax.microedition.khronos.opengles.GL10;

/**
 * Created by shenwangqiang on 2017/9/13.
 */
public class FlatColoredSquare extends Square {
    public void draw(GL10 gl) {
        gl.glColor4f(0.5f, 0.5f, 1.0f, 1.0f);
        super.draw(gl);
    }
}
