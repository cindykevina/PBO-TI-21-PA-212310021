import java.util.Scanner;
public class Latihan_03 {
   
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float phi = 3.14f;
        float r, tinggi;  // s = Panjang Garis Pelukis
        float luas, volume, s;
        int bangunan;
        
        
        System.out.println("\t Pilih Bangunan yang ingin di hitung Luas dan Volume nya \n\n");
        System.out.println("\t 1. Tabung \n\n");
        System.out.println("\t 2. Segitiga Kerucut \n\n");
        System.out.print(" Silahkan Ketik  : ");
        bangunan = userInput.nextInt();
        
        if(bangunan == 1) {
//          ===================tabung================================
            System.out.println("\t Hitung Luas dan Volume Tabung \n\n");
            System.out.print(" Masukkan Jari-jari     : ");
            r = userInput.nextFloat();
           
            System.out.print(" Masukkan Tinggi        : ");
            tinggi = userInput.nextFloat();
     
            luas = 2 * phi * r * r * tinggi;
            volume = phi * r * r * tinggi;
            System.out.println(" Luas Permukaan Tabungnya Adalah  : " + luas);
            System.out.println(" Volume Tabungnya Adalah  : " + volume);
        } else {
//          ===================segitiga kerucut================================
            System.out.println("\t Hitung Luas dan Volume Segitiga Kerucut \n\n");
            System.out.print(" Masukkan Jari-jari     : ");
            r = userInput.nextFloat();
            
            System.out.print(" Masukkan Garis Pelukis        : ");
            s = userInput.nextFloat();
            
            System.out.print(" Masukkan Tinggi        : ");
            tinggi = userInput.nextFloat();

            luas = (phi * r * r) + (phi * r * s );
            volume = (phi * r * r * tinggi)/3;
            System.out.println(" Luas Permukaan Segitiga Kerucutnya Adalah  : " + luas);
            System.out.println(" Volume Segitiga Kerucutnya Adalah  : " + volume);
              
        }  
    }
}
 
