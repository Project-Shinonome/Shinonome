import javax.swing.*;
import java.awt.*;

public class InputPanel extends JPanel {
    private JTextField inputField;
    private JButton submitButton;

    public InputPanel(){
        setLayout(new FlowLayout());

        inputField = new JTextField(20);
        submitButton = new JButton("제출");

        add(new JLabel("입력: "));
        add(inputField);
        add(submitButton);
    }

    public JTextField getInputField() {
        return inputField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }
}
