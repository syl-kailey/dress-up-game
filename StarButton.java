import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StarButton extends JButton {

    private int numPoints;
    private int innerRadius;
    private int outerRadius;
    private boolean filled;

    public StarButton(int numPoints, int innerRadius, int outerRadius, boolean filled) {
        this.numPoints = numPoints;
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;
        this.filled = filled;
        setPreferredSize(new Dimension(outerRadius * 2, outerRadius * 2));
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setOpaque(false);

        
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int cx = getWidth() / 2;
        int cy = getHeight() / 2;

        double angle = Math.toRadians(360.0 / numPoints);
        int[] xPoints = new int[numPoints * 2];
        int[] yPoints = new int[numPoints * 2];
        for (int i = 0; i < numPoints * 2; i++) {
            double r = (i % 2 == 0) ? innerRadius : outerRadius;
            xPoints[i] = (int) (cx + r * Math.cos(i * angle));
            yPoints[i] = (int) (cy + r * Math.sin(i * angle));
        }

        if (filled) {
            g2d.setColor(getForeground());
            g2d.fillPolygon(xPoints, yPoints, numPoints * 2);
        } else {
            g2d.setColor(getForeground());
            g2d.drawPolygon(xPoints, yPoints, numPoints * 2);
        }

        g2d.dispose();
    }
}
