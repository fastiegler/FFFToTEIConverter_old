package gui;

import controler.FFFToTEIConverter;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by fstiegle on 20.05.2017.
 */
public class MainForm implements ActionListener{


    private JPanel MainPanel;
    private JLabel lbHeader;
    private JLabel lbFile;
    private JTextField tbFilePath;
    private JButton btnBrowse;
    private JButton btnStart;
    private JFileChooser fc;

    private File currFile;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new MainForm().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainForm() {
        btnBrowse.addActionListener(this);
        fc = new JFileChooser();
        btnStart.addActionListener(this);
    }

    private void createUIComponents() {}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnBrowse)) {
            int returnVal = fc.showOpenDialog(MainPanel);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                currFile = fc.getSelectedFile();
                tbFilePath.setText(currFile.getAbsolutePath());
            }
        } else if(e.getSource().equals(btnStart )) {
            try {
                FFFToTEIConverter converter = new FFFToTEIConverter();
                converter.
            } catch(Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
