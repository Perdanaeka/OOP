public class Kipas implements Elektronik {

    boolean menyala = false;
    int kecepatan=0;
    
    public void on() {
    	menyala=true;
    }
    public void off(){
    	menyala=false;
    }
}