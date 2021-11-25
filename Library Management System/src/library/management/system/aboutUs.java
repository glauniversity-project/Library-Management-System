package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("Library Management System");
            setBackground(new Color(173, 216, 230));
            setBounds(700, 100, 600, 900);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(250, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(160, 90, 405, 40);
            contentPane.add(l4);

           


            JLabel l6 = new JLabel("Developed By : Yash Nigam");
            JLabel l11 = new JLabel("Rajat Pandey");
            JLabel l12 = new JLabel("Yash Gupta");
            JLabel l13 = new JLabel("Pawan Pandey");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 200, 600, 35);
            l11.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l11.setBounds(290, 240, 600, 35);
            l12.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l12.setBounds(290, 280, 600, 35);
            l13.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l13.setBounds(290, 320, 600, 35);
            
            contentPane.add(l6);
            contentPane.add(l11);
            contentPane.add(l12);
            contentPane.add(l13);

            JLabel l7 = new JLabel("Contact Us : yash.gupta_cs19@gla.ac.in");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            JLabel l14 = new JLabel("yash.nigam_cs19@gla.ac.in");
            l14.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            JLabel l15 = new JLabel("rajat.pandey_cs19@gla.ac.in");
            l15.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            JLabel l16 = new JLabel("pawan.pandey_cs19@gla.ac.in");
            l16.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 400, 600, 34);
            l14.setBounds(190, 450, 600, 34);
            l15.setBounds(190, 500, 600, 34);
            l16.setBounds(190, 550, 600, 34);
            contentPane.add(l7);
            contentPane.add(l14);
            contentPane.add(l15);
            contentPane.add(l16);        
            contentPane.setBackground(Color.WHITE);
	}
        

}