package PesawatTerbang;
import java.util.Scanner;
public class PesawatTerbang_CASE 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		//deklarasi
		int nomor_bulan;
		
		System.out.println("Masukkan Nomor Bulan = ");
		nomor_bulan = scan.nextInt();
		
		switch (nomor_bulan)
		{
			case 1 :
			{	
				System.out.println("Bulan Januari");
			}
			break;
			case 2 :
			{	
				System.out.println("Bulan February");
			}
			break;
			case 3 :
			{
				System.out.println("Bulan Maret");
			}
			break;
			case 4 :
			{
				System.out.println("Bulan April");
			}
			break;
			case 5 :
			{
				System.out.println("Bulan Mei");
			}
			break;
			case 6 :
			{
				System.out.println("Bulan Juni");
			}
			break;
			case 7 :
			{
				System.out.println("Bulan Juli");
			}
			break;
			case 8 :
			{
				System.out.println("Bulan Agustus");
			}
			break;
			case 9 :
			{
				System.out.println("Bulan September");
			}
			break;
			case 10 :
			{
				System.out.println("Bulan Oktober");
			}
			break;
			case 11 :
			{
				System.out.println("Bulan November");
			}
			break;
			case 12 :
			{
				System.out.println("Bulan Desember");
			}
			break;
			default : System.out.println("Nomor Bulan Salah");
		}
				
				
	}	
}
