import javax.swing.JOptionPane;
class Call {
	static Depowith01 d = new Depowith01();
	private int money;
	private int wmoney;
	private int balance;

	Call(){}

	Call(int money){
	this.money = money;
	}

	Call(int money,int wmoney){
	this.money = money;
	this.wmoney = wmoney;

	}
	public void setBalance(int balance){
	this. balance= balance;
	}

	public int getBalance(){
	return balance;
	}

	public void setMoney(int money){
	this.money=money;
	}
	public int getMoney(){
	return money;
	}

	public void setWmoney(int wmoney){
	this.wmoney = wmoney;
	}
	public int getWmoney(){
	return wmoney;
	}

	public void deposit(int atm){
	
		if(atm<0 || atm<99 || atm%100!=0  ){
			JOptionPane.showMessageDialog(null,"Unable to make a transaction >please re-enter<");
			d.Deposit();
		}else{

			balance +=atm;

		}
	}

		public void withdrew(int o){

		if(o>balance || o<99 || o%100!=0){
			JOptionPane.showMessageDialog(null,"Unable to make a transaction");
			d.Withdrew();
		}else{
			balance -= o;
		}
		
	}
	
}