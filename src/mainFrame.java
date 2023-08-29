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

    public mainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 472, 539);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(16, 24, 32));
        setResizable(false);
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Rest of the code from the second part
        // ... (addTaskTextField, addTaskBtn, labels, task fields, done buttons)
    }
}
