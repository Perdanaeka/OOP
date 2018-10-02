import java.util.Scanner;
class utama{

    public static void main(String[]arg) {
    	Scanner sc = new Scanner(System.in);
    	handphone h1 = new handphone();
    	
    	System.out.print("Nama Merk = ");
    	h1.setMerk(sc.nextLine());
    	System.out.print("Tipe      = ");
    	h1.setTipe(sc.nextLine());
    	System.out.print("Warna     = ");
    	h1.setWarna(sc.nextLine());
    	System.out.print("Harga     = ");
    	h1.setHarga(sc.nextInt());
    	
    	System.out.println();
    	System.out.println();
    	System.out.println("**********************************");
		System.out.println("         J A Y A   C E L L        ");
		System.out.println("**********************************");
		System.out.println();
		System.out.println("Merk Handphone = "+h1.getMerk());
		System.out.println("Warna		   = "+h1.getWarna());
		System.out.println("Tipe Handphone = "+h1.getTipe());
		System.out.println("Harga          = RP "+h1.getHarga());
		System.out.println();
		h1.keterangan();
		System.out.println();
		System.out.println();
	
    
	}
}
