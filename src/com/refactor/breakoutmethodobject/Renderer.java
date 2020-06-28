package com.refactor.breakoutmethodobject;


import java.awt.*;
import java.util.Vector;

public class Renderer {
    PointRenderer gdiBrush;
    Vector<Point> renderingRoots;
    Color color;
    Vector<Point> selection;

    public Renderer(PointRenderer pointRenderer, Vector<Point> renderingRoots, Color color, Vector<Point> selection) {
        this.gdiBrush = pointRenderer;
        this.renderingRoots = renderingRoots;
        this.color = color;
        this.selection = selection;
    }

    void draw() {
        for (Point point : renderingRoots) {
            gdiBrush.drawPoint(point.x, point.y, color.getRGB());
        }
    }
}
