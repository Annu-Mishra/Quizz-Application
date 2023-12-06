package quizzApp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
  public static void main(String args[]) {
	  new Login();
  }
  
  JButton rules,back;
  JTextField tfname;

public Login() {
	getContentPane().setBackground(Color.WHITE);
	setLayout(null);
	
	ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/pic1.jpg"));
	JLabel image=new JLabel(i1);
	image.setBounds(0,0,500,500);
	add(image);
	
	JLabel heading=new JLabel("Simple Minds");
	heading.setBounds(650,60,300,45);
	add(heading);
	heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
	heading.setForeground(Color.BLUE);
	
	JLabel name=new JLabel("Enter Your Name");
	name.setBounds(710,150,300,20);
	add(name);
	name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
	name.setForeground(Color.BLUE);
	
	 tfname=new JTextField();
	tfname.setBounds(630,200,300,25);
	tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
	add(tfname);
	
	rules=new JButton("Rules");
	rules.setBounds(640,270,120,25);
	rules.setBackground(new Color(30,144,254));
	rules.setForeground(Color.WHITE);
	rules.addActionListener(this);
	add(rules);
	
	back=new JButton("Back");
	back.setBounds(800,270,120,25);
	back.setBackground(new Color(30,144,254));
	back.setForeground(Color.WHITE);
	back.addActionListener(this);
	add(back);
	
	setSize(1100,500);
	setLocation(100,100);
	setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==rules) {
		String name=tfname.getText();
		setVisible(false);
		new Rules(name);
	}
	else if(e.getSource()==back) {
		setVisible(false);
	}
	
}
}
