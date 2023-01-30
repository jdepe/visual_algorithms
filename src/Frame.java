import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    private SortingPanel panel = new SortingPanel();

    public Frame() {
        this.setTitle("Sorting");
        this.getContentPane().setPreferredSize(new Dimension(1200, 720));
        this.getContentPane().add(panel);
        this.pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public SortingPanel getPanel() {
        return this.panel;
    }
}
