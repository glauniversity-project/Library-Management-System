package library.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;
public class Forgot extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTextField t1,t2,t3,t4,t5;
    private JButton b1,b2,b3;
    
    public static void main(String[] args){
        new Forgot().setVisible(true);
    }
    
    public Forgot(){
        setBounds(500,200,650,500);//frame size
        contentPane=new JPanel();//work as div
        setContentPane(contentPane);//adding to frame
        contentPane.setBackground(Color.WHITE);
        contentPane.setLayout(null);//borderlayout(null) ,flow layout
        
        JLabel L1=new JLabel("Username :");
        L1.setForeground(Color.DARK_GRAY);
        L1.setFont(new Font("Tahoma",Font.BOLD,14));
        L1.setBounds(109, 83, 87, 29);
        contentPane.add(L1);
        
        JLabel L2=new JLabel("Name :");
        L2.setForeground(Color.DARK_GRAY);
        L2.setFont(new Font("Tahoma",Font.BOLD,14));
        L2.setBounds(109, 122, 75, 21);
        contentPane.add(L2);
        
        JLabel L3=new JLabel("Your Security Question :");
        L3.setForeground(Color.DARK_GRAY);
        L3.setFont(new Font("Tahoma",Font.BOLD,14));
        L3.setBounds(109, 154, 156, 27);
        contentPane.add(L3);
        
        JLabel L4=new JLabel("Answer :");
        L4.setForeground(Color.DARK_GRAY);
        L4.setFont(new Font("Tahoma",Font.BOLD,14));
        L4.setBounds(109, 192, 104, 21);
        contentPane.add(L4);
        
        JLabel L5=new JLabel("Password");
        L5.setForeground(Color.DARK_GRAY);
        L5.setFont(new Font("Tahoma",Font.BOLD,14));
        L5.setBounds(109, 224, 104, 21);
        contentPane.add(L5);
                
        t1=new JTextField();
        t1.setFont(new Font("Tahoma",Font.BOLD,14));
        t1.setForeground(new Color(105,105,105));
        t1.setBounds(277, 88, 139, 20);
        contentPane.add(t1);
        t1.setColumns(10);
        
        t2=new JTextField();
        t2.setEditable(false);
        t2.setFont(new Font("Tahoma",Font.BOLD,14));
        t2.setForeground(new Color(165,42,42));
        t2.setBounds(277, 123, 139, 20);
        contentPane.add(t2);
        t2.setColumns(10);
        
        t3=new JTextField();
        t3.setEditable(false);
        t3.setFont(new Font("Tahoma",Font.BOLD,14));
        t3.setForeground(new Color(72,61,139));
        t3.setBounds(277, 161,121,20);
        contentPane.add(t3);
        t3.setColumns(10);
        
        t4=new JTextField();
        t4.setFont(new Font("Tahoma",Font.BOLD,14));
        t4.setForeground(new Color(205,92,92));
        t4.setBounds(277, 193, 139, 20);
        contentPane.add(t4);
        t4.setColumns(10);
        
        t5=new JTextField();
        t5.setFont(new Font("Tahoma",Font.BOLD,14));
        t5.setForeground(new Color(50,205,50));
        t5.setBounds(277, 225, 139, 20);
        contentPane.add(t5);
        t5.setColumns(10);
        
        b1= new JButton("Search");
        b1.addActionListener(this);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Tahoma",Font.BOLD,13));
        b1.setBounds(428, 83, 80, 29);
        contentPane.add(b1);
        
        b2= new JButton("Retrieve");
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Tahoma",Font.BOLD,13));
        b2.setBounds(426, 188, 100, 29);
        contentPane.add(b2);
        
        b3= new JButton("Back");
        b3.addActionListener(this);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("Tahoma",Font.BOLD,13));
        b3.setBounds(233, 270, 101, 29);
        contentPane.add(b3);
        
        JPanel panel=new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(139,69,19),2),"Forgot-Password Section",
            TitledBorder.LEADING,TitledBorder.TOP,null,new Color(178,34,34)));
        panel.setBounds(47,45,508,281);
        panel.setBackground(Color.WHITE);
        contentPane.add(panel);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            conn con =new conn();
            if(e.getSource()==b1){
                String sql="select * from  account where username=?";
                PreparedStatement st=con.c.prepareStatement(sql);
                
                st.setString(1,t1.getText());
                ResultSet rs=st.executeQuery();
                
                while(rs.next()){
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("security_q"));
                }
            }
            if(e.getSource()==b2){
                String sql="select * from  account where security_ans=?";
                PreparedStatement st=con.c.prepareStatement(sql);
                
                st.setString(1,t4.getText());
                ResultSet rs=st.executeQuery();
                
                while(rs.next()){
                    t5.setText(rs.getString("password"));
                }
            }
            if(e.getSource()==b3){
                this.setVisible(false);
                new Login_user().setVisible(true);
            }
        }catch(Exception ee){
            
        }
    }

    
    
}
