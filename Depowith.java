import java.util.*;
import javax.swing.JOptionPane;
class Depowith{
	private double Baht;

	public Depowith(double baht){
		this.Baht=baht;
	}

	public static void main(String[] args){
	int ch;
		ch=manu();
		do{
			switch(ch){
				case 1 : Deposit(); break;
				//case 2 : show(); break;
				case 0 :break;

			}

		ch=manu();

		}while(ch!=0);

	}

	public static int manu(){
	int ch = Integer.parseInt(JOptionPane.showInputDialog("********Deposit********"
														+"\n    1.Inputdeposit    "
														+"\n    2.Show			  "));

									return ch;


	}





	public static void Deposit(){
		double baht;
		System.out.println("input radius : ");
		Scanner scanner = new Scanner(System.in);
		baht = scanner.nextDouble();

		if(baht<0){
			System.out.println("can not");
		}

		if(baht>0 && baht/100){
			this.Baht += baht;
		}
}



}


 

	

