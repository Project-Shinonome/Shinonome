import javax.swing.*;
import java.awt.*;

public class Window {
    MainFrame a = new MainFrame();
}


class MainFrame extends JFrame{
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private JPanel mainPanel1;
    private JPanel mainPanel2;
    private InputOutputSection inOutSection;

    public MainFrame(){
        setTitle("Testing");
        setSize(1600, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //인스턴스 생성
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        mainPanel1 = new JPanel();
        mainPanel2 = new JPanel();
        inOutSection = new InputOutputSection();


        mainPanel.add(mainPanel1, "main1");
        mainPanel.add(mainPanel2, "main2");

        mainPanel1.add(inOutSection);

        add(mainPanel);
        cardLayout.show(mainPanel, "Main");
        setLocationRelativeTo(null);
        setVisible(true);
    }
}

