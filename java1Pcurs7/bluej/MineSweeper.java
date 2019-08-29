import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class MineSweeper extends JFrame {
    
    private JPanel optionsPanel;
    private JPanel buttonsPanel;
    
    private JButton resetButton;
    private JButton[][] buttons;
    
    private ImageIcon smileyIcon;
    private ImageIcon deadIcon;
    
    private JMenuBar mb;
    
    private JMenu m1;
    
    private JMenuItem mi1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    
    private int n = 5;
    private int m = 5;
    
    private boolean[][] mines;
    
    private final int[] I = {-1, -1, 0, 1, 1, 1, 0, -1};
    private final int[] J = {0, 1, 1, 1, 0, -1, -1, -1};
    
    public MineSweeper() {
        super("Mine sweeper");
        initComponents();
        initMenu();
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void initComponents() {
        optionsPanel = new JPanel();
        
        Image scaledImage = 
            new ImageIcon("smiley.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        smileyIcon = new ImageIcon(scaledImage);
        
        Image scaledImage1 = 
            new ImageIcon("dead.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        deadIcon = new ImageIcon(scaledImage1);
        
        resetButton = new JButton(smileyIcon);
        resetButton.addActionListener(ev -> initButtonsPanel(n, m));
        
        optionsPanel.add(resetButton);
        
        add(optionsPanel, BorderLayout.NORTH);
        
        buttonsPanel = new JPanel();
        
        initButtonsPanel(n, m);
        
        
        add(buttonsPanel);
    }
    
    private void initButtonsPanel(int n, int m) {
        buttonsPanel.removeAll();
        resetButton.setIcon(smileyIcon);
        
        LayoutManager layout = new GridLayout(n, m);
        buttonsPanel.setLayout(layout);
        
        buttons = new JButton[n][m];
        mines = new boolean[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                buttons[i][j] = new JButton();
                
                final int I = i;
                final int J = j;
                buttons[i][j].addActionListener(ev -> clickButton(I, J));
                
                buttonsPanel.add(buttons[i][j]);
            }
        }
        
        buttonsPanel.revalidate();
        generateMines(n, m);
        //showMines();
    }
    
    private void clickButton(int i, int j) {
        if (mines[i][j]) {
            gameOver();
            return;
        }
        
        discoverButtons(i, j);
    }
    
    private void gameOver() {
        resetButton.setIcon(deadIcon);
        showMines();
        JOptionPane.showMessageDialog(null, "Ai pierdut");
    }
    
    private void discoverButtons(int i, int j) {
        if (!buttons[i][j].isEnabled()) {
            return;
        }
        
        int minesCounter = countMines(i, j);
        
        buttons[i][j].setEnabled(false);
        
        if (minesCounter != 0) {
            buttons[i][j].setText(String.valueOf(minesCounter));
            return;
        }
        
        for (int k = 0; k < I.length; k++) {
            int newI = i + I[k];
            int newJ = j + J[k];
            
            if (newI < 0 || newI >= n) {
                continue;
            }
            
            if (newJ < 0 || newJ >= m) {
                continue;
            }
            
            discoverButtons(newI, newJ);
        }
    }
    
    private int countMines(int i, int j) {
        int counter = 0;
        
        for (int k = 0; k < I.length; k++) {
            int newI = i + I[k];
            int newJ = j + J[k];
            
            if (newI < 0 || newI >= n) {
                continue;
            }
            
            if (newJ < 0 || newJ >= m) {
                continue;
            }
            
            if (mines[newI][newJ]) {
                counter++;
            }
        }
        return counter;
    }
    
    // start
    private void generateMines(int n, int m) {
        int toBeGenerated = n * m / 7;
        int generated = 0;
        Random random = new Random();
        
        while (generated < toBeGenerated) {
            int i = random.nextInt(n);
            int j = random.nextInt(m);
            
            if (!mines[i][j]) {
                mines[i][j] = true;
                generated++;
            }
        }
        
    }
    
    private void showMines() {
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[i].length; j++) {
                if (mines[i][j]) {
                    buttons[i][j].setBackground(Color.RED);
                }
            }
        }
        
    }
    // end
    
    private void initMenu() {
        mb = new JMenuBar();
        
        m1 = new JMenu("Optiuni");
        
        mi1 = new JMenuItem("5 x 5");
        mi2 = new JMenuItem("7 x 7");
        mi3 = new JMenuItem("10 x 10");
        
        mi1.addActionListener(ev -> initButtonsPanel(n = 5, m = 5));
        mi2.addActionListener(ev -> initButtonsPanel(n = 7, m = 7));
        mi3.addActionListener(ev -> initButtonsPanel(n = 10, m = 10));
        
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        
        mb.add(m1);
        
        setJMenuBar(mb);
    }
    
    
    
    
}