import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Depowith01 {
	static Depowith01 d = new Depowith01();
	static Call c = new Call();

	JFrame manu = new JFrame("Main Menu");

	public static void main(String[] args){
	 d.manu();
	}

	public void manu(){
		JPanel panel1 = new JPanel();
		String Lb ="Main menu";
		JLabel label = new JLabel("<html><div style = 'text -align:center'><h1>"+Lb+"</h1></html>",SwingConstants.LEFT);

		JButton depobutton = new JButton("DEPOSIT");
		JButton shdepobutton = new JButton("Showdeposit");
		JButton withbutton = new JButton("WITHDRAW");
		JButton shwithbutton = new JButton("SHOWWITHDRAW");
		JButton exbutton = new JButton("Quit");
		
		panel1.setLayout(new GridLayout(5,1));

		panel1.add(depobutton);
		panel1.add(shdepobutton);
		panel1.add(withbutton);
		panel1.add(shwithbutton);
		panel1.add(exbutton);


		manu.add(label,BorderLayout.NORTH);
		manu.add(panel1,BorderLayout.CENTER);
		
		manu.setSize(300,300);
		manu.setLocationRelativeTo(null);
		manu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		manu.setVisible(true);

		depobutton.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
				manu.dispose();
				d.Deposit();
			}
		});

		shdepobutton.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
			manu.dispose();
			d.showdeposit();
			}
		});

		withbutton.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
			manu.dispose();
			d.Withdrew();
			}
		});

		shwithbutton.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
			manu.dispose();
			d.showwithdrew();
			}
		});

		exbutton.addActionListener(new ActionListener (){
			public void actionPerformed(ActionEvent e){
			manu.dispose();
			}
		});

	}

	
	public void Deposit(){
		int money;
		money = Integer.parseInt(JOptionPane.showInputDialog("Enter Deposit"));
		c = new Call(money);
		c.deposit(money);
		d.manu();

		}

	public void showdeposit(){
		String output = "***************DEPOSIT***************";
			Calendar g = Calendar.getInstance();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String currentDate = df.format(g.getTime());
			
			output +="\n Deposit: " +c.getMoney()+" THB";
			output += "\nDate: " + currentDate;
			output += "\n****************************************";

			JOptionPane.showMessageDialog(null,output);
			d.manu();
}

	public void Withdrew(){
		int wmoney;
		wmoney = Integer.parseInt(JOptionPane.showInputDialog("Enter Withdrew"));
		c.withdrew(wmoney);
		d.manu();

		}

	public void showwithdrew(){
		String output = "***************WITHDREW***************";
			Calendar g = Calendar.getInstance();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String currentDate = df.format(g.getTime());
			
			output +="\n Withdrew: " +c.getBalance()+ "THB";
			output += "\nDate: " + currentDate;
			output += "\n****************************************";

			JOptionPane.showMessageDialog(null,output);
			d.manu();
}
	
		
	}


		






 

	

