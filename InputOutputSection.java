import javax.swing.*;
import java.awt.*;

public class InputOutputSection extends JPanel {
    private InputPanel inputPanel;
    private OutputPanel outputPanel;

    public InputOutputSection(){
        setLayout(new GridBagLayout()); 
        GridBagConstraints gbc = new GridBagConstraints();
        inputPanel = new InputPanel();
        outputPanel = new OutputPanel();

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(outputPanel,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(inputPanel,gbc);

    }
    
}
