import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MobilBMWBeraksi {
	public static void main (String[]args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		MobilBMW mobilku = new MobilBMW();
		
		mobilku.hidupkanMobil();
		System.out.println();
		System.out.println("Masukkan kecepatan = ");
		mobilku.jalankanMobil(Integer.parseInt(input.readLine()));
		System.out.println();
		System.out.println("1. Menyalakan TV");
		System.out.println("2. Mencari Channel");
		System.out.println("3. Menampilkan GAMBAR");
		System.out.println();
		System.out.print("Masukkan pilihan ");
		System.out.println();
		mobilku.nontonTV(Integer.parseInt(input.readLine()));
		System.out.println();
		mobilku.printMobil();
		System.out.println();
		
		
	}
}
