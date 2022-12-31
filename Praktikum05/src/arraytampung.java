import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class arraytampung {
 public static void main(String[] args) {
	 ArrayList<ArrayList<Integer>> matriks_a = new ArrayList<ArrayList<Integer>>();
	 ArrayList<ArrayList<Integer>> matriks_b=new ArrayList<ArrayList<Integer>>();
	 
	 matriks_a.add(new ArrayList<Integer>());
	 //get(row).add(column, value)
	 matriks_a.get(0).add(0,1);
	 matriks_a.get(0).add(1,3);
	 
	 matriks_a.add(new ArrayList<Integer>());
	 matriks_a.get(1).add(0,9);
	 matriks_a.get(1).add(1,5);
	 
	matriks_b.add(new ArrayList<Integer>());
	matriks_b.get(0).add(0,4);
	matriks_b.get(0).add(1,5);
	
	matriks_b.add(new ArrayList<Integer>());
	matriks_b.get(1).add(0,3);
	matriks_b.get(1).add(1,6);
	 
	 for(int i=0; i<matriks_a.size(); i++) {
		 for(int j=0; j<matriks_a.size(); j++) {
			 System.out.println(matriks_a.get(i).get(j)+" ");
		 }
		 System.out.println();
	 }
 }
}
