package library.management.system;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
 
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.SwingUtilities;

public class aboutUs extends JFrame {
    
    public JPanel contentPane;
    
    public JHyperlink linkEmail1 = new JHyperlink("Pawan Pandey");
    public JHyperlink linkEmail2 = new JHyperlink("Yash Nigam");
    public JHyperlink linkEmail3 = new JHyperlink("Yash Gupta");
    public JHyperlink linkEmail4 = new JHyperlink("Rajat Pandey");
     
    public aboutUs() throws HeadlessException {
         
            super("Library Management System");
            setBackground(new Color(173, 216, 230));
            setBounds(700, 100, 800, 600);
            setTitle("About Us");
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(340, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(250, 90, 405, 40);
            contentPane.add(l4);
            
            JLabel l5 = new JLabel("Developed By : ");
            l5.setForeground(new Color(127, 255, 0));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l5.setBounds(130,180,405,40);
            contentPane.add(l5);

         
        linkEmail1.setURL("mailto:pawan.pandey_cs19@gla.ac.in");
        linkEmail2.setURL("mailto:yash.nigam_cs19@gla.ac.in");
        linkEmail3.setURL("mailto:yash.gupta_cs19@gla.ac.in");
        linkEmail4.setURL("mailto:rajat.pandey_cs19@gla.ac.in");
        linkEmail1.setBounds(380,180,405,40);
        linkEmail1.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        linkEmail2.setBounds(390,255,405,40);
        linkEmail2.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        linkEmail3.setBounds(390,335,405,40);
        linkEmail3.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
        linkEmail4.setBounds(380,410,405,40);
        linkEmail4.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
         
        getContentPane().add(linkEmail1);
        getContentPane().add(linkEmail2);
        getContentPane().add(linkEmail3);
        getContentPane().add(linkEmail4);

        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
 
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
             
            @Override
            public void run() {
                new aboutUs().setVisible(true);
            }
        });
    }
}
