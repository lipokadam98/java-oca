public class MainArgs {

    public static void main(String[] args) {
	//Meg lehet adni argumentumot a futás előtt
	try{
 	System.out.println(args[0] +" - "+ args[1]);
	}catch(Exception e){
	System.out.println(e.getMessage());
	}
       
    }
}
