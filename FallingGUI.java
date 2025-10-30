import javax.swing.*;
import java.awt.*;

public class FallingGUI extends JPanel implements Runnable {
    private double y = 20;
    private double velocity = 10;
    private final double gravity = 0.20;
    private final int groundLevel = 450;
    private final int ballRadius = 20;

    public FallingSimulationGUI() {
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.BLUE);
        g.fillOval(200, (int) y, ballRadius * 2, ballRadius * 2);
        g.setColor(Color.BLACK);
        g.drawLine(0, groundLevel + ballRadius * 2, getWidth(), groundLevel + ballRadius * 2);
    }

    @Override
    public void run() {
        while (true) {
            velocity += gravity;
            y += velocity;
            if (y >= groundLevel) {
                y = groundLevel;
                velocity *= -0.7;
            }
            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Falling Simulation");
        FallingSimulationGUI sim = new FallingSimulationGUI();
        frame.add(sim);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
