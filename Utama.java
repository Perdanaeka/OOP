import java.util.Scanner;
class Utama 
{

    public static void main(String[]arg) throws Exception 
    	{
    	
    	Scanner input = new Scanner(System.in);
    	Login user1 = new Login();
    	Login user2 = new Login("","");
    	
    	while (true)	
    	{
    	
    	System.out.println("*************************");
    	System.out.println("*    M E N U L O G I N  *");
    	System.out.println("*************************");
    	System.out.println("* 1. Login Admin        *");
    	System.out.println("* 2. Ubah Psswd Admin   *");
    	System.out.println("* 3. Buat User          *");
    	System.out.println("* 4. Lihat Data User    *");
    	System.out.println("* 5. Keluar             *");
    	System.out.println("*************************");
    	
    	//input
    	
    	System.out.print("Masukkan pilihan = ");
    	int pilih = input.nextInt(); 
    		
    	System.out.println();	
    
    	//Proses + output 
    	
    	switch(pilih)
    	{
    		case 1 : pilih = 1 ;
    			System.out.print("Username = ");
    			String my_user = input.nextLine();
    			System.out.print("Password = "); 
    			String my_passwd = input.nextLine();
    			System.out.println();
    			
    			//checking
    			if (my_user.equals (user1.getUsernm()) && my_passwd.equals(user1.getPasswd()))
    			{
    				System.out.println("***   Login Sukses    ***");
    			}
    			else
    			{
    				System.out.println("***   Login Gagal    ***");
    			}
    			
    			break ;
    			
    		case 2 : pilih = 2 ;
    		System.out.print("Masukkan Password Lama = ");
    			String old_passwd = input.nextLine();
    			System.out.print("Masukkan Password Baru = "); 
    			String new_passwd = input.nextLine();
    			System.out.println();
    			
    			//checking
    			if (old_passwd.equals (user1.getPasswd()))
    			{
    				user1.setPasswd(new_passwd);
    				System.out.println("***   Password Berhasil di Ganti    ***");
    			}
    			else
    			{
    				System.out.println("***   Password yang Anda Masukkan Salah    ***");
    			}
    			break;
    			
    		case 3 : pilih = 3 ;
    			System.out.print("Masukkan Username = ");
    			String create_user = input.nextLine();
    			System.out.print("Masukkan Password = "); 
    			String create_passwd = input.nextLine();
    			System.out.println();
    			
    			
    			user2 = new Login(create_user,create_passwd);
    			System.out.println();
    			
    			
    			System.out.println("****    User erhasil Dibuat    ****");
    			break;
    			
    		case 4 : pilih = 4 ;
    		
    			break;
    			
    		default :
    		
    			System.exit(0);
    		}		
   		}
	}
}
