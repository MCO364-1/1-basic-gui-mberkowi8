import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicGui {

    private static Color randomColor(){
        return new Color((float)Math.random(), (float)Math.random(), (float)Math.random());
    }

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("➕🪟");
        window.setSize(500, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flowLayout = new FlowLayout();
        window.setLayout(flowLayout);
        window.getContentPane().setBackground( randomColor());


        JPanel panel = new JPanel(new GridLayout(3,6));

        JTextField text1 = new JTextField(5);
        text1.setBackground(randomColor());
        JTextField text2 = new JTextField(5);
        text2.setBackground(randomColor());


        JButton additionButton = new JButton("Addition Button");

        JLabel solutionLabel = new JLabel("      ");

        window.setBackground(randomColor());
        window.add(panel);
        panel.setBackground(randomColor());


        panel.add(text1);
        panel.add(text2);
        panel.add(additionButton);
        panel.add(solutionLabel);

        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String s1 = text1.getText();
                    int int1 = Integer.parseInt(s1);

                    String s2 = text2.getText();
                    int int2 = Integer.parseInt(s2);

                    int sum = int1 + int2;

                    solutionLabel.setText(String.valueOf(sum));
                    System.out.println("It worked!!! ");

                } catch (NumberFormatException ex) {
                    solutionLabel.setText("Invalid!!!");
                }
            }
        });

        window.setVisible(true);
    }
}