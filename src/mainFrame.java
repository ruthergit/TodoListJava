import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class mainFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    protected JPanel contentPane;
    protected JTextField addTaskTextField;
    protected JTextField[] taskFields;
    protected JButton[] doneButtons;
    private JButton addTaskBtn; 


    public mainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 472, 539);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(16, 24, 32));
        setResizable(false);
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("To-Do List");
        lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(254, 231, 21));
		lblNewLabel.setBounds(10, 11, 167, 40);
		contentPane.add(lblNewLabel);

        addTaskTextField = new JTextField();
        addTaskTextField.setForeground(new Color(254, 231, 21));
		addTaskTextField.setFont(new Font("Verdana", Font.BOLD, 14));
		addTaskTextField.setBackground(new Color(16, 24, 32));
		addTaskTextField.setBounds(10, 76, 321, 28);
		contentPane.add(addTaskTextField);
		addTaskTextField.setColumns(10);
		
		addTaskBtn = new JButton("ADD TASK");
        addTaskBtn.setBackground(new Color(16, 24, 32));
		addTaskBtn.setForeground(new Color(254, 231, 21));
		addTaskBtn.setFocusable(false);
		addTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskFields[0].setText(addTaskTextField.getText());
			}
		}); 
		contentPane.add(addTaskBtn);


        taskFields = new JTextField[6];
        doneButtons = new JButton[6];

        for (int i = 0; i < 6; i++) {
            taskFields[i] = new JTextField();
            taskFields[i].setForeground(new Color(254, 231, 21));
            taskFields[i].setFont(new Font("Verdana", Font.BOLD, 14));
            taskFields[i].setColumns(10);
            taskFields[i].setBackground(new Color(16, 24, 32));
            taskFields[i].setBounds(10, 152, 321, 28);
            taskFields[i].setEditable(false);

            doneButtons[i] = new JButton("Done");
            // ... (Set properties and bounds)
            final int index = i; // Need to use final for ActionListener
            doneButtons[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Handle Done button click
                }
            });
            
            contentPane.add(taskFields[i]);
            contentPane.add(doneButtons[i]);
        }

        // Set layout positions
        setLayoutPositions();
    }

    private void setLayoutPositions() {
        
    	addTaskBtn.setBounds(341, 78, 105, 23);
        
    

    }
}
