package com.refactor.breakoutmethodobject;

import org.junit.Test;

import java.awt.*;
import java.util.Vector;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

class FakePointRender implements PointRenderer {

    int x;
    int y;

    @Override
    public void drawPoint(int x, int y, int rgb) {
        this.x = x;
        this.y = y;

    }
}

public class RendererTest {

    @Test
    public void draw() {
        FakePointRender fakePointRender = new FakePointRender();
        Vector<Point> renderingRoots = new Vector<Point>();
        renderingRoots.add(new Point(1, 1));
        Renderer renderer = new Renderer(fakePointRender, renderingRoots, new Color(0, 0, 0), new Vector<>());
        renderer.draw();
        assertThat(fakePointRender.x, is(1));
        assertThat(fakePointRender.y, is(1));
    }
}

