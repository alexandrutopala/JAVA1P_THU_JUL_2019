import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fereastra1 extends JFrame {
    private JButton button;
    private JLabel label;
    
    public Fereastra1() {
        
        super("Fereastra mea");
        
        button = new JButton("Apasa-ma");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent event) {
                int count = Integer.parseInt( label.getText() );
                count++;
                label.setText( String.valueOf(count) );
            }
        });
        
        add(button);
        
        label = new JLabel("0");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.SOUTH);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}