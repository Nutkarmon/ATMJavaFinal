public class Deposit extends Bank{
	protected int DBaht;
	protected int WBaht;

	public Deposit (int d,int w){
		DBaht=d;
		WBaht=w;
	}
	public Deposit (int d){
		DBaht=d;
	}
	

	public int caldeposit(){
		 int sum=0,sumi=0,sumo=0,sump=0;

		if(DBaht==1000){
			 sumi =+ DBaht;
		}else if(DBaht==500){
			 sumo =+ DBaht;
		}else if(DBaht==100){
			 sump =+ DBaht;
		}
		else{
		 System.out.println("can not Deposit");
		}	
		  sum = sumi+sumo+sump;
			return sum;
		}

	public int calwithdarw(){
      int sum=0;
	  return sum-WBaht;
	
	}


}