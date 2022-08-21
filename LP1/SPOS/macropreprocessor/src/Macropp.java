
//importing java packages
import java.util.*;
import java.io.*;
import java.io.BufferedReader;

public class Macropp {

    public static void main(String[] args) throws Exception {
        
        //creating objects for scanner and buffered reader classes 
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        String line;

        try {
            br = new BufferedReader(new FileReader("input.txt"));
        } catch (FileNotFoundException fnfex) {
            System.out.println(fnfex.getMessage() + " File not found in System");
            System.exit(0);
        }

        try{
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException ioex){
            System.out.println(ioex.getMessage() + "Error while reading File");
        } finally{
            //exiting the code at the end of the program
            System.exit(0);
        }
    }
}
