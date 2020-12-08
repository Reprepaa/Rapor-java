/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengepakbagus;
import java.util.Scanner;
/**
 *
 * @author Revalina Santosa
 */
public class Rapor_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nama;
        double nilaiBahasaIndonesia;
        double nilaiPkn;
        double nilaiMatematika;
        double nilaiOlahraga;
        double nilaiBahasaInggris;
        double nilaiAgama;
        double nilaiRpl;
        double nilaiSeniBudaya;
        double nilaiSejarah;
        double nilaiKjd;
        double nilaiDdg;
        double nilaiFisika;
        double nilaiKimia;
        double nilaiRataRata;
Scanner dataIn = new Scanner(System.in);
 Scanner ui = new Scanner (System.in);
System.out.println("Masukkan Nama Siswa : ");
nama = ui.next();
 System.out.println("Masukkan Nilai Bahasa Indonesia : ");
 nilaiBahasaIndonesia = dataIn.nextDouble();
System.out.println("Masukkan Nilai PKN : ");
nilaiPkn = dataIn.nextDouble();
System.out.println("Masukkan Nilai Matematika : ");
nilaiMatematika = dataIn.nextDouble();
System.out.println("Masukkan Nilai Olahrga : ");
nilaiOlahraga = dataIn.nextDouble();
System.out.println("Masukkan Nilai Bahasa Inggris : ");
nilaiBahasaInggris = dataIn.nextDouble();
System.out.println("Masukkan Nilai Agama : ");
nilaiAgama = dataIn.nextDouble();
System.out.println("Masukkan Nilai RPL : ");
nilaiRpl = dataIn.nextDouble();
System.out.println("Masukkan Nilai Seni Budaya : ");
nilaiSeniBudaya = dataIn.nextDouble();
System.out.println("Masukkan Nilai Sejarah : ");
nilaiSejarah = dataIn.nextDouble();
System.out.println("Masukkan Nilai KJD : ");
nilaiKjd = dataIn.nextDouble();
System.out.println("Masukkan Nilai DDG : ");
nilaiDdg = dataIn.nextDouble();
System.out.println("Masukkan Nilai Fisika : ");
nilaiFisika = dataIn.nextDouble();
System.out.println("Masukkan Nilai Kimia : ");
nilaiKimia = dataIn.nextDouble();
nilaiRataRata = (nilaiBahasaIndonesia + nilaiPkn + nilaiMatematika+nilaiOlahraga+nilaiBahasaInggris+
        nilaiAgama+nilaiRpl+nilaiSeniBudaya+nilaiSejarah+nilaiKjd+nilaiDdg+nilaiFisika+nilaiKimia)/13;
if (nilaiRataRata > 75 )
{
    System.out.println("Nilai Raport : "+nilaiRataRata);
    System.out.println("Status  : LULUS");
    }
else{
    System.out.println("Nilai Raport : "+nilaiRataRata);
    System.out.println("Status  : TIDAK LULUS”");
     }
String jawab;
Scanner scanner = new Scanner (System.in);
do{
    System.out.println("Apakah anda ingin mengecek lagi?");
    System.out.println("Klik 'tidak' jika anda tidak ingin mengcek lagi");
    jawab = scanner.next();
}while (jawab.equals("Ya"));

}
}

    
    
         
         
        
        
       
   


       
    
    
            
    

              
      
      
      
    
   
    

