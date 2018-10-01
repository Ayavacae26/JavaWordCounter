import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;


public class TempWindow extends JFrame {
    JLabel label = new JLabel("Word Counter");
    JButton fileButton = new JButton("Choose Text File");

    public TempWindow() {
        this.setTitle("Word Counter");
        this.setBounds(300,400,350,250);
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.label.setBounds(130,60,100,30);
        this.getContentPane().add(label);

        this.fileButton.setBounds(100,100,150,60);
        this.getContentPane().add(fileButton);
        this.fileButton.addActionListener(new FileButtonListner());

    }

    private class FileButtonListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("hit the file button");
            JFileChooser chooser = new JFileChooser();
            chooser.setFileFilter(new FileNameExtensionFilter("TEXT FILES", "txt", "test"));
            System.out.println("I created the file chooser");
            int chooserSuccess = chooser.showOpenDialog(null);
            System.out.println("I opened the file chooser, it returned" + chooserSuccess);
            if (chooserSuccess == JFileChooser.APPROVE_OPTION) {
                File chosenFile = chooser.getSelectedFile();
                //pass this file to your function
                System.out.println("You choose the file:" + chosenFile.getAbsolutePath());
                System.out.println("You choose the file:" + chosenFile.getName());
                WordCount file = new WordCount(chosenFile);
                file.wordCount();

            } else {
                System.out.println("You hit cancel");
            }
        }



    }
}
























