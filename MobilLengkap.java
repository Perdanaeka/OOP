import java.io.*;

class MobilLengkap {
	
	String status;
	int TV = 0;
	String TeVe = "Mati" ; 
	double kecepatan = 0;

	public void hidupkanMobil() {
		System.out.print("Menyalakan Mobil");
		status = "hidup" ;
	}
	
	public void matikanMobil() {
		System.out.print("Mematikan Mobil");
		status = "mati" ;
	}
	
	void printMobil() {
		System.out.println("Status Mobil = "+status);
		System.out.println("Status TV = "+TeVe);
		System.out.println("Kecepatan Mobil = "+kecepatan);
	}
	
	void jalankanMobil(double kecepatan) {
		this.kecepatan = kecepatan;
	}
}

class MobilBMW extends MobilLengkap {
	public void nontonTV(int pilihan) {
		switch (pilihan) {
		case 1 : 
			System.out.println("TV Menyala");
			TV = 1;
			TeVe = "hidup";
			break;
		case 2 :
			if ( TV == 1) {
				System.out.print("TV Mencari Channel");
			}
			else
				TeVe = "Mati";
				System.out.print("TV Belum nyala BOS");
			break;
		case 3 :
			if ( TV == 1) {
				System.out.print("Menampilkan GAmbar Rumah");
			}
			else
				TeVe = "Mati";
				System.out.print("TV Belum nyala BOS");
			break;
		default :
			System.out.print("Anda MAUNYA APA!!!");
			break;
		}
	}
}

