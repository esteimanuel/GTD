/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gtd.view;

import gtd.Config;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author st
 */
public class ContextDetailView extends JPanel {
    private final JTextField nameTextField;
    
    public ContextDetailView() {
        this.setLayout(new BorderLayout());       
        this.setAlignmentY(TOP_ALIGNMENT);

        nameTextField = new JTextField();
        nameTextField.setBorder(new EmptyBorder(Config.MARGIN,Config.MARGIN,Config.MARGIN,Config.MARGIN));
        nameTextField.setFont(getFont().deriveFont(Font.BOLD, 48));
        nameTextField.setHorizontalAlignment((int) JTextField.CENTER_ALIGNMENT);
                
        this.add(new JScrollPane(nameTextField), BorderLayout.CENTER);
    }
    
    public ContextDetailView(String name) {
        this();
        nameTextField.setText(name);
    }
    
    public String getName() {
        return nameTextField.getText();
    }
}
