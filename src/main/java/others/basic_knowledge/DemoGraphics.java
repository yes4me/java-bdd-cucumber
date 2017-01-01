package others.basic_knowledge;

/**
 * Created by Thomas on 12/30/2016.
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class DemoGraphics extends JFrame {
    public void paint(Graphics g){
        //This sets the color of g as Black.
        g.setColor(Color.RED);

        //The first statement creates the background rectangle on which the others are drawn.
        g.fillRect(0,0,800,480);

        //This sets the color of g as Blue.
        g.setColor(Color.BLUE);

        //This will draw the outline of a Blue rectangle, as the color of g when this is called is Blue.
        g.drawRect(60, 200, 100, 250);

        //This sets the color of g as Black.
        g.setColor(Color.BLACK);

        //This will display a black string.
        g.drawString("My name is James", 200, 400);
    }

    // The constructor follows:
    public DemoGraphics() {
        setTitle("Graphics Demo");
        setSize(800, 480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String args[]) {
        DemoGraphics demo = new DemoGraphics();
    }
}