package com.refactor.breakoutmethodobject;

import java.awt.*;
import java.util.Vector;

public class GDIBrush implements PointRenderer {
    public void draw(Vector<Point> renderingRoots, Color color, Vector<Point> selection) {
        Renderer renderer = new Renderer(this, renderingRoots, color, selection);
        renderer.draw();
    }

    @Override
    public void drawPoint(int x, int y, int rgb) {

    }
}
