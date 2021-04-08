package Components.Panels;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class WorkLabelsPanel extends JPanel
{
    private boolean isVisible = true;

    public WorkLabelsPanel()
    {
        this.createPanel();
    }

    private void createPanel()
    {
        this.setBorder(new EmptyBorder(10, 5, 10, 5));
        this.setBackground(Color.red);
        this.setVisible(isVisible);
    }

    public void changeVisibility()
    {
        this.isVisible = !this.isVisible;
        this.createPanel();
    }
}
