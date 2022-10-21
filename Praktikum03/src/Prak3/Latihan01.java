package Prak3;

import javax.swing.JOptionPane;

public class Latihan01 {
	
	public static void main(String[] args) {
		JOptionPane jop = new JOptionPane();
		
		String nama = jop.showInputDialog(null, "Masukkan nama: ");
		
		jop.showMessageDialog(null, nama);
		
		int pilihan = jop.showConfirmDialog(null, "Are you Human?", "Pilihan", jop.YES_NO_OPTION);
		
		if(pilihan == jop.YES_OPTION) {
			jop.showMessageDialog(null, "You're Human!");
		} else {
			jop.showMessageDialog(null, "You're not Human!");
		}
	}
	
}