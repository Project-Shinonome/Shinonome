import javax.swing.*;
import java.awt.*;


public class OutputPanel extends JPanel{
    private JTextArea textArea;

    public OutputPanel(){
        setLayout(new BorderLayout());

        textArea = new JTextArea(10, 30); // 크기 설정
        textArea.setEditable(false); // 사용자 입력 불가
        textArea.setLineWrap(true);  // 줄바꿈 허용
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);
    }

    public void showMessage(String message){
        textArea.append(message + "\n");
    }

}
