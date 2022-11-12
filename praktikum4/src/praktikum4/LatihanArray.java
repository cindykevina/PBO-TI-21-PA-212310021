package praktikum4;

import javax.swing.JOptionPane;

public class LatihanArray {

public static void main(String[] args) {
// TODO Auto-generated method stub
int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan Panjang Array :"));
int angka[] = new int[x];

for (int i = 0; i < angka.length; i++) {
angka[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan array ke-" + i));
}
String output = "";
for (int i = 0; i < angka.length; i++) {
output += "Index ke-" + i + " = " + angka[i] + "\n";
}
JOptionPane.showMessageDialog(null, output);

}

}
