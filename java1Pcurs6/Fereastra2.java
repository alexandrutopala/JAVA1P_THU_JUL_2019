import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra2 extends JFrame {
    
    private JPanel colorPanel;
    private JPanel buttonsPanel;
    
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton;
    
    private JMenuBar mb;
    
    private JMenu m1;
    
    private JMenuItem mi1;
    private JMenuItem mi2;
    
    public Fereastra2() {
        initComponents();
        initMenu();
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        // set up the color panel
        colorPanel = new JPanel();
        add(colorPanel);
        
        // set up the buttons panel
        buttonsPanel = new JPanel();
        
        LayoutManager layout = new FlowLayout();
        buttonsPanel.setLayout(layout);
        
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        
        redButton.addActionListener(ev -> colorPanel.setBackground(Color.RED));
        greenButton.addActionListener(ev -> colorPanel.setBackground(Color.GREEN));
        blueButton.addActionListener(ev -> colorPanel.setBackground(Color.BLUE));
        
        buttonsPanel.add(redButton);
        buttonsPanel.add(greenButton);
        buttonsPanel.add(blueButton);
        
        add(buttonsPanel, BorderLayout.SOUTH);
    }
    
    private void initMenu() {
        mb = new JMenuBar();
        
        m1 = new JMenu("Optiuni");
        
        mi1 = new JMenuItem("Reseteaza");
        mi2 = new JMenuItem("Inchide");
        
        mi1.addActionListener(ev -> colorPanel.setBackground(Color.GRAY));
        mi2.addActionListener(ev -> dispose());
        
        m1.add(mi1);
        m1.add(mi2);
        
        mb.add(m1);
        
        setJMenuBar(mb);
    }
    
    
    
    
    
    
    
}