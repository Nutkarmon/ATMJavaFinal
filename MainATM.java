import javax.swing.*;
// import java.awt.*;
class MainATM {
	static MainATM OS = new MainATM();
	
    public static void main(String[] args){
        OS.createStartupWindow();
    }


    public void createStartupWindow(){
		JFrame frame = new JFrame();
        int result = JOptionPane.showConfirmDialog(frame, "Do you have an account already?", "User Confirmation",
        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		switch (result){
			case JOptionPane.YES_OPTION : JOptionPane.showMessageDialog(null, "Proceed to login page"); break;
			case JOptionPane.NO_OPTION : JOptionPane.showMessageDialog(null, "Proceed to registration page"); break;
		}

        /*if(result == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Proceed to login page");
        }else{
            JOptionPane.showMessageDialog(null, "Proceed to registration page");
        }*/
    }
}
