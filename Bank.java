import javax.swing.JOptionPane;;

public class Bank {
    static Bank b = new Bank();
    static Depohis []d = new Depohis[1000];
    static Addbank []a = new Addbank[1000];
    static int count=0;

public static void main(String[] args){
        b.bank();
        b.showbank();

}

public void bank(){
   // string account;
    Double tranfer1=0.0;
    Double m=0.0;

    m = Double.parseDouble(JOptionPane.showInputDialog("sai money"));
    tranfer1 = Double.parseDouble(JOptionPane.showInputDialog("กรุณาใส่จำนวนเงิน"));       
                    
                
                if(tranfer1<0){
                JOptionPane.showMessageDialog(null,"connot");
            }else{
                double res = JOptionPane.showConfirmDialog(null,"คุณเเน่ใจเเล้วใช่ไหม"+tranfer1+"?");

                    if(res == JOptionPane.YES_OPTION){
                        m-=tranfer1;

                        double bathtranfer1 = m;
                        
                        a[count] = new Addbank(tranfer1,bathtranfer1);
                    }
                   

            }
            count++;
        }
            



public void showbank(){
    String output = "*****************HISTORY TRANFER*****************";
    for(int i=0 ; i<count;i++){
    output += "\n TRANFER THB"+a[i].getTranfer();
    output +="\nLast balance : THB "+a[i].getBathtranfer();
    }
     
     JOptionPane.showMessageDialog(null,output);

}



    
}
