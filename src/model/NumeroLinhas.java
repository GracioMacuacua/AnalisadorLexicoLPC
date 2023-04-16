// 
// Decompiled by Procyon v0.5.36
// 

package model;

import java.awt.Container;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.Component;
import javax.swing.JViewport;
import java.awt.Color;
import javax.swing.border.AbstractBorder;

public class NumeroLinhas extends AbstractBorder
{
    private int lineHeight;
    private int characterHeight;
    private int characterWidth;
    private Color myColor;
    private JViewport viewport;
    
    public NumeroLinhas() {
        this.lineHeight = 20;
        this.characterHeight = 6;
        this.characterWidth = 6;
        this.myColor = Color.WHITE;
    }
    
    @Override
    public void paintBorder(final Component c, final Graphics g, final int x, final int y, final int width, final int height) {
        if (this.viewport == null) {
            this.searchViewport(c);
        }
        final Dimension d = null;
        Point point;
        if (this.viewport != null) {
            point = this.viewport.getViewPosition();
        }
        else {
            point = new Point();
        }
        final Color oldColor = g.getColor();
        g.setColor(this.myColor);
        double r = height / (double)this.lineHeight;
        int rows = (int)(r + 0.5);
        String str = String.valueOf(rows);
        final int maxLenght = str.length();
        int i = 0;
        if (point.y > 0) {
            i = point.y / this.lineHeight;
        }
        if (d != null) {
            r = d.height / (double)this.lineHeight;
            rows = (int)(r + 0.5);
            rows += i + 1;
        }
        while (i < rows) {
            str = String.valueOf(i + 1);
            int lenght = str.length();
            lenght = maxLenght - lenght;
            final int py = this.lineHeight * i + 14;
            final int px = this.characterWidth * lenght + 2;
            g.drawString(str, px, py);
            ++i;
        }
        final int left = this.calculateLeft(height) + 7;
        g.drawLine(left, 0, left, height);
        g.setColor(myColor);
    }
    
    @Override
    public Insets getBorderInsets(final Component c) {
        final int left = this.calculateLeft(c.getHeight()) + 10;
        return new Insets(1, left, 1, 1);
    }
    
    @Override
    public Insets getBorderInsets(final Component c, final Insets insets) {
        insets.top = 1;
        insets.left = this.calculateLeft(c.getHeight()) + 10;
        insets.bottom = 1;
        insets.right = 1;
        return insets;
    }
    
    protected int calculateLeft(final int height) {
        final double r = height / (double)this.lineHeight;
        final int rows = (int)(r + 0.5);
        final String str = String.valueOf(rows);
        final int lenght = str.length();
        return this.characterHeight * lenght;
    }
    
    protected void searchViewport(final Component c) {
        final Container parent = c.getParent();
        if (parent instanceof JViewport) {
            this.viewport = (JViewport)parent;
        }
    }
}
