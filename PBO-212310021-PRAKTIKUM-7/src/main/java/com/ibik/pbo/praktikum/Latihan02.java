package com.ibik.pbo.praktikum;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Latihan02 extends JFrame {

	private JPanel contentPane;
	private JTextField field_Email;
	private JTextField field_Fullname;
	private JTextField field_Phone;
	private JLabel label_Gender;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Latihan02 frame = new Latihan02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Latihan02() {
		setTitle("Latihan 02");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 400, 400);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 150, 30));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel label_Fullname = new JLabel("Fullname");
		label_Fullname.setBounds(20, 20, 150, 30);
		contentPane.add(label_Fullname);
		
		field_Fullname = new JTextField();
		field_Fullname.setColumns(10);
		field_Fullname.setBounds(110,20,150,30);
		contentPane.add(field_Fullname);
		
		final JLabel label_Email = new JLabel("Email");
		label_Email.setBounds(20, 70, 150, 30);
		contentPane.add(label_Email);
		
		field_Email = new JTextField();
		field_Email.setBounds(110,70,150,30);
		contentPane.add(field_Email);
		field_Email.setColumns(10);
		
		final JLabel label_Phone = new JLabel("Phone");
		label_Phone.setBounds(20, 120, 150, 30);
		contentPane.add(label_Phone);
		
		field_Phone = new JTextField();
		field_Phone.setColumns(10);
		field_Phone.setBounds(110, 120, 150, 30);
		contentPane.add(field_Phone);
		
		label_Gender = new JLabel("Gender");
		label_Gender.setBounds(20,170,150,30);
		contentPane.add(label_Gender);
		
		final JRadioButton rb_Female = new JRadioButton("Female");
		rb_Female.setBounds(190, 170, 150, 30);
		contentPane.add(rb_Female);
		
		final JRadioButton rb_Male = new JRadioButton("Male");
		rb_Male.setBounds(105, 170, 150, 30);
		contentPane.add(rb_Male);
		
		final JLabel label_Citizenship = new JLabel("Citizenship");
		label_Citizenship.setBounds(20, 220, 150, 30);
		contentPane.add(label_Citizenship);
		
		final JComboBox cb_Citizenship = new JComboBox();
		cb_Citizenship.setModel(new DefaultComboBoxModel(new String[] {"Indonesia", "Rusia", "Singapore", "Korea", "Jepang"}));
		cb_Citizenship.setToolTipText("");
		cb_Citizenship.setBounds(110, 220, 150, 30);
		contentPane.add(cb_Citizenship);
		
		JButton button_Submit = new JButton("SUBMIT");
		button_Submit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (field_Fullname.getText().equals("") || field_Email.getText().equals("") || field_Phone.getText().equals("") || (rb_Female.isSelected() == false && rb_Male.isSelected() == false) || cb_Citizenship.getSelectedItem().equals("")) {
					JOptionPane.showMessageDialog(null, "Data tidak boleh kosong. Silakan periksa kembali\r\n"
							+ "isian anda","Error",JOptionPane.ERROR_MESSAGE);
				}else {
					String gender;
					if (rb_Female.isSelected() == true) {
						gender = "Female";
					}else {
						gender = "Male";
					}
					JOptionPane.showMessageDialog(null, label_Fullname.getText() + " : " + field_Fullname.getText() + "\n" + label_Email.getText() + " : " + field_Email.getText() +  "\n" + label_Phone.getText() + " : " + field_Phone.getText()  +  "\n" + label_Gender.getText() + " : " + gender + "\n" + label_Citizenship.getText() + " : " + cb_Citizenship.getSelectedItem());
				}
			}
		});
		button_Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_Submit.setBounds(70, 285, 150, 30);
		contentPane.add(button_Submit);
	}
}