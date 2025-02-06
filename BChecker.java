import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BChecker {
    private JFrame frame;
    private JTextArea textArea;
    //private JLabel counterLabel;

    public BChecker() { //later: make triple box area that renders the choices for autocomplete and spellcheck
        //                          also remember to have spellcheck markup unrecognized words with change, method(?)
        frame = new JFrame("B Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel(new FlowLayout());
        JPanel tPanel = new JPanel(new BorderLayout());
        textArea = new JTextArea();
        textArea.setLineWrap(true);

        JButton selecA = new JButton("a");
        JButton selecB = new JButton("b");
        JButton selecC = new JButton("c");

        panel.add(selecA); panel.add(selecB); panel.add(selecC);
        tPanel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        //panel.add(counterLabel, BorderLayout.SOUTH);

        JPanel container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        container.add(panel);
        container.add(tPanel);

        frame.add(container);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {

                // if (Character.toLowerCase(e.getKeyChar()) == 'b') {
                //     bCount++;
                //     counterLabel.setText("Number of 'b's: " + bCount);
                // }

                String currentText = textArea.getText();

                String[] AC = Meth.autocomplete(currentText);
                //String[] EC = Meth.spellcheck(currentText);

                selecA.setText(AC[0]);
                selecB.setText(AC[1]);
                selecC.setText(AC[2]);

                // int bCount = 0;
                // for(int i = 0; i < currentText.length(); i++) {
                //     if(currentText.substring(i,i+1).equals("b")) {
                //         bCount++;
                //     }
                // }
                // counterLabel.setText("Number of 'b's: " + bCount);

            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BChecker();
    }
}