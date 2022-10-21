package Prak3;

import javax.swing.JOptionPane;
public class Latihan02 {

	public static void main(String[] args) {
		Biodata myBio = new Biodata();
		
		myBio.setFullname(JOptionPane.showInputDialog(
				null, 
				"Input your fullname:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));
		
		myBio.setAge(Integer.parseInt(JOptionPane.showInputDialog(
				null, 
				"Input your age:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		)));
		
		myBio.setAlamat(JOptionPane.showInputDialog(
				null, 
				"Input your address:",
				"Form Input",
				JOptionPane.QUESTION_MESSAGE
		));

		JOptionPane.showMessageDialog(
				null, 
				"Your fullname is " + myBio.getFullname() 
				+ "\nYour age is " + myBio.getAge() + " year " 
				+ "\nRaiYour address is " + myBio.getAlamat());
	}

}