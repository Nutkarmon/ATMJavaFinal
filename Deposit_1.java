import javax.swing.JOptionPane;
class Deposit_1 {
	static Deposit_1 D = new Deposit_1();
	static Deposit []p = new Deposit[1000];
	static int count=0;
	
	public static void main(String[] args){
		int ch;
		ch=D.manu();
		do{
			switch(ch){
				case 1 : D.Inputdeposit(); break;
				case 2 : D.show(); break;
				case 0 :break;


			}

		ch=D.manu();

		}while(ch!=0);


	}


	public int manu(){
	int ch = Integer.parseInt(JOptionPane.showInputDialog("********Deposit********"
														+"\n    1.Inputdeposit    "
														+"\n    2.Show			  "));

									return ch;


	}


	public void Inputdeposit(){
	int d,t;
	int u,sum=0;
	t = Integer.parseInt(JOptionPane.showInputDialog("Input Deposit"));

	for(int i=0;i<count;i++){
		if(t==1000){
			sum =+ t;
			
	}
		else if(t==500){
			sum =+ t;
			
	}
		else if(t==100){
			sum =+ t;
			
	}	
		else{
			System.out.println("can not deposit");
	}

	}
	
	d = sum;
	p[count] = new Deposit(d);
	count++;
}
	
	public void show(){
	String output = "********Deposit********";
	for(int i=0;i<count;i++){
	output += "\nDeposit"+p[i].getBaht();
	}
	JOptionPane.showMessageDialog(null,output);
	
	}


}
