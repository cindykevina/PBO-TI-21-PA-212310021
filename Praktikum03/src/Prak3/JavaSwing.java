package Prak3;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class JavaSwing {

	public static void main(String[] args) {
		JOptionPane jop= new JOptionPane();
		// jop.showMessageDialog(null, "ini Java Swing");
//		jop.showMessageDialog(null, "ini Java Swing", "Swing", jop.INFORMATION_MESSAGE);
//		jop.showMessageDialog(null, "ini Java Swing", "Swing", jop.WARNING_MESSAGE);
//		jop.showMessageDialog(null, "ini Java Swing", "Swing", jop.ERROR_MESSAGE);
//		jop.showMessageDialog(null, "ini Java Swing", "Swing", jop.PLAIN_MESSAGE);
//		ImageIcon icon = new ImageIcon("C:/Users/ckevi/Downloads/logo.png");
//		jop.showMessageDialog(null, "Java with icon", "Swing icon", jop.WARNING_MESSAGE, icon);
		
//		String nama = jop.showInputDialog(null, "Masukkan Nama : ");
//		jop.showMessageDialog(null, nama);
		
		//confirm dialog
//		jop.showMessageDialog(null, "Are you human?");
//		jop.showConfirmDialog(null, jop.YES_NO_CANCEL_OPTION);
		ImageIcon icon1 = new ImageIcon("C:/Users/ckevi/OneDrive/Pictures/Logo-Java/Logo5.png");
		jop.showMessageDialog(null, "Hallo, Selamat Datang!", "Welcome", jop.ERROR_MESSAGE, icon1);

		String nama = jop.showInputDialog(null, "Masukkan Nama : ", jop.QUESTION_MESSAGE);
				
		int confirm = jop.showConfirmDialog(null, "Apakah ini "+nama+"?","Confirm", jop.YES_NO_OPTION);
		
		if(confirm == 0) {
			ImageIcon icon = new ImageIcon("C:/Users/ckevi/OneDrive/Pictures/Logo-Java/Logo7.png");
			jop.showMessageDialog(null, "Benar kamu adalah "+nama,"Correct", jop.WARNING_MESSAGE, icon);
		}else {
			ImageIcon icon2 = new ImageIcon("C:/Users/ckevi/OneDrive/Pictures/Logo-Java/Logo.png");
			jop.showMessageDialog(null, "Kamu bukan "+nama,"False", jop.ERROR_MESSAGE, icon2);
		
		}
	}

}
