package com.legacy;

import java.awt.*;
import java.util.Vector;

public class GDIBrush {
    public void draw(Vector<Point> renderingRoots, Color color, Vector<Point> selection) {
        for (Point point : renderingRoots) {
            drawPoint(point.x, point.y, color.getRGB());
        }
    }

    public void drawPoint(int x, int y, int rgb) {

    }
}
