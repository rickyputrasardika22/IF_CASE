package PesawatTerbang;
import java.util.Scanner;
public class PesawatTerbang 
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String kodePesawat,  namaMaskapai = null, jenisKelas = null;
		char kodeKelas;
		int jumlahTiket = 0, hargaTiket = 0, total = 0;
		
		//input
		System.out.println("Masukkan kode pesawat = ");
		kodePesawat = scan.nextLine();
		
		System.out.println("Masukkan kode kelas = ");
		kodeKelas = scan.nextLine().charAt(0);
		
		System.out.println("Masukkan Jumlah Tiket");
		jumlahTiket = scan.nextInt();
		
		//proses
		if (kodePesawat.equalsIgnoreCase("GA"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Garuda Indonesia";
				jenisKelas = "Bisnis";
				hargaTiket = 220000;
			}
			else if (kodeKelas == 'E')
			{
				namaMaskapai = "Garuda Indonesia";
				jenisKelas = "Ekonomi";
				hargaTiket = 160000;
			}
			else
			{
				System.out.println("=========Error!!!!=========");
			}	
		}
		else if(kodePesawat.equalsIgnoreCase("SR"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Sriwijaya Air";
				jenisKelas = "Bisnis";
				hargaTiket = 170000;
			}
			else if (kodeKelas == 'E')
			{
				namaMaskapai = "Sriwijaya Air";
				jenisKelas = "Ekonomi";
				hargaTiket = 140000;
			}
			else
			{
				System.out.println("=========Error!!!!=========");
			}
		}
		else if (kodePesawat.equalsIgnoreCase("LI"))
		{
			if(kodeKelas == 'B')
			{
				namaMaskapai = "Lion Air";
				jenisKelas = "Bisnis";
				hargaTiket = 150000;
			}
			else if (kodeKelas == 'E')
			{
				namaMaskapai = "Lion Air";
				jenisKelas = "Ekonomi";
				hargaTiket = 120000;
			}
			else
			{
				System.out.println("=========Error!!!!=========");
			}	
		}
		else
		{
			System.out.println("=========Error!!!!=========");
		}
		
		total = jumlahTiket*hargaTiket;
		
		//OUTPUT
		System.out.println("Nama Maskapai Anda Adalah = " + namaMaskapai);
		System.out.println("Jenis Kelas Anda Adalah = " + jenisKelas);
		System.out.println("Harga Tiket Anda Adalah = " + hargaTiket);
		System.out.println("Jumlah Tiket Yang Dipesan = " + jumlahTiket);
		System.out.println("Total Bayar Anda Adalah = " + total);
		
	}
}
