package quizzApp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
	String name;
	JButton start,back;
	Rules(String name){
		this.name=name;
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel("Welcome "+ name +" to Simple Minds");
		heading.setBounds(50,20,700,30);
		add(heading);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
		heading.setForeground(Color.BLUE);
		
		JLabel rules=new JLabel("Welcome"+ name +" to Simple Minds");
		rules.setBounds(20,90,700,350);
		add(rules);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText("rules will be declare later");
		
		start=new JButton("START");
		start.setBounds(400,400,100,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
		
		back=new JButton("Back");
		back.setBounds(250,400,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		setSize(800,550);
		setLocation(300,100);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Rules("user");
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==start) {
			setVisible(false);
			new Quiz(name);
		}
		else {
			setVisible(false);
			new Login();
		}
		
	}

}
