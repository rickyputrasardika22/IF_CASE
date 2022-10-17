package PesawatTerbang;
import java.util.Scanner;
public class Bangun_Datar_Switch_Case 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//deklarasi
		int nomor_bangun_datar , luas_bangun_datar ;
		double panjang, lebar, alas, tinggi, r, phi, luas_persegi_panjang, luas_segitiga, luas_lingkaran;
		String nama_bangun_datar = null;
		
		phi = 3.14;
		
		System.out.println("Masukkan Pilihan Anda = ");
		nomor_bangun_datar = scan.nextInt();
		
		
		
		switch	(nomor_bangun_datar)
		{
			case 1 :
			{
				nama_bangun_datar = "Persegi Panjang";
				System.out.println("Masukkan Nilai Panjang = ");
				panjang = scan.nextDouble();
				
				System.out.println("Masukkan Nilai Lebar = ");
				lebar = scan.nextDouble();
				
				luas_persegi_panjang= panjang*lebar;
				System.out.println("Luas Persegi Panjang = " + luas_persegi_panjang);
			}
			break;
			case 2 :
			{
				nama_bangun_datar = "Segitiga";
				System.out.println("Masukkan Nilai Alas = ");
				alas = scan.nextDouble();
				
				System.out.println("Masukkan Nilai Tinggi = ");
				tinggi = scan.nextDouble();
				
				luas_segitiga = (alas*tinggi)/2;
				System.out.println("Luas Segitiga = " + luas_segitiga);
			}
			break;
			case 3 :
			{
				nama_bangun_datar = "Lingkaran";
				System.out.println("Masukkan Nilai Jari - Jari = ");
				r = scan.nextDouble();
				
				luas_lingkaran = phi*r*r;
				System.out.println("Luas Lingkaran = " + luas_lingkaran);
			}
			break;
		}
		
	}
}
