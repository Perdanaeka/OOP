class handphone{
	private String merk,tipe,warna ;
	private double harga;
	 
	public void setMerk(String merk)
	{
		this.merk=merk;
	}
	public void setTipe(String tipe)
	{
		this.tipe=tipe;
	}	
	public void setWarna(String warna)
	{
		this.warna=warna;
	}
	public void setHarga(double harga)
	{
		this.harga=harga;
	}
	  
	public String getMerk()
	{
		return merk;
	}
	public String getTipe()
	{
		return tipe;
	}	
	public String getWarna()
	{
		return warna;
	}	
	public double getHarga()
	{
		return harga;
	}
	
	
	public double HargaDiskon()
	{
		double diskon = 0.1 * getHarga();
		double total = getHarga() - diskon;
		
		return total;
	}
	public void keterangan()
	{
		System.out.println("Harga setelah diskon (10%) = Rp "+HargaDiskon());
	}
	
}
