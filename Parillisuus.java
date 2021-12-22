import java.io.*;

public class Parillisuus {
    public static void main(String [] args){
        int eka;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("Anna kokonaisluku:");
            eka = Integer.parseInt(in.readLine());

            if(eka%2==0){
                System.out.println("Luku "+eka+" on parillinen.");
            }
        
            else{
                System.out.println("Luku "+eka+" on pariton.");
            }
        }
        catch (Exception e){
            System.out.println("Error");
        }

    }
        
}
