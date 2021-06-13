import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pluspminus extends JFrame {
    private TextField txt;
    private JButton but1;
    private JButton but2;


    public pluspminus() {
        setBounds(400,400,150,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txt = new TextField("0");
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("+1");
        but2 = new JButton("-1");


        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(txt.getText());
                if(i<3) {
                    i++;
                }
                txt.setText(Integer.toString(i));
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(txt.getText());
                if(i>-5) {
                    i--;
                }
                txt.setText(Integer.toString(i));
            }
        });

        add(but1);
        add(but2);
        setVisible(true);
    }
    public static void main(String[] args) {
        new pluspminus();

    }
}