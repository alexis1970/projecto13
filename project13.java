import javax.swing.*;
import java.awt.event.*;
import javax.swing.SwingUtilities;
//import java.swing.FileNameExtensionFilter;
import javax.swing.JFileChooser.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class project13 extends JFrame {
    private JCheckBox kl0800VictuosaCheckBox;
    private JCheckBox kl1700MetforminCheckBox;
    private JCheckBox kl2000InsulatardCheckBox;
    private JCheckBox kl2200InmovaneCheckBox;
    private JTextArea textArea1;
    private JButton clearButton;
    private JButton sparaButton;
    private JButton openButton;
    private JPanel mainpaleta13;
    private JFileChooser fileChooser;
    public project13() {

        setContentPane(mainpaleta13);
        setTitle("Wellcome");
        setSize(850, 800);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        fileChooser = new JFileChooser();

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kl0800VictuosaCheckBox.setSelected(false);
                kl1700MetforminCheckBox.setSelected(false);
                kl2000InsulatardCheckBox.setSelected(false);
                kl2200InmovaneCheckBox.setSelected(false);

                JOptionPane.showMessageDialog(null, "Du Valde Rensa-Knappen");
            }
        });
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //open a file using JFileChooser
             if (fileChooser.showOpenDialog(project13.this) == JFileChooser.APPROVE_OPTION);

            }
        });
        sparaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (fileChooser.showSaveDialog(project13.this) != JFileChooser.APPROVE_OPTION) {
                    return;
                }
                ;

            }
        });
    }

    public static void main (String[]args) {
        project13 myframe = new project13();

    }


}


