class Radio implements Elektronik {

    boolean menyala = false;
    String[] channel={"Gajah Mada FM","Smart FM","Buana FM","MAJT FM"};
    int volume=0;
    
    public void on() {
    	menyala=true;
    }
    public void off(){
    	menyala=false;
    }
    
    public void status(){
    	if (menyala){
    	System.out.println("Radio Menyala");
    	}
    	else{
    	System.out.print("Radio Mati");
    	}
    }
}